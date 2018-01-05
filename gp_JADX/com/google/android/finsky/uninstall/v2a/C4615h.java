package com.google.android.finsky.uninstall.v2a;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2718h;
import com.google.android.finsky.p111d.C2474c;
import java.util.ArrayList;

final /* synthetic */ class C4615h implements C1031w {
    public final C4613f f23779a;
    public final C2718h f23780b;

    C4615h(C4613f c4613f, C2718h c2718h) {
        this.f23779a = c4613f;
        this.f23780b = c2718h;
    }

    public final void m_() {
        C4613f c4613f = this.f23779a;
        C2718h c2718h = this.f23780b;
        c4613f.f23774q.m13371a(new C2474c(164).f13342a, null);
        c4613f.f23766i = new ArrayList(c2718h.m14719b());
        if (c4613f.f23776s) {
            c4613f.f23776s = false;
            c4613f.mo4307f();
        }
    }
}
