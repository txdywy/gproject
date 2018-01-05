package com.google.android.finsky.billing.gifting;

import android.view.View;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.gifting.d implements View$OnClickListener
{

    public final GiftingActivity a;

    d(GiftingActivity p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        this.a.E.b(new com.google.android.finsky.d.d(this.a).a(5555));
        this.a.finish();
    }

}
