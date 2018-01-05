package com.google.android.finsky.billing.myaccount;

import android.view.View;
import android.widget.Button;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.wireless.android.finsky.dfe.nano.cl;

public final class com.google.android.finsky.billing.myaccount.au implements View$OnClickListener
{

    public final com.google.wireless.android.finsky.dfe.nano.cl a;
    public final Button b;
    public final com.google.android.finsky.billing.myaccount.an c;

    au(com.google.android.finsky.billing.myaccount.an p0, com.google.wireless.android.finsky.dfe.nano.cl p1, Button p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        this.c.j.b(new com.google.android.finsky.d.d(this.c.l).a(2696));
        com.google.android.finsky.billing.myaccount.an.a(this.c, this.a.b, this.b, 2131951858, new com.google.android.finsky.billing.myaccount.av(this));
    }

}
