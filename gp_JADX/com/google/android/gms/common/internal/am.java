package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.C5158m;

public final class am {
    public static Object m23733a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static Object m23734a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static String m23735a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static String m23736a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    public static void m23737a(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    public static void m23738a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m23739a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void m23740a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void m23741b(String str) {
        if (!C5158m.m23894a()) {
            throw new IllegalStateException(str);
        }
    }

    public static void m23742b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m23743b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void m23744b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void m23745c(String str) {
        if (C5158m.m23894a()) {
            throw new IllegalStateException(str);
        }
    }
}
