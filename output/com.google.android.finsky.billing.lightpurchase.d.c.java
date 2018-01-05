package com.google.android.finsky.billing.lightpurchase.d;

import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.bg.s;

public final class com.google.android.finsky.billing.lightpurchase.d.c implements View$OnClickListener
{

    public final com.google.android.finsky.billing.lightpurchase.d.a a;

    c(com.google.android.finsky.billing.lightpurchase.d.a p0) {
        this.a = p0;
    }

    public final void onClick(View p0) {
        if (this.a.ax != 0 && this.a.az != 0) {
            com.google.android.finsky.bg.s.a(this.a.h(), this.a.ax.R);
            if (p0 == this.a.aG)
                this.a.ax.X();
            else if (p0 == this.a.aH)
                this.a.ax.Z();
        }
    }

}
