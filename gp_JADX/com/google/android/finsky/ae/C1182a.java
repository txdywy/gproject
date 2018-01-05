package com.google.android.finsky.ae;

import java.util.HashSet;
import java.util.Set;

public final class C1182a {
    public final Set f7258a = new HashSet();

    public final void m7132a(C1183b c1183b) {
        synchronized (this.f7258a) {
            this.f7258a.add(c1183b);
        }
    }

    public final boolean m7133a() {
        synchronized (this.f7258a) {
            for (C1183b a : this.f7258a) {
                if (a.mo2949a()) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean m7134b() {
        synchronized (this.f7258a) {
            for (C1183b c1183b : this.f7258a) {
                if (c1183b.mo2950b() == 2 && c1183b.mo2949a()) {
                    return true;
                }
            }
            return false;
        }
    }
}
