package com.google.android.finsky.cq;

import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.cq.c
{

    public final b[] a;
    public final int b;
    public final boolean c;

    c(b[] p0, int p1, boolean p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final List a() {
        v1 = new ArrayList();
        v0 = 0;
        while (v0 < this.a.length) {
            if (this.a[v0] != 0)
                v1.add(this.a[v0]);
            v0 = v0 + 1;
        }
        return v1;
    }

}
