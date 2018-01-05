package com.google.android.finsky.billing.b;

import com.google.android.finsky.billing.common.e;
import com.google.wireless.android.finsky.a.a.ax;

public final class com.google.android.finsky.billing.b.o implements Runnable
{

    public final com.google.wireless.android.finsky.a.a.ax a;
    public final com.google.android.finsky.billing.b.n b;

    o(com.google.android.finsky.billing.b.n p0, com.google.wireless.android.finsky.a.a.ax p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        this.b.m = 0;
        if (this.b.l != 0) {
            this.b.a(this.b.l);
            this.b.l = 0;
        }
        if (this.a != 0)
            this.b.d.a(this.a);
    }

}
