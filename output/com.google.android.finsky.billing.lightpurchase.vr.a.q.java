package com.google.android.finsky.billing.lightpurchase.vr.a;

import android.text.TextUtils;
import com.google.android.finsky.d.ad;
import com.google.vr.a.a.a;
import com.google.vr.a.a.a.b;
import com.google.vr.b.a.c;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.q extends com.google.android.finsky.billing.lightpurchase.vr.a.a
{

    public final com.google.vr.a.a.a.b c;
    public final com.google.vr.a.a.a.b d;
    public final com.google.vr.a.a.a.b e;
    public final com.google.vr.a.a.a.b f;
    public final com.google.vr.a.a.a.b g;
    public final com.google.vr.a.a.a.b h;
    public final com.google.vr.a.a.a.b i;
    public final com.google.vr.a.a.a.b j;
    public int k;
    public String l;
    public com.google.android.finsky.billing.lightpurchase.vr.a.ap m;
    public boolean n;

    q(com.google.vr.b.a.c p0, com.google.android.finsky.billing.lightpurchase.vr.a.aq p1, com.google.android.finsky.d.ad p2) {
        com.google.android.finsky.billing.lightpurchase.vr.a.a(p0, p1, p2, "background");
        this.k = -1;
        this.l = "";
        v2 = this.a("vertical-layout", this.a, 1);
        this.a("padding-y-48mm", v2, 1);
        v0 = this.a("container", v2, 2);
        this.a("padding-x-pinwidth", v0, 2);
        this.c = this.a("pin-title", v0, 1);
        this.a("padding-y-12mm", v2, 1);
        this.d = this.a("pin-account", v2, 1);
        this.a("padding-y-24mm", v2, 1);
        v0 = this.a("container", v2, 1);
        this.a("padding-x-pinwidth", v0, 2);
        this.j = this.a("pin-entry", v0, 1);
        this.i = this.a("pin-backspace", v0, 1);
        this.g = this.a("pin-entry-incorrect-line", this.a("pin-entry-line", v2, 1), 2);
        this.a("padding-y-12mm", v2, 1);
        v0 = this.a("container", v2, 1);
        this.a("padding-x-pinwidth", v0, 2);
        this.a("padding-y-36mm", v0, 1);
        this.h = this.a("pin-entry-incorrect-text", v0, 3);
        this.a("padding-y-18mm", v2, 1);
        this.g.b("lull::HideEvent");
        v3 = this.a("pin-pad", v2, 1);
        v0 = 1;
        while (v0 <= 9) {
            this.a(Integer.toString(v0), v3);
            v0 = v0 + 1;
        }
        this.a("pin-key-button-stub", v3, 2);
        this.a("0", v3);
        this.a(this.i, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.r(this));
        this.a("padding-y-18mm", v2, 1);
        v0 = this.a("container", v2, 2);
        this.f = this.a("pin-reset-button", this.a("button-shadow", v0, 2), 3);
        this.a(this.f, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.s(this));
        this.e = this.a("pin-reset-label", this.f, 4);
        this.a("pin-play-logo", v0, 2);
        this.a("padding-y-36mm", v2, 1);
    }

    private final void a(String p0, com.google.vr.a.a.a.b p1) {
        v0 = this.a("pin-key-button", this.a("pin-key-shadow", p1, 2), 3);
        this.a("pin-key-label", v0, 4).a(p0);
        this.a(v0, "lull::ClickEvent", new com.google.android.finsky.billing.lightpurchase.vr.a.t(this, p0));
    }

    protected final int a() {
        return 750;
    }

    public final void a(String p0) {
        this.h.a(p0);
        if (TextUtils.isEmpty(p0))
            this.g.b("lull::HideEvent");
        else
            this.g.b("lull::ShowEvent");
    }

    public final void b(String p0) {
        this.l = p0;
        this.j.a(p0);
    }

}
