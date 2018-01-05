package com.google.android.gms.ads.p239b;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class C4894c extends Thread {
    public WeakReference f25248a;
    public long f25249b;
    public CountDownLatch f25250c = new CountDownLatch(1);
    public boolean f25251d = false;

    public C4894c(C4892a c4892a, long j) {
        this.f25248a = new WeakReference(c4892a);
        this.f25249b = j;
        start();
    }

    private final void m22918a() {
        C4892a c4892a = (C4892a) this.f25248a.get();
        if (c4892a != null) {
            c4892a.m22917b();
            this.f25251d = true;
        }
    }

    public final void run() {
        try {
            if (!this.f25250c.await(this.f25249b, TimeUnit.MILLISECONDS)) {
                m22918a();
            }
        } catch (InterruptedException e) {
            m22918a();
        }
    }
}
