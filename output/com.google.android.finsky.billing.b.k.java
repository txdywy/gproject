package com.google.android.finsky.billing.b;

import com.android.volley.VolleyError;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.b.k implements com.android.volley.w
{

    public boolean a;
    public final com.google.android.finsky.billing.b.i b;

    k(com.google.android.finsky.billing.b.i p0) {
        this.b = p0;
    }

    public final void a(VolleyError p0) {
        if (this.a == 0) {
            this.b.a(p0);
            this.b.l.release();
        }
    }

}
