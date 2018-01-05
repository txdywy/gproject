package com.google.android.finsky.billing.lightpurchase;

import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.lightpurchase.v implements Runnable
{

    public final int a;
    public final LightPurchaseFlowActivity b;

    v(LightPurchaseFlowActivity p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        if (this.a == -1) {
            v2 = new Object[1];
            v2[0] = this.b.J;
            FinskyLog.a("Age verification activity success: %s", v2);
            this.b.B();
        }
        else {
            v2 = new Object[1];
            v2[0] = this.b.J;
            FinskyLog.a("Age verification activity canceled: %s", v2);
            this.b.l();
        }
    }

}
