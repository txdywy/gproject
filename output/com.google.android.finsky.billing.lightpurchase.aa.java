package com.google.android.finsky.billing.lightpurchase;

import android.content.Intent;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;

public final class com.google.android.finsky.billing.lightpurchase.aa implements Runnable
{

    public final int a;
    public final Intent b;
    public final LightPurchaseFlowActivity c;

    aa(LightPurchaseFlowActivity p0, int p1, Intent p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        if (this.a == -1) {
            v3 = new com.google.android.finsky.billing.lightpurchase.ak((Document)this.b.getParcelableExtra("OfferResolutionActivity.document"), (com.google.android.finsky.cv.a.bl)ParcelableProto.a(this.b, "OfferResolutionActivity.offer"));
            this.c.T = v3.a;
            this.c.K = this.c.T.d();
            this.c.J = this.c.T.a.c;
            this.c.L = v3.b.p;
            this.c.M = v3.b.B;
            this.c.N = v3.b.n;
            v1 = new Object[3];
            v1[0] = this.c.J;
            v1[1] = Integer.valueOf(this.c.L);
            v1[2] = Boolean.valueOf(this.c.N);
            FinskyLog.a("Offer resolution: %s, offerType=%d, checkoutFlowRequired=%b", v1);
            if (this.c.K.d == 6 && this.c.K.c == 15 && this.c.N == 0)
                this.c.A();
            else
                this.c.a(0, 0, 0);
        }
        else {
            v1 = new Object[1];
            v1[0] = this.c.J;
            FinskyLog.a("Offer resolution canceled: %s", v1);
            this.c.l();
        }
    }

}
