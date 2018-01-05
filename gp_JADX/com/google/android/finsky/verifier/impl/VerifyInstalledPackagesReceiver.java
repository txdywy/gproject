package com.google.android.finsky.verifier.impl;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;

public class VerifyInstalledPackagesReceiver extends BroadcastReceiver {
    public C2266a f24343a;

    public VerifyInstalledPackagesReceiver() {
        ((ac) C3947d.m18649a(ac.class)).mo1978a(this);
    }

    public void onReceive(Context context, Intent intent) {
        if ("com.google.android.vending.verifier.intent.action.VERIFY_INSTALLED_PACKAGES".equals(intent.getAction())) {
            boolean z;
            C2266a c2266a = this.f24343a;
            if (!((Boolean) C0955b.by.m28964b()).booleanValue() || C1503a.m8831b(context)) {
                FinskyLog.m21659a("Skipping verification because disabled", new Object[0]);
                z = false;
            } else {
                int i;
                ContentResolver contentResolver = context.getContentResolver();
                if (VERSION.SDK_INT >= 17) {
                    i = Global.getInt(contentResolver, "package_verifier_enable", 1);
                } else {
                    i = Secure.getInt(contentResolver, "package_verifier_enable", 1);
                }
                if (i != 0) {
                    i = 1;
                } else {
                    z = false;
                }
                if (i == 0) {
                    FinskyLog.m21659a("Skipping verification because verify apps is not enabled", new Object[0]);
                    z = false;
                } else if (c2266a.m11723e()) {
                    z = true;
                } else {
                    FinskyLog.m21659a("Skipping verification because network inactive", new Object[0]);
                    z = false;
                }
            }
            if (z) {
                FinskyLog.m21659a("Verify installed apps requested", new Object[0]);
                PackageVerificationService.m22003a(context, intent);
                return;
            }
            dk.m22317a(context, intent.getBooleanExtra("lite_run", false), false);
            return;
        }
        FinskyLog.m21665c("Unexpected action %s", intent.getAction());
    }
}
