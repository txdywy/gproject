package com.google.android.libraries.play.entertainment.p351m;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Locale;

public final class C6116b {
    public static Object m28100a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static Object m28101a(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.format(Locale.US, str, objArr));
    }

    public static Object[] m28105a(Object[] objArr) {
        for (Object a : (Object[]) C6116b.m28100a((Object) objArr)) {
            C6116b.m28100a(a);
        }
        return objArr;
    }

    public static CharSequence m28099a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        throw new IllegalArgumentException();
    }

    public static void m28104a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void m28103a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m28107b(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void m28106b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m28102a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not on main thread");
        }
    }
}
