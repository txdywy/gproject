package com.google.android.finsky.billing.lightpurchase;

import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.billing.lightpurchase.y implements Runnable
{

    public final int a;
    public final LightPurchaseFlowActivity b;

    y(LightPurchaseFlowActivity p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        if (this.a == -1) {
            v2 = new Object[1];
            v2[0] = this.b.J;
            FinskyLog.a("Prompt for FOP activity success: %s", v2);
            if (this.b.ao == 0 || !this.b.h(1)) {
                if (this.b.an != 0 && this.b.C())
                    this.b.E();
                else
                    this.b.G();
            }
        }
        else {
            v2 = new Object[1];
            v2[0] = this.b.J;
            FinskyLog.a("Prompt for FOP activity canceled: %s", v2);
            this.b.l();
        }
    }

}
