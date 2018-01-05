package com.google.android.finsky.activities;

import android.app.Activity;
import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class AppCrashProxy extends Activity {
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
        int i;
        int i2 = 1;
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.setComponent(null);
        String str = (String) C0955b.eV.m28964b();
        C2322b a = C1473m.f7980a.mo2032L().mo2854a(str);
        PackageManager packageManager = getPackageManager();
        intent.setPackage(str);
        ApplicationErrorReport applicationErrorReport = (ApplicationErrorReport) intent.getParcelableExtra("android.intent.extra.BUG_REPORT");
        if (a == null) {
            FinskyLog.m21665c("Feedback package %s not installed", str);
        } else if (a.f11424i) {
            FinskyLog.m21665c("Feedback package %s disabled", str);
        } else if (a.f11419d < ((Integer) C0955b.eU.m28964b()).intValue()) {
            FinskyLog.m21659a("Feedback package %s version %d too old", str, Integer.valueOf(a.f11419d));
        } else if (packageManager.queryBroadcastReceivers(intent, 0).size() < 0) {
            FinskyLog.m21665c("No receiver found in %s", str);
        } else if (applicationErrorReport == null) {
            FinskyLog.m21665c("Crash report missing", new Object[0]);
        } else if (TextUtils.isEmpty(applicationErrorReport.packageName)) {
            FinskyLog.m21665c("Crash bug report missing package name", new Object[0]);
        } else {
            try {
                int i3;
                int i4;
                for (Object equals : packageManager.getPackagesForUid(packageManager.getApplicationInfo(a.f11416a, 0).uid)) {
                    if (applicationErrorReport.packageName.equals(equals)) {
                        FinskyLog.m21665c("Package %s has crashed but is related to feedback package %s", r6[i3], str);
                        i3 = 1;
                        break;
                    }
                }
                i3 = 0;
                if (i3 == 0) {
                    try {
                        FinskyLog.m21659a("Sending feedback for crashed %s to %s", applicationErrorReport.packageName, str);
                        i4 = 0;
                    } catch (NameNotFoundException e) {
                        i = 0;
                        FinskyLog.m21669e("Exception, feedback package %s not found", str);
                        i2 = i;
                        if (i2 != 0) {
                            intent.setPackage((String) C0955b.eV.m28964b());
                        } else if (C1503a.m8830a(C1473m.f7980a.f7981b)) {
                            C1473m.f7980a.mo2242f(C1473m.f7980a.cZ()).m13319a(new C2474c(15).f13342a, null);
                            FinskyLog.m21667d("Legacy reporting package unavailable on TV; Log in BackgroundEvent.", new Object[0]);
                            finish();
                            return;
                        } else {
                            intent.setPackage((String) C0955b.eW.m28964b());
                        }
                        startActivity(intent);
                        finish();
                    }
                }
                i4 = 1;
                i2 = i4;
            } catch (NameNotFoundException e2) {
                i = 1;
                FinskyLog.m21669e("Exception, feedback package %s not found", str);
                i2 = i;
                if (i2 != 0) {
                    intent.setPackage((String) C0955b.eV.m28964b());
                } else if (C1503a.m8830a(C1473m.f7980a.f7981b)) {
                    intent.setPackage((String) C0955b.eW.m28964b());
                } else {
                    C1473m.f7980a.mo2242f(C1473m.f7980a.cZ()).m13319a(new C2474c(15).f13342a, null);
                    FinskyLog.m21667d("Legacy reporting package unavailable on TV; Log in BackgroundEvent.", new Object[0]);
                    finish();
                    return;
                }
                startActivity(intent);
                finish();
            }
        }
        if (i2 != 0) {
            intent.setPackage((String) C0955b.eV.m28964b());
        } else if (C1503a.m8830a(C1473m.f7980a.f7981b)) {
            C1473m.f7980a.mo2242f(C1473m.f7980a.cZ()).m13319a(new C2474c(15).f13342a, null);
            FinskyLog.m21667d("Legacy reporting package unavailable on TV; Log in BackgroundEvent.", new Object[0]);
            finish();
            return;
        } else {
            intent.setPackage((String) C0955b.eW.m28964b());
        }
        startActivity(intent);
        finish();
    }
}
