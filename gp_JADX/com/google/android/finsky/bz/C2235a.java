package com.google.android.finsky.bz;

import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p167r.C2176c;
import com.google.android.finsky.p167r.C3961b;
import com.google.wireless.android.finsky.dfe.f.a.b;

public final class C2235a implements C2176c {
    public final C1500a f11140a;

    public C2235a(C1500a c1500a) {
        this.f11140a = c1500a;
    }

    public final void mo2769a(C3961b c3961b) {
        String str = null;
        b g = this.f11140a.m8827g();
        Object obj = (g == null || C1500a.m8815a(g) >= g.c) ? null : 1;
        if (obj != null) {
            C1500a c1500a = this.f11140a;
            Document document = c3961b.f19983a;
            if (document != null) {
                C2441n N = document.m14625N();
                if (N != null) {
                    str = N.f13171k;
                }
            }
            if (!c1500a.m8820a(str)) {
                c3961b.f19989g &= -33;
                c3961b.f19988f.m16797c();
            }
        }
    }
}
