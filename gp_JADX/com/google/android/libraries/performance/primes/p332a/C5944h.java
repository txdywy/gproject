package com.google.android.libraries.performance.primes.p332a;

import android.os.health.HealthStats;
import com.google.protobuf.nano.C0757i;
import d.a.a.a.a.a.bg;

final class C5944h extends C5940g {
    public static final C5944h f29599a = new C5944h();

    private C5944h() {
        super(bg.class);
    }

    final /* synthetic */ String mo5215a(C0757i c0757i) {
        return ((bg) c0757i).d.b;
    }

    final /* synthetic */ C0757i mo5213a(C0757i c0757i, C0757i c0757i2) {
        bg bgVar = (bg) c0757i;
        bg bgVar2 = (bg) c0757i2;
        if (bgVar == null || bgVar2 == null) {
            return bgVar;
        }
        C0757i bgVar3 = new bg();
        bgVar3.d = bgVar.d;
        bgVar3.b = C5939c.m27542a(bgVar.b, bgVar2.b);
        bgVar3.c = C5939c.m27542a(bgVar.c, bgVar2.c);
        return C5939c.m27548a((bg) bgVar3) ? null : bgVar3;
    }

    final /* synthetic */ C0757i mo5214a(String str, Object obj) {
        HealthStats healthStats = (HealthStats) obj;
        bg bgVar = new bg();
        bgVar.b = C5939c.m27543a(C5939c.m27544a(healthStats, 50001));
        bgVar.c = C5939c.m27543a(C5939c.m27544a(healthStats, 50002));
        bgVar.d = C5939c.m27539a(str);
        if (C5939c.m27548a(bgVar)) {
            return null;
        }
        return bgVar;
    }
}
