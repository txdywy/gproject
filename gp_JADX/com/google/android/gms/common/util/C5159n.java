package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.C5107g;
import com.google.android.gms.internal.dr;

public final class C5159n {
    public static boolean m23895a(Context context, int i) {
        boolean z = false;
        if (!C5159n.m23896a(context, i, "com.google.android.gms")) {
            return z;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            C5107g a = C5107g.m23705a(context);
            context.getPackageManager();
            return a.m23709a(packageInfo);
        } catch (NameNotFoundException e) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return z;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return z;
        }
    }

    @TargetApi(19)
    public static boolean m23896a(Context context, int i, String str) {
        return dr.f26667b.m24299a(context).m24297a(i, str);
    }
}
