package com.google.android.finsky.co;

import android.content.pm.PackageStats;

public final class com.google.android.finsky.co.g implements Runnable
{

    public final com.google.android.finsky.co.j a;
    public final PackageStats b;

    g(com.google.android.finsky.co.j p0, PackageStats p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void run() {
        com.google.android.finsky.co.a.a(this.a, this.b);
    }

}
