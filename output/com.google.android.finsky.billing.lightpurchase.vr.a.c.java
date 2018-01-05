package com.google.android.finsky.billing.lightpurchase.vr.a;

import android.app.Application;
import android.content.res.Resources;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.m;
import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;
import com.google.wireless.android.finsky.a.a.ak;
import com.google.wireless.android.finsky.a.a.ao;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.c extends com.google.android.finsky.billing.lightpurchase.vr.a.a
{

    public final com.google.vr.a.a.a.b c;
    public final com.google.vr.a.a.a.b d;
    public final com.google.vr.a.a.a.b e;
    public final com.google.vr.a.a.a.b f;
    public com.google.wireless.android.finsky.a.a.ao g;

    c(com.google.vr.b.a.c p0, com.google.android.finsky.billing.lightpurchase.vr.a.aq p1, com.google.android.finsky.d.ad p2) {
        com.google.android.finsky.billing.lightpurchase.vr.a.a(p0, p1, p2, "background");
        this.e = this.a("vertical-layout", this.a, 1);
        this.a("padding-y-48mm", this.e, 1);
        v0 = this.a("container", this.e, 1);
        this.a("padding-x-screenwidth", v0, 1);
        this.c = this.a("title", v0, 2);
        this.a("padding-y-12mm", this.e, 1);
        this.d = this.a("account", this.e, 2);
        this.a("padding-y-36mm", this.e, 1);
        this.a("line", this.e, 2);
        this.f = this.a("container", this.e, 1);
        this.a("line", this.e, 2);
        this.a("padding-y-36mm", this.e, 1);
        v0 = this.a("container", this.e, 1);
        this.a("padding-x-screenwidth", v0, 1);
        this.a("play-logo", v0, 2);
        this.a("padding-y-36mm", this.e, 1);
    }

    protected final int a() {
        return 801;
    }

    public final void a(com.google.wireless.android.finsky.a.a.ao p0, ao[] p1, com.google.android.finsky.billing.lightpurchase.vr.a.ap p2) {
        this.g = p0;
        v4 = (int)com.google.android.finsky.m.a.b.getResources().getDimension(2131624679);
        if (p1.length >= 5)
            v0 = this.a("instrument-scroll-view", this.f, 2);
        else
            v0 = this.f;
        v7 = this.a("vertical-layout-center-scrollview", v0, 1);
        this.a("padding-y-18mm", v7, 1);
        v6 = 0;
        while (v6 < p1.length) {
            v2 = this.a("clickable-container", v7, 1);
            this.a("padding-x-screenwidth", v2, 1);
            v10 = this.a("vertical-layout-center-aligned", v2, 1);
            this.a("padding-y-18mm", v10, 1);
            this.a("instrument-title", v10, 2).a(p1[v6].d);
            if (p1[v6].r.length > 0)
                this.a("instrument-subtitle", v10, 2).a(p1[v6].r[0].d);
            else if (p1[v6].e())
                this.a("instrument-subtitle", v10, 2).a(p1[v6].x);
            this.a("instrument-icon", v2, p1[v6].e.f, v4, v4);
            if (p1[v6].c.equals(this.g.c))
                this.a("instrument-selected", v2, 2);
            if (p1[v6].r.length == 0)
                this.a(v2, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.d(this, p1[v6], p2));
            this.a("padding-y-18mm", v10, 1);
            v6 = v6 + 1;
        }
        this.a("padding-y-18mm", v7, 1);
    }

}
