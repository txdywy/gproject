package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import android.view.View$OnClickListener;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.myaccount.layout.b implements View$OnClickListener
{

    public final com.google.android.finsky.d.w a;
    public final com.google.android.finsky.billing.myaccount.layout.c b;
    public final AccountSimpleRowView c;

    b(AccountSimpleRowView p0, com.google.android.finsky.d.w p1, com.google.android.finsky.billing.myaccount.layout.c p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void onClick(View p0) {
        this.a.b(new com.google.android.finsky.d.d(this.c));
        this.b.i.onClick(p0);
    }

}
