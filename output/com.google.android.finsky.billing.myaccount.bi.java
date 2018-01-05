package com.google.android.finsky.billing.myaccount;

import android.content.Intent;
import android.support.v4.app.u;
import android.view.View;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;

public final class com.google.android.finsky.billing.myaccount.bi implements View$OnClickListener
{

    public final Intent a;
    public final ManageSubscriptionActivity b;

    bi(ManageSubscriptionActivity p0, Intent p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.E.b(new com.google.android.finsky.d.d(this.b).a(2643).a(this.b.p.a.D));
        this.b.startActivityForResult(this.a, 2);
    }

}
