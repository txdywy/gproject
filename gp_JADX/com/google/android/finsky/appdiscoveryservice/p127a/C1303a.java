package com.google.android.finsky.appdiscoveryservice.p127a;

import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p002a.C0002a;

public final class C1303a {
    public final C0002a f7746a;
    public final C0002a f7747b;
    public final C1305c f7748c;

    public final InstantAppInfo m7760a(List list) {
        UsageStats usageStats = null;
        if (list.isEmpty()) {
            return null;
        }
        UsageStats usageStats2;
        InstantAppInfo instantAppInfo;
        long currentTimeMillis = System.currentTimeMillis();
        long toMillis = currentTimeMillis - TimeUnit.HOURS.toMillis(4);
        long j = ((SharedPreferences) this.f7747b.mo1a()).getLong("InstantApsStatsManager.mostRecentTimestamp", -1);
        if (j > toMillis) {
            InstantAppInfo instantAppInfo2;
            UsageStats usageStats3;
            String string = ((SharedPreferences) this.f7747b.mo1a()).getString("InstantApsStatsManager.recentlyMostRecentStats", null);
            if (TextUtils.isEmpty(string)) {
                usageStats2 = null;
            } else {
                usageStats2 = this.f7748c.m7764a(string);
            }
            if (usageStats2 != null && usageStats2.getLastTimeUsed() > toMillis) {
                for (InstantAppInfo instantAppInfo3 : list) {
                    if (usageStats2.getPackageName().equals(instantAppInfo3.m17188a())) {
                        instantAppInfo2 = instantAppInfo3;
                        usageStats3 = usageStats2;
                        break;
                    }
                }
            }
            usageStats3 = null;
            instantAppInfo = instantAppInfo2;
            usageStats = usageStats3;
        } else {
            instantAppInfo = null;
            j = toMillis;
        }
        Map queryAndAggregateUsageStats = ((UsageStatsManager) this.f7746a.mo1a()).queryAndAggregateUsageStats(j, currentTimeMillis);
        InstantAppInfo instantAppInfo4 = instantAppInfo;
        for (InstantAppInfo instantAppInfo32 : list) {
            usageStats2 = (UsageStats) queryAndAggregateUsageStats.get(instantAppInfo32.m17188a());
            if (usageStats2 != null) {
                Object obj;
                if (usageStats == null) {
                    obj = 1;
                } else if (usageStats2.getLastTimeUsed() > usageStats.getLastTimeUsed()) {
                    int i = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    usageStats = usageStats2;
                    instantAppInfo = instantAppInfo32;
                    instantAppInfo4 = instantAppInfo;
                }
            }
            instantAppInfo = instantAppInfo4;
            instantAppInfo4 = instantAppInfo;
        }
        if (usageStats == null) {
            ((SharedPreferences) this.f7747b.mo1a()).edit().remove("InstantApsStatsManager.recentlyMostRecentStats").putLong("InstantApsStatsManager.mostRecentTimestamp", System.currentTimeMillis()).apply();
        } else {
            ((SharedPreferences) this.f7747b.mo1a()).edit().putString("InstantApsStatsManager.recentlyMostRecentStats", C1305c.m7763a(usageStats)).putLong("InstantApsStatsManager.mostRecentTimestamp", System.currentTimeMillis()).apply();
        }
        return instantAppInfo4;
    }

    public final InstantAppInfo m7761b(List list) {
        InstantAppInfo instantAppInfo = null;
        if (list.isEmpty()) {
            return null;
        }
        UsageStats usageStats;
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.HOURS.toMillis(4);
        long toMillis = currentTimeMillis - TimeUnit.DAYS.toMillis(2);
        long j = ((SharedPreferences) this.f7747b.mo1a()).getLong("InstantApsStatsManager.mostUsedTimestamp", -1);
        if (j > toMillis) {
            String string = ((SharedPreferences) this.f7747b.mo1a()).getString("InstantApsStatsManager.mostUsedStats", null);
            if (TextUtils.isEmpty(string)) {
                usageStats = null;
            } else {
                usageStats = this.f7748c.m7764a(string);
            }
            if (usageStats != null && usageStats.getLastTimeUsed() > toMillis) {
                for (InstantAppInfo instantAppInfo2 : list) {
                    if (usageStats.getPackageName().equals(instantAppInfo2.m17188a())) {
                        instantAppInfo = instantAppInfo2;
                        break;
                    }
                }
            }
            usageStats = null;
        } else {
            usageStats = null;
            j = toMillis;
        }
        Map queryAndAggregateUsageStats = ((UsageStatsManager) this.f7746a.mo1a()).queryAndAggregateUsageStats(j, currentTimeMillis);
        InstantAppInfo instantAppInfo3 = instantAppInfo;
        UsageStats usageStats2 = usageStats;
        for (InstantAppInfo instantAppInfo22 : list) {
            usageStats = (UsageStats) queryAndAggregateUsageStats.get(instantAppInfo22.m17188a());
            if (usageStats != null) {
                Object obj;
                if (usageStats2 == null) {
                    obj = 1;
                } else if (usageStats.getTotalTimeInForeground() > usageStats2.getTotalTimeInForeground()) {
                    int i = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    instantAppInfo = instantAppInfo22;
                    instantAppInfo3 = instantAppInfo;
                    usageStats2 = usageStats;
                }
            }
            usageStats = usageStats2;
            instantAppInfo = instantAppInfo3;
            instantAppInfo3 = instantAppInfo;
            usageStats2 = usageStats;
        }
        Editor putLong = ((SharedPreferences) this.f7747b.mo1a()).edit().putLong("InstantApsStatsManager.mostUsedTimestamp", System.currentTimeMillis());
        if (usageStats2 == null) {
            putLong.remove("InstantApsStatsManager.mostUsedStats").apply();
        } else {
            putLong.putString("InstantApsStatsManager.mostUsedStats", C1305c.m7763a(usageStats2)).apply();
        }
        return instantAppInfo3;
    }

    C1303a(C0002a c0002a, C0002a c0002a2, C1305c c1305c) {
        this.f7746a = c0002a;
        this.f7747b = c0002a2;
        this.f7748c = c1305c;
    }
}
