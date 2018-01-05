package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.android.finsky.billing.lightpurchase.ak;
import com.google.android.finsky.p111d.ad;
import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;
import java.util.List;

public final class C1976m extends C1964a {
    public final b f10059c;
    public final b f10060d = m10455a("vertical-layout", this.a, 1);

    public C1976m(c cVar, aq aqVar, ad adVar) {
        super(cVar, aqVar, adVar, "background");
        m10455a("padding-y-48mm", this.f10060d, 1);
        b a = m10455a("container", this.f10060d, 1);
        m10455a("padding-x-screenwidth", a, 1);
        this.f10059c = m10455a("title", a, 2);
    }

    public final void m10480a(List list, ap apVar) {
        ak akVar = (ak) list.get(list.size() - 1);
        for (ak akVar2 : list) {
            m10455a("padding-y-36mm", this.f10060d, 1);
            b a = m10455a("clickable-container", this.f10060d, 1);
            b a2 = m10455a("vertical-layout", a, 1);
            b a3 = m10455a("container", a2, 1);
            m10455a("padding-x-screenwidth", a3, 1);
            a a4 = m10455a("offer-label", a3, 2);
            a a5 = m10455a("offer-price", a3, 2);
            m10455a("padding-y-12mm", a2, 1);
            a4.a(akVar2.f9750b.f11918h);
            a5.a(akVar2.f9750b.f11917g);
            a2 = m10455a("container", a2, 1);
            m10455a("padding-x-screenwidth", a2, 1);
            a a6 = m10455a("body", a2, 2);
            m10455a("padding-y-36mm", this.f10060d, 1);
            a6.a(akVar2.f9750b.f11919i);
            if (akVar2 != akVar) {
                m10455a("line", this.f10060d, 2);
            }
            m10457a(a, "lull::ClickEvent", new C1977n(this, apVar, akVar2));
        }
    }

    protected final int mo2562a() {
        return 781;
    }
}
