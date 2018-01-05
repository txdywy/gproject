package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;

final class ab implements Runnable {
    public final /* synthetic */ int f9722a;
    public final /* synthetic */ Intent f9723b;
    public final /* synthetic */ LightPurchaseFlowActivity f9724c;

    ab(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        this.f9724c = lightPurchaseFlowActivity;
        this.f9722a = i;
        this.f9723b = intent;
    }

    public final void run() {
        LightPurchaseFlowActivity lightPurchaseFlowActivity = this.f9724c;
        int i = this.f9722a;
        Intent intent = this.f9723b;
        FinskyLog.m21659a("Payment screen finished with result: %d", Integer.valueOf(i));
        if (intent != null) {
            lightPurchaseFlowActivity.C = lightPurchaseFlowActivity.f9671t.m13182a(intent.getExtras(), lightPurchaseFlowActivity.C);
        }
        if (i == -1) {
            lightPurchaseFlowActivity.f9669Z = intent.getBooleanExtra("PurchaseActivity.postSuccessItemOpened", false);
            if (lightPurchaseFlowActivity.am) {
                if (!lightPurchaseFlowActivity.m10085i(false)) {
                    lightPurchaseFlowActivity.m10077a(lightPurchaseFlowActivity.ah);
                } else {
                    return;
                }
            }
            lightPurchaseFlowActivity.m10088m();
            return;
        }
        lightPurchaseFlowActivity.m10087l();
    }
}
