package com.google.android.gms.internal;

import android.util.Log;

@C5302b
public class ap {
    public static void m24188a(String str) {
        if (m24190a(3)) {
            Log.d("Ads", str);
        }
    }

    public static void m24189a(String str, Throwable th) {
        if (m24190a(3)) {
            Log.d("Ads", str, th);
        }
    }

    public static boolean m24190a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }

    public static void m24191b(String str) {
        if (m24190a(6)) {
            Log.e("Ads", str);
        }
    }

    public static void m24192b(String str, Throwable th) {
        if (m24190a(6)) {
            Log.e("Ads", str, th);
        }
    }

    public static void m24193c(String str) {
        if (m24190a(5)) {
            Log.w("Ads", str);
        }
    }

    public static void m24194c(String str, Throwable th) {
        if (m24190a(5)) {
            Log.w("Ads", str, th);
        }
    }
}
