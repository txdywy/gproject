package com.google.android.finsky.cs.a.a;

import com.google.android.gms.phenotype.core.a;

public final class com.google.android.finsky.cs.a.a.b implements com.google.android.finsky.cs.a.d
{

    public final l[] a;

    b(com.google.android.gms.phenotype.core.a p0) {
        this.a = new l[p0.b.length];
        v0 = p0.b.length - 1;
        while (v0 >= 0) {
            this.a[v0] = new com.google.android.finsky.cs.a.a.i(p0.b[v0]);
            v0 = v0 - 1;
        }
    }

    public final l[] a() {
        return this.a;
    }

}
