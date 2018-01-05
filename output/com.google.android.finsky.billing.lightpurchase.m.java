package com.google.android.finsky.billing.lightpurchase;

import com.android.volley.VolleyError;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.lightpurchase.m implements com.android.volley.w
{

    public final com.google.android.finsky.d.w a;
    public final com.google.android.finsky.billing.lightpurchase.i b;

    m(com.google.android.finsky.billing.lightpurchase.i p0, com.google.android.finsky.d.w p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a(VolleyError p0) {
        this.b.ar = p0;
        com.google.android.finsky.billing.lightpurchase.i.a(this.b, this.a, 305, p0, this.b.aa(), this.b.Z());
        this.b.b(3, 3);
    }

}
