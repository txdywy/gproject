package com.google.protobuf;

final class dw extends du {
    dw() {
    }

    final boolean mo6193a() {
        return false;
    }

    private static void m33333a(Object obj, dv dvVar) {
        ((at) obj).f35180h = dvVar;
    }

    final void mo6201d(Object obj) {
        ((at) obj).f35180h.f35370f = false;
    }

    final /* synthetic */ int mo6203f(Object obj) {
        return ((dv) obj).m33327a();
    }

    final /* synthetic */ int mo6202e(Object obj) {
        dv dvVar = (dv) obj;
        int i = dvVar.f35369e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < dvVar.f35366b; i2++) {
                i += CodedOutputStream.m32598d(dvVar.f35367c[i2] >>> 3, (C7203j) dvVar.f35368d[i2]);
            }
            dvVar.f35369e = i;
        }
        return i;
    }

    final /* synthetic */ Object mo6200c(Object obj, Object obj2) {
        dv dvVar = (dv) obj;
        dv dvVar2 = (dv) obj2;
        if (dvVar2.equals(dv.f35365a)) {
            return dvVar;
        }
        return dv.m33324a(dvVar, dvVar2);
    }

    final /* synthetic */ void mo6197b(Object obj, eq eqVar) {
        dv dvVar = (dv) obj;
        int i;
        if (eqVar.mo6051a() == er.DESCENDING) {
            for (i = dvVar.f35366b - 1; i >= 0; i--) {
                eqVar.mo6072c(dvVar.f35367c[i] >>> 3, dvVar.f35368d[i]);
            }
            return;
        }
        for (i = 0; i < dvVar.f35366b; i++) {
            eqVar.mo6072c(dvVar.f35367c[i] >>> 3, dvVar.f35368d[i]);
        }
    }

    final /* synthetic */ void mo6191a(Object obj, eq eqVar) {
        ((dv) obj).m33330a(eqVar);
    }

    final /* synthetic */ void mo6198b(Object obj, Object obj2) {
        m33333a(obj, (dv) obj2);
    }

    final /* synthetic */ Object mo6199c(Object obj) {
        dv dvVar = ((at) obj).f35180h;
        if (dvVar != dv.f35365a) {
            return dvVar;
        }
        dvVar = new dv();
        m33333a(obj, dvVar);
        return dvVar;
    }

    final /* synthetic */ Object mo6195b(Object obj) {
        return ((at) obj).f35180h;
    }

    final /* synthetic */ Object mo6186a(Object obj) {
        dv dvVar = (dv) obj;
        dvVar.f35370f = false;
        return dvVar;
    }

    final /* synthetic */ Object mo6194b() {
        return new dv();
    }

    final /* synthetic */ void mo6190a(Object obj, int i, Object obj2) {
        ((dv) obj).m33328a((i << 3) | 3, (dv) obj2);
    }

    final /* synthetic */ void mo6189a(Object obj, int i, C7203j c7203j) {
        ((dv) obj).m33328a((i << 3) | 2, (Object) c7203j);
    }

    final /* synthetic */ void mo6196b(Object obj, int i, long j) {
        ((dv) obj).m33328a((i << 3) | 1, Long.valueOf(j));
    }

    final /* synthetic */ void mo6187a(Object obj, int i, int i2) {
        ((dv) obj).m33328a((i << 3) | 5, Integer.valueOf(i2));
    }

    final /* synthetic */ void mo6188a(Object obj, int i, long j) {
        ((dv) obj).m33328a((i << 3) | 0, Long.valueOf(j));
    }
}
