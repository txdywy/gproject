package com.google.android.finsky.cm;

import java.util.concurrent.CountDownLatch;

public final class com.google.android.finsky.cm.w implements Runnable
{

    public final PackageInstaller$Session[] a;
    public final String b;
    public final CountDownLatch c;
    public final com.google.android.finsky.cm.e d;

    w(com.google.android.finsky.cm.e p0, PackageInstaller$Session[] p1, String p2, CountDownLatch p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void run() {
        this.a[0] = this.d.d(this.b);
        this.c.countDown();
    }

}
