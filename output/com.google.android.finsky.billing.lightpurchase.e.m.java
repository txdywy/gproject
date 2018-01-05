package com.google.android.finsky.billing.lightpurchase.e;

import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.lightpurchase.e.m implements View$OnClickListener
{

    public final String a;
    public final com.google.android.finsky.billing.lightpurchase.e.k b;

    m(com.google.android.finsky.billing.lightpurchase.e.k p0, String p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.Y().b(new com.google.android.finsky.d.d(this.b).a(718));
        com.google.android.finsky.bg.a.a(p0.getContext(), this.b.c(2131951905), p0, 0);
        ((com.google.android.finsky.billing.lightpurchase.aq)this.b.aa()).a(this.a);
    }

}
