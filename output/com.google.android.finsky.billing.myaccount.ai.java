package com.google.android.finsky.billing.myaccount;

import android.content.DialogInterface;
import com.google.wireless.android.finsky.dfe.c.a.bk;

public final class com.google.android.finsky.billing.myaccount.ai implements DialogInterface$OnClickListener
{

    public final com.google.android.finsky.billing.myaccount.af a;
    public final com.google.wireless.android.finsky.dfe.c.a.bk b;

    ai(com.google.android.finsky.billing.myaccount.af p0, com.google.wireless.android.finsky.dfe.c.a.bk p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void onClick(DialogInterface p0, int p1) {
        this.a.b(this.b.f);
    }

}
