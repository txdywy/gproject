package com.google.android.finsky.billing.lightpurchase.vr.p163a;

import android.text.TextUtils;
import com.google.android.finsky.p111d.ad;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;

public final class C1980q extends C1964a {
    public final b f10076c;
    public final b f10077d;
    public final b f10078e;
    public final b f10079f;
    public final b f10080g;
    public final b f10081h;
    public final b f10082i;
    public final b f10083j;
    public int f10084k = -1;
    public String f10085l = "";
    public ap f10086m;
    public boolean f10087n;

    public C1980q(c cVar, aq aqVar, ad adVar) {
        super(cVar, aqVar, adVar, "background");
        b a = m10455a("vertical-layout", this.a, 1);
        m10455a("padding-y-48mm", a, 1);
        b a2 = m10455a("container", a, 2);
        m10455a("padding-x-pinwidth", a2, 2);
        this.f10076c = m10455a("pin-title", a2, 1);
        m10455a("padding-y-12mm", a, 1);
        this.f10077d = m10455a("pin-account", a, 1);
        m10455a("padding-y-24mm", a, 1);
        a2 = m10455a("container", a, 1);
        m10455a("padding-x-pinwidth", a2, 2);
        this.f10083j = m10455a("pin-entry", a2, 1);
        this.f10082i = m10455a("pin-backspace", a2, 1);
        this.f10080g = m10455a("pin-entry-incorrect-line", m10455a("pin-entry-line", a, 1), 2);
        m10455a("padding-y-12mm", a, 1);
        a2 = m10455a("container", a, 1);
        m10455a("padding-x-pinwidth", a2, 2);
        m10455a("padding-y-36mm", a2, 1);
        this.f10081h = m10455a("pin-entry-incorrect-text", a2, 3);
        m10455a("padding-y-18mm", a, 1);
        this.f10080g.b("lull::HideEvent");
        b a3 = m10455a("pin-pad", a, 1);
        for (int i = 1; i <= 9; i++) {
            m10485a(Integer.toString(i), a3);
        }
        m10455a("pin-key-button-stub", a3, 2);
        m10485a("0", a3);
        m10457a(this.f10082i, "lull::ClickEvent", new C1981r(this));
        m10455a("padding-y-18mm", a, 1);
        a2 = m10455a("container", a, 2);
        this.f10079f = m10455a("pin-reset-button", m10455a("button-shadow", a2, 2), 3);
        m10457a(this.f10079f, "lull::ClickEvent", new C1982s(this));
        this.f10078e = m10455a("pin-reset-label", this.f10079f, 4);
        m10455a("pin-play-logo", a2, 2);
        m10455a("padding-y-36mm", a, 1);
    }

    public final void m10487a(String str) {
        this.f10081h.a(str);
        if (TextUtils.isEmpty(str)) {
            this.f10080g.b("lull::HideEvent");
        } else {
            this.f10080g.b("lull::ShowEvent");
        }
    }

    public final void m10488b(String str) {
        this.f10085l = str;
        this.f10083j.a(str);
    }

    private final void m10485a(String str, b bVar) {
        b a = m10455a("pin-key-button", m10455a("pin-key-shadow", bVar, 2), 3);
        m10455a("pin-key-label", a, 4).a(str);
        m10457a(a, "lull::ClickEvent", new C1983t(this, str));
    }

    protected final int mo2562a() {
        return 750;
    }
}
