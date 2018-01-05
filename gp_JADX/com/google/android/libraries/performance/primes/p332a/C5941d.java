package com.google.android.libraries.performance.primes.p332a;

import com.google.protobuf.nano.C0757i;
import d.a.a.a.a.a.p;

final class C5941d extends C5940g {
    public static final C5941d f29596a = new C5941d();

    private C5941d() {
        super(p.class);
    }

    final /* synthetic */ String mo5215a(C0757i c0757i) {
        return ((p) c0757i).c.b;
    }

    final /* synthetic */ C0757i mo5213a(C0757i c0757i, C0757i c0757i2) {
        p pVar = (p) c0757i;
        p pVar2 = (p) c0757i2;
        if (pVar == null || pVar2 == null) {
            return pVar;
        }
        C0757i pVar3 = new p();
        pVar3.c = pVar.c;
        pVar3.b = C5939c.m27542a(pVar.b, pVar2.b);
        return C5939c.m27550a((p) pVar3) ? null : pVar3;
    }

    final /* synthetic */ C0757i mo5214a(String str, Object obj) {
        int intValue = ((Long) obj).intValue();
        p pVar = new p();
        pVar.b = Integer.valueOf(intValue);
        pVar.c = C5939c.m27539a(str);
        if (C5939c.m27550a(pVar)) {
            return null;
        }
        return pVar;
    }
}
