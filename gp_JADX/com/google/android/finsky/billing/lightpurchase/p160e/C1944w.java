package com.google.android.finsky.billing.lightpurchase.p160e;

import android.support.v4.app.Fragment;
import com.google.android.finsky.billing.AskToDownloadActivity;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.lightpurchase.C1958q;
import com.google.android.finsky.billing.lightpurchase.CheckoutPurchaseError;

public final class C1944w extends C1926o {
    public static C1944w m10367a(CheckoutPurchaseError checkoutPurchaseError) {
        Fragment c1944w = new C1944w();
        c1944w.m600f(C1926o.m10299a(checkoutPurchaseError, true, false, 770, 771, PurchaseFlowConfig.f9283a));
        return c1944w;
    }

    public final void mo1405X() {
        super.mo1405X();
        AskToDownloadActivity askToDownloadActivity = (AskToDownloadActivity) ((C1958q) aa()).m603h();
        askToDownloadActivity.setResult(0);
        askToDownloadActivity.finish();
    }
}
