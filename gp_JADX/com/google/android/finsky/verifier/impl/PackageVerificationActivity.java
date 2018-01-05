package com.google.android.finsky.verifier.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class PackageVerificationActivity extends Activity {
    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setVisible(false);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("android.intent.action.VIEW".equals(action) || "android.intent.action.INSTALL_PACKAGE".equals(action)) {
            boolean z;
            if (VERSION.SDK_INT >= 17) {
                FinskyLog.m21669e("Skipping verification. Unexpected SDK=%d", Integer.valueOf(VERSION.SDK_INT));
                z = false;
            } else {
                z = true;
            }
            if (z) {
                FinskyLog.m21665c("Verification requested through action=%s", action);
                intent.putExtra("com.google.android.vending.verifier.extra.FROM_VERIFICATION_ACTIVITY", true);
                PackageVerificationService.m22003a(this, intent);
            } else {
                intent.setPackage(ab.f24377a);
                intent.setComponent(new ComponentName(ab.f24377a, "com.android.packageinstaller.PackageInstallerActivity"));
                startActivity(intent);
            }
        } else {
            FinskyLog.m21665c("Unexpected action %s", action);
        }
        finish();
    }
}
