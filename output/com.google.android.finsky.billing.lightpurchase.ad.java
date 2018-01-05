package com.google.android.finsky.billing.lightpurchase;

public final class com.google.android.finsky.billing.lightpurchase.ad implements Runnable
{

    public final int a;
    public final LightPurchaseFlowActivity b;

    ad(LightPurchaseFlowActivity p0, int p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        if (this.a == -1)
            this.b.m();
        else
            this.b.l();
    }

}
