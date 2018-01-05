package com.google.android.gms.car;

import android.util.Log;

public final class C4997m {
    public static volatile boolean f25506a;
    public static volatile boolean f25507b;

    static {
        C5003r c5003r = new C5003r();
        c5003r = new C5003r();
    }

    public static final boolean m23159a(String str, int i) {
        return (f25506a && (i >= 3 || f25507b)) || Log.isLoggable(str, i);
    }
}
