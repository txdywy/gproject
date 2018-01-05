package com.google.android.libraries.performance.primes;

final class an implements ap {
    public final /* synthetic */ am f29659a;

    an(am amVar) {
        this.f29659a = amVar;
    }

    public final void mo5228a(String str) {
        this.f29659a.m27619a(str);
    }

    public final void mo5229b(String str) {
        this.f29659a.m27620a(str, true);
    }

    public final void mo5227a(int i) {
        am amVar = this.f29659a;
        synchronized (amVar.f29655h) {
            for (as a : amVar.f29655h.values()) {
                a.mo5232a(i, amVar.f29658k);
            }
        }
    }
}
