package com.google.android.finsky.detailspage;

import com.android.volley.C0660x;
import com.google.android.finsky.detailsmodules.p183a.C2598b;
import com.google.android.finsky.ratereview.C3964c;
import com.google.wireless.android.finsky.dfe.nano.ft;

final class fh implements C0660x {
    public final /* synthetic */ boolean f14574a;
    public final /* synthetic */ fg f14575b;

    fh(fg fgVar, boolean z) {
        this.f14575b = fgVar;
        this.f14574a = z;
    }

    public final /* synthetic */ void b_(Object obj) {
        fk fkVar = (fk) this.f14575b.b;
        fkVar.f14578b = C3964c.m18673a((ft) obj, this.f14574a);
        C2598b c2598b = this.f14575b;
        fkVar = (fk) c2598b.b;
        fkVar.f14578b = c2598b.f14573g.m18689a(((fk) c2598b.b).f14577a.f14885a.f12096c, ((fk) c2598b.b).f14578b, ((fk) c2598b.b).f14580d);
        if (!c2598b.f14570d) {
            if (((fk) c2598b.b).f14578b == null) {
                c2598b.u.mo3032a(c2598b);
            } else {
                c2598b.u.mo3033a(c2598b, true);
            }
        }
    }
}
