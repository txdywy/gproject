package com.google.android.finsky.verifier.impl;

import android.os.Build.VERSION;

public final class ab {
    public static final String f24377a;

    static {
        String str;
        if (VERSION.SDK_INT >= 23) {
            str = "com.google.android.packageinstaller";
        } else {
            str = "com.android.packageinstaller";
        }
        f24377a = str;
    }
}
