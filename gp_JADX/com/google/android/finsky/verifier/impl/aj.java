package com.google.android.finsky.verifier.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

final class aj {
    public static void m22054a(Context context, int i) {
        context.getSharedPreferences("per_source_installation_consent_data_store", 0).edit().remove(Integer.toString(i)).apply();
    }

    static boolean m22055b(Context context, int i) {
        PackageManager packageManager = context.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return false;
        }
        int length = packagesForUid.length;
        int i2 = 0;
        while (i2 < length) {
            try {
                packageManager.getPackageInfo(packagesForUid[i2], 0);
                i2++;
            } catch (NameNotFoundException e) {
                return false;
            }
        }
        return true;
    }
}
