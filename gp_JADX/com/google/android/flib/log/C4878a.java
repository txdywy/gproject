package com.google.android.flib.log;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;

public final class C4878a {
    public static final String f25230a = C4878a.class.getName();
    public static boolean f25231b = false;
    public static boolean f25232c = false;
    public static boolean f25233d = false;

    private C4878a() {
    }

    public static void m22891a() {
        f25231b = true;
    }

    public static void m22894b() {
        f25232c = true;
    }

    public static String m22887a(String str, String str2, Object... objArr) {
        String a = C4878a.m22889a(str2, objArr);
        Log.i(str, a);
        return a;
    }

    public static String m22892b(String str, String str2, Object... objArr) {
        if (!Log.isLoggable(str, 3)) {
            return null;
        }
        String a = C4878a.m22889a(str2, objArr);
        Log.d(str, a);
        return a;
    }

    public static String m22895c(String str, String str2, Object... objArr) {
        String a = C4878a.m22889a(str2, objArr);
        Log.w(str, a);
        return a;
    }

    public static String m22896d(String str, String str2, Object... objArr) {
        String a = C4878a.m22889a(str2, objArr);
        Log.e(str, a);
        return a;
    }

    public static String m22888a(String str, Throwable th, String str2, Object... objArr) {
        String a = C4878a.m22889a(str2, objArr);
        Log.e(str, a, th);
        return a;
    }

    @TargetApi(8)
    public static String m22897e(String str, String str2, Object... objArr) {
        String a = C4878a.m22889a(str2, objArr);
        if (f25233d) {
            throw new WhatATerribleException(a);
        }
        Log.wtf(str, a, new WhatATerribleException());
        return a;
    }

    @TargetApi(8)
    public static String m22893b(String str, Throwable th, String str2, Object... objArr) {
        String a = C4878a.m22889a(str2, objArr);
        if (f25233d) {
            throw new WhatATerribleException(a, th);
        }
        Log.wtf(str, a, new WhatATerribleException(th));
        return a;
    }

    public static String m22886a(Object obj, boolean z) {
        String valueOf = String.valueOf(obj);
        if (obj == null || TextUtils.isEmpty(valueOf) || z) {
            return valueOf;
        }
        valueOf = C4878a.m22890a(valueOf.getBytes());
        return new StringBuilder(String.valueOf(valueOf).length() + 2).append("[").append(valueOf).append("]").toString();
    }

    @TargetApi(8)
    private static String m22890a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    private static String m22889a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    str = String.format(Locale.US, str, objArr);
                }
            } catch (Throwable e) {
                String arrays = Arrays.toString(objArr);
                C4878a.m22893b("Blog", e, "msg: \"%s\" args: %s", str, arrays);
                str = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(arrays).length()).append(str).append(" ").append(arrays).toString();
            }
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str3 = "<unknown>";
        int i = 2;
        while (i < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            arrays = stackTraceElement.getClassName();
            if (arrays.equals(f25230a) || arrays.endsWith("Log")) {
                i++;
            } else {
                if (f25231b) {
                    str2 = arrays;
                } else {
                    str2 = arrays.substring(arrays.lastIndexOf(46) + 1);
                }
                arrays = stackTraceElement.getMethodName();
                str2 = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(arrays).length()).append(str2).append(".").append(arrays).toString();
                if (f25232c) {
                    str2 = String.valueOf(str2);
                    str2 = new StringBuilder(String.valueOf(str2).length() + 13).append(str2).append("(").append(stackTraceElement.getLineNumber()).append(")").toString();
                }
                return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
            }
        }
        str2 = str3;
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
