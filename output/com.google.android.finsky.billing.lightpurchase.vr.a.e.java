package com.google.android.finsky.billing.lightpurchase.vr.a;

import com.google.android.finsky.d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;

protected final class com.google.android.finsky.billing.lightpurchase.vr.a.e extends com.google.android.finsky.billing.lightpurchase.vr.a.a
{

    public final com.google.vr.a.a.a.b c;
    public final com.google.vr.a.a.a.b d;
    public final com.google.vr.a.a.a.b e;
    public final com.google.vr.a.a.a.b f;
    public final com.google.vr.a.a.a.b g;
    public final com.google.vr.a.a.a.b h;
    public final com.google.vr.a.a.a.b i;
    public final com.google.vr.a.a.a.b j;
    public final com.google.vr.a.a.a.b k;
    public final com.google.vr.a.a.a.b l;
    public final com.google.vr.a.a.a.b m;
    public final com.google.vr.a.a.a.b n;
    public boolean o;

    e(com.google.vr.b.a.c p0, com.google.android.finsky.billing.lightpurchase.vr.a.aq p1, com.google.android.finsky.d.ad p2, int p3) {
        com.google.android.finsky.billing.lightpurchase.vr.a.a(p0, p1, p2, "background");
        this.o = 1;
        v1 = this.a("vertical-layout", this.a, 1);
        this.a("padding-y-48mm", v1, 1);
        this.i = this.a("clickable-container", v1, 1);
        v2 = this.a("vertical-layout", this.i, 2);
        v3 = this.a("container", v2, 2);
        this.a("padding-x-screenwidth", v3, 1);
        this.c = this.a("cart-title", v3, 3);
        if (p3 == 4)
            v0 = "price-movies";
        else {
            if (p3 != 3)
                FinskyLog.e(32 + "Unsupported backend: " + p3, new Object[0]);
            v0 = "price-apps";
        }
        this.d = this.a(v0, v3, 3);
        this.a("padding-y-12mm", v2, 1);
        v0 = this.a("container", v2, 2);
        this.a("padding-x-screenwidth", v0, 1);
        v0 = this.a("cart-fop-layout", v0, 2);
        this.e = this.a("fop", v0, 3);
        v0 = this.a("container", v0, 2);
        this.j = this.a("show-more", v0, 3);
        this.k = this.a("show-less", v0, 3);
        this.k.b("lull::DisableEvent");
        this.l = this.a("container", v1, 2);
        this.m = this.a("container", v1, 2);
        this.n = this.a("container", v1, 2);
        this.a("padding-y-36mm", v1, 1);
        this.f = this.a("body", v1, 2);
        this.a("padding-y-36mm", v1, 1);
        v0 = this.a("container", v1, 2);
        this.g = this.a(p3, this.a("button-shadow", v0, 2));
        this.h = this.a("button-label", this.g, 4);
        this.a("play-logo", v0, 2);
        this.a("padding-y-36mm", v1, 1);
    }

    protected final int a() {
        return 710;
    }

}
