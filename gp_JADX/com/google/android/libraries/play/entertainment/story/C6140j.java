package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class C6140j {
    public static String f30498a;
    public static final Intent f30499b = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));

    public static String m28335a(Context context) {
        if (f30498a != null) {
            return f30498a;
        }
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(f30499b, 0);
        if (resolveActivity != null) {
            obj = resolveActivity.activityInfo.packageName;
        } else {
            obj = null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(f30499b, 0);
        List arrayList = new ArrayList();
        for (ResolveInfo resolveActivity2 : queryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(resolveActivity2.activityInfo.packageName);
            if (packageManager.resolveService(intent, 0) != null) {
                arrayList.add(resolveActivity2.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f30498a = null;
        } else if (arrayList.size() == 1) {
            f30498a = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(obj) && !C6140j.m28337a(context, f30499b) && arrayList.contains(obj)) {
            f30498a = obj;
        } else if (arrayList.contains("com.android.chrome")) {
            f30498a = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            f30498a = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            f30498a = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            f30498a = "com.google.android.apps.chrome";
        }
        return f30498a;
    }

    private static boolean m28337a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                return false;
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
    }

    public static void m28336a() {
        f30498a = null;
    }
}
