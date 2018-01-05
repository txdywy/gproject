package com.google.android.finsky.co;

import android.content.pm.PackageStats;

final /* synthetic */ class C2329g implements Runnable {
    public final C2332j f11456a;
    public final PackageStats f11457b;

    C2329g(C2332j c2332j, PackageStats packageStats) {
        this.f11456a = c2332j;
        this.f11457b = packageStats;
    }

    public final void run() {
        this.f11456a.mo3143a(this.f11457b);
    }
}
