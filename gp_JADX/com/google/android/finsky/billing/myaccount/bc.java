package com.google.android.finsky.billing.myaccount;

import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.nano.cl;

final class bc implements C0660x {
    public final /* synthetic */ C0660x f10242a;
    public final /* synthetic */ bb f10243b;

    bc(bb bbVar, C0660x c0660x) {
        this.f10243b = bbVar;
        this.f10242a = c0660x;
    }

    public final /* synthetic */ void b_(Object obj) {
        com.google.wireless.android.finsky.dfe.nano.bc bcVar = (com.google.wireless.android.finsky.dfe.nano.bc) obj;
        bb bbVar = this.f10243b;
        an anVar = (an) bbVar.f10241a.e.getAdapter();
        cl clVar = anVar.f10202e;
        if (bcVar.d()) {
            bbVar.f10241a.f10240h.b = clVar;
        } else {
            if (clVar.b.equals(anVar.m10592b().b)) {
                bbVar.f10241a.f10240h.b = null;
            }
            bbVar.f10241a.f10240h.a = clVar;
        }
        bbVar.f10241a.m10606a(bbVar.f10241a.f10240h);
        this.f10242a.b_(bcVar);
    }
}
