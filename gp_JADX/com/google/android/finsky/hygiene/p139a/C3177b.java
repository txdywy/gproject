package com.google.android.finsky.hygiene.p139a;

import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.utils.C4678i;

public final class C3177b {
    static long m16201a() {
        long a = C4678i.m21812a();
        if (C0954a.f5853w.m5764b()) {
            long longValue = ((Long) C0955b.aG.m28964b()).longValue();
            long longValue2 = (((Long) C0954a.f5853w.m5760a()).longValue() % longValue) + (a - (a % longValue));
            if (longValue2 > a) {
                return longValue2 - longValue;
            }
            return longValue2;
        }
        C0954a.f5853w.m5763a(Long.valueOf(a));
        return a;
    }

    public static C4023a m16202b() {
        long a = C3177b.m16201a() - C4678i.m21812a();
        long longValue = ((Long) C0955b.aG.m28964b()).longValue() + a;
        a = Math.max(a, 0);
        C4024b c4024b = new C4024b();
        c4024b.m18842b(1).m18839a(a).m18843b(longValue).m18838a(1);
        return c4024b.m18837a();
    }

    static boolean m16203c() {
        return ((Long) C0954a.f5845o.m5760a()).longValue() < C4678i.m21812a() - ((2 * ((Long) C0955b.aG.m28964b()).longValue()) + ((Long) C0955b.aH.m28964b()).longValue());
    }
}
