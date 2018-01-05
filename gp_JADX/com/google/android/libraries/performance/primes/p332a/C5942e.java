package com.google.android.libraries.performance.primes.p332a;

import android.os.health.HealthStats;
import com.google.protobuf.nano.C0757i;
import d.a.a.a.a.a.ar;
import d.a.a.a.a.a.bg;
import d.a.a.a.a.a.p;

public final class C5942e extends C5940g {
    public static final C5942e f29597a = new C5942e();

    private C5942e() {
        super(ar.class);
    }

    final /* synthetic */ String mo5215a(C0757i c0757i) {
        return ((ar) c0757i).d.b;
    }

    final /* synthetic */ C0757i mo5213a(C0757i c0757i, C0757i c0757i2) {
        ar arVar = (ar) c0757i;
        ar arVar2 = (ar) c0757i2;
        if (arVar == null || arVar2 == null) {
            return arVar;
        }
        C0757i arVar3 = new ar();
        arVar3.d = arVar.d;
        arVar3.b = (bg[]) C5944h.f29599a.m27561a(arVar.b, arVar2.b);
        arVar3.c = (p[]) C5941d.f29596a.m27561a(arVar.c, arVar2.c);
        return C5939c.m27546a((ar) arVar3) ? null : arVar3;
    }

    final /* synthetic */ C0757i mo5214a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        C0757i arVar = new ar();
        arVar.b = (bg[]) C5944h.f29599a.m27560a(C5939c.m27555d(healthStats, 40001));
        arVar.c = (p[]) C5941d.f29596a.m27560a(healthStats.hasMeasurements(40002) ? healthStats.getMeasurements(40002) : null);
        arVar.d = C5939c.m27539a(str);
        if (C5939c.m27546a((ar) arVar)) {
            return null;
        }
        return arVar;
    }
}
