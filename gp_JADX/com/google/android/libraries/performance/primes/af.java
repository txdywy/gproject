package com.google.android.libraries.performance.primes;

import com.google.android.libraries.performance.primes.metriccapture.C6009a;
import d.a.a.a.a.a.bp;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

final class af implements Runnable {
    public final AtomicInteger f29639a = new AtomicInteger(0);
    public final /* synthetic */ ae f29640b;

    af(ae aeVar) {
        this.f29640b = aeVar;
    }

    public final void run() {
        if (this.f29640b.m27580a() && this.f29639a.getAndIncrement() < this.f29640b.f29637h) {
            C5949a c5949a = this.f29640b;
            bp bpVar = new bp();
            bpVar.r = C6009a.m27873a(new HashSet(Thread.getAllStackTraces().values()));
            c5949a.m27577a(bpVar);
        }
        if (this.f29639a.get() >= this.f29640b.f29637h) {
            this.f29640b.m27602a(false);
        }
    }
}
