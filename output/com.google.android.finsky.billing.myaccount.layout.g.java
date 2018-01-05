package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.billing.myaccount.layout.g implements View$OnClickListener
{

    public final com.google.android.finsky.navigationmanager.a a;
    public final Document b;
    public final com.google.android.finsky.d.ad c;
    public final com.google.android.finsky.d.w d;
    public final SubscriptionRowView e;

    g(SubscriptionRowView p0, com.google.android.finsky.navigationmanager.a p1, Document p2, com.google.android.finsky.d.ad p3, com.google.android.finsky.d.w p4) {
        this.e = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
    }

    public final void onClick(View p0) {
        this.a.a(this.b, this.c, this.e.getThumbnailCover(), this.d);
    }

}
