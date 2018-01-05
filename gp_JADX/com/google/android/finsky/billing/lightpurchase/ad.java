package com.google.android.finsky.billing.lightpurchase;

final class ad implements Runnable {
    public final /* synthetic */ int f9728a;
    public final /* synthetic */ LightPurchaseFlowActivity f9729b;

    ad(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i) {
        this.f9729b = lightPurchaseFlowActivity;
        this.f9728a = i;
    }

    public final void run() {
        LightPurchaseFlowActivity lightPurchaseFlowActivity = this.f9729b;
        if (this.f9728a == -1) {
            lightPurchaseFlowActivity.m10088m();
        } else {
            lightPurchaseFlowActivity.m10087l();
        }
    }
}
