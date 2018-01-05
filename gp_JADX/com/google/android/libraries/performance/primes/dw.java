package com.google.android.libraries.performance.primes;

import java.util.concurrent.Callable;

final class dw implements Callable {
    public final /* synthetic */ Callable f30001a;
    public final /* synthetic */ du f30002b;

    dw(du duVar, Callable callable) {
        this.f30002b = duVar;
        this.f30001a = callable;
    }

    public final Object call() {
        try {
            return this.f30001a.call();
        } catch (Throwable th) {
            this.f30002b.f29997a.mo5253a(th);
        }
    }
}
