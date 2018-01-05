package com.google.android.finsky.billing.addresschallenge.a;

import android.os.Handler;

public final class com.google.android.finsky.billing.addresschallenge.a.k implements com.google.android.finsky.billing.addresschallenge.a.y
{

    public final com.google.android.finsky.billing.addresschallenge.a.d a;
    public final com.google.android.finsky.billing.addresschallenge.a.j b;

    k(com.google.android.finsky.billing.addresschallenge.a.j p0, com.google.android.finsky.billing.addresschallenge.a.d p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a() {
    }

    public final void b() {
        this.b.u.post(new com.google.android.finsky.billing.addresschallenge.a.p(this.b, this.a));
    }

}
