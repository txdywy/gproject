package com.google.android.finsky.p229o;

import com.google.android.finsky.dk.C2830g;
import com.google.wireless.android.finsky.dfe.b.a.a.a;
import com.google.wireless.android.finsky.dfe.b.a.b.a.b;

final class C3834i implements C3826a {
    public final C2830g f19194a;
    public b f19195b = new b();

    C3834i(C2830g c2830g) {
        this.f19194a = c2830g;
    }

    public final int mo3813a() {
        return 2;
    }

    public final boolean mo3815b() {
        long g = C2830g.m14971g();
        b bVar = this.f19195b;
        long b = C2830g.m14968b(g);
        bVar.a |= 2;
        bVar.c = b;
        bVar = this.f19195b;
        b = C2830g.m14968b(C2830g.m14970d());
        bVar.a |= 1;
        bVar.b = b;
        bVar = this.f19195b;
        g = C2830g.m14968b(this.f19194a.m14974a(g));
        bVar.a |= 4;
        bVar.d = g;
        return true;
    }

    public final void mo3814a(a aVar) {
        aVar.b = this.f19195b;
    }
}
