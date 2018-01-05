package com.google.android.finsky.co;

import android.content.pm.IPackageStatsObserver$Stub;
import android.content.pm.PackageStats;
import android.os.Handler;

public final class com.google.android.finsky.co.h extends IPackageStatsObserver$Stub
{

    public final com.google.android.finsky.co.j a;
    public final String b;
    public final com.google.android.finsky.co.a c;

    h(com.google.android.finsky.co.a p0, com.google.android.finsky.co.j p1, String p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
        IPackageStatsObserver$Stub();
    }

    public final void onGetStatsCompleted(PackageStats p0, boolean p1) {
        this.c.j.post(new com.google.android.finsky.co.i(p0, p1, this.a, this.b));
    }

}
