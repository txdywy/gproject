package com.google.android.finsky.billing.myaccount;

import android.view.View;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.pagesystem.b;
import com.google.wireless.android.finsky.dfe.nano.cl;

public final class com.google.android.finsky.billing.myaccount.bg implements View$OnClickListener
{

    public final com.google.wireless.android.finsky.dfe.nano.cl a;
    public final com.google.android.finsky.billing.myaccount.bf b;

    bg(com.google.android.finsky.billing.myaccount.bf p0, com.google.wireless.android.finsky.dfe.nano.cl p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.a.bw.b(new com.google.android.finsky.d.d(this.b.a).a(2695));
        this.b.a.ag.a(this.a, new com.google.android.finsky.billing.myaccount.bh(this), 0);
    }

}
