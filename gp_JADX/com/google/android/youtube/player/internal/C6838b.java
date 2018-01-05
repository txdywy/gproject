package com.google.android.youtube.player.internal;

import android.text.TextUtils;

public final class C6838b {
    public static Object m31127a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static Object m31128a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static String m31129a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void m31130a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
