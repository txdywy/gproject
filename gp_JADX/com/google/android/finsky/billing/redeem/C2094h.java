package com.google.android.finsky.billing.redeem;

import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.el;

final class C2094h implements C0660x {
    public final C2495w f10663a;
    public final /* synthetic */ C2089c f10664b;

    public C2094h(C2089c c2089c, C2495w c2495w) {
        this.f10664b = c2089c;
        this.f10663a = c2495w;
    }

    public final /* synthetic */ void b_(Object obj) {
        el elVar = (el) obj;
        C1089s c1089s = this.f10664b;
        C2495w c2495w = this.f10663a;
        c1089s.f10654c = elVar;
        int i = elVar.b;
        C2474c a = new C2474c(801).m13240a(elVar.l);
        if (i != 1) {
            a.m13210a(i);
        }
        c2495w.m13367a(a);
        switch (i) {
            case 1:
                C1473m.f7980a.ai().mo2796a(c1089s.f10652a.mo1620b(), "redeem-code-sidecar", new C2090d(c1089s), elVar.o);
                return;
            case 3:
                c1089s.m6758b(4, 0);
                return;
            case 5:
                c1089s.m6758b(5, 0);
                return;
            default:
                FinskyLog.m21665c("Received error/unknown result: %d", Integer.valueOf(elVar.b));
                c1089s.f10655d = elVar.g;
                c1089s.m6758b(3, 0);
                return;
        }
    }
}
