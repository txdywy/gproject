package com.google.android.finsky.utils;

import android.os.SystemClock;

public final class C4678i {
    public static C4678i f24060a;

    private C4678i() {
    }

    public static long m21812a() {
        if (f24060a == null) {
            f24060a = new C4678i();
        }
        return System.currentTimeMillis();
    }

    public static long m21813b() {
        if (f24060a == null) {
            f24060a = new C4678i();
        }
        return SystemClock.elapsedRealtime();
    }
}
