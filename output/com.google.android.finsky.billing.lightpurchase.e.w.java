package com.google.android.finsky.billing.lightpurchase.e;

import android.support.v4.app.Fragment;
import com.google.android.finsky.billing.AskToDownloadActivity;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.lightpurchase.CheckoutPurchaseError;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.billing.lightpurchase.q;

public final class com.google.android.finsky.billing.lightpurchase.e.w extends com.google.android.finsky.billing.lightpurchase.e.o
{

    w() {
        com.google.android.finsky.billing.lightpurchase.e.o();
    }

    public static com.google.android.finsky.billing.lightpurchase.e.w a(CheckoutPurchaseError p0) {
        v6 = new com.google.android.finsky.billing.lightpurchase.e.w();
        v6.f(com.google.android.finsky.billing.lightpurchase.e.o.a(p0, 1, 0, 770, 771, PurchaseFlowConfig.a));
        return v6;
    }

    public final void X() {
        super.X();
        v0 = (AskToDownloadActivity)((com.google.android.finsky.billing.lightpurchase.q)this.aa()).h();
        v0.setResult(0);
        v0.finish();
    }

}
