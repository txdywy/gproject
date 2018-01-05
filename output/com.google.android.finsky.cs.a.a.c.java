package com.google.android.finsky.cs.a.a;

import com.google.android.gms.phenotype.core.b;

public final class com.google.android.finsky.cs.a.a.c implements com.google.android.finsky.cs.a.e
{

    public final com.google.android.gms.phenotype.core.b a;
    public final d[] b;

    c(com.google.android.gms.phenotype.core.b p0) {
        this.a = p0;
        this.b = new b[this.a.d.length];
        v0 = this.a.d.length - 1;
        while (v0 >= 0) {
            this.b[v0] = new com.google.android.finsky.cs.a.a.b(this.a.d[v0]);
            v0 = v0 - 1;
        }
    }

    public final String a() {
        return this.a.a;
    }

    public final String b() {
        return this.a.c;
    }

    public final d[] c() {
        return this.b;
    }

}
