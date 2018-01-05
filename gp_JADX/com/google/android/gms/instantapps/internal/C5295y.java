package com.google.android.gms.instantapps.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.C5107g;

final class C5295y {
    static boolean m24173a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            C5107g a = C5107g.m23705a(context);
            context.getPackageManager();
            if (a.m23709a(packageInfo)) {
                return true;
            }
            String str = "InstantAppsApi";
            String str2 = "Incorrect signature for package ";
            String valueOf = String.valueOf(packageInfo.packageName);
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
