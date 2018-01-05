package com.google.android.finsky.setup;

import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import java.util.HashMap;

final class bu {
    public final HashMap f20881a = new HashMap();
    public final an f20882b;

    bu(C2471a c2471a) {
        this.f20882b = new an(c2471a);
    }

    final void m19342a() {
        if (this.f20881a.isEmpty()) {
            this.f20881a.putAll(this.f20882b.m19228a());
        }
    }

    public final C2495w m19340a(C4178k c4178k) {
        C2495w c2495w;
        synchronized (bt.f20877a) {
            m19342a();
            c2495w = (C2495w) this.f20881a.get(c4178k);
        }
        return c2495w;
    }

    public final C2495w m19341a(String str, Integer num) {
        C2495w a;
        synchronized (bt.f20877a) {
            a = m19340a(new C4178k(str, num));
        }
        return a;
    }
}
