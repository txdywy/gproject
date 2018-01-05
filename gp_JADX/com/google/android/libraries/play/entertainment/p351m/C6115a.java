package com.google.android.libraries.play.entertainment.p351m;

import android.os.Build.VERSION;

public final class C6115a {
    public static final int f30288a;

    public static boolean m28097a(int i) {
        return f30288a >= i;
    }

    public static boolean m28098b(int i) {
        return f30288a < i;
    }

    static {
        int i = VERSION.SDK_INT;
        if (i == 23 && VERSION.CODENAME.startsWith("N")) {
            i = 24;
        }
        f30288a = i;
    }
}
