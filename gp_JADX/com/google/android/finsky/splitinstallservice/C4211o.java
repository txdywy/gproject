package com.google.android.finsky.splitinstallservice;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ae;
import java.util.Arrays;

final class C4211o {
    public final C1461c f21256a;
    public final Context f21257b;
    public final SharedPreferences f21258c;

    C4211o(C1461c c1461c, Context context) {
        this.f21257b = context;
        this.f21256a = c1461c;
        this.f21258c = context.getSharedPreferences("splitinstallservice_sharedprefs_timestamp_of_last_start_install", 0);
    }

    final boolean m19590a(String str) {
        if (this.f21256a.dj().mo2294a(12642050)) {
            int i;
            String[] packagesForUid = this.f21257b.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            if (packagesForUid != null) {
                for (String equals : packagesForUid) {
                    if (equals.equals(str)) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            if (i == 0) {
                FinskyLog.m21665c("Package name %s is not owned by caller.", str);
                return false;
            } else if (!ae.m21693a(str, (String) C0955b.fQ.m28964b())) {
                FinskyLog.m21665c("Package name %s is not permitted by global flag.", str);
                return false;
            } else if (C4671b.m21787d() || ae.m21693a(str, (String) C0955b.fR.m28964b())) {
                return true;
            } else {
                FinskyLog.m21665c("Package name %s is not permitted on pre-L by global flag.", str);
                return false;
            }
        }
        FinskyLog.m21665c("Split install requested but experiment is disabled for %s.", str);
        return false;
    }

    final boolean m19591b(String str) {
        int i;
        long j = this.f21258c.getLong(str, -1);
        long a = C4678i.m21812a();
        this.f21258c.edit().putLong(str, a).apply();
        if (j <= 0 || a - j >= ((Long) C0955b.fU.m28964b()).longValue() || a - j < 0) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            FinskyLog.m21665c("Package name %s is calling us too often.", str);
            return false;
        }
        for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.f21257b.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.importance <= 125 && (str.equals(runningAppProcessInfo.processName) || Arrays.asList(runningAppProcessInfo.pkgList).contains(str))) {
                i = 1;
                break;
            }
        }
        i = 0;
        if (i != 0) {
            return true;
        }
        FinskyLog.m21665c("Package name %s asks for split install in background; denied.", str);
        return false;
    }
}
