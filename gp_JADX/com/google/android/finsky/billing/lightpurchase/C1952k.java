package com.google.android.finsky.billing.lightpurchase;

import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.es;
import com.google.wireless.android.finsky.dfe.nano.et;
import com.google.wireless.android.finsky.dfe.nano.eu;
import com.google.wireless.android.finsky.dfe.nano.fb;

final class C1952k implements Runnable {
    public final /* synthetic */ et f9947a;
    public final /* synthetic */ C2495w f9948b;
    public final /* synthetic */ fb f9949c;
    public final /* synthetic */ C1950i f9950d;

    C1952k(C1950i c1950i, et etVar, C2495w c2495w, fb fbVar) {
        this.f9950d = c1950i;
        this.f9947a = etVar;
        this.f9948b = c2495w;
        this.f9949c = fbVar;
    }

    public final void run() {
        if (this.f9950d.f9942e.f9285a.f11834c == 1) {
            if (this.f9947a.e != null) {
                if (!TextUtils.isEmpty(this.f9947a.g)) {
                    C1473m.f7980a.mo2256o().mo3437a(this.f9950d.f9942e.f9286b, this.f9947a.g);
                }
                this.f9950d.m10395a(this.f9948b);
            } else {
                FinskyLog.m21665c("missing delivery data for %s", this.f9950d.f9942e.f9286b);
            }
        }
        switch (this.f9949c.b) {
            case 0:
                this.f9950d.an = this.f9947a.j;
                this.f9950d.ao = this.f9947a.l;
                if (C1473m.f7980a.dj().mo2294a(12603704)) {
                    int i = (this.f9950d.an == null || this.f9950d.an.b == null || this.f9950d.an.b.a == null || this.f9950d.an.b.a.a == null) ? 0 : 1;
                    if (i != 0) {
                        i = this.f9950d.an.b.a.a.f12099f;
                        if ((i == 1 || i == 6) && !C1473m.f7980a.bn().mo2703a(C1473m.f7980a.f7981b.getPackageManager(), i)) {
                            this.f9950d.m6758b(11, 0);
                            return;
                        }
                    }
                }
                this.f9950d.m6758b(2, 7);
                return;
            case 2:
                this.f9950d.aq = this.f9947a.c;
                this.f9950d.m6758b(7, 0);
                return;
            case 3:
                this.f9950d.as = new CheckoutPurchaseError(this.f9949c.d, this.f9949c.c);
                this.f9950d.m6758b(3, 5);
                return;
            case 4:
                es esVar = this.f9947a.i;
                if (esVar.b == 1) {
                    eu euVar = esVar.c;
                    this.f9950d.as = new CheckoutPurchaseError(this.f9949c.d, euVar.c, euVar.b);
                    this.f9950d.m6758b(10, 0);
                    return;
                } else if (esVar.b == 3) {
                    this.f9950d.m6758b(13, 10);
                    return;
                } else {
                    FinskyLog.m21669e("Unknown recoverable error type: %d", Integer.valueOf(esVar.b));
                    this.f9950d.as = new CheckoutPurchaseError();
                    this.f9950d.m6758b(3, 5);
                    return;
                }
            default:
                FinskyLog.m21669e("Unknown purchase status: %d", Integer.valueOf(this.f9949c.b));
                this.f9950d.as = new CheckoutPurchaseError();
                this.f9950d.m6758b(3, 5);
                return;
        }
    }
}
