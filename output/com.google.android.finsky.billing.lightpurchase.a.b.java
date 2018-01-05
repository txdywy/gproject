package com.google.android.finsky.billing.lightpurchase.a;

import android.widget.CompoundButton;
import android.widget.TextView;

public final class com.google.android.finsky.billing.lightpurchase.a.b implements CompoundButton$OnCheckedChangeListener
{

    public final com.google.android.finsky.billing.lightpurchase.a.a a;

    b(com.google.android.finsky.billing.lightpurchase.a.a p0) {
        this.a = p0;
    }

    public final void onCheckedChanged(CompoundButton p0, boolean p1) {
        if (p1 != 0)
            this.a.ao.setError(0);
    }

}
