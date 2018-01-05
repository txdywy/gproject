package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ba;
import com.google.android.gms.common.util.C5147b;
import com.google.firebase.iid.FirebaseInstanceId;

public final class gx extends hz {
    public String f26830a;
    public String f26831b;
    public int f26832c;
    public String f26833d;
    public long f26834e;
    public int f26835f;
    public String f26836g;

    gx(hv hvVar) {
        super(hvVar);
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

    protected final void mo4745s() {
        int i = 1;
        String str = "unknown";
        String str2 = "Unknown";
        int i2 = Integer.MIN_VALUE;
        String str3 = "Unknown";
        String packageName = mo4736j().getPackageName();
        PackageManager packageManager = mo4736j().getPackageManager();
        if (packageManager == null) {
            mo4742p().f26845d.m24653a("PackageManager is null, app identity information might be inaccurate. appId", hc.m24625a(packageName));
        } else {
            try {
                str = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException e) {
                mo4742p().f26845d.m24653a("Error retrieving app installer package name. appId", hc.m24625a(packageName));
            }
            if (str == null) {
                str = "manual_install";
            } else if ("com.android.vending".equals(str)) {
                str = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(mo4736j().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    if (!TextUtils.isEmpty(applicationLabel)) {
                        str3 = applicationLabel.toString();
                    }
                    str2 = packageInfo.versionName;
                    i2 = packageInfo.versionCode;
                }
            } catch (NameNotFoundException e2) {
                mo4742p().f26845d.m24654a("Error retrieving package info. appId, appName", hc.m24625a(packageName), str3);
            }
        }
        this.f26830a = packageName;
        this.f26833d = str;
        this.f26831b = str2;
        this.f26832c = i2;
        this.f26834e = 0;
        gj.m24442H();
        Status a = ba.m23472a(mo4736j());
        i2 = (a == null || !a.m23271a()) ? 0 : 1;
        if (i2 == 0) {
            if (a == null) {
                mo4742p().f26845d.m24652a("GoogleService failed to initialize (no status)");
            } else {
                mo4742p().f26845d.m24654a("GoogleService failed to initialize, status", Integer.valueOf(a.f25631g), a.f25632h);
            }
        }
        if (i2 != 0) {
            Boolean a2 = mo4744r().m24469a("firebase_analytics_collection_enabled");
            if (mo4744r().m24468J()) {
                mo4742p().f26849h.m24652a("Collection disabled with firebase_analytics_collection_deactivated=1");
                i2 = 0;
            } else if (a2 != null && !a2.booleanValue()) {
                mo4742p().f26849h.m24652a("Collection disabled with firebase_analytics_collection_enabled=0");
                i2 = 0;
            } else if (a2 == null && gj.m24443K()) {
                mo4742p().f26849h.m24652a("Collection disabled with google_app_measurement_enable=0");
                i2 = 0;
            } else {
                mo4742p().f26851j.m24652a("Collection enabled");
                i2 = 1;
            }
        } else {
            i2 = 0;
        }
        this.f26836g = "";
        gj.m24442H();
        try {
            str2 = ba.m23474a();
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.f26836g = str2;
            if (i2 != 0) {
                mo4742p().f26851j.m24654a("App package, google app id", this.f26830a, this.f26836g);
            }
        } catch (IllegalStateException e3) {
            mo4742p().f26845d.m24654a("getGoogleAppId or isMeasurementEnabled failed with exception. appId", hc.m24625a(packageName), e3);
        }
        if (VERSION.SDK_INT >= 16) {
            if (!dp.m24293a(mo4736j())) {
                i = 0;
            }
            this.f26835f = i;
            return;
        }
        this.f26835f = 0;
    }

    final String m24575t() {
        m24432x();
        return this.f26830a;
    }

    final String m24576u() {
        m24432x();
        return this.f26836g;
    }

    final zzcqe m24555a(String str) {
        mo4728b();
        String t = m24575t();
        String u = m24576u();
        m24432x();
        String str2 = this.f26831b;
        m24432x();
        long j = (long) this.f26832c;
        m24432x();
        String str3 = this.f26833d;
        long G = gj.m24441G();
        m24432x();
        mo4728b();
        if (this.f26834e == 0) {
            this.f26834e = this.p.m24764g().m24939c(mo4736j(), mo4736j().getPackageName());
        }
        long j2 = this.f26834e;
        boolean l = this.p.m24769l();
        boolean z = !mo4743q().f26877o;
        String v = m24554v();
        m24432x();
        hv hvVar = this.p;
        Long valueOf = Long.valueOf(hvVar.m24760c().f26870h.m24685a());
        long min = valueOf.longValue() == 0 ? hvVar.f26926D : Math.min(hvVar.f26926D, valueOf.longValue());
        m24432x();
        return new zzcqe(t, u, str2, j, str3, G, j2, str, l, z, v, min, this.f26835f);
    }

    private final String m24554v() {
        mo4728b();
        try {
            return FirebaseInstanceId.a(FirebaseInstanceId.a().a.a());
        } catch (IllegalStateException e) {
            mo4742p().f26847f.m24652a("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }
}
