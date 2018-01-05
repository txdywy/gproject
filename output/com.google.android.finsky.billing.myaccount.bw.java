package com.google.android.finsky.billing.myaccount;

import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.dfe.h.a.i;

public final class com.google.android.finsky.billing.myaccount.bw implements com.android.volley.x
{

    public final com.google.android.finsky.d.w a;
    public final com.google.android.finsky.billing.myaccount.bu b;

    bw(com.google.android.finsky.billing.myaccount.bu p0, com.google.android.finsky.d.w p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void b_(Object p0) {
        if (((com.google.wireless.android.finsky.dfe.h.a.i)p0).b == 1) {
            com.google.android.finsky.billing.myaccount.bu.a(0, 0, this.a);
            this.b.b(2, 0);
        }
        else {
            com.google.android.finsky.billing.myaccount.bu.a(2, 0, this.a);
            this.b.b = ((com.google.wireless.android.finsky.dfe.h.a.i)p0).c;
            this.b.b(3, 0);
        }
    }

}
