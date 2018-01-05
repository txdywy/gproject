package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.finsky.activities.C1036b;
import java.util.HashMap;
import java.util.Map;

final class ae implements Runnable {
    public final /* synthetic */ int f9730a;
    public final /* synthetic */ Intent f9731b;
    public final /* synthetic */ LightPurchaseFlowActivity f9732c;

    ae(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        this.f9732c = lightPurchaseFlowActivity;
        this.f9730a = i;
        this.f9731b = intent;
    }

    public final void run() {
        C1036b c1036b = this.f9732c;
        int i = this.f9730a;
        Intent intent = this.f9731b;
        if (i == 0) {
            c1036b.m10083c(i);
        } else if (i != -1) {
            c1036b.m10087l();
        } else {
            i = intent.getIntExtra("AskToDownloadActivity.authMethod", 0);
            intent.removeExtra("AskToDownloadActivity.authMethod");
            Map hashMap = new HashMap();
            hashMap.put("pcam", String.valueOf(i));
            Bundle extras = intent.getExtras();
            for (String str : extras.keySet()) {
                hashMap.put(str, String.valueOf(extras.get(str)));
            }
            ar.m10198a(c1036b.f9652I, c1036b.f9663T, c1036b.f9654K, c1036b.f9653J, c1036b.f9655L, c1036b.f9664U, hashMap, new aj(c1036b), new ai(c1036b), true, c1036b.ak, c1036b.f6316C, null);
        }
    }
}
