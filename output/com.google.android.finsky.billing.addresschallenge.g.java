package com.google.android.finsky.billing.addresschallenge;

import android.os.Bundle;
import com.google.wireless.android.finsky.a.a.p;

public final class com.google.android.finsky.billing.addresschallenge.g implements com.google.android.finsky.billing.addresschallenge.q
{

    public final com.google.android.finsky.billing.addresschallenge.e a;

    g(com.google.android.finsky.billing.addresschallenge.e p0) {
        this.a = p0;
    }

    public final void a(com.google.wireless.android.finsky.a.a.p p0) {
        this.a.g.a(p0, this.a.b, 0);
        if (this.a.d != 0) {
            v0 = new Bundle();
            this.a.a(v0);
            this.a.d.a(p0.c, v0);
        }
    }

}
