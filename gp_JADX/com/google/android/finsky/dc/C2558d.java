package com.google.android.finsky.dc;

import com.android.volley.C0660x;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.bs;

final class C2558d implements C0660x {
    public final /* synthetic */ C2495w f13651a;
    public final /* synthetic */ int f13652b;
    public final /* synthetic */ C2557c f13653c;

    C2558d(C2557c c2557c, C2495w c2495w, int i) {
        this.f13653c = c2557c;
        this.f13651a = c2495w;
        this.f13652b = i;
    }

    public final /* synthetic */ void b_(Object obj) {
        bs bsVar = (bs) obj;
        int i = bsVar.b;
        if (i != 1) {
            this.f13653c.f13649f = null;
            FinskyLog.m21665c("SelfUpdate non-OK response - %d", Integer.valueOf(i));
            this.f13651a.m13367a(this.f13653c.m13549b(104).m13210a(C3322j.m16691a(i)));
        } else if (bsVar.c == null) {
            this.f13653c.f13649f = null;
            FinskyLog.m21665c("SelfUpdate response missing appDeliveryData", new Object[0]);
            this.f13651a.m13367a(this.f13653c.m13549b(104).m13244b("missing-delivery-data"));
        } else {
            this.f13653c.f13649f.m13502a(this.f13653c.f13644a, this.f13652b, bsVar.c);
        }
    }
}
