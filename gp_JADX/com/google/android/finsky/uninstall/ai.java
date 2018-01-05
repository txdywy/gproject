package com.google.android.finsky.uninstall;

import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.p111d.C2474c;
import java.util.ArrayList;

final /* synthetic */ class ai implements C1031w {
    public final ae f23479a;
    public final C2719i f23480b;

    ai(ae aeVar, C2719i c2719i) {
        this.f23479a = aeVar;
        this.f23480b = c2719i;
    }

    public final void m_() {
        ae aeVar = this.f23479a;
        C2719i c2719i = this.f23480b;
        aeVar.f23464p.m13371a(new C2474c(164).f13342a, null);
        aeVar.f23457i = new ArrayList();
        aeVar.f23457i.add(c2719i.m14722b());
        if (aeVar.f23473y) {
            aeVar.f23473y = false;
            aeVar.mo4275g();
        }
    }
}
