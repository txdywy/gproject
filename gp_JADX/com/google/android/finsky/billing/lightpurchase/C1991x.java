package com.google.android.finsky.billing.lightpurchase;

final class C1991x implements Runnable {
    public final /* synthetic */ int f10111a;
    public final /* synthetic */ LightPurchaseFlowActivity f10112b;

    C1991x(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i) {
        this.f10112b = lightPurchaseFlowActivity;
        this.f10111a = i;
    }

    public final void run() {
        if (this.f10112b.as != null) {
            this.f10112b.as.m10156a(this.f10111a);
            this.f10112b.as = null;
        }
    }
}
