package com.google.android.finsky.billing.addresschallenge.a;

import java.util.ArrayList;

public final class com.google.android.finsky.billing.addresschallenge.a.p implements Runnable
{

    public com.google.android.finsky.billing.addresschallenge.a.d a;
    public final com.google.android.finsky.billing.addresschallenge.a.j b;

    p(com.google.android.finsky.billing.addresschallenge.a.j p0, com.google.android.finsky.billing.addresschallenge.a.d p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        v2 = 0;
        while (v2 < ((ArrayList)this.b.v).size()) {
            v1 = ((ArrayList)this.b.v).get(v2);
            v2 = v2 + 1;
            if (((com.google.android.finsky.billing.addresschallenge.a.n)v1).c != this.a)
                continue;
            ((com.google.android.finsky.billing.addresschallenge.a.n)v1).a(this.b.a(((com.google.android.finsky.billing.addresschallenge.a.n)v1).c), "");
        }
    }

}
