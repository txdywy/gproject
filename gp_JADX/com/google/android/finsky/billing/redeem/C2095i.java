package com.google.android.finsky.billing.redeem;

import android.content.Intent;
import com.google.android.finsky.billing.common.C1801q;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.p111d.C2495w;

public final class C2095i implements C1801q {
    public final Intent mo2638a(String str, ax axVar, int i, C2495w c2495w) {
        return RedeemCodeActivity.m10894a(str, 1, axVar, i, null, c2495w);
    }

    public final Intent mo2636a(String str, int i, ax axVar, int i2, PurchaseFlowConfig purchaseFlowConfig, C2495w c2495w) {
        return RedeemCodeActivity.m10894a(str, i, axVar, i2, purchaseFlowConfig, c2495w);
    }

    public final Intent mo2637a(String str, int i, String str2, C2495w c2495w) {
        return RedeemCodeActivity.m10895a(str, i, str2, null, c2495w);
    }
}
