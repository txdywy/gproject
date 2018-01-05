package com.google.android.finsky.billing.iab;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.iab.j implements com.android.volley.w
{

    public final x[] a;
    public final String b;
    public final Semaphore c;
    public final com.google.android.finsky.billing.iab.e d;

    j(com.google.android.finsky.billing.iab.e p0, x[] p1, String p2, Semaphore p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0.toString();
        FinskyLog.c("Error response on confirmPurchase: %s", v1);
        this.a[0] = com.google.android.finsky.billing.iab.x.g;
        this.d.a(this.a[0], this.b, p0, com.google.android.finsky.billing.iab.e.a(p0));
        this.c.release();
    }

}
