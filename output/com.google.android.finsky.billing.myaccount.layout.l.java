package com.google.android.finsky.billing.myaccount.layout;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.ke;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.a;

public final class com.google.android.finsky.billing.myaccount.layout.l implements View$OnClickListener
{

    public final com.google.android.finsky.d.w a;
    public final Document b;
    public final com.google.android.finsky.navigationmanager.a c;
    public final com.google.android.finsky.cv.a.ke d;
    public final DfeToc e;
    public final SubscriptionRowView f;

    l(SubscriptionRowView p0, com.google.android.finsky.d.w p1, Document p2, com.google.android.finsky.navigationmanager.a p3, com.google.android.finsky.cv.a.ke p4, DfeToc p5) {
        this.f = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
    }

    public final void onClick(View p0) {
        this.a.b(new com.google.android.finsky.d.d(this.f).a(2645).a(this.b.a.D));
        this.c.a(this.d.e, this.e, p0.getContext().getPackageManager(), this.a);
    }

}
