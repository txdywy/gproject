package com.google.android.finsky.scheduler;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.p034e.C0286a;
import android.telephony.TelephonyManager;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import java.util.ArrayList;
import java.util.List;

public final class C4042t {
    public final Context f20329a;
    public final ai f20330b;
    public final C1461c f20331c;
    public final bj f20332d;
    public long[] f20333e;

    public C4042t(Context context, ai aiVar, C1461c c1461c, bj bjVar) {
        this.f20329a = context;
        this.f20330b = aiVar;
        this.f20331c = c1461c;
        this.f20332d = bjVar;
    }

    final C4033g m18945a() {
        boolean z;
        C4033g c4033g;
        int i = 0;
        boolean z2 = true;
        C4033g c4033g2 = new C4033g();
        c4033g2.f20292a = C4678i.m21812a();
        if (this.f20331c.dj().mo2294a(12636615)) {
            z = true;
            c4033g = c4033g2;
        } else if (this.f20330b.m21698c()) {
            z = false;
            c4033g = c4033g2;
        } else {
            z = true;
            c4033g = c4033g2;
        }
        c4033g.f20295d = z;
        Boolean a = this.f20330b.m21696a();
        if (a == null || a.booleanValue()) {
            c4033g2.f20294c = true;
        }
        Context context = this.f20329a;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            z2 = false;
        }
        if (z2) {
            int i2 = 2;
            if (!C0286a.m1605a(connectivityManager)) {
                i2 = 6;
            }
            if (!((TelephonyManager) context.getSystemService("phone")).isNetworkRoaming()) {
                i2 |= 8;
            }
            i = i2;
        }
        c4033g2.f20293b = i;
        return c4033g2;
    }

    final boolean m18946a(C4026d c4026d) {
        if (this.f20333e == null || this.f20333e.length == 0) {
            String[] a = C4680k.m21818a((String) C0955b.iV.m28964b());
            if (a.length == 0) {
                return false;
            }
            int i;
            List arrayList = new ArrayList();
            for (String parseLong : a) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(parseLong)));
                } catch (Throwable e) {
                    FinskyLog.m21663b(e, "blacklist contains invalid numbers", new Object[0]);
                }
            }
            this.f20333e = new long[arrayList.size()];
            for (i = 0; i < this.f20333e.length; i++) {
                this.f20333e[i] = ((Long) arrayList.get(i)).longValue();
            }
        }
        long a2 = aa.m18792a(c4026d);
        for (long j : this.f20333e) {
            if (j == a2) {
                return true;
            }
        }
        return false;
    }

    static boolean m18943a(C4033g c4033g, C4026d c4026d) {
        boolean z = true;
        C4023a a = c4026d.m18856a();
        if (c4033g.f20292a >= c4026d.f20249a.f20178f + c4026d.m18856a().f20246a.f20155c) {
            return true;
        }
        if (a.f20246a.f20158f && !c4033g.f20295d) {
            return false;
        }
        if (a.f20246a.f20157e && !c4033g.f20294c) {
            return false;
        }
        switch (a.f20246a.f20156d) {
            case 0:
                break;
            case 1:
                if ((c4033g.f20293b & 2) == 0) {
                    z = false;
                    break;
                }
                break;
            case 2:
                if ((c4033g.f20293b & 4) == 0) {
                    z = false;
                    break;
                }
                break;
            case 3:
                if ((c4033g.f20293b & 8) == 0) {
                    z = false;
                    break;
                }
                break;
            default:
                FinskyLog.m21669e("unknown network type requirement %d", Integer.valueOf(a.f20246a.f20156d));
                break;
        }
        if (z) {
            return C4042t.m18944b(c4033g, c4026d);
        }
        return false;
    }

    static boolean m18944b(C4033g c4033g, C4026d c4026d) {
        if (c4033g.f20292a < c4026d.f20249a.f20178f + c4026d.m18856a().f20246a.f20154b) {
            return false;
        }
        return true;
    }
}
