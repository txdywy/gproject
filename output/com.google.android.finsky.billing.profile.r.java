package com.google.android.finsky.billing.profile;

import com.android.volley.VolleyError;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.profile.r implements com.android.volley.w
{

    public final com.google.android.finsky.d.w a;
    public final int b;
    public final com.google.android.finsky.billing.profile.m c;

    r(com.google.android.finsky.billing.profile.m p0, com.google.android.finsky.d.w p1, int p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void a(VolleyError p0) {
        this.c.a(1, p0, this.a);
        this.c.an = p0;
        this.c.b(this.b, 2);
    }

}
