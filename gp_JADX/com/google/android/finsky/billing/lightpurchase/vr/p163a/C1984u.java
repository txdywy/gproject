package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.android.finsky.p111d.ad;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;

final class C1984u extends C1964a {
    public final b f10092c;
    public final b f10093d;
    public final b f10094e;
    public final b f10095f = m10455a("button-label", this.f10094e, 4);
    public int f10096g;

    public static C1984u m10492a(c cVar, aq aqVar, ad adVar, int i, int i2) {
        C1984u c1984u = new C1984u(cVar, aqVar, adVar, i2);
        c1984u.f10096g = i;
        return c1984u;
    }

    private C1984u(c cVar, aq aqVar, ad adVar, int i) {
        super(cVar, aqVar, adVar, "background");
        b a = m10455a("vertical-layout", this.a, 1);
        m10455a("padding-y-48mm", a, 1);
        b a2 = m10455a("container", a, 2);
        m10455a("padding-x-screenwidth", a2, 2);
        this.f10092c = m10455a("title", a2, 1);
        m10455a("padding-y-36mm", a, 1);
        a2 = m10455a("container", a, 2);
        m10455a("padding-x-screenwidth", a2, 2);
        this.f10093d = m10455a("body", a2, 1);
        m10455a("padding-y-36mm", a, 1);
        a2 = m10455a("container", a, 2);
        m10455a("padding-x-screenwidth", a2, 2);
        this.f10094e = m10454a(i, m10455a("button-shadow", a2, 2));
        m10455a("play-logo", a2, 2);
        m10455a("padding-y-36mm", a, 1);
    }

    protected final int mo2562a() {
        return this.f10096g;
    }
}
