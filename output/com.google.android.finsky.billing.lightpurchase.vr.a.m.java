package com.google.android.finsky.billing.lightpurchase.vr.a;

import com.google.android.finsky.billing.lightpurchase.ak;
import com.google.android.finsky.cv.a.bl;
import com.google.android.finsky.d.ad;
import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.m extends com.google.android.finsky.billing.lightpurchase.vr.a.a
{

    public final com.google.vr.a.a.a.b c;
    public final com.google.vr.a.a.a.b d;

    m(com.google.vr.b.a.c p0, com.google.android.finsky.billing.lightpurchase.vr.a.aq p1, com.google.android.finsky.d.ad p2) {
        com.google.android.finsky.billing.lightpurchase.vr.a.a(p0, p1, p2, "background");
        this.d = this.a("vertical-layout", this.a, 1);
        this.a("padding-y-48mm", this.d, 1);
        v0 = this.a("container", this.d, 1);
        this.a("padding-x-screenwidth", v0, 1);
        this.c = this.a("title", v0, 2);
    }

    protected final int a() {
        return 781;
    }

    public final void a(List p0, com.google.android.finsky.billing.lightpurchase.vr.a.ap p1) {
        v2 = p0.iterator();
        while (v2.hasNext()) {
            v1 = (com.google.android.finsky.billing.lightpurchase.ak)v2.next();
            this.a("padding-y-36mm", this.d, 1);
            v3 = this.a("clickable-container", this.d, 1);
            v4 = this.a("vertical-layout", v3, 1);
            v5 = this.a("container", v4, 1);
            this.a("padding-x-screenwidth", v5, 1);
            this.a("padding-y-12mm", v4, 1);
            this.a("offer-label", v5, 2).a(v1.b.h);
            this.a("offer-price", v5, 2).a(v1.b.g);
            v4 = this.a("container", v4, 1);
            this.a("padding-x-screenwidth", v4, 1);
            this.a("padding-y-36mm", this.d, 1);
            this.a("body", v4, 2).a(v1.b.i);
            if (v1 != (com.google.android.finsky.billing.lightpurchase.ak)p0.get(p0.size() - 1))
                this.a("line", this.d, 2);
            this.a(v3, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.n(this, p1, v1));
        }
    }

}
