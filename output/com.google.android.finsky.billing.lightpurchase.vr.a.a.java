package com.google.android.finsky.billing.lightpurchase.vr.a;

import com.google.android.finsky.billing.lightpurchase.vr.VrPurchaseActivity;
import com.google.android.finsky.d.ad;
import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.a extends com.google.android.finsky.billing.lightpurchase.vr.a.aq
{

    public final com.google.vr.a.a.a.b a;
    public final com.google.vr.a.a.a.b b;

    a(com.google.vr.b.a.c p0, com.google.android.finsky.billing.lightpurchase.vr.a.aq p1, com.google.android.finsky.d.ad p2, String p3) {
        com.google.android.finsky.billing.lightpurchase.vr.a.aq(p0, p1, p2);
        this.q = this.a("root", 0, 0);
        v0 = this.a("vertical-layout-center-aligned", this.q, 0);
        this.a = this.a(p3, v0, 0);
        this.a("padding-y-64mm", v0, 0);
        this.b = this.a("back", v0, 0);
        this.b.b("lull::DisableEvent");
    }

    public final void a(VrPurchaseActivity p0, com.google.android.finsky.billing.lightpurchase.vr.a.ap p1) {
        v0 = new com.google.android.finsky.billing.lightpurchase.vr.a.b(this, p0, p1);
        this.a(this.b, "lull::ClickEvent", v0);
        this.a("lull::SecondaryButtonRelease", v0);
        this.b.b("lull::EnableEvent");
    }

}
