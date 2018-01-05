package com.google.android.libraries.performance.primes;

import com.google.android.libraries.p326c.p327a.C5916a;

public final class cm {
    public static final cm f29877a;
    public static volatile cm f29878b;
    public final cn f29879c;

    private cm(cn cnVar) {
        this.f29879c = (cn) C5916a.m27406a((Object) cnVar);
    }

    public static synchronized cm m27796a(C5983c c5983c) {
        cm cmVar;
        Object obj = null;
        synchronized (cm.class) {
            if (f29878b != f29877a) {
                obj = 1;
            }
            if (obj != null) {
                C5989do.m27824a(3, "Primes", "Primes.initialize() is called more than once. This call will be ignored.", new Object[0]);
                cmVar = f29878b;
            } else {
                cmVar = new cm(c5983c.mo5252a());
                f29878b = cmVar;
            }
        }
        return cmVar;
    }

    public static String m27797a(cc ccVar) {
        return ccVar != null ? ccVar.toString() : null;
    }

    static {
        cm cmVar = new cm(new cd());
        f29877a = cmVar;
        f29878b = cmVar;
    }
}
