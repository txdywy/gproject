package com.google.android.agera;

public final class C0917x {
    public static void m5640a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void m5641b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Object m5639a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }
}
