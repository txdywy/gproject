package com.google.android.finsky.billing.lightpurchase;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.by.e;
import com.google.android.finsky.by.o;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;

public final class com.google.android.finsky.billing.lightpurchase.ao implements Runnable
{

    public final com.google.android.finsky.by.e a;
    public final VolleyError b;
    public final long c;
    public final boolean d;
    public final com.google.android.finsky.billing.lightpurchase.am e;

    ao(com.google.android.finsky.billing.lightpurchase.am p0, com.google.android.finsky.by.e p1, VolleyError p2, long p3, boolean p5) {
        this.e = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p5;
    }

    public final void run() {
        if (com.google.android.finsky.m.a.Y().a(this.e.h.a, this.a) != this.d)
            v0 = 1;
        else
            v0 = 0;
        this.e.aJ.a(new com.google.android.finsky.d.c(631).b("commit").a(this.b).b(SystemClock.elapsedRealtime() - this.c).a(v0));
    }

}
