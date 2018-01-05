package com.google.android.finsky.billing.myaccount;

import android.support.v4.app.Fragment;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.m;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.myaccount.bv implements com.android.volley.w
{

    public final com.google.android.finsky.d.w a;
    public final com.google.android.finsky.billing.myaccount.bu b;

    bv(com.google.android.finsky.billing.myaccount.bu p0, com.google.android.finsky.d.w p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a(VolleyError p0) {
        com.google.android.finsky.billing.myaccount.bu.a(1, p0, this.a);
        this.b.b = com.google.android.finsky.api.m.a(this.b.h(), p0);
        this.b.b(3, 0);
    }

}
