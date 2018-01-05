package com.google.android.finsky.billing.myaccount;

import android.view.View;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.billing.myaccount.c implements View$OnClickListener
{

    public final int a;
    public final com.google.android.finsky.billing.myaccount.a b;

    c(com.google.android.finsky.billing.myaccount.a p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.h.a(this.a, this.b.j);
    }

}
