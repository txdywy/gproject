package com.google.android.finsky.billing;

import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.gp;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.b implements com.google.android.finsky.dp.g
{

    public final Semaphore a;
    public final int[] b;

    b(Semaphore p0, int[] p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void a(VolleyError p0) {
        v1 = new Object[1];
        v1[0] = p0;
        FinskyLog.d("Error while loading toc: %s", v1);
        this.b[0] = BillingAccountService.a(p0);
        this.a.release();
    }

    public final void a(com.google.wireless.android.finsky.dfe.nano.gp p0) {
        this.a.release();
    }

}
