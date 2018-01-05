package com.google.android.finsky.verifier.impl;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aj;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ec extends C4740a {
    public final PackageVerificationService f24666a;
    public final int f24667b;
    public final dh f24668c;
    public final int f24669d;
    public final String f24670e;
    public final int f24671f;
    public final AtomicBoolean f24672g = new AtomicBoolean(false);
    public volatile int f24673h = -1;

    public ec(PackageVerificationService packageVerificationService, Intent intent, dh dhVar) {
        this.f24666a = (PackageVerificationService) aj.m21700a(packageVerificationService);
        this.f24668c = (dh) aj.m21700a(dhVar);
        this.f24667b = intent.getIntExtra("android.content.pm.extra.VERIFICATION_ID", -1);
        this.f24669d = intent.getIntExtra("android.content.pm.extra.VERIFICATION_INSTALLER_UID", -1);
        String stringExtra = intent.getStringExtra("android.content.pm.extra.VERIFICATION_INSTALLER_PACKAGE");
        int intExtra = intent.getIntExtra("android.intent.extra.ORIGINATING_UID", -1);
        if (this.f24669d == -1 && m22356b()) {
            FinskyLog.m21669e("No installer UIDs were provided. PSIC will not run.", new Object[0]);
        }
        if (stringExtra == null && this.f24669d != -1) {
            stringExtra = m22353a(this.f24669d);
        }
        this.f24670e = stringExtra;
        int i = this.f24669d;
        if (i != -1 && intExtra != -1 && ab.f24377a.equals(this.f24670e) && m22354a(ab.f24377a)) {
            i = intExtra;
        }
        this.f24671f = i;
    }

    protected final boolean mo4343a() {
        if (!m22356b() || this.f24671f == -1 || this.f24669d == -1 || this.f24670e == null) {
            this.f24673h = 1;
            return false;
        }
        int i = this.f24671f;
        String str = "Skipping validation for user's trust on the source. %s";
        if (Global.getInt(this.f24666a.getContentResolver(), "install_non_market_apps", -1) == 0) {
            int i2 = 1;
        } else {
            boolean z = false;
        }
        if (i2 != 0) {
            FinskyLog.m21659a(str, "Unknown sources is off.");
            z = false;
        } else {
            String[] packagesForUid = this.f24666a.getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null) {
                for (String a : packagesForUid) {
                    if (m22354a(a)) {
                        i2 = 1;
                        break;
                    }
                }
            }
            z = false;
            if (i2 != 0) {
                FinskyLog.m21659a(str, "Origin is a system package.");
                z = false;
            } else {
                Context context = this.f24666a;
                if (aj.m22055b(context, i)) {
                    z = context.getSharedPreferences("per_source_installation_consent_data_store", 0).getBoolean(Integer.toString(i), false);
                } else {
                    aj.m22054a(context, i);
                    z = false;
                }
                if (z) {
                    FinskyLog.m21659a(str, "Origin has already been user trusted.");
                    z = false;
                } else {
                    FinskyLog.m21659a("Package source uid %d requires user's source trust", Integer.valueOf(i));
                    z = true;
                }
            }
        }
        if (z) {
            String str2;
            this.f24668c.mo4376a(this.f24667b, -1);
            if (this.f24671f == this.f24669d) {
                str2 = this.f24670e;
            } else {
                str2 = m22353a(this.f24671f);
            }
            String b = m22355b(str2);
            Context context2 = this.f24666a;
            context2.startActivity(new Intent(context2, PerSourceInstallationConsentWarningDialog.class).setFlags(1476395008).putExtra("app_name", b).putExtra("package_name", str2).putExtra("listener", new VerifyPerSourceInstallationConsentInstallTask$1(this)));
            return true;
        }
        this.f24673h = 1;
        return false;
    }

    private static boolean m22356b() {
        if (VERSION.SDK_INT < 26 && VERSION.SDK_INT > 16) {
            return true;
        }
        return false;
    }

    private final boolean m22354a(String str) {
        try {
            if ((this.f24666a.getPackageManager().getApplicationInfo(str, 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    private final String m22355b(String str) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = this.f24666a.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(str, 0);
        } catch (NameNotFoundException e) {
            applicationInfo = null;
        }
        CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
        if (applicationInfo == null || applicationLabel == null) {
            return str;
        }
        return applicationLabel.toString();
    }

    private final String m22353a(int i) {
        PackageManager packageManager = this.f24666a.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            FinskyLog.m21669e("Uid %d has no installed package associated to it", Integer.valueOf(i));
            return null;
        }
        List asList = Arrays.asList(packagesForUid);
        if (asList.size() == 1) {
            return (String) asList.get(0);
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER"), 0);
        List arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            if (asList.contains(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        if (!arrayList.isEmpty()) {
            asList = arrayList;
        }
        Collections.sort(r1);
        long j = Long.MAX_VALUE;
        str = (String) r1.get(0);
        String str2 = str;
        for (String str3 : r1) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str3, 0);
                if (packageInfo.firstInstallTime < j) {
                    j = packageInfo.firstInstallTime;
                    str3 = packageInfo.packageName;
                } else {
                    str3 = str2;
                }
                str2 = str3;
            } catch (NameNotFoundException e) {
            }
        }
        return str2;
    }

    protected final void mo4344c() {
        if (!this.f24672g.getAndSet(true)) {
            this.f24668c.mo4378b(this.f24667b, this.f24673h);
        }
    }
}
