package com.google.android.libraries.performance.primes;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import com.google.android.libraries.p319a.p320a.C5844a;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.metriccapture.C6016h;
import com.google.android.libraries.performance.primes.p343i.C6006a;
import d.a.a.a.a.a.bp;
import d.a.a.a.a.a.e;
import d.a.a.a.a.a.s;

public final class bw {
    public static volatile bw f29829h;
    public final String f29830a;
    public final String f29831b;
    public final String f29832c;
    public final int f29833d;
    public final C5844a f29834e;
    public final long f29835f;
    public final Long f29836g;

    private bw(String str, String str2, String str3, int i, Long l, C5844a c5844a) {
        this.f29830a = str;
        this.f29831b = str2;
        this.f29832c = str3;
        this.f29833d = i;
        this.f29836g = l;
        this.f29834e = c5844a;
        this.f29835f = c5844a.m27270a().getTotalSpace() / 1024;
    }

    static bw m27747a(Context context) {
        if (f29829h == null) {
            synchronized (bw.class) {
                if (f29829h == null) {
                    f29829h = m27749c(context);
                }
            }
        }
        return f29829h;
    }

    public static eo m27748b(Context context) {
        C5916a.m27406a((Object) context);
        return new bx(context);
    }

    private static bw m27749c(Context context) {
        int i = 1;
        String packageName = ((Context) C5916a.m27406a((Object) context)).getPackageName();
        String d = C6016h.m27892d(context);
        String str = null;
        PackageManager packageManager = context.getPackageManager();
        try {
            str = packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (NameNotFoundException e) {
            C5989do.m27824a(5, "MetricStamper", "Failed to get PackageInfo for: %s", packageName);
        }
        if (VERSION.SDK_INT >= 20 && packageManager.hasSystemFeature("android.hardware.type.watch")) {
            i = 2;
        }
        return new bw(packageName, d, str, i, C6006a.m27869a(context), new C5844a(context));
    }

    public final bp m27750a(bp bpVar) {
        if (bpVar == null) {
            C5989do.m27824a(5, "MetricStamper", "Unexpected null metric to stamp, Stamping has been skipped.", new Object[0]);
        } else {
            bpVar.e = new e();
            bpVar.e.a = this.f29830a;
            bpVar.e.c = this.f29833d;
            bpVar.e.d = this.f29836g;
            bpVar.e.b = this.f29832c;
            bpVar.e.e = this.f29831b;
            bpVar.w = new s();
            bpVar.w.a = Long.valueOf(this.f29834e.m27270a().getFreeSpace() / 1024);
            bpVar.w.b = Long.valueOf(this.f29835f);
        }
        return bpVar;
    }
}
