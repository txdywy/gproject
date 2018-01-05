package com.google.android.libraries.performance.primes.p340g.p341a;

import d.a.a.a.a.a.bs;

final class C5998c {
    public int f30060a;
    public long f30061b;

    C5998c() {
    }

    final synchronized void m27859a(long j) {
        this.f30060a++;
        this.f30061b += j;
    }

    final synchronized bs m27858a() {
        bs bsVar;
        bsVar = new bs();
        bsVar.c = Integer.valueOf(this.f30060a);
        bsVar.d = Long.valueOf(this.f30061b);
        return bsVar;
    }
}
