package com.google.android.finsky.billing.myaccount;

import com.google.wireless.android.finsky.dfe.c.a.au;
import com.google.wireless.android.finsky.dfe.c.a.ax;

public final class com.google.android.finsky.billing.myaccount.ah implements Runnable
{

    public final com.google.android.finsky.billing.myaccount.af a;
    public final com.google.wireless.android.finsky.dfe.c.a.au b;

    ah(com.google.android.finsky.billing.myaccount.af p0, com.google.wireless.android.finsky.dfe.c.a.au p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void run() {
        this.a.b(this.b.d().c);
    }

}
