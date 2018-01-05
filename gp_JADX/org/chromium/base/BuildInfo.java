package org.chromium.base;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import org.chromium.base.annotations.CalledByNative;

public class BuildInfo {
    private BuildInfo() {
    }

    @CalledByNative
    public static String[] getAll() {
        try {
            String str;
            String join;
            String packageName = C7888e.f40514a.getPackageName();
            PackageManager packageManager = C7888e.f40514a.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = packageInfo.versionCode <= 0 ? "" : Integer.toString(packageInfo.versionCode);
            String str2 = packageInfo.versionName == null ? "" : packageInfo.versionName;
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
            String charSequence = applicationLabel == null ? "" : applicationLabel.toString();
            String installerPackageName = packageManager.getInstallerPackageName(packageName);
            if (installerPackageName == null) {
                str = "";
            } else {
                str = installerPackageName;
            }
            if (VERSION.SDK_INT >= 21) {
                join = TextUtils.join(", ", Build.SUPPORTED_ABIS);
            } else {
                join = "ABI1: " + Build.CPU_ABI + ", ABI2: " + Build.CPU_ABI2;
            }
            long j = packageInfo.versionCode > 10 ? (long) packageInfo.versionCode : packageInfo.lastUpdateTime;
            installerPackageName = String.format("@%s", new Object[]{Long.toHexString(j)});
            return new String[]{Build.BRAND, Build.DEVICE, Build.ID, Build.MANUFACTURER, Build.MODEL, String.valueOf(VERSION.SDK_INT), Build.TYPE, charSequence, packageName, num, str2, Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), 128)), m37783a(packageManager), str, join, installerPackageName};
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static String m37783a(PackageManager packageManager) {
        String str = "gms versionCode not available.";
        try {
            str = Integer.toString(packageManager.getPackageInfo("com.google.android.gms", 0).versionCode);
        } catch (NameNotFoundException e) {
        }
        return str;
    }

    public static boolean m37784a() {
        return VERSION.SDK_INT >= 26;
    }
}
