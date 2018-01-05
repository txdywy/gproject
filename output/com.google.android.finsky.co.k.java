package com.google.android.finsky.co;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.os.UserHandle;
import com.google.android.finsky.utils.FinskyLog;
import java.util.UUID;

static class com.google.android.finsky.co.k
{

    k() {
    }

    static Method a(Context p0) {
        try {
            v2 = new Class[2];
            v2[0] = String;
            v2[1] = IPackageStatsObserver;
            v0 = p0.getPackageManager().getClass().getMethod("getPackageSizeInfo", v2);
        }
        catch (NoSuchMethodException ex) {
            FinskyLog.c("Unable to find PackageManager.getPackageSizeInfo", new Object[0]);
            v0 = 0;
        }
        return v0;
    }

    static Method a(Object p0) {
        try {
            v2 = new Class[3];
            v2[0] = UUID;
            v2[1] = String;
            v2[2] = UserHandle;
            v0 = p0.getClass().getMethod("queryStatsForPackage", v2);
        }
        catch (NoSuchMethodException ex) {
            FinskyLog.c("Unable to find query method on StorageStatsService", new Object[0]);
            v0 = 0;
        }
        return v0;
    }

    static Method a(String p0) {
 10:    v0 = Class.forName("android.app.usage.StorageStats").getMethod(p0, new Class[0]);
 14:    return v0;
 20:    FinskyLog.c("Unable to find StorageStats class", new Object[0]);
 23:    v0 = 0;
 24:    return v0;
 26:    goto 16;
 27:    try
            run 1...13
        catch (ClassNotFoundException ex) {
  1:        goto 15;
        }
        catch (NoSuchMethodException ex) {
  1:        goto 25;
        }
    }

}
