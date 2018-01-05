package com.google.android.finsky.billing.lightpurchase.vr.a;

import com.google.android.finsky.d.ad;
import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;

protected final class com.google.android.finsky.billing.lightpurchase.vr.a.i extends com.google.android.finsky.billing.lightpurchase.vr.a.a
{

    public final com.google.vr.a.a.a.b c;
    public final com.google.vr.a.a.a.b d;
    public final com.google.vr.a.a.a.b e;
    public final com.google.vr.a.a.a.b f;
    public boolean g;
    public final com.google.vr.a.a.a.b h;
    public final com.google.vr.a.a.a.b i;
    public final com.google.vr.a.a.a.b j;

    i(com.google.vr.b.a.c p0, com.google.android.finsky.billing.lightpurchase.vr.a.aq p1, com.google.android.finsky.d.ad p2, int p3) {
        com.google.android.finsky.billing.lightpurchase.vr.a.a(p0, p1, p2, "background");
        this.g = 1;
        this.h = this.a("vertical-layout", this.a, 1);
        this.a("padding-y-48mm", this.h, 1);
        v0 = this.a("container", this.h, 2);
        this.a("padding-x-screenwidth", v0, 2);
        this.c = this.a("title", v0, 1);
        this.a("padding-y-36mm", this.h, 1);
        v0 = this.a("container", this.h, 2);
        this.a("padding-x-screenwidth", v0, 2);
        this.d = this.a("body", v0, 1);
        this.a("padding-y-36mm", this.h, 1);
        this.i = this.a("container", this.h, 1);
        this.j = this.a("padding-y-36mm", this.h, 1);
        this.j.b("lull::DisableEvent");
        v0 = this.a("container", this.h, 2);
        this.a("padding-x-screenwidth", v0, 2);
        this.e = this.a(p3, this.a("button-shadow", v0, 2));
        this.f = this.a("button-label", this.e, 4);
        this.a("play-logo", v0, 2);
        this.a("padding-y-36mm", this.h, 1);
    }

    protected final int a() {
        return 0;
    }

}
