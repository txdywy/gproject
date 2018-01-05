package com.google.android.finsky.uninstall;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.p111d.C2474c;
import java.util.ArrayList;

final /* synthetic */ class C4635x implements C1031w {
    public final C4605t f23848a;
    public final C2719i f23849b;

    C4635x(C4605t c4605t, C2719i c2719i) {
        this.f23848a = c4605t;
        this.f23849b = c2719i;
    }

    public final void m_() {
        C4605t c4605t = this.f23848a;
        C2719i c2719i = this.f23849b;
        c4605t.f23672q.m13371a(new C2474c(164).f13342a, null);
        c4605t.f23664i = new ArrayList();
        c4605t.f23664i.add(c2719i.m14722b());
        if (c4605t.f23674s) {
            c4605t.f23674s = false;
            c4605t.mo4275g();
        }
    }
}
