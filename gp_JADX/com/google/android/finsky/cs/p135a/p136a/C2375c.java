package com.google.android.finsky.cs.p135a.p136a;

import com.google.android.finsky.cs.p135a.C2372d;
import com.google.android.finsky.cs.p135a.C2374e;
import com.google.android.gms.phenotype.core.C5516b;

public final class C2375c implements C2374e {
    public final C5516b f11638a;
    public final C2372d[] f11639b = new C2373b[this.f11638a.f28355d.length];

    public C2375c(C5516b c5516b) {
        this.f11638a = c5516b;
        for (int length = this.f11638a.f28355d.length - 1; length >= 0; length--) {
            this.f11639b[length] = new C2373b(this.f11638a.f28355d[length]);
        }
    }

    public final String mo2872a() {
        return this.f11638a.f28352a;
    }

    public final String mo2873b() {
        return this.f11638a.f28354c;
    }

    public final C2372d[] mo2874c() {
        return this.f11639b;
    }
}
