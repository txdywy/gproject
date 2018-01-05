package com.google.android.finsky.cs.p135a.p136a;

import com.google.android.finsky.cs.p135a.C2372d;
import com.google.android.finsky.cs.p135a.C2384l;
import com.google.android.gms.phenotype.core.C5514a;

public final class C2373b implements C2372d {
    public final C2384l[] f11637a;

    public C2373b(C5514a c5514a) {
        this.f11637a = new C2384l[c5514a.f28340b.length];
        for (int length = c5514a.f28340b.length - 1; length >= 0; length--) {
            this.f11637a[length] = new C2385i(c5514a.f28340b[length]);
        }
    }

    public final C2384l[] mo2871a() {
        return this.f11637a;
    }
}
