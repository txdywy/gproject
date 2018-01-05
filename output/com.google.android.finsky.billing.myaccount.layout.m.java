package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.cv.a.ke;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.billing.myaccount.layout.m implements View$OnClickListener
{

    public final com.google.android.finsky.billing.myaccount.layout.n a;
    public final Document b;
    public final com.google.android.finsky.cv.a.ke c;
    public final SubscriptionRowView d;

    m(SubscriptionRowView p0, com.google.android.finsky.billing.myaccount.layout.n p1, Document p2, com.google.android.finsky.cv.a.ke p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void onClick(View p0) {
        this.a.a(this.b, this.d.q.cZ(), this.c.i);
    }

}
