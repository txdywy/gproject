package com.android.volley;

import android.util.Log;
import java.util.Locale;

public class aa {
    public static String f4123a;
    public static boolean f4124b;

    public static void m4480a(String str, Object... objArr) {
        if (f4124b) {
            Log.v(f4123a, m4484d(str, objArr));
        }
    }

    public static void m4482b(String str, Object... objArr) {
        Log.d(f4123a, m4484d(str, objArr));
    }

    public static void m4483c(String str, Object... objArr) {
        Log.e(f4123a, m4484d(str, objArr));
    }

    public static void m4481a(Throwable th, String str, Object... objArr) {
        Log.e(f4123a, m4484d(str, objArr), th);
    }

    public static String m4484d(String str, Object... objArr) {
        String methodName;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClass().equals(aa.class)) {
                str2 = stackTrace[i].getClassName();
                str2 = str2.substring(str2.lastIndexOf(46) + 1);
                str2 = str2.substring(str2.lastIndexOf(36) + 1);
                methodName = stackTrace[i].getMethodName();
                methodName = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(methodName).length()).append(str2).append(".").append(methodName).toString();
                break;
            }
        }
        methodName = str2;
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), methodName, str});
    }

    static {
        String str = "Volley";
        f4123a = str;
        f4124b = Log.isLoggable(str, 2);
    }
}
