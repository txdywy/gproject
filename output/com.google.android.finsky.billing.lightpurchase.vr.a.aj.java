package com.google.android.finsky.billing.lightpurchase.vr.a;

import com.google.android.finsky.billing.lightpurchase.vr.VrPurchaseActivity;
import com.google.vr.a.a.a.c;
import com.google.vr.b.a.c;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.aj implements com.google.vr.a.a.a.d
{

    public final com.google.android.finsky.billing.lightpurchase.vr.a.u a;
    public final Runnable b;
    public final Runnable c;
    public final com.google.android.finsky.billing.lightpurchase.vr.a.w d;

    aj(com.google.android.finsky.billing.lightpurchase.vr.a.w p0, com.google.android.finsky.billing.lightpurchase.vr.a.u p1, Runnable p2, Runnable p3) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
        this.c = p3;
    }

    public final void a(com.google.vr.a.a.a.c p0) {
        this.a.t = 0;
        this.d.c.a(this.a, 771);
        v6 = new com.google.android.finsky.billing.lightpurchase.vr.a.k(this.d.e, this.d.f, this.d.c);
        v6.p.a(this.b, this.c);
        this.d.f = v6;
        this.d.f.b();
        this.d.c.b(this.d.f);
    }

}
