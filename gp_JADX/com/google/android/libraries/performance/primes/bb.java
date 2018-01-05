package com.google.android.libraries.performance.primes;

import d.a.a.a.a.a.ag;
import d.a.a.a.a.a.bp;

final class bb implements Runnable {
    public final /* synthetic */ String f29763a;
    public final /* synthetic */ boolean f29764b;
    public final /* synthetic */ av f29765c;
    public final /* synthetic */ az f29766d;

    bb(az azVar, String str, boolean z, av avVar) {
        this.f29766d = azVar;
        this.f29763a = str;
        this.f29764b = z;
        this.f29765c = avVar;
    }

    public final void run() {
        C5949a c5949a = this.f29766d;
        String str = this.f29763a;
        boolean z = this.f29764b;
        av avVar = this.f29765c;
        ag agVar = new ag();
        agVar.a = Integer.valueOf(avVar.f29680b);
        agVar.b = Integer.valueOf(avVar.f29679a);
        agVar.c = Integer.valueOf((int) avVar.f29682d);
        agVar.d = Integer.valueOf((int) avVar.f29681c);
        bp bpVar = new bp();
        bpVar.l = agVar;
        c5949a.m27578a(str, z, bpVar);
    }
}
