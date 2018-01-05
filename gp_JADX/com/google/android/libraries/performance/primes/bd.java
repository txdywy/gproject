package com.google.android.libraries.performance.primes;

import d.a.a.a.a.a.ah;
import d.a.a.a.a.a.bp;

final class bd implements Runnable {
    public final /* synthetic */ int f29769a;
    public final /* synthetic */ bc f29770b;

    bd(bc bcVar, int i) {
        this.f29770b = bcVar;
        this.f29769a = i;
    }

    public final void run() {
        bp bpVar = new bp();
        bpVar.o = new ah();
        bpVar.o.a = this.f29769a;
        this.f29770b.m27577a(bpVar);
    }
}
