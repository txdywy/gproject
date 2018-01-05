package com.google.android.finsky.billing.myaccount;

import android.view.View;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.dfe.c.a.av;

public final class com.google.android.finsky.billing.myaccount.y implements View$OnClickListener
{

    public final com.google.android.finsky.billing.myaccount.x a;
    public final com.google.android.finsky.billing.myaccount.ab b;
    public final com.google.android.finsky.d.ad c;
    public final com.google.android.finsky.d.w d;
    public final com.google.wireless.android.finsky.dfe.c.a.av e;

    y(com.google.android.finsky.billing.myaccount.x p0, com.google.android.finsky.billing.myaccount.ab p1, com.google.android.finsky.d.ad p2, com.google.android.finsky.d.w p3, com.google.wireless.android.finsky.dfe.c.a.av p4) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p4;
    }

    public final void onClick(View p0) {
        com.google.android.finsky.billing.myaccount.w.a(this.b, this.c, this.d);
        this.a.x.i.a(this.e.f);
    }

}
