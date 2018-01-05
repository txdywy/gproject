package com.google.android.finsky.billing.gifting;

import android.view.View;
import com.google.android.finsky.bg.s;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.gifting.c implements View$OnClickListener
{

    public final GiftingActivity a;

    c(GiftingActivity p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        this.a.E.b(new com.google.android.finsky.d.d(this.a).a(5553));
        com.google.android.finsky.bg.s.a(this.a, this.a.u);
        this.a.n.a(this.a.u.getMessage());
    }

}
