package com.google.android.finsky.billing.myaccount.layout;

import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.f.a;

public final class com.google.android.finsky.billing.myaccount.layout.d implements View$OnClickListener
{

    public final com.google.android.finsky.d.w a;
    public final com.google.android.finsky.billing.myaccount.layout.e b;
    public final Document c;
    public final com.google.android.finsky.f.a d;
    public final OrderHistoryRowView e;

    d(OrderHistoryRowView p0, com.google.android.finsky.d.w p1, com.google.android.finsky.billing.myaccount.layout.e p2, Document p3, com.google.android.finsky.f.a p4) {
        this.e = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
    }

    public final void onClick(View p0) {
        this.a.b(new com.google.android.finsky.d.d(this.e.y));
        this.b.a(this.c.a.d, this.d.r);
    }

}
