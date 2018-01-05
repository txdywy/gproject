package com.google.android.finsky.billing.myaccount;

import android.content.DialogInterface;
import com.google.wireless.android.finsky.dfe.c.a.bk;

public final class com.google.android.finsky.billing.myaccount.ak implements DialogInterface$OnCancelListener
{

    public final com.google.android.finsky.billing.myaccount.af a;
    public final com.google.wireless.android.finsky.dfe.c.a.bk b;

    ak(com.google.android.finsky.billing.myaccount.af p0, com.google.wireless.android.finsky.dfe.c.a.bk p1) {
        this.a = p0;
        this.b = p1;
    }

    public final void onCancel(DialogInterface p0) {
        this.a.b(this.b.g);
    }

}
