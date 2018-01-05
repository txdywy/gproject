package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.System;

public final class C5146a {
    @TargetApi(17)
    public static boolean m23876a(Context context) {
        if (VERSION.SDK_INT >= 17) {
            if (Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } else if (System.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        } else {
            return true;
        }
    }
}
