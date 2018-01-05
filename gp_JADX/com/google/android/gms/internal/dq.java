package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Process;
import com.google.android.gms.common.util.C5155j;

public final class dq {
    public Context f26666a;

    public dq(Context context) {
        this.f26666a = context;
    }

    public final int m24294a(String str) {
        return this.f26666a.checkCallingOrSelfPermission(str);
    }

    public final ApplicationInfo m24295a(String str, int i) {
        return this.f26666a.getPackageManager().getApplicationInfo(str, i);
    }

    public final boolean m24296a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return dp.m24293a(this.f26666a);
        }
        if (C5155j.m23890c()) {
            String nameForUid = this.f26666a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.f26666a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }

    @TargetApi(19)
    public final boolean m24297a(int i, String str) {
        if (VERSION.SDK_INT >= 19) {
            try {
                ((AppOpsManager) this.f26666a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        }
        String[] packagesForUid = this.f26666a.getPackageManager().getPackagesForUid(i);
        if (str == null || packagesForUid == null) {
            return false;
        }
        for (Object equals : packagesForUid) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public final PackageInfo m24298b(String str, int i) {
        return this.f26666a.getPackageManager().getPackageInfo(str, i);
    }
}
