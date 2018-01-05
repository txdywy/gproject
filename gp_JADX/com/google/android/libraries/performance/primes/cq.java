package com.google.android.libraries.performance.primes;

import java.util.ArrayList;
import java.util.List;

final class cq implements C5985h {
    public final C6018r f29888a;
    public final List f29889b = new ArrayList();
    public boolean f29890c;

    cq(C6018r c6018r) {
        this.f29888a = c6018r;
        c6018r.m27896a((C5950g) this);
    }

    public final void mo5250a() {
        synchronized (this) {
            this.f29890c = true;
        }
        this.f29888a.m27897b((C5950g) this);
        for (dy e : this.f29889b) {
            e.mo5224e();
        }
    }
}
