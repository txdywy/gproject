package com.google.common.p420f.p421a;

import com.google.common.p414a.C6937m;
import com.google.common.p414a.C6939o;

final class be extends C6977a implements Runnable {
    public final Runnable f34410e;

    public be(Runnable runnable) {
        this.f34410e = (Runnable) C6937m.m31623a((Object) runnable);
    }

    public final void run() {
        try {
            this.f34410e.run();
        } catch (Throwable th) {
            mo5943a(th);
            RuntimeException b = C6939o.m31643b(th);
        }
    }
}
