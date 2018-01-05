package com.google.android.finsky.uninstall.v2a;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.p111d.C2474c;
import java.util.ArrayList;

final /* synthetic */ class C4617j implements C1031w {
    public final C4613f f23782a;
    public final C2719i f23783b;

    C4617j(C4613f c4613f, C2719i c2719i) {
        this.f23782a = c4613f;
        this.f23783b = c2719i;
    }

    public final void m_() {
        C4613f c4613f = this.f23782a;
        C2719i c2719i = this.f23783b;
        c4613f.f23774q.m13371a(new C2474c(164).f13342a, null);
        c4613f.f23766i = new ArrayList();
        c4613f.f23766i.add(c2719i.m14722b());
        if (c4613f.f23776s) {
            c4613f.f23776s = false;
            c4613f.mo4307f();
        }
    }
}
