package com.google.android.finsky.billing.lightpurchase.vr.a;

import com.google.android.finsky.d.ad;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;

protected final class com.google.android.finsky.billing.lightpurchase.vr.a.u extends com.google.android.finsky.billing.lightpurchase.vr.a.a
{

    public final com.google.vr.a.a.a.b c;
    public final com.google.vr.a.a.a.b d;
    public final com.google.vr.a.a.a.b e;
    public final com.google.vr.a.a.a.b f;
    public int g;

    u(com.google.vr.b.a.c p0, com.google.android.finsky.billing.lightpurchase.vr.a.aq p1, com.google.android.finsky.d.ad p2, int p3) {
        com.google.android.finsky.billing.lightpurchase.vr.a.a(p0, p1, p2, "background");
        v0 = this.a("vertical-layout", this.a, 1);
        this.a("padding-y-48mm", v0, 1);
        v1 = this.a("container", v0, 2);
        this.a("padding-x-screenwidth", v1, 2);
        this.c = this.a("title", v1, 1);
        this.a("padding-y-36mm", v0, 1);
        v1 = this.a("container", v0, 2);
        this.a("padding-x-screenwidth", v1, 2);
        this.d = this.a("body", v1, 1);
        this.a("padding-y-36mm", v0, 1);
        v1 = this.a("container", v0, 2);
        this.a("padding-x-screenwidth", v1, 2);
        this.e = this.a(p3, this.a("button-shadow", v1, 2));
        this.f = this.a("button-label", this.e, 4);
        this.a("play-logo", v1, 2);
        this.a("padding-y-36mm", v0, 1);
    }

    public static com.google.android.finsky.billing.lightpurchase.vr.a.u a(com.google.vr.b.a.c p0, com.google.android.finsky.billing.lightpurchase.vr.a.aq p1, com.google.android.finsky.d.ad p2, int p3, int p4) {
        v0 = new com.google.android.finsky.billing.lightpurchase.vr.a.u(p0, p1, p2, p4);
        v0.g = p3;
        return v0;
    }

    protected final int a() {
        return this.g;
    }

}
