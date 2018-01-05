package com.google.android.finsky.cm;

import android.content.pm.PackageInstaller.Session;
import java.util.concurrent.CountDownLatch;

final class C2316w implements Runnable {
    public final /* synthetic */ Session[] f11392a;
    public final /* synthetic */ String f11393b;
    public final /* synthetic */ CountDownLatch f11394c;
    public final /* synthetic */ C2298e f11395d;

    C2316w(C2298e c2298e, Session[] sessionArr, String str, CountDownLatch countDownLatch) {
        this.f11395d = c2298e;
        this.f11392a = sessionArr;
        this.f11393b = str;
        this.f11394c = countDownLatch;
    }

    public final void run() {
        this.f11392a[0] = this.f11395d.m11848d(this.f11393b);
        this.f11394c.countDown();
    }
}
