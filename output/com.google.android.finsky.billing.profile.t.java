package com.google.android.finsky.billing.profile;

import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.m;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;
import com.google.wireless.android.a.a.a.a.ch;
import java.util.concurrent.TimeUnit;

public final class com.google.android.finsky.billing.profile.t
{

    public final com.google.android.finsky.ba.c a;
    public final com.google.android.finsky.billing.profile.x b;

    t(com.google.android.finsky.ba.c p0, com.google.android.finsky.billing.profile.x p1) {
        this.a = p0;
        this.b = p1;
    }

    public static void a(String p0) {
        com.google.android.finsky.aa.a.S.b(p0).a(Long.valueOf(System.currentTimeMillis()));
        v1 = com.google.android.finsky.aa.a.R.b(p0);
        v1.a(Integer.valueOf(((Integer)v1.a()).intValue() + 1));
        v3 = new Object[2];
        v3[0] = Long.valueOf(com.google.android.finsky.billing.profile.t.e(p0));
        v3[1] = FinskyLog.a(p0);
        FinskyLog.a("Snoozing for %d ms (account=%s)", v3);
    }

    public static boolean a(String p0, long p1) {
        v1 = 0;
        if (((Integer)com.google.android.finsky.aa.a.R.b(p0).a()).intValue() > 0) {
            v6 = com.google.android.finsky.billing.profile.t.e(p0);
            if (v6 < 0 || ((Long)com.google.android.finsky.aa.a.S.b(p0).a()).longValue() + v6 > p1)
                v0 = 1;
            else
                v0 = 0;
            v4 = new Object[2];
            v4[0] = Boolean.valueOf(v0);
            v4[1] = FinskyLog.a(p0);
            FinskyLog.b("is_snoozed=%b (account=%s)", v4);
            v1 = v0;
        }
        return v1;
    }

    public static boolean b(String p0, long p1) {
        v0 = (Boolean)com.google.android.finsky.aa.a.P.b(p0).a();
        if (v0 == 0) {
            FinskyLog.a("#accountHasFop is not ready", new Object[0]);
            v0 = 0;
        }
        else if (v0.booleanValue()) {
            v3 = new Object[1];
            v3[0] = FinskyLog.a(p0);
            FinskyLog.b("has_fop=true cache valid. (account=%s)", v3);
            v0 = 1;
        }
        else if (((Long)com.google.android.finsky.aa.a.Q.b(p0).a()).longValue() + ((Long)com.google.android.finsky.aa.b.F.b()).longValue() > p1) {
            v3 = new Object[1];
            v3[0] = FinskyLog.a(p0);
            FinskyLog.b("has_fop=false cache valid. (account=%s)", v3);
            v0 = 1;
        }
        else {
            v2 = new Object[1];
            v2[0] = FinskyLog.a(p0);
            FinskyLog.a("has_fop=false cache invalid. (account=%s)", v2);
            v0 = 0;
        }
        return v0;
    }

    public static void c(String p0) {
        com.google.android.finsky.aa.a.P.b(p0).a(Boolean.valueOf(1));
    }

    public static com.google.wireless.android.a.a.a.a.ch d(String p0) {
        v1 = new com.google.wireless.android.a.a.a.a.ch();
        v0 = (Boolean)com.google.android.finsky.aa.a.P.b(p0).a();
        if (v0 != 0) {
            v1.a = v1.a | 1;
            v1.b = v0.booleanValue();
        }
        v1.a = v1.a | 2;
        v1.c = ((Boolean)com.google.android.finsky.aa.a.V.b(p0).a()).booleanValue();
        v1.a = v1.a | 4;
        v1.d = ((Integer)com.google.android.finsky.aa.a.T.b(p0).a()).intValue();
        v1.a = v1.a | 8;
        v1.e = ((Integer)com.google.android.finsky.aa.a.U.b(p0).a()).intValue();
        v1.a = v1.a | 16;
        v1.f = ((Integer)com.google.android.finsky.aa.a.R.b(p0).a()).intValue();
        return v1;
    }

    private static long e(String p0) {
        v0 = (String)com.google.android.finsky.aa.b.G.b();
        if (v0 == 0) {
            FinskyLog.a("No snooze schedule.", new Object[0]);
            v0 = -1;
        }
        else {
            v4 = com.google.android.finsky.utils.k.a(v0);
            v1 = Math.min(((Integer)com.google.android.finsky.aa.a.R.b(p0).a()).intValue() - 1, v4.length - 1);
            if (v1 < 0) {
                v4 = new Object[1];
                v4[0] = v0;
                FinskyLog.d("Invalid snooze schedule: %s", v4);
                v0 = -1;
            }
            else {
                try {
                    v0 = TimeUnit.MILLISECONDS.convert(Long.parseLong(v4[v1]), TimeUnit.MINUTES);
                }
                catch (NumberFormatException ex) {
                    v5 = new Object[2];
                    v5[0] = v4[v1];
                    v5[1] = v0;
                    FinskyLog.d("Invalid snooze period: %s. Schedule: %s", v5);
                    v0 = -1;
                }
            }
        }
        return v0;
    }

    public final boolean b(String p0) {
        return this.a.j(p0).a(12602035);
    }

}
