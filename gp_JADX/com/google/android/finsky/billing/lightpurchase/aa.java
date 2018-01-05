package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;

final class aa implements Runnable {
    public final /* synthetic */ int f9719a;
    public final /* synthetic */ Intent f9720b;
    public final /* synthetic */ LightPurchaseFlowActivity f9721c;

    aa(LightPurchaseFlowActivity lightPurchaseFlowActivity, int i, Intent intent) {
        this.f9721c = lightPurchaseFlowActivity;
        this.f9719a = i;
        this.f9720b = intent;
    }

    public final void run() {
        LightPurchaseFlowActivity lightPurchaseFlowActivity = this.f9721c;
        int i = this.f9719a;
        Intent intent = this.f9720b;
        if (i == -1) {
            ak akVar = new ak((Document) intent.getParcelableExtra("OfferResolutionActivity.document"), (bl) ParcelableProto.m21672a(intent, "OfferResolutionActivity.offer"));
            lightPurchaseFlowActivity.f9663T = akVar.f9749a;
            lightPurchaseFlowActivity.f9654K = lightPurchaseFlowActivity.f9663T.m14646d();
            lightPurchaseFlowActivity.f9653J = lightPurchaseFlowActivity.f9663T.f14885a.f12096c;
            bl blVar = akVar.f9750b;
            lightPurchaseFlowActivity.f9655L = blVar.f11926p;
            lightPurchaseFlowActivity.f9656M = blVar.f11907B;
            lightPurchaseFlowActivity.f9657N = blVar.f11924n;
            FinskyLog.m21659a("Offer resolution: %s, offerType=%d, checkoutFlowRequired=%b", lightPurchaseFlowActivity.f9653J, Integer.valueOf(lightPurchaseFlowActivity.f9655L), Boolean.valueOf(lightPurchaseFlowActivity.f9657N));
            if (lightPurchaseFlowActivity.f9654K.f11835d == 6 && lightPurchaseFlowActivity.f9654K.f11834c == 15 && !lightPurchaseFlowActivity.f9657N) {
                lightPurchaseFlowActivity.m10065A();
                return;
            } else {
                lightPurchaseFlowActivity.m10075a(null, false, null);
                return;
            }
        }
        FinskyLog.m21659a("Offer resolution canceled: %s", lightPurchaseFlowActivity.f9653J);
        lightPurchaseFlowActivity.m10087l();
    }
}
