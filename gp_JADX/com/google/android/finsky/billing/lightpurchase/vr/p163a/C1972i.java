package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.android.finsky.p111d.ad;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;

public final class C1972i extends C1964a {
    public final b f10049c;
    public final b f10050d;
    public final b f10051e;
    public final b f10052f;
    public boolean f10053g = true;
    public final b f10054h = m10455a("vertical-layout", this.a, 1);
    public final b f10055i;
    public final b f10056j;

    public C1972i(c cVar, aq aqVar, ad adVar, int i) {
        super(cVar, aqVar, adVar, "background");
        m10455a("padding-y-48mm", this.f10054h, 1);
        b a = m10455a("container", this.f10054h, 2);
        m10455a("padding-x-screenwidth", a, 2);
        this.f10049c = m10455a("title", a, 1);
        m10455a("padding-y-36mm", this.f10054h, 1);
        a = m10455a("container", this.f10054h, 2);
        m10455a("padding-x-screenwidth", a, 2);
        this.f10050d = m10455a("body", a, 1);
        m10455a("padding-y-36mm", this.f10054h, 1);
        this.f10055i = m10455a("container", this.f10054h, 1);
        this.f10056j = m10455a("padding-y-36mm", this.f10054h, 1);
        this.f10056j.b("lull::DisableEvent");
        a = m10455a("container", this.f10054h, 2);
        m10455a("padding-x-screenwidth", a, 2);
        this.f10051e = m10454a(i, m10455a("button-shadow", a, 2));
        this.f10052f = m10455a("button-label", this.f10051e, 4);
        m10455a("play-logo", a, 2);
        m10455a("padding-y-36mm", this.f10054h, 1);
    }

    protected final int mo2562a() {
        return 0;
    }
}
