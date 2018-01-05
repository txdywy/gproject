package com.google.android.finsky.appdiscoveryservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Collections;
import java.util.List;

public final class C1328j {
    public static Intent m7804a(Context context, String str, String str2, int i, int i2, int i3, byte[] bArr, C2495w c2495w) {
        Intent putExtra = new Intent().setComponent(new ComponentName(context, AppDiscoveryLaunchActivity.class)).setPackage(context.getPackageName()).setData(Uri.parse("https://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", str).build()).putExtra("sessionId", i2).putExtra("requestCode", i3).putExtra("callingPackageName", str2).putExtra("callingVersionCode", i);
        if (bArr != null) {
            putExtra.putExtra("serverLogsCookie", bArr);
        }
        if (c2495w != null) {
            c2495w.m13376a(putExtra);
        }
        return putExtra;
    }

    public static Intent m7803a(Context context, String str, String str2, int i, int i2, int i3, C2495w c2495w) {
        Intent putExtra = new Intent().setComponent(new ComponentName(context, AppDiscoveryLaunchActivity.class)).setData(Uri.parse(str)).putExtra("sessionId", i2).putExtra("requestCode", i3).putExtra("callingPackageName", str2).putExtra("callingVersionCode", i);
        if (c2495w != null) {
            c2495w.m13376a(putExtra);
        }
        return putExtra;
    }

    public static boolean m7806a(PackageManager packageManager, InstantAppInfo instantAppInfo) {
        for (ResolveInfo resolveInfo : C1328j.m7807b(packageManager, instantAppInfo)) {
            if (C1328j.m7805a(resolveInfo.activityInfo) != null) {
                return true;
            }
        }
        return false;
    }

    static List m7807b(PackageManager packageManager, InstantAppInfo instantAppInfo) {
        if (instantAppInfo.f17909a == null) {
            return Collections.emptyList();
        }
        return packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(instantAppInfo.m17188a()), 8388736);
    }

    static ActivityInfo m7805a(ActivityInfo activityInfo) {
        if (activityInfo == null || activityInfo.metaData == null) {
            return null;
        }
        CharSequence string = activityInfo.metaData.getString("default-url");
        if (TextUtils.isEmpty(string)) {
            FinskyLog.m21662b("No <meta-data name=\"%s\" /> tag provided by: %s/%s", "default-url", activityInfo.packageName, activityInfo.name);
            return null;
        } else if (!TextUtils.isEmpty(string) && Patterns.WEB_URL.matcher(string).matches()) {
            return activityInfo;
        } else {
            FinskyLog.m21662b("Invalid <meta-data name=\"%s\" value=\"%s\"/> tag provided by: %s/%s", "default-url", string, activityInfo.packageName, activityInfo.name);
            return null;
        }
    }
}
