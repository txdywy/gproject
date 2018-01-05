package com.google.android.finsky.billing.redeem;

import android.content.Intent;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.d.w;

public final class com.google.android.finsky.billing.redeem.i implements com.google.android.finsky.billing.common.q
{

    i() {
    }

    public final Intent a(String p0, int p1, com.google.android.finsky.cv.a.ax p2, int p3, PurchaseFlowConfig p4, com.google.android.finsky.d.w p5) {
        return RedeemCodeActivity.a(p0, p1, p2, p3, p4, p5);
    }

    public final Intent a(String p0, int p1, String p2, com.google.android.finsky.d.w p3) {
        return RedeemCodeActivity.a(p0, p1, p2, 0, p3);
    }

    public final Intent a(String p0, com.google.android.finsky.cv.a.ax p1, int p2, com.google.android.finsky.d.w p3) {
        return RedeemCodeActivity.a(p0, 1, p1, p2, 0, p3);
    }

}
