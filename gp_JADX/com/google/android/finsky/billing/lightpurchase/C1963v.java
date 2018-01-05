package com.google.android.finsky.billing.lightpurchase;

import com.google.android.finsky.utils.FinskyLog;

final class C1963v implements Runnable {
    public final /* synthetic */ int f9972a;
    public final /* synthetic */ LightPurchaseFlowActivity f9973b;

    C1963v(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i) {
        this.f9973b = lightPurchaseFlowActivity;
        this.f9972a = i;
    }

    public final void run() {
        LightPurchaseFlowActivity lightPurchaseFlowActivity = this.f9973b;
        if (this.f9972a == -1) {
            FinskyLog.m21659a("Age verification activity success: %s", lightPurchaseFlowActivity.f9653J);
            lightPurchaseFlowActivity.m10066B();
            return;
        }
        FinskyLog.m21659a("Age verification activity canceled: %s", lightPurchaseFlowActivity.f9653J);
        lightPurchaseFlowActivity.m10087l();
    }
}
