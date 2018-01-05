package com.google.android.finsky.p226m;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.Process;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C3744e {
    static Map m17625a(Context context, C2495w c2495w) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        try {
            Method declaredMethod = activityManager.getClass().getDeclaredMethod("getAllPackageUsageStats", new Class[0]);
            if (context.getPackageManager().checkPermission("android.permission.PACKAGE_USAGE_STATS", context.getPackageName()) == 0) {
                try {
                    Class cls = Class.forName("com.android.internal.os.PkgUsageStats");
                    Field declaredField = cls.getDeclaredField("componentResumeTimes");
                    Field declaredField2 = cls.getDeclaredField("packageName");
                    Object[] objArr = (Object[]) declaredMethod.invoke(activityManager, new Object[0]);
                    Map hashMap = new HashMap();
                    for (Object obj : objArr) {
                        long j = 0;
                        for (Long longValue : ((HashMap) declaredField.get(obj)).values()) {
                            j = Math.max(j, longValue.longValue());
                        }
                        String str = (String) declaredField2.get(obj);
                        hashMap.put(str, new C3740a(str, j, -1, -1));
                    }
                    return hashMap;
                } catch (Exception e) {
                    FinskyLog.m21665c("Unable to invoke method: %s", e.getMessage());
                    C3744e.m17626a(c2495w, 4);
                }
            } else {
                C3744e.m17626a(c2495w, 2);
                return Collections.emptyMap();
            }
        } catch (NoSuchMethodException e2) {
            FinskyLog.m21662b("Unable to get package usage stats method", new Object[0]);
            C3744e.m17626a(c2495w, 3);
            return Collections.emptyMap();
        }
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    static Map m17624a(Context context, long j, long j2, C2495w c2495w) {
        String str = "android:get_usage_stats";
        int checkOpNoThrow = ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow(str, Process.myUid(), context.getPackageName());
        if (checkOpNoThrow == 0 || (((Boolean) C0955b.gH.m28964b()).booleanValue() && checkOpNoThrow == 3)) {
            try {
                UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
                if (usageStatsManager == null) {
                    FinskyLog.m21665c("UsageStatsManager is not available", new Object[0]);
                    C3744e.m17626a(c2495w, 5);
                    return Collections.emptyMap();
                }
                List<UsageStats> queryUsageStats = usageStatsManager.queryUsageStats(3, j, j2);
                if (queryUsageStats == null) {
                    FinskyLog.m21665c("queryUsageStats returned null", new Object[0]);
                    C3744e.m17626a(c2495w, 6);
                    return Collections.emptyMap();
                }
                HashMap hashMap = new HashMap();
                long a = C4678i.m21812a();
                for (UsageStats usageStats : queryUsageStats) {
                    if (usageStats.getLastTimeUsed() <= a) {
                        String packageName = usageStats.getPackageName();
                        C3740a c3740a = (C3740a) hashMap.get(packageName);
                        if (c3740a == null) {
                            hashMap.put(packageName, new C3740a(packageName, usageStats.getLastTimeUsed(), usageStats.getFirstTimeStamp(), usageStats.getLastTimeStamp()));
                        } else {
                            hashMap.put(packageName, new C3740a(packageName, Math.max(c3740a.f18883b, usageStats.getLastTimeUsed()), Math.min(c3740a.f18884c, usageStats.getFirstTimeStamp()), Math.max(c3740a.f18885d, usageStats.getLastTimeStamp())));
                        }
                    }
                }
                return hashMap;
            } catch (Exception e) {
                FinskyLog.m21665c("Unable to invoke method: %s", e.getMessage());
                C3744e.m17626a(c2495w, 7);
            }
        } else {
            C3744e.m17626a(c2495w, 1);
            return Collections.emptyMap();
        }
    }

    private static void m17626a(C2495w c2495w, int i) {
        c2495w.m13367a(new C2474c(154).m13210a(i));
    }
}
