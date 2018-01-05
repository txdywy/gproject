package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;

public final class C1968e extends C1964a {
    public final b f10029c;
    public final b f10030d;
    public final b f10031e;
    public final b f10032f;
    public final b f10033g;
    public final b f10034h;
    public final b f10035i;
    public final b f10036j;
    public final b f10037k;
    public final b f10038l;
    public final b f10039m;
    public final b f10040n;
    public boolean f10041o = true;

    public C1968e(c cVar, aq aqVar, ad adVar, int i) {
        String str;
        super(cVar, aqVar, adVar, "background");
        b a = m10455a("vertical-layout", this.a, 1);
        m10455a("padding-y-48mm", a, 1);
        this.f10035i = m10455a("clickable-container", a, 1);
        b a2 = m10455a("vertical-layout", this.f10035i, 2);
        b a3 = m10455a("container", a2, 2);
        m10455a("padding-x-screenwidth", a3, 1);
        this.f10029c = m10455a("cart-title", a3, 3);
        if (i == 4) {
            str = "price-movies";
        } else {
            if (i != 3) {
                FinskyLog.m21669e("Unsupported backend: " + i, new Object[0]);
            }
            str = "price-apps";
        }
        this.f10030d = m10455a(str, a3, 3);
        m10455a("padding-y-12mm", a2, 1);
        b a4 = m10455a("container", a2, 2);
        m10455a("padding-x-screenwidth", a4, 1);
        a4 = m10455a("cart-fop-layout", a4, 2);
        this.f10031e = m10455a("fop", a4, 3);
        a4 = m10455a("container", a4, 2);
        this.f10036j = m10455a("show-more", a4, 3);
        this.f10037k = m10455a("show-less", a4, 3);
        this.f10037k.b("lull::DisableEvent");
        this.f10038l = m10455a("container", a, 2);
        this.f10039m = m10455a("container", a, 2);
        this.f10040n = m10455a("container", a, 2);
        m10455a("padding-y-36mm", a, 1);
        this.f10032f = m10455a("body", a, 2);
        m10455a("padding-y-36mm", a, 1);
        a4 = m10455a("container", a, 2);
        this.f10033g = m10454a(i, m10455a("button-shadow", a4, 2));
        this.f10034h = m10455a("button-label", this.f10033g, 4);
        m10455a("play-logo", a4, 2);
        m10455a("padding-y-36mm", a, 1);
    }

    protected final int mo2562a() {
        return 710;
    }
}
