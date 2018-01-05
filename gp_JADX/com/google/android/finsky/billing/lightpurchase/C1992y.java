package com.google.android.finsky.billing.lightpurchase;

import com.google.android.finsky.utils.FinskyLog;

final class C1992y implements Runnable {
    public final /* synthetic */ int f10113a;
    public final /* synthetic */ LightPurchaseFlowActivity f10114b;

    C1992y(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i) {
        this.f10114b = lightPurchaseFlowActivity;
        this.f10113a = i;
    }

    public final void run() {
        LightPurchaseFlowActivity lightPurchaseFlowActivity = this.f10114b;
        if (this.f10113a == -1) {
            FinskyLog.m21659a("Prompt for FOP activity success: %s", lightPurchaseFlowActivity.f9653J);
            if (!lightPurchaseFlowActivity.ao || !lightPurchaseFlowActivity.m10084h(true)) {
                if (lightPurchaseFlowActivity.an && lightPurchaseFlowActivity.m10067C()) {
                    lightPurchaseFlowActivity.m10069E();
                    return;
                } else {
                    lightPurchaseFlowActivity.m10071G();
                    return;
                }
            }
            return;
        }
        FinskyLog.m21659a("Prompt for FOP activity canceled: %s", lightPurchaseFlowActivity.f9653J);
        lightPurchaseFlowActivity.m10087l();
    }
}
