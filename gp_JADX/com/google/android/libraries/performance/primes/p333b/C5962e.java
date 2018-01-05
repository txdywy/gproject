package com.google.android.libraries.performance.primes.p333b;

import com.google.android.libraries.p326c.p327a.C5916a;

public abstract class C5962e {
    public int f29721i;
    public C5962e f29722j;
    public int f29723k;

    protected C5962e(int i) {
        this.f29721i = i;
    }

    public abstract int mo5235a(C5970j c5970j);

    public abstract int mo5236a(C5970j c5970j, int i);

    public abstract String mo5237b(C5970j c5970j, int i);

    public abstract String mo5238c(C5970j c5970j, int i);

    public final int m27680d(C5970j c5970j) {
        return c5970j.m27710d(this.f29721i);
    }

    public final int m27677a(C5970j c5970j, String str) {
        C5916a.m27406a((Object) str);
        int a = mo5235a(c5970j);
        for (int i = 0; i < a; i++) {
            if (str.equals(mo5237b(c5970j, i))) {
                return mo5236a(c5970j, i);
            }
        }
        return 0;
    }

    public final int m27681d(C5970j c5970j, int i) {
        int a = mo5235a(c5970j);
        for (int i2 = 0; i2 < a; i2++) {
            if (i == mo5236a(c5970j, i2)) {
                return i2;
            }
        }
        return -1;
    }
}
