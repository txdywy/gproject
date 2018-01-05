package com.google.android.finsky.billing.lightpurchase;

final class af implements Runnable {
    public final /* synthetic */ int f9733a;
    public final /* synthetic */ LightPurchaseFlowActivity f9734b;

    af(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i) {
        this.f9734b = lightPurchaseFlowActivity;
        this.f9733a = i;
    }

    public final void run() {
        LightPurchaseFlowActivity lightPurchaseFlowActivity = this.f9734b;
        if (this.f9733a == -1) {
            lightPurchaseFlowActivity.m10088m();
        } else {
            lightPurchaseFlowActivity.m10087l();
        }
    }
}
