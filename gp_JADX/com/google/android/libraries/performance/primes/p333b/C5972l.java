package com.google.android.libraries.performance.primes.p333b;

import android.app.Application;
import android.app.admin.DevicePolicyManager;
import android.os.Build;
import android.os.Build.VERSION;

public final class C5972l {
    public static boolean m27711a(Application application) {
        if (VERSION.SDK_INT >= 23) {
            int i;
            Object obj;
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) application.getSystemService("device_policy");
            if (devicePolicyManager == null) {
                i = 0;
            } else {
                i = devicePolicyManager.getStorageEncryptionStatus();
            }
            if (i == 3 || i == 4 || i == 5) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null && Build.FINGERPRINT.contains("userdebug")) {
                return true;
            }
        }
        return false;
    }
}
