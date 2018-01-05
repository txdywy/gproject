package com.google.android.finsky.billing.lightpurchase.e;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.lightpurchase.CheckoutPurchaseError;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.br.b;
import com.google.android.finsky.cv.a.ip;
import com.google.android.finsky.m;

public final class com.google.android.finsky.billing.lightpurchase.e.ac extends com.google.android.finsky.billing.lightpurchase.e.o
{

    ac() {
        com.google.android.finsky.billing.lightpurchase.e.o();
    }

    public static com.google.android.finsky.billing.lightpurchase.e.ac a(CheckoutPurchaseError p0, boolean p1) {
        return com.google.android.finsky.billing.lightpurchase.e.ac.b(p0, p1, 0, 770, 771, PurchaseFlowConfig.a);
    }

    public static com.google.android.finsky.billing.lightpurchase.e.ac a(CheckoutPurchaseError p0, boolean p1, PurchaseFlowConfig p2) {
        return com.google.android.finsky.billing.lightpurchase.e.ac.b(p0, p1, 0, 770, 771, p2);
    }

    public static com.google.android.finsky.billing.lightpurchase.e.ac b(CheckoutPurchaseError p0, boolean p1, boolean p2, int p3, int p4, PurchaseFlowConfig p5) {
        v0 = new com.google.android.finsky.billing.lightpurchase.e.ac();
        v0.f(com.google.android.finsky.billing.lightpurchase.e.o.a(p0, p1, p2, p3, p4, p5));
        return v0;
    }

    public final void X() {
        super.X();
        if (this.q.getBoolean("ErrorBaseStep.paymentDeclined"))
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ad();
        else if (this.q.getBoolean("ErrorBaseStep.purchaseFailed")) {
            if (com.google.android.finsky.billing.lightpurchase.e.ac.b.g != 0 && com.google.android.finsky.billing.lightpurchase.e.ac.b.g.b != 0)
                this.a(com.google.android.finsky.m.a.bo().a(this.h(), com.google.android.finsky.billing.lightpurchase.e.ac.b.g.b, ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).am()));
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).ac();
        }
        else if (com.google.android.finsky.billing.lightpurchase.e.ac.b.f == 0)
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).Y();
        else
            ((com.google.android.finsky.billing.lightpurchase.aq)this.aa()).a(com.google.android.finsky.billing.lightpurchase.e.ac.b.f);
    }

}
