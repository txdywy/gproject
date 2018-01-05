package com.google.android.finsky.uninstall;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2718h;
import com.google.android.finsky.p111d.C2474c;
import java.util.ArrayList;

final /* synthetic */ class C4633v implements C1031w {
    public final C4605t f23845a;
    public final C2718h f23846b;

    C4633v(C4605t c4605t, C2718h c2718h) {
        this.f23845a = c4605t;
        this.f23846b = c2718h;
    }

    public final void m_() {
        C4605t c4605t = this.f23845a;
        C2718h c2718h = this.f23846b;
        c4605t.f23672q.m13371a(new C2474c(164).f13342a, null);
        c4605t.f23664i = new ArrayList(c2718h.m14719b());
        if (c4605t.f23674s) {
            c4605t.f23674s = false;
            c4605t.mo4275g();
        }
    }
}
