package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.ad;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;
import com.google.wireless.android.finsky.a.a.ao;
import com.squareup.leakcanary.C7582R;

public final class C1966c extends C1964a {
    public final b f10021c;
    public final b f10022d;
    public final b f10023e = m10455a("vertical-layout", this.a, 1);
    public final b f10024f;
    public ao f10025g;

    public C1966c(c cVar, aq aqVar, ad adVar) {
        super(cVar, aqVar, adVar, "background");
        m10455a("padding-y-48mm", this.f10023e, 1);
        b a = m10455a("container", this.f10023e, 1);
        m10455a("padding-x-screenwidth", a, 1);
        this.f10021c = m10455a("title", a, 2);
        m10455a("padding-y-12mm", this.f10023e, 1);
        this.f10022d = m10455a("account", this.f10023e, 2);
        m10455a("padding-y-36mm", this.f10023e, 1);
        m10455a("line", this.f10023e, 2);
        this.f10024f = m10455a("container", this.f10023e, 1);
        m10455a("line", this.f10023e, 2);
        m10455a("padding-y-36mm", this.f10023e, 1);
        a = m10455a("container", this.f10023e, 1);
        m10455a("padding-x-screenwidth", a, 1);
        m10455a("play-logo", a, 2);
        m10455a("padding-y-36mm", this.f10023e, 1);
    }

    public final void m10469a(ao aoVar, ao[] aoVarArr, ap apVar) {
        b a;
        this.f10025g = aoVar;
        int dimension = (int) C1473m.f7980a.f7981b.getResources().getDimension(C7582R.dimen.instrument_icon_size);
        if (aoVarArr.length >= 5) {
            a = m10455a("instrument-scroll-view", this.f10024f, 2);
        } else {
            a = this.f10024f;
        }
        b a2 = m10455a("vertical-layout-center-scrollview", a, 1);
        m10455a("padding-y-18mm", a2, 1);
        for (ao aoVar2 : aoVarArr) {
            b a3 = m10455a("clickable-container", a2, 1);
            m10455a("padding-x-screenwidth", a3, 1);
            b a4 = m10455a("vertical-layout-center-aligned", a3, 1);
            m10455a("padding-y-18mm", a4, 1);
            m10455a("instrument-title", a4, 2).a(aoVar2.d);
            if (aoVar2.r.length > 0) {
                m10455a("instrument-subtitle", a4, 2).a(aoVar2.r[0].d);
            } else if (aoVar2.e()) {
                m10455a("instrument-subtitle", a4, 2).a(aoVar2.x);
            }
            m10453a("instrument-icon", a3, aoVar2.e.f11860f, dimension, dimension);
            if (aoVar2.c.equals(this.f10025g.c)) {
                m10455a("instrument-selected", a3, 2);
            }
            if (aoVar2.r.length == 0) {
                m10457a(a3, "lull::ClickEvent", new C1967d(this, aoVar2, apVar));
            }
            m10455a("padding-y-18mm", a4, 1);
        }
        m10455a("padding-y-18mm", a2, 1);
    }

    protected final int mo2562a() {
        return 801;
    }
}
