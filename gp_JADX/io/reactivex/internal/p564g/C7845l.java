package io.reactivex.internal.p564g;

import io.reactivex.internal.p552a.C7791b;
import io.reactivex.internal.p552a.C7797e;

final class C7845l implements Runnable {
    public final C7797e f40423a;
    public final Runnable f40424b;
    public final /* synthetic */ C7843j f40425c;

    C7845l(C7843j c7843j, C7797e c7797e, Runnable runnable) {
        this.f40425c = c7843j;
        this.f40423a = c7797e;
        this.f40424b = runnable;
    }

    public final void run() {
        C7791b.m37588b(this.f40423a, this.f40425c.mo6564a(this.f40424b));
    }
}
