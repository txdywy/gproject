package com.google.android.libraries.performance.primes.p332a;

import android.os.health.HealthStats;
import com.google.protobuf.nano.C0757i;
import d.a.a.a.a.a.be;

public final class C5943f extends C5940g {
    public static final C5943f f29598a = new C5943f();

    private C5943f() {
        super(be.class);
    }

    final /* synthetic */ String mo5215a(C0757i c0757i) {
        return ((be) c0757i).h.b;
    }

    final /* synthetic */ C0757i mo5213a(C0757i c0757i, C0757i c0757i2) {
        be beVar = (be) c0757i;
        be beVar2 = (be) c0757i2;
        if (beVar == null || beVar2 == null) {
            return beVar;
        }
        C0757i beVar3 = new be();
        beVar3.h = beVar.h;
        beVar3.b = C5939c.m27545a(beVar.b, beVar2.b);
        beVar3.c = C5939c.m27545a(beVar.c, beVar2.c);
        beVar3.d = C5939c.m27545a(beVar.d, beVar2.d);
        beVar3.e = C5939c.m27545a(beVar.e, beVar2.e);
        beVar3.f = C5939c.m27545a(beVar.f, beVar2.f);
        beVar3.g = C5939c.m27545a(beVar.g, beVar2.g);
        return C5939c.m27547a((be) beVar3) ? null : beVar3;
    }

    final /* synthetic */ C0757i mo5214a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        be beVar = new be();
        beVar.b = C5939c.m27544a(healthStats, 30001);
        beVar.c = C5939c.m27544a(healthStats, 30002);
        beVar.d = C5939c.m27544a(healthStats, 30003);
        beVar.e = C5939c.m27544a(healthStats, 30004);
        beVar.f = C5939c.m27544a(healthStats, 30005);
        beVar.g = C5939c.m27544a(healthStats, 30006);
        beVar.h = C5939c.m27539a(str);
        if (C5939c.m27547a(beVar)) {
            return null;
        }
        return beVar;
    }
}
