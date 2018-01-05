package com.google.android.finsky.co;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.os.UserHandle;
import com.google.android.finsky.utils.FinskyLog;
import java.lang.reflect.Method;
import java.util.UUID;

final class C2333k {
    C2333k() {
    }

    static Method m11896a(Object obj) {
        try {
            return obj.getClass().getMethod("queryStatsForPackage", new Class[]{UUID.class, String.class, UserHandle.class});
        } catch (NoSuchMethodException e) {
            FinskyLog.m21665c("Unable to find query method on StorageStatsService", new Object[0]);
            return null;
        }
    }

    static Method m11897a(String str) {
        try {
            return Class.forName("android.app.usage.StorageStats").getMethod(str, new Class[0]);
        } catch (ClassNotFoundException e) {
            FinskyLog.m21665c("Unable to find StorageStats class", new Object[0]);
            return null;
        } catch (NoSuchMethodException e2) {
            FinskyLog.m21665c("Unable to find StorageStats class", new Object[0]);
            return null;
        }
    }

    static Method m11895a(Context context) {
        try {
            return context.getPackageManager().getClass().getMethod("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class});
        } catch (NoSuchMethodException e) {
            FinskyLog.m21665c("Unable to find PackageManager.getPackageSizeInfo", new Object[0]);
            return null;
        }
    }
}
