package com.google.android.finsky.installapi.p206a;

import android.accounts.Account;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.lightpurchase.ar;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dv.C2899a;
import com.google.android.finsky.installapi.C3272g;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p111d.C2495w;
import java.util.List;

final class C3262g implements C1031w {
    public final /* synthetic */ C2899a f16807a;
    public final /* synthetic */ C3272g f16808b;
    public final /* synthetic */ C3260e f16809c;

    C3262g(C3260e c3260e, C2899a c2899a, C3272g c3272g) {
        this.f16809c = c3260e;
        this.f16807a = c2899a;
        this.f16808b = c3272g;
    }

    public final void m_() {
        List list = this.f16807a.f15421r;
        if (!list.isEmpty()) {
            Document document = (Document) list.get(0);
            Account b = this.f16809c.f16802f.mo1183b(C1473m.f7980a.bt().m15626a(this.f16809c.f16803g).m15620a(this.f16809c.f16801e));
            if (C1473m.f7980a.mo2045Y().m11647a(document, this.f16809c.f16800d.mo2811a(b))) {
                C3260e c3260e = this.f16809c;
                C3272g c3272g = this.f16808b;
                c3260e.f16799c.mo3440a(c3260e.f16803g, c3272g.f16844c.getBoolean("show_progress", true), c3272g.f16844c.getBoolean("show_errors", true), c3272g.f16844c.getBoolean("show_completion", true));
                C2495w a = c3260e.f16797a.m13184a("isotope_install");
                C3300k c3300k = c3260e.f16799c;
                c3300k.mo3433a(c3260e.f16803g, document.m14653h(), b.name, document.f14885a.f12100g, 2, document.m14671z(), c3272g.f16842a, a);
                return;
            }
            ar.m10196a(b, document, new C3263h(this), false, false, this.f16809c.f16797a.m13178a(b));
        }
    }
}
