package com.google.android.finsky.installer.p207a;

import android.net.Uri;
import android.support.v7.widget.eq;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p189e.C2956k;

final class am implements C2956k {
    public final /* synthetic */ Uri f16933a;
    public final /* synthetic */ ah f16934b;

    am(ah ahVar, Uri uri) {
        this.f16934b = ahVar;
        this.f16933a = uri;
    }

    public final void mo3410a() {
        if (this.f16934b.ag.equals(this.f16934b.f16878I)) {
            this.f16934b.f16903k.mo2845a(this.f16934b.f16878I, this.f16933a);
        }
        this.f16934b.m16449i();
    }

    public final void mo3411a(int i) {
        this.f16934b.f16898f.mo3179c(this.f16933a);
        if (!this.f16934b.m16450j() || this.f16934b.ac == null) {
            ah ahVar = this.f16934b;
            ahVar.m16435a(false);
            ahVar.m16423a(5, i);
            ahVar.m16425a(i, null);
            return;
        }
        ahVar = this.f16934b;
        ahVar.f16874E.m11221a(ahVar.f16878I, new C2474c(3151).m13236a(ahVar.f16878I).m13231a(ahVar.f16893X).f13342a);
        C2127b c2127b = ahVar.f16900h;
        c2127b.mo2675d(ahVar.f16878I, c2127b.mo2657a(ahVar.f16878I).f10819m | eq.FLAG_MOVED);
        ahVar.ac.mo3420g();
        ahVar.ac = null;
        if (!ahVar.m16442b(4, 8)) {
            ahVar.m16439b(0, null);
            ahVar.m16443c();
        }
    }
}
