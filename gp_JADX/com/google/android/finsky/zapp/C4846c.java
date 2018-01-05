package com.google.android.finsky.zapp;

import android.content.Context;

public final class C4846c {
    static int m22668a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable e) {
            throw new RuntimeException("Cannot determine apk version.", e);
        }
    }
}
