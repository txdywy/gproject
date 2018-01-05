package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.ke;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.billing.myaccount.layout.h implements View$OnClickListener
{

    public final com.google.android.finsky.d.w a;
    public final Document b;
    public final com.google.android.finsky.billing.myaccount.layout.p c;
    public final com.google.android.finsky.cv.a.ke d;
    public final SubscriptionRowView e;

    h(SubscriptionRowView p0, com.google.android.finsky.d.w p1, Document p2, com.google.android.finsky.billing.myaccount.layout.p p3, com.google.android.finsky.cv.a.ke p4) {
        this.e = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
    }

    public final void onClick(View p0) {
        this.a.b(new com.google.android.finsky.d.d(this.e).a(2643).a(this.b.a.D));
        this.c.a(this.b, this.d.f);
    }

}
