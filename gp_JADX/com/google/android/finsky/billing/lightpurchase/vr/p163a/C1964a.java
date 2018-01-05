package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.android.finsky.billing.lightpurchase.vr.VrPurchaseActivity;
import com.google.android.finsky.p111d.ad;
import com.google.vr.a.a.a.b;
import com.google.vr.a.a.a.d;
import com.google.vr.b.a.c;

public abstract class C1964a extends aq {
    public final b f9988a;
    public final b f9989b;

    protected C1964a(c cVar, aq aqVar, ad adVar, String str) {
        super(cVar, aqVar, adVar);
        this.q = m10455a("root", null, 0);
        b a = m10455a("vertical-layout-center-aligned", this.q, 0);
        this.f9988a = m10455a(str, a, 0);
        m10455a("padding-y-64mm", a, 0);
        this.f9989b = m10455a("back", a, 0);
        this.f9989b.b("lull::DisableEvent");
    }

    public final void m10460a(VrPurchaseActivity vrPurchaseActivity, ap apVar) {
        d c1965b = new C1965b(this, vrPurchaseActivity, apVar);
        m10457a(this.f9989b, "lull::ClickEvent", c1965b);
        m10458a("lull::SecondaryButtonRelease", c1965b);
        this.f9989b.b("lull::EnableEvent");
    }
}
