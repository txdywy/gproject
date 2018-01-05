package com.google.android.finsky.billing.addresschallenge.a;

public final class com.google.android.finsky.billing.addresschallenge.a.aw implements Runnable
{

    public com.google.android.finsky.billing.addresschallenge.a.a a;
    public com.google.android.finsky.billing.addresschallenge.a.f b;
    public com.google.android.finsky.billing.addresschallenge.a.y c;
    public final com.google.android.finsky.billing.addresschallenge.a.av d;

    aw(com.google.android.finsky.billing.addresschallenge.a.av p0, com.google.android.finsky.billing.addresschallenge.a.a p1, com.google.android.finsky.billing.addresschallenge.a.f p2, com.google.android.finsky.billing.addresschallenge.a.y p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void run() {
        this.c.a();
        v2 = this.d.a;
        v1 = 0;
        if (this.a.k != 0) {
            if (com.google.android.finsky.billing.addresschallenge.a.az.a(this.a.k))
                v1 = com.google.android.finsky.billing.addresschallenge.a.ao.a;
            else
                v1 = com.google.android.finsky.billing.addresschallenge.a.ao.b;
        }
        this.d.a(v1, v2, com.google.android.finsky.billing.addresschallenge.a.d.k, this.a.a, this.b);
        if (this.b.a()) {
            v2 = v2.a(this.a.a);
            this.d.a(v1, v2, com.google.android.finsky.billing.addresschallenge.a.d.a, this.a.d, this.b);
            if (this.b.a()) {
                v2 = v2.a(this.a.d);
                this.d.a(v1, v2, com.google.android.finsky.billing.addresschallenge.a.d.b, this.a.e, this.b);
                if (this.b.a()) {
                    v2 = v2.a(this.a.e);
                    this.d.a(v1, v2, com.google.android.finsky.billing.addresschallenge.a.d.g, this.a.f, this.b);
                    if (this.b.a())
                        v2 = v2.a(this.a.f);
                }
            }
        }
        v3 = new String[2];
        v3[0] = this.a.b;
        v3[1] = this.a.c;
        this.d.a(v1, v2, com.google.android.finsky.billing.addresschallenge.a.d.h, this.a.g, this.b);
        this.d.a(v1, v2, com.google.android.finsky.billing.addresschallenge.a.d.j, com.google.android.finsky.billing.addresschallenge.a.az.a("\n", v3), this.b);
        this.d.a(v1, v2, com.google.android.finsky.billing.addresschallenge.a.d.i, this.a.h, this.b);
        this.d.a(v1, v2, com.google.android.finsky.billing.addresschallenge.a.d.d, this.a.i, this.b);
        this.d.a(v1, v2, com.google.android.finsky.billing.addresschallenge.a.d.c, this.a.j, this.b);
        com.google.android.finsky.billing.addresschallenge.a.av.a();
        this.c.b();
    }

}
