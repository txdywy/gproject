package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v7.widget.eq;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.api.internal.ba;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.C5147b;
import com.google.android.gms.common.util.C5156k;
import java.lang.reflect.InvocationTargetException;

public final class gj extends hy {
    public Boolean f26777a;

    static {
        String.valueOf(C5095d.f25936c / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
    }

    gj(hv hvVar) {
        super(hvVar);
    }

    public static int m24435A() {
        return 36;
    }

    public static int m24436B() {
        return eq.FLAG_MOVED;
    }

    static long m24437C() {
        return 3600000;
    }

    static long m24438D() {
        return ((Long) gs.f26808o.m24528a()).longValue();
    }

    public static String m24439E() {
        return "google_app_measurement.db";
    }

    static String m24440F() {
        return "google_app_measurement_local.db";
    }

    public static long m24441G() {
        return 11200;
    }

    public static boolean m24442H() {
        return false;
    }

    public static boolean m24443K() {
        return ba.m23475b();
    }

    public static long m24444L() {
        return ((Long) gs.f26807n.m24528a()).longValue();
    }

    public static long m24445M() {
        return ((Long) gs.f26803j.m24528a()).longValue();
    }

    public static long m24446N() {
        return 1000;
    }

    public static long m24447O() {
        return Math.max(0, ((Long) gs.f26795b.m24528a()).longValue());
    }

    public static int m24448P() {
        return 100000;
    }

    public static long m24449Q() {
        return Math.max(0, ((Long) gs.f26796c.m24528a()).longValue());
    }

    public static long m24450R() {
        return Math.max(0, ((Long) gs.f26798e.m24528a()).longValue());
    }

    public static long m24451S() {
        return Math.max(0, ((Long) gs.f26799f.m24528a()).longValue());
    }

    public static long m24452T() {
        return Math.max(0, ((Long) gs.f26800g.m24528a()).longValue());
    }

    public static long m24453U() {
        return Math.max(0, ((Long) gs.f26801h.m24528a()).longValue());
    }

    public static long m24454V() {
        return Math.max(0, ((Long) gs.f26802i.m24528a()).longValue());
    }

    public static long m24455W() {
        return ((Long) gs.f26797d.m24528a()).longValue();
    }

    public static long m24456X() {
        return Math.max(0, ((Long) gs.f26804k.m24528a()).longValue());
    }

    public static long m24457Y() {
        return Math.max(0, ((Long) gs.f26805l.m24528a()).longValue());
    }

    public static int m24458Z() {
        return Math.min(20, Math.max(0, ((Integer) gs.f26806m.m24528a()).intValue()));
    }

    static String m24459s() {
        return (String) gs.f26794a.m24528a();
    }

    public static int m24460t() {
        return 25;
    }

    public static int m24461u() {
        return 40;
    }

    public static int m24462v() {
        return 24;
    }

    static int m24463w() {
        return 40;
    }

    static int m24464x() {
        return 100;
    }

    static int m24465y() {
        return 256;
    }

    static int m24466z() {
        return 1000;
    }

    public final boolean m24467I() {
        if (this.f26777a == null) {
            synchronized (this) {
                if (this.f26777a == null) {
                    ApplicationInfo applicationInfo = mo4736j().getApplicationInfo();
                    String a = C5156k.m23891a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = str != null && str.equals(a);
                        this.f26777a = Boolean.valueOf(z);
                    }
                    if (this.f26777a == null) {
                        this.f26777a = Boolean.TRUE;
                        mo4742p().f26845d.m24652a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f26777a.booleanValue();
    }

    public final boolean m24468J() {
        Boolean a = m24469a("firebase_analytics_collection_deactivated");
        return a != null && a.booleanValue();
    }

    public final /* bridge */ /* synthetic */ void mo4727a() {
        super.mo4727a();
    }

    public final /* bridge */ /* synthetic */ void mo4728b() {
        super.mo4728b();
    }

    public final /* bridge */ /* synthetic */ gd mo4729c() {
        return super.mo4729c();
    }

    public final /* bridge */ /* synthetic */ ib mo4730d() {
        return super.mo4730d();
    }

    public final /* bridge */ /* synthetic */ gx mo4731e() {
        return super.mo4731e();
    }

    public final /* bridge */ /* synthetic */ go mo4732f() {
        return super.mo4732f();
    }

    public final /* bridge */ /* synthetic */ il mo4733g() {
        return super.mo4733g();
    }

    public final /* bridge */ /* synthetic */ ig mo4734h() {
        return super.mo4734h();
    }

    public final /* bridge */ /* synthetic */ C5147b mo4735i() {
        return super.mo4735i();
    }

    public final /* bridge */ /* synthetic */ Context mo4736j() {
        return super.mo4736j();
    }

    public final /* bridge */ /* synthetic */ gy mo4737k() {
        return super.mo4737k();
    }

    public final /* bridge */ /* synthetic */ ha mo4738l() {
        return super.mo4738l();
    }

    public final /* bridge */ /* synthetic */ jl mo4739m() {
        return super.mo4739m();
    }

    public final /* bridge */ /* synthetic */ jb mo4740n() {
        return super.mo4740n();
    }

    public final /* bridge */ /* synthetic */ hr mo4741o() {
        return super.mo4741o();
    }

    public final /* bridge */ /* synthetic */ hc mo4742p() {
        return super.mo4742p();
    }

    public final /* bridge */ /* synthetic */ hj mo4743q() {
        return super.mo4743q();
    }

    public final /* bridge */ /* synthetic */ gj mo4744r() {
        return super.mo4744r();
    }

    final Boolean m24469a(String str) {
        Boolean bool = null;
        am.m23735a(str);
        try {
            if (mo4736j().getPackageManager() == null) {
                mo4742p().f26845d.m24652a("Failed to load metadata: PackageManager is null");
            } else {
                ApplicationInfo a = dr.f26667b.m24299a(mo4736j()).m24295a(mo4736j().getPackageName(), 128);
                if (a == null) {
                    mo4742p().f26845d.m24652a("Failed to load metadata: ApplicationInfo is null");
                } else if (a.metaData == null) {
                    mo4742p().f26845d.m24652a("Failed to load metadata: Metadata bundle is null");
                } else if (a.metaData.containsKey(str)) {
                    bool = Boolean.valueOf(a.metaData.getBoolean(str));
                }
            }
        } catch (NameNotFoundException e) {
            mo4742p().f26845d.m24653a("Failed to load metadata: Package name not found", e);
        }
        return bool;
    }

    public final String aa() {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{"debug.firebase.analytics.app", ""});
        } catch (ClassNotFoundException e) {
            mo4742p().f26845d.m24653a("Could not find SystemProperties class", e);
        } catch (NoSuchMethodException e2) {
            mo4742p().f26845d.m24653a("Could not find SystemProperties.get() method", e2);
        } catch (IllegalAccessException e3) {
            mo4742p().f26845d.m24653a("Could not access SystemProperties.get()", e3);
        } catch (InvocationTargetException e4) {
            mo4742p().f26845d.m24653a("SystemProperties.get() threw an exception", e4);
        }
        return "";
    }
}
