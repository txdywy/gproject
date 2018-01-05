package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;

public final class C5154i {
    public static Boolean f26090a;
    public static Boolean f26091b;
    public static Boolean f26092c;

    @TargetApi(24)
    public static boolean m23886a(Context context) {
        if (VERSION.SDK_INT < 24 || C5154i.m23887b(context)) {
            if (f26090a == null) {
                boolean z;
                if (C5155j.m23888a() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                    z = true;
                } else {
                    z = false;
                }
                f26090a = Boolean.valueOf(z);
            }
            if (f26090a.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(21)
    public static boolean m23887b(Context context) {
        if (f26091b == null) {
            boolean z = C5155j.m23889b() && context.getPackageManager().hasSystemFeature("cn.google");
            f26091b = Boolean.valueOf(z);
        }
        return f26091b.booleanValue();
    }
}
