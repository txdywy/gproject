package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.dr;

public final class C5151f {
    public static boolean m23882a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((dr.f26667b.m24299a(context).m24295a(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
