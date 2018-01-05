package com.google.android.play.utils;

import android.util.Log;
import com.google.android.flib.log.a;
import java.util.Locale;

public class PlayCommonLog {
    public static final long f32389a = System.currentTimeMillis();

    public static void m29460a(String str, Object... objArr) {
        a.a("PlayCommon", str, objArr);
    }

    public static void m29461b(String str, Object... objArr) {
        a.c("PlayCommon", str, objArr);
    }

    public static void m29462c(String str, Object... objArr) {
        a.d("PlayCommon", str, objArr);
    }

    public static void m29463d(String str, Object... objArr) {
        a.e("PlayCommon", str, objArr);
    }

    public static void m29464e(String str, Object... objArr) {
        a.e("PlayCommon", str, objArr);
    }

    public static void m29465f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCommon", 2)) {
            if (objArr.length != 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Object[] objArr2 = new Object[]{Long.valueOf(System.currentTimeMillis() - f32389a), str};
        }
    }
}
