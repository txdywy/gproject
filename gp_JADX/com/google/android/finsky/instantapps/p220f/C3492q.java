package com.google.android.finsky.instantapps.p220f;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.support.v4.os.C0327a;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.ba.C1552e;

public final class C3492q {
    public static boolean m17063a(String str, C1552e c1552e, Integer num, PackageManager packageManager, Integer num2) {
        if (!c1552e.mo2294a(12631758)) {
            return false;
        }
        if (!C3492q.m17062a(packageManager)) {
            return false;
        }
        if (VERSION.SDK_INT < num.intValue()) {
            return false;
        }
        if (!((Boolean) C0954a.by.m5777b(str).m5760a()).booleanValue()) {
            return false;
        }
        if (C3492q.m17064b(packageManager) < num2.intValue()) {
            return false;
        }
        return true;
    }

    private static int m17064b(PackageManager packageManager) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (NameNotFoundException e) {
            return 0;
        }
    }

    public static boolean m17062a(PackageManager packageManager) {
        if (C0327a.m1722b()) {
            return true;
        }
        try {
            if (packageManager.getPackageInfo("com.google.android.instantapps.supervisor", 0) == null) {
                return false;
            }
            return true;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
