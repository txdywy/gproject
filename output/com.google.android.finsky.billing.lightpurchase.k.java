package com.google.android.finsky.billing.lightpurchase;

import android.app.Application;
import android.text.TextUtils;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.br.a;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.w;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.es;
import com.google.wireless.android.finsky.dfe.nano.et;
import com.google.wireless.android.finsky.dfe.nano.eu;
import com.google.wireless.android.finsky.dfe.nano.fb;
import com.google.wireless.android.finsky.dfe.nano.i;
import com.google.wireless.android.finsky.dfe.nano.k;
import com.google.wireless.android.finsky.dfe.nano.l;

public final class com.google.android.finsky.billing.lightpurchase.k implements Runnable
{

    public final com.google.wireless.android.finsky.dfe.nano.et a;
    public final com.google.android.finsky.d.w b;
    public final com.google.wireless.android.finsky.dfe.nano.fb c;
    public final com.google.android.finsky.billing.lightpurchase.i d;

    k(com.google.android.finsky.billing.lightpurchase.i p0, com.google.wireless.android.finsky.dfe.nano.et p1, com.google.android.finsky.d.w p2, com.google.wireless.android.finsky.dfe.nano.fb p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void run() {
        if (this.d.e.a.c == 1) {
            if (this.a.e != 0) {
                if (!TextUtils.isEmpty(this.a.g))
                    com.google.android.finsky.m.a.o().a(this.d.e.b, this.a.g);
                this.d.a(this.b);
            }
            else {
                v3 = new Object[1];
                v3[0] = this.d.e.b;
                FinskyLog.c("missing delivery data for %s", v3);
            }
        }
        switch (this.c.b) {
            case 0:
                this.d.an = this.a.j;
                this.d.ao = this.a.l;
                if (com.google.android.finsky.m.a.dj().a(12603704)) {
                    if (this.d.an != 0 && this.d.an.b != 0 && this.d.an.b.a != 0 && this.d.an.b.a.a != 0)
                        v0 = 1;
                    else
                        v0 = 0;
                    if (v0 != 0) {
                        if (this.d.an.b.a.a.f == 1 || this.d.an.b.a.a.f == 6) {
                            if (!com.google.android.finsky.m.a.bn().a(com.google.android.finsky.m.a.b.getPackageManager(), this.d.an.b.a.a.f))
                                this.d.b(11, 0);
                            else
                                this.d.b(2, 7);
                        }
                        else
                            this.d.b(2, 7);
                    }
                    else
                        this.d.b(2, 7);
                }
                else
                    this.d.b(2, 7);
                break;
            case 1:
                v1 = new Object[1];
                v1[0] = Integer.valueOf(this.c.b);
                FinskyLog.e("Unknown purchase status: %d", v1);
                this.d.as = new CheckoutPurchaseError();
                this.d.b(3, 5);
                break;
            case 2:
                this.d.aq = this.a.c;
                this.d.b(7, 0);
                break;
            case 3:
                this.d.as = new CheckoutPurchaseError(this.c.d, this.c.c);
                this.d.b(3, 5);
                break;
            case 4:
                if (this.a.i.b == 1) {
                    this.d.as = new CheckoutPurchaseError(this.c.d, this.a.i.c.c, this.a.i.c.b);
                    this.d.b(10, 0);
                }
                else if (this.a.i.b == 3)
                    this.d.b(13, 10);
                else {
                    v1 = new Object[1];
                    v1[0] = Integer.valueOf(this.a.i.b);
                    FinskyLog.e("Unknown recoverable error type: %d", v1);
                    this.d.as = new CheckoutPurchaseError();
                    this.d.b(3, 5);
                }
                break;
            default:
                v1 = new Object[1];
                v1[0] = Integer.valueOf(this.c.b);
                FinskyLog.e("Unknown purchase status: %d", v1);
                this.d.as = new CheckoutPurchaseError();
                this.d.b(3, 5);
                break;
        }
    }

}
