package com.google.android.libraries.performance.primes;

import android.util.Log;
import java.util.Locale;

public final class C5989do {
    private static String m27823a(String str, Object... objArr) {
        return objArr.length == 0 ? str : String.format(Locale.US, str, objArr);
    }

    public static void m27824a(int i, String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            Log.println(i, str, C5989do.m27823a(str2, objArr));
        }
    }

    private static void m27825a(int i, String str, Throwable th, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            switch (i) {
                case 2:
                    Log.v(str, C5989do.m27823a(str2, objArr), th);
                    return;
                case 3:
                    Log.d(str, C5989do.m27823a(str2, objArr), th);
                    return;
                case 4:
                    Log.i(str, C5989do.m27823a(str2, objArr), th);
                    return;
                case 5:
                    Log.w(str, C5989do.m27823a(str2, objArr), th);
                    return;
                case 6:
                    Log.e(str, C5989do.m27823a(str2, objArr), th);
                    return;
                default:
                    C5989do.m27824a(5, "PrimesLog", "unexpected priority: %d for log %s: %s", Integer.valueOf(i), str, C5989do.m27823a(str2, objArr));
                    return;
            }
        }
    }

    public static void m27827a(String str, String str2, Object... objArr) {
        C5989do.m27824a(6, str, str2, objArr);
    }

    public static void m27826a(String str, String str2, Throwable th, Object... objArr) {
        C5989do.m27825a(3, str, th, str2, objArr);
    }

    public static void m27828b(String str, String str2, Throwable th, Object... objArr) {
        C5989do.m27825a(5, str, th, str2, objArr);
    }

    public static void m27829c(String str, String str2, Throwable th, Object... objArr) {
        C5989do.m27825a(6, str, th, str2, objArr);
    }
}
