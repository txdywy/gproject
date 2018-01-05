package com.google.android.finsky.detailspage;

import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.nano.fu;
import com.google.wireless.android.finsky.dfe.nano.fv;
import java.util.ArrayList;

final class C2640do implements C0660x {
    public final /* synthetic */ dn f14428a;

    C2640do(dn dnVar) {
        this.f14428a = dnVar;
    }

    public final /* synthetic */ void b_(Object obj) {
        fv fvVar = (fv) obj;
        if (this.f14428a.b != null) {
            ((dr) this.f14428a.b).f14431b = new ArrayList();
            for (fu fuVar : fvVar.a) {
                ((dr) this.f14428a.b).f14431b.add(new dv(fuVar.c, fuVar.d, (int) fuVar.e, fuVar.f, fuVar.g, fuVar.h));
            }
            if (!this.f14428a.f14426d && this.f14428a.mo2979f()) {
                this.f14428a.u.mo3033a(this.f14428a, true);
            }
        }
    }
}
