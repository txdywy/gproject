package com.google.android.finsky.billing;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.d implements com.android.volley.w
{

    public final int[] a;
    public final Semaphore b;

    d(int[] p0, Semaphore p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.c("Received error: %s", v1);
        this.a[0] = BillingAccountService.a(p0);
        this.b.release();
    }

}
