package com.google.android.finsky.deviceconfig;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class C2706s implements Runnable {
    public final RemoveAssetReceiver f14864a;
    public final Context f14865b;
    public final Intent f14866c;

    C2706s(RemoveAssetReceiver removeAssetReceiver, Context context, Intent intent) {
        this.f14864a = removeAssetReceiver;
        this.f14865b = context;
        this.f14866c = intent;
    }

    public final void run() {
        RemoveAssetReceiver removeAssetReceiver = this.f14864a;
        Context context = this.f14865b;
        Intent intent = this.f14866c;
        String stringExtra = intent.getStringExtra("asset_package");
        String stringExtra2 = intent.getStringExtra("asset_name");
        boolean parseBoolean = Boolean.parseBoolean(intent.getStringExtra("asset_malicious"));
        if (TextUtils.isEmpty(stringExtra)) {
            FinskyLog.m21665c("Unexpected empty package name", new Object[0]);
            return;
        }
        C3647b a = removeAssetReceiver.f14822b.m17243a(stringExtra);
        FinskyLog.m21659a("Removing package '%s'. Malicious='%s'", stringExtra, Boolean.valueOf(parseBoolean));
        if (parseBoolean) {
            PackageManager packageManager = context.getPackageManager();
            try {
                String[] packagesForUid = packageManager.getPackagesForUid(packageManager.getPackageInfo(stringExtra, 0).applicationInfo.uid);
                if (packagesForUid != null) {
                    for (String str : packagesForUid) {
                        FinskyLog.m21659a("Removing package '%s' (child of '%s')", str, stringExtra);
                        removeAssetReceiver.f14824d.mo2849a(str, false);
                    }
                }
            } catch (NameNotFoundException e) {
                FinskyLog.m21665c("'%s' not found in PM.", stringExtra);
            }
        } else {
            removeAssetReceiver.f14824d.mo2849a(stringExtra, false);
        }
        if (a != null && a.f18028c != null) {
            C2495w a2 = removeAssetReceiver.f14821a.m13184a(null);
            if (parseBoolean) {
                removeAssetReceiver.f14823c.mo3783a(stringExtra2, a2);
            } else {
                removeAssetReceiver.f14823c.mo3808c(stringExtra2, stringExtra, a2);
            }
        }
    }
}
