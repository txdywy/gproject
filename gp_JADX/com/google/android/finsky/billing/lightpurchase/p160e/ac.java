package com.google.android.finsky.billing.lightpurchase.p160e;

import android.support.v4.app.Fragment;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.lightpurchase.CheckoutPurchaseError;
import com.google.android.finsky.billing.lightpurchase.aq;

public final class ac extends C1926o {
    public static ac m10304a(CheckoutPurchaseError checkoutPurchaseError, boolean z) {
        return ac.m10306b(checkoutPurchaseError, z, false, 770, 771, PurchaseFlowConfig.f9283a);
    }

    public static ac m10305a(CheckoutPurchaseError checkoutPurchaseError, boolean z, PurchaseFlowConfig purchaseFlowConfig) {
        return ac.m10306b(checkoutPurchaseError, z, false, 770, 771, purchaseFlowConfig);
    }

    public static ac m10306b(CheckoutPurchaseError checkoutPurchaseError, boolean z, boolean z2, int i, int i2, PurchaseFlowConfig purchaseFlowConfig) {
        Fragment acVar = new ac();
        acVar.m600f(C1926o.m10299a(checkoutPurchaseError, z, z2, i, i2, purchaseFlowConfig));
        return acVar;
    }

    public final void mo1405X() {
        super.mo1405X();
        if (this.f760q.getBoolean("ErrorBaseStep.paymentDeclined")) {
            ((aq) aa()).ad();
        } else if (this.f760q.getBoolean("ErrorBaseStep.purchaseFailed")) {
            if (!(b.f9632g == null || b.f9632g.f12679b == null)) {
                m580a(C1473m.f7980a.bo().mo2745a(m603h(), b.f9632g.f12679b, ((aq) aa()).am()));
            }
            ((aq) aa()).ac();
        } else if (b.f9631f == null) {
            ((aq) aa()).mo2514Y();
        } else {
            ((aq) aa()).mo2517a(b.f9631f);
        }
    }
}
