package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;
import com.google.android.finsky.d.a;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.lightpurchase.ab implements Runnable
{

    public final int a;
    public final Intent b;
    public final LightPurchaseFlowActivity c;

    ab(LightPurchaseFlowActivity p0, int p1, Intent p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        v4 = new Object[1];
        v4[0] = Integer.valueOf(this.a);
        FinskyLog.a("Payment screen finished with result: %d", v4);
        if (this.b != 0)
            this.c.C = this.c.t.a(this.b.getExtras(), this.c.C);
        if (this.a == -1) {
            this.c.Z = this.b.getBooleanExtra("PurchaseActivity.postSuccessItemOpened", 0);
            if (this.c.am == 0) {
                this.c.m();
                return;
            }
            if (!this.c.i(0)) {
                this.c.a(this.c.ah);
                this.c.m();
            }
        }
        else
            this.c.l();
    }

}
