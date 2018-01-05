package com.google.vr.vrcore.base.api;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.vr.cardboard.annotations.UsedByNative;
import java.util.List;

@UsedByNative
public final class VrCoreUtils {
    public static final String f35537a = VrCoreUtils.class.getSimpleName();

    public static int m34037a(Context context) {
        return m34039b(context);
    }

    @UsedByNative
    public static int getVrCoreClientApiVersion(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
            if (!applicationInfo.enabled) {
                throw new VrCoreNotAvailableException(2);
            } else if (applicationInfo.metaData != null) {
                return applicationInfo.metaData.getInt("com.google.vr.vrcore.ClientApiVersion", 0);
            } else {
                return 0;
            }
        } catch (NameNotFoundException e) {
            throw new VrCoreNotAvailableException(m34039b(context));
        }
    }

    public static String m34038a(int i) {
        switch (i) {
            case 0:
                return "VR Service present";
            case 1:
                return "VR Service missing";
            case 2:
                return "VR Service disabled";
            case 3:
                return "VR Service updating";
            case 4:
                return "VR Service obsolete";
            case 5:
                return "VR Service not connected";
            case 6:
                return "No permission to do operation";
            case 7:
                return "This operation is not supported on this device";
            case 8:
                return "An unknown failure occurred";
            default:
                return "Invalid connection result: " + i;
        }
    }

    private static int m34039b(Context context) {
        List allSessions;
        boolean z = true;
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            return 0;
        }
        try {
            if (!context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 0).enabled) {
                return 2;
            }
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.vr.vrcore", 64);
            if (!C7268b.m34042a(packageInfo, C7268b.f35539a)) {
                if (C7267a.f35538a != null ? C7267a.f35538a.booleanValue() : C7267a.m34040a(context)) {
                    z = C7268b.m34042a(packageInfo, C7268b.f35540b);
                } else {
                    z = false;
                }
            }
            if (z) {
                return 0;
            }
            return 9;
        } catch (NameNotFoundException e) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    allSessions = context.getPackageManager().getPackageInstaller().getAllSessions();
                } catch (NullPointerException e2) {
                    String str = f35537a;
                    String valueOf = String.valueOf(e2);
                    Log.w(str, new StringBuilder(String.valueOf(valueOf).length() + 45).append("Failure querying package installer sessions: ").append(valueOf).toString());
                    allSessions = null;
                }
                if (r0 != null) {
                    for (SessionInfo appPackageName : r0) {
                        if ("com.google.vr.vrcore".equals(appPackageName.getAppPackageName())) {
                            return 3;
                        }
                    }
                }
            }
            try {
                if (context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 8192).enabled) {
                    return 3;
                }
            } catch (NameNotFoundException e3) {
            }
            return 1;
        }
    }
}
