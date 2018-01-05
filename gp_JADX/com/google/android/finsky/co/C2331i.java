package com.google.android.finsky.co;

import android.content.pm.PackageStats;

final /* synthetic */ class C2331i implements Runnable {
    public final PackageStats f11461a;
    public final boolean f11462b;
    public final C2332j f11463c;
    public final String f11464d;

    C2331i(PackageStats packageStats, boolean z, C2332j c2332j, String str) {
        this.f11461a = packageStats;
        this.f11462b = z;
        this.f11463c = c2332j;
        this.f11464d = str;
    }

    public final void run() {
        PackageStats packageStats = this.f11461a;
        boolean z = this.f11462b;
        C2332j c2332j = this.f11463c;
        String str = this.f11464d;
        if (packageStats == null || !z) {
            c2332j.mo3144a(str, z ? 1602 : 1601, null);
        } else {
            c2332j.mo3143a(packageStats);
        }
    }
}
