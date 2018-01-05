package com.google.android.finsky.billing.addresschallenge.a;

import android.os.Handler;
import android.util.Log;

public final class com.google.android.finsky.billing.addresschallenge.a.l implements com.google.android.finsky.billing.addresschallenge.a.y
{

    public final com.google.android.finsky.billing.addresschallenge.a.j a;

    l(com.google.android.finsky.billing.addresschallenge.a.j p0) {
        this.a = p0;
    }

    public final void a() {
    }

    public final void b() {
        Log.d(this.toString(), "Data loading completed.");
        this.a.u.post(new com.google.android.finsky.billing.addresschallenge.a.m(this));
    }

}
