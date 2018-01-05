package com.google.android.finsky.cj;

import com.google.android.finsky.bn.c;
import com.google.wireless.android.finsky.b.a;
import com.google.wireless.android.finsky.b.e;

private final class com.google.android.finsky.cj.b
{

    public final com.google.android.finsky.bn.c a;
    public final com.google.wireless.android.finsky.b.a b;
    public com.google.android.finsky.cj.a c;
    public com.google.android.finsky.cj.a d;

    b(com.google.android.finsky.bn.c p0) {
        this.a = p0;
        this.b = p0.e;
        this.c = this.a(0);
        this.d = this.a(1);
    }

    private final com.google.android.finsky.cj.a a(int p0) {
        v1 = 0;
        if (this.b == 0)
            v0 = 0;
        else {
            v0 = 0;
            while (v0 < this.b.j.length) {
                if (this.b.j[v0].c == p0) {
                    if (p0 == 1)
                        v1 = 1;
                    v0 = new com.google.android.finsky.cj.a(v1, this.a.a, this.b.j[v0].d, this.b.j[v0].e);
                    v0.a();
                    return v0;
                }
                v0 = v0 + 1;
            }
            v0 = 0;
        }
        return v0;
    }

}
