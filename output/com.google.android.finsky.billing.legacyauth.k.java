package com.google.android.finsky.billing.legacyauth;

import android.content.Intent;
import android.view.View;

public final class com.google.android.finsky.billing.legacyauth.k implements View$OnClickListener
{

    public final int a;
    public final PurchaseAuthActivity b;

    k(PurchaseAuthActivity p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        if (this.b.q != this.a) {
            v2 = new Intent();
            v2.putExtra("purchase-auth-current", this.b.q);
            v2.putExtra("purchase-auth-new", this.a);
            this.b.setResult(-1, v2);
        }
        this.b.finish();
    }

}
