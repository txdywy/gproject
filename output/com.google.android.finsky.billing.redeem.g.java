package com.google.android.finsky.billing.redeem;

import com.android.volley.VolleyError;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.redeem.g implements com.android.volley.w
{

    public final com.google.android.finsky.d.w a;
    public final com.google.android.finsky.billing.redeem.c b;

    g(com.google.android.finsky.billing.redeem.c p0, com.google.android.finsky.d.w p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void a(VolleyError p0) {
        this.b.e = p0;
        this.a.a(new com.google.android.finsky.d.c(801).a(-1).a(p0));
        this.b.b(3, 1);
    }

}
