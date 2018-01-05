package com.google.android.finsky.co;

import android.content.pm.IPackageStatsObserver.Stub;
import android.content.pm.PackageStats;

final class C2330h extends Stub {
    public final /* synthetic */ C2332j f11458a;
    public final /* synthetic */ String f11459b;
    public final /* synthetic */ C2323a f11460c;

    C2330h(C2323a c2323a, C2332j c2332j, String str) {
        this.f11460c = c2323a;
        this.f11458a = c2332j;
        this.f11459b = str;
    }

    public final void onGetStatsCompleted(PackageStats packageStats, boolean z) {
        this.f11460c.f11440j.post(new C2331i(packageStats, z, this.f11458a, this.f11459b));
    }
}
