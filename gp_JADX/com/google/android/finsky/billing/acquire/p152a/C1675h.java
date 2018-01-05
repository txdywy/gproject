package com.google.android.finsky.billing.acquire.p152a;

import android.view.View;
import android.view.ViewGroup;
import com.android.volley.C0700r;
import com.google.android.finsky.billing.p130b.C1764f;
import com.google.android.finsky.billing.payments.C2044g;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.p137a.C1666l;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.ad;
import com.google.android.wallet.common.pub.a.a;
import com.google.wireless.android.finsky.dfe.c.a.v;

public final class C1675h extends C1666l {
    public final v f8695a;
    public final C1764f f8696b;

    public C1675h(v vVar, C1764f c1764f) {
        super(null);
        this.f8695a = vVar;
        this.f8696b = c1764f;
    }

    public final View mo2383a(C2797e c2797e, ViewGroup viewGroup) {
        ad c2473o = new C2473o(1600);
        C1764f c1764f = this.f8696b;
        v vVar = this.f8695a;
        c1764f.f9096c = vVar;
        a.a = new C2044g(c2473o, c1764f.f9103j);
        com.google.android.wallet.common.c.a.a((C0700r) c1764f.f9094a.mo1a());
        com.google.android.wallet.common.c.a.b((C0700r) c1764f.f9095b.mo1a());
        View a = c1764f.f9102i.mo2452a(vVar, c1764f.f9103j);
        if (a.getParent() != null) {
            ((ViewGroup) a.getParent()).removeView(a);
        }
        return a;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        throw new UnsupportedOperationException("OrchestrationComponent does not support view configuration.");
    }

    public final int mo2377a() {
        throw new UnsupportedOperationException("OrchestrationComponent has no fixed layout ID.");
    }
}
