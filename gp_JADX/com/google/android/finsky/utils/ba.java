package com.google.android.finsky.utils;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Build.VERSION;

public final class ba {
    public static String m21789a(String str) {
        String str2 = "";
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke(null, new Object[]{str});
        } catch (Exception e) {
            FinskyLog.m21669e("Can't get system properties: %s", e);
            return str2;
        }
    }

    @TargetApi(21)
    public static String[] m21790a() {
        if (VERSION.SDK_INT >= 21) {
            return Build.SUPPORTED_ABIS;
        }
        if (Build.CPU_ABI2.equals("unknown")) {
            return new String[]{Build.CPU_ABI};
        }
        return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
    }
}
