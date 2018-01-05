package com.google.android.libraries.performance.primes;

final class dv implements Runnable {
    public final /* synthetic */ Runnable f29999a;
    public final /* synthetic */ du f30000b;

    dv(du duVar, Runnable runnable) {
        this.f30000b = duVar;
        this.f29999a = runnable;
    }

    public final void run() {
        try {
            this.f29999a.run();
        } catch (Throwable th) {
            this.f30000b.f29997a.mo5253a(th);
        }
    }
}
