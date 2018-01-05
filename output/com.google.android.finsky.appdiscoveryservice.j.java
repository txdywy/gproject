package com.google.android.finsky.appdiscoveryservice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.net.Uri$Builder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import com.google.android.finsky.d.w;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

static class com.google.android.finsky.appdiscoveryservice.j
{

    j() {
    }

    public static Intent a(Context p0, String p1, String p2, int p3, int p4, int p5, com.google.android.finsky.d.w p6) {
        v0 = new Intent().setComponent(new ComponentName(p0, AppDiscoveryLaunchActivity)).setData(Uri.parse(p1)).putExtra("sessionId", p4).putExtra("requestCode", p5).putExtra("callingPackageName", p2).putExtra("callingVersionCode", p3);
        if (p6 != 0)
            p6.a(v0);
        return v0;
    }

    public static Intent a(Context p0, String p1, String p2, int p3, int p4, int p5, byte[] p6, com.google.android.finsky.d.w p7) {
        v0 = new Intent().setComponent(new ComponentName(p0, AppDiscoveryLaunchActivity)).setPackage(p0.getPackageName()).setData(Uri.parse("https://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", p1).build()).putExtra("sessionId", p4).putExtra("requestCode", p5).putExtra("callingPackageName", p2).putExtra("callingVersionCode", p3);
        if (p6 != 0)
            v0.putExtra("serverLogsCookie", p6);
        if (p7 != 0)
            p7.a(v0);
        return v0;
    }

    static ActivityInfo a(ActivityInfo p0) {
        if (p0 == 0 || p0.metaData == 0)
            p0 = 0;
        else {
            v1 = p0.metaData.getString("default-url");
            if (TextUtils.isEmpty(v1)) {
                v2 = new Object[3];
                v2[0] = "default-url";
                v2[1] = p0.packageName;
                v2[2] = p0.name;
                FinskyLog.b("No <meta-data name=\"%s\" /> tag provided by: %s/%s", v2);
                p0 = 0;
            }
            else if ((TextUtils.isEmpty(v1)) || !Patterns.WEB_URL.matcher(v1).matches()) {
                v3 = new Object[4];
                v3[0] = "default-url";
                v3[1] = v1;
                v3[2] = p0.packageName;
                v3[3] = p0.name;
                FinskyLog.b("Invalid <meta-data name=\"%s\" value=\"%s\"/> tag provided by: %s/%s", v3);
                p0 = 0;
            }
        }
        return p0;
    }

    public static boolean a(PackageManager p0, InstantAppInfo p1) {
        v1 = com.google.android.finsky.appdiscoveryservice.j.b(p0, p1).iterator();
        while (true) {
            if (!v1.hasNext()) {
                v0 = 0;
                return v0;
            }
            if (com.google.android.finsky.appdiscoveryservice.j.a(((ResolveInfo)v1.next()).activityInfo) != 0) {
                v0 = 1;
                return v0;
            }
        }
    }

    static List b(PackageManager p0, InstantAppInfo p1) {
        if (p1.a == 0)
            v0 = Collections.emptyList();
        else
            v0 = p0.queryIntentActivities(new Intent().setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(p1.a()), 8388736);
        return v0;
    }

}
