package com.google.android.instantapps.p309a;

public final class C5699f {
    public static Object m26959a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static Object m26960a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static void m26961a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m26963b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m26962a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
