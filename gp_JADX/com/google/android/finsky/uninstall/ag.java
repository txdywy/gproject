package com.google.android.finsky.uninstall;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2718h;
import com.google.android.finsky.p111d.C2474c;
import java.util.ArrayList;

final /* synthetic */ class ag implements C1031w {
    public final ae f23476a;
    public final C2718h f23477b;

    ag(ae aeVar, C2718h c2718h) {
        this.f23476a = aeVar;
        this.f23477b = c2718h;
    }

    public final void m_() {
        ae aeVar = this.f23476a;
        C2718h c2718h = this.f23477b;
        aeVar.f23464p.m13371a(new C2474c(164).f13342a, null);
        aeVar.f23457i = new ArrayList(c2718h.m14719b());
        if (aeVar.f23473y) {
            aeVar.f23473y = false;
            aeVar.mo4275g();
        }
    }
}
