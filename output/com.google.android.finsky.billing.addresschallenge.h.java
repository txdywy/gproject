package com.google.android.finsky.billing.addresschallenge;

import com.google.wireless.android.finsky.a.a.i;

public final class com.google.android.finsky.billing.addresschallenge.h implements Runnable
{

    public final com.google.android.finsky.billing.addresschallenge.e a;

    h(com.google.android.finsky.billing.addresschallenge.e p0) {
        this.a = p0;
    }

    public final void run() {
        v0 = 0;
        while (v0 < this.a.i.h.length) {
            this.a.g.a(this.a.i.h[v0]);
            v0 = v0 + 1;
        }
    }

}
