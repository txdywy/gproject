package com.google.android.finsky.installer.p207a;

import android.net.Uri;
import android.support.v7.widget.eq;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p189e.C2956k;

final class ao implements C2956k {
    public final /* synthetic */ Uri f16939a;
    public final /* synthetic */ ah f16940b;

    ao(ah ahVar, Uri uri) {
        this.f16940b = ahVar;
        this.f16939a = uri;
    }

    public final void mo3410a() {
        this.f16940b.f16898f.mo3179c(this.f16939a);
        this.f16940b.m16449i();
    }

    public final void mo3411a(int i) {
        this.f16940b.f16898f.mo3179c(this.f16939a);
        this.f16940b.m16447g();
        this.f16940b.ah.mo2281f();
        if (!this.f16940b.m16450j() || this.f16940b.ac == null) {
            this.f16940b.m16442b(4, 8);
            return;
        }
        ah ahVar = this.f16940b;
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
