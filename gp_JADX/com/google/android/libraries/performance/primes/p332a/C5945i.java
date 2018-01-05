package com.google.android.libraries.performance.primes.p332a;

import android.os.health.TimerStat;
import com.google.protobuf.nano.C0757i;
import d.a.a.a.a.a.bt;

final class C5945i extends C5940g {
    public static final C5945i f29600a = new C5945i();

    private C5945i() {
        super(bt.class);
    }

    final /* synthetic */ String mo5215a(C0757i c0757i) {
        bt btVar = (bt) c0757i;
        String str = btVar.d.b;
        if (str != null) {
            return str;
        }
        return Long.toHexString(btVar.d.a.longValue());
    }

    final /* synthetic */ C0757i mo5213a(C0757i c0757i, C0757i c0757i2) {
        return C5939c.m27540a((bt) c0757i, (bt) c0757i2);
    }

    final /* synthetic */ C0757i mo5214a(String str, Object obj) {
        return C5939c.m27541a(str, (TimerStat) obj);
    }
}
