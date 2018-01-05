package com.google.android.finsky.billing.lightpurchase.vr.a;

import android.text.TextUtils;
import com.google.android.finsky.billing.lightpurchase.vr.VrPurchaseActivity;
import com.google.vr.a.a.a.c;
import com.google.vr.b.a.c;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.ac implements com.google.vr.a.a.a.d
{

    public final com.google.android.finsky.billing.lightpurchase.vr.a.w a;

    ac(com.google.android.finsky.billing.lightpurchase.vr.a.w p0) {
        this.a = p0;
    }

    public final void a(com.google.vr.a.a.a.c p0) {
        if (p0 != 0) {
            v0 = p0.a("href");
            if (!TextUtils.isEmpty(v0)) {
                this.a.d.i();
                v6 = new com.google.android.finsky.billing.lightpurchase.vr.a.k(this.a.e, this.a.f, this.a.c);
                v6.p.a(new com.google.android.finsky.billing.lightpurchase.vr.a.ad(this, v0), new com.google.android.finsky.billing.lightpurchase.vr.a.af(this));
                this.a.f = v6;
                this.a.f.b();
                this.a.c.b(this.a.f);
            }
        }
    }

}
