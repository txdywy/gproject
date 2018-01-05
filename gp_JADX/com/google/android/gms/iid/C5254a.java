package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.util.C5155j;

public final class C5254a {
    public static String f26379a = null;

    public static String m24074a(Context context) {
        if (f26379a != null) {
            return f26379a;
        }
        int i;
        Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0)) {
            if (C5254a.m24077a(packageManager, resolveInfo.activityInfo.packageName, "com.google.iid.TOKEN_REQUEST")) {
                i = 1;
                break;
            }
        }
        i = 0;
        if (i != 0) {
            return f26379a;
        }
        if (!C5155j.m23890c() && C5254a.m24075a(packageManager)) {
            return f26379a;
        }
        Log.w("InstanceID/Rpc", "Failed to resolve IID implementation package, falling back");
        if (C5254a.m24076a(packageManager, "com.google.android.gms")) {
            C5155j.m23890c();
            return f26379a;
        } else if (!C5155j.m23889b() && C5254a.m24076a(packageManager, "com.google.android.gsf")) {
            return f26379a;
        } else {
            Log.w("InstanceID/Rpc", "Google Play services is missing, unable to get tokens");
            return null;
        }
    }

    private static boolean m24075a(PackageManager packageManager) {
        for (ResolveInfo resolveInfo : packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0)) {
            if (C5254a.m24077a(packageManager, resolveInfo.serviceInfo.packageName, "com.google.android.c2dm.intent.REGISTER")) {
                return true;
            }
        }
        return false;
    }

    private static boolean m24076a(PackageManager packageManager, String str) {
        boolean z = false;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            f26379a = applicationInfo.packageName;
            int i = applicationInfo.uid;
            return true;
        } catch (NameNotFoundException e) {
            return z;
        }
    }

    private static boolean m24077a(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return C5254a.m24076a(packageManager, str);
        }
        Log.w("InstanceID/Rpc", new StringBuilder((String.valueOf(str).length() + 56) + String.valueOf(str2).length()).append("Possible malicious package ").append(str).append(" declares ").append(str2).append(" without permission").toString());
        return false;
    }
}
