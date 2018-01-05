package com.google.android.finsky.billing;

import com.google.wireless.android.finsky.dfe.nano.aq;
import java.util.concurrent.Semaphore;

public final class com.google.android.finsky.billing.c implements com.android.volley.x
{

    public final int[] a;
    public final Semaphore b;

    c(int[] p0, Semaphore p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void b_(Object p0) {
        if (((com.google.wireless.android.finsky.dfe.nano.aq)p0).b != 0)
            v0 = 1;
        else
            v0 = 2;
        this.a[0] = v0;
        this.b.release();
    }

}
