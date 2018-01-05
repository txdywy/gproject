package com.google.android.libraries.performance.primes;

import d.a.a.a.a.a.al;
import d.a.a.a.a.a.bp;

final class bu implements Runnable {
    public final /* synthetic */ String f29821a;
    public final /* synthetic */ boolean f29822b;
    public final /* synthetic */ bp f29823c;
    public final /* synthetic */ al f29824d;
    public final /* synthetic */ bt f29825e;

    bu(bt btVar, String str, boolean z, bp bpVar, al alVar) {
        this.f29825e = btVar;
        this.f29821a = str;
        this.f29822b = z;
        this.f29823c = bpVar;
        this.f29824d = alVar;
    }

    public final void run() {
        this.f29825e.m27746a(this.f29821a, this.f29822b, this.f29823c, this.f29824d);
    }
}
