package com.google.android.finsky.billing.profile;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ch;
import java.util.concurrent.TimeUnit;

public final class C2063t {
    public final C1461c f10590a;
    public final C2067x f10591b;

    public C2063t(C1461c c1461c, C2067x c2067x) {
        this.f10590a = c1461c;
        this.f10591b = c2067x;
    }

    public static void m10821a(String str) {
        C0954a.f5823S.m5777b(str).m5763a(Long.valueOf(System.currentTimeMillis()));
        C0957n b = C0954a.f5822R.m5777b(str);
        b.m5763a(Integer.valueOf(((Integer) b.m5760a()).intValue() + 1));
        FinskyLog.m21659a("Snoozing for %d ms (account=%s)", Long.valueOf(C2063t.m10826e(str)), FinskyLog.m21655a(str));
    }

    public static boolean m10822a(String str, long j) {
        if (((Integer) C0954a.f5822R.m5777b(str).m5760a()).intValue() <= 0) {
            return false;
        }
        boolean z;
        long longValue = ((Long) C0954a.f5823S.m5777b(str).m5760a()).longValue();
        long e = C2063t.m10826e(str);
        if (e < 0 || longValue + e > j) {
            z = true;
        } else {
            z = false;
        }
        FinskyLog.m21662b("is_snoozed=%b (account=%s)", Boolean.valueOf(z), FinskyLog.m21655a(str));
        return z;
    }

    private static long m10826e(String str) {
        String str2 = (String) C0955b.f5863G.m28964b();
        int intValue = ((Integer) C0954a.f5822R.m5777b(str).m5760a()).intValue();
        if (str2 == null) {
            FinskyLog.m21659a("No snooze schedule.", new Object[0]);
            return -1;
        }
        String[] a = C4680k.m21818a(str2);
        intValue = Math.min(intValue - 1, a.length - 1);
        if (intValue < 0) {
            FinskyLog.m21667d("Invalid snooze schedule: %s", str2);
            return -1;
        }
        try {
            return TimeUnit.MILLISECONDS.convert(Long.parseLong(r1), TimeUnit.MINUTES);
        } catch (NumberFormatException e) {
            FinskyLog.m21667d("Invalid snooze period: %s. Schedule: %s", a[intValue], str2);
            return -1;
        }
    }

    public static boolean m10823b(String str, long j) {
        Boolean bool = (Boolean) C0954a.f5820P.m5777b(str).m5760a();
        if (bool == null) {
            FinskyLog.m21659a("#accountHasFop is not ready", new Object[0]);
            return false;
        } else if (bool.booleanValue()) {
            FinskyLog.m21662b("has_fop=true cache valid. (account=%s)", FinskyLog.m21655a(str));
            return true;
        } else if (((Long) C0954a.f5821Q.m5777b(str).m5760a()).longValue() + ((Long) C0955b.f5862F.m28964b()).longValue() > j) {
            FinskyLog.m21662b("has_fop=false cache valid. (account=%s)", FinskyLog.m21655a(str));
            return true;
        } else {
            FinskyLog.m21659a("has_fop=false cache invalid. (account=%s)", FinskyLog.m21655a(str));
            return false;
        }
    }

    public final boolean m10827b(String str) {
        return this.f10590a.mo2249j(str).mo2294a(12602035);
    }

    public static void m10824c(String str) {
        C0954a.f5820P.m5777b(str).m5763a(Boolean.valueOf(true));
    }

    public static ch m10825d(String str) {
        boolean booleanValue;
        ch chVar = new ch();
        Boolean bool = (Boolean) C0954a.f5820P.m5777b(str).m5760a();
        if (bool != null) {
            booleanValue = bool.booleanValue();
            chVar.a |= 1;
            chVar.b = booleanValue;
        }
        booleanValue = ((Boolean) C0954a.f5826V.m5777b(str).m5760a()).booleanValue();
        chVar.a |= 2;
        chVar.c = booleanValue;
        int intValue = ((Integer) C0954a.f5824T.m5777b(str).m5760a()).intValue();
        chVar.a |= 4;
        chVar.d = intValue;
        intValue = ((Integer) C0954a.f5825U.m5777b(str).m5760a()).intValue();
        chVar.a |= 8;
        chVar.e = intValue;
        intValue = ((Integer) C0954a.f5822R.m5777b(str).m5760a()).intValue();
        chVar.a |= 16;
        chVar.f = intValue;
        return chVar;
    }
}
