package com.google.android.libraries.play.entertainment.bitmap;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

final class C6035f extends PhantomReference {
    public Object f30141a;
    public int f30142b;

    C6035f(C6034e c6034e, ReferenceQueue referenceQueue, boolean z, Object obj) {
        super(c6034e, referenceQueue);
        this.f30141a = obj;
        this.f30142b = z ? 0 : 1;
    }

    final synchronized boolean m27931a() {
        return this.f30142b == 2;
    }

    final synchronized boolean m27933b() {
        boolean z;
        if (this.f30142b != 2) {
            this.f30142b = 2;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    final synchronized boolean m27932a(Object obj) {
        boolean z = true;
        synchronized (this) {
            if (this.f30142b == 0) {
                this.f30142b = 1;
                this.f30141a = obj;
            } else {
                z = false;
            }
        }
        return z;
    }
}
