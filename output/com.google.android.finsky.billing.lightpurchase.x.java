package com.google.android.finsky.billing.lightpurchase;

public final class com.google.android.finsky.billing.lightpurchase.x implements Runnable
{

    public final int a;
    public final LightPurchaseFlowActivity b;

    x(LightPurchaseFlowActivity p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        if (this.b.as != 0) {
            this.b.as.a(this.a);
            this.b.as = 0;
        }
    }

}
