package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;

final class ac implements Runnable {
    public final /* synthetic */ int f9725a;
    public final /* synthetic */ Intent f9726b;
    public final /* synthetic */ LightPurchaseFlowActivity f9727c;

    ac(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        this.f9727c = lightPurchaseFlowActivity;
        this.f9725a = i;
        this.f9726b = intent;
    }

    public final void run() {
        LightPurchaseFlowActivity lightPurchaseFlowActivity = this.f9727c;
        int i = this.f9725a;
        Intent intent = this.f9726b;
        FinskyLog.m21659a("TV payment screen finished with result: %d", Integer.valueOf(i));
        if (i == -1) {
            if (lightPurchaseFlowActivity.f9659P) {
                Intent intent2 = new Intent();
                intent2.putExtra("authAccount", lightPurchaseFlowActivity.f9652I.name);
                intent2.putExtras(intent.getExtras());
                lightPurchaseFlowActivity.setResult(-1, intent2);
            } else {
                lightPurchaseFlowActivity.setResult(-1);
            }
            lightPurchaseFlowActivity.m10088m();
            return;
        }
        lightPurchaseFlowActivity.m10087l();
    }
}
