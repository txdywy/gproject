package com.google.android.finsky.instantappsquickinstall;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.instantappscompatibility.C3600b;

public final class C3615o {
    public static ValidatedQuickInstallRequest m17220a(Context context, Intent intent, String str) {
        if (intent == null) {
            return null;
        }
        if (VERSION.SDK_INT >= 26 || !"com.google.android.instantapps.supervisor".equals(str) || !C2744a.m14788a(context, str)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                C3600b c3600b = new C3600b(packageManager);
                if (!C3600b.m17189a(packageManager.getPackageInfo(str, 0).applicationInfo)) {
                    return null;
                }
            } catch (NameNotFoundException e) {
                return null;
            }
        } else if (intent.hasExtra("appPackage")) {
            str = intent.getStringExtra("appPackage");
        }
        if (str == null) {
            return null;
        }
        if (!"com.google.android.finsky.action.IA_INSTALL".equals(intent.getAction())) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null || !"market".equals(data.getScheme()) || !"details".equals(data.getAuthority())) {
            return null;
        }
        String queryParameter = data.getQueryParameter("id");
        Intent intent2 = (Intent) intent.getParcelableExtra("postInstallIntent");
        return (!str.equals(queryParameter) || intent2 == null) ? null : new ValidatedQuickInstallRequest(queryParameter, intent2);
    }
}
