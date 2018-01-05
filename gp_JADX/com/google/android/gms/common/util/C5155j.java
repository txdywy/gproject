package com.google.android.gms.common.util;

import android.os.Build.VERSION;

public final class C5155j {
    public static boolean m23888a() {
        return VERSION.SDK_INT >= 20;
    }

    public static boolean m23889b() {
        return VERSION.SDK_INT >= 21;
    }

    public static boolean m23890c() {
        return VERSION.SDK_INT > 25 || "O".equals(VERSION.CODENAME) || VERSION.CODENAME.startsWith("OMR") || VERSION.CODENAME.startsWith("ODR");
    }
}
