package com.google.android.finsky.uninstall;

import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class bm extends AsyncTask {
    public final /* synthetic */ Context f23579a;
    public final /* synthetic */ bl f23580b;

    bm(bl blVar, Context context) {
        this.f23580b = blVar;
        this.f23579a = context;
    }

    private final Map m21386a() {
        try {
            UsageStatsManager usageStatsManager = (UsageStatsManager) this.f23579a.getSystemService("usagestats");
            if (usageStatsManager == null) {
                this.f23580b.m21379a(1510);
                return Collections.emptyMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            Map queryAndAggregateUsageStats = usageStatsManager.queryAndAggregateUsageStats(currentTimeMillis - 31449600000L, currentTimeMillis);
            if (queryAndAggregateUsageStats == null) {
                this.f23580b.m21379a(1511);
                return Collections.emptyMap();
            }
            Map hashMap = new HashMap();
            for (String str : queryAndAggregateUsageStats.keySet()) {
                hashMap.put(str, Long.valueOf(((UsageStats) queryAndAggregateUsageStats.get(str)).getLastTimeUsed()));
            }
            return hashMap;
        } catch (Exception e) {
            FinskyLog.m21665c("Unable to invoke method: %s", e.getMessage());
            this.f23580b.m21379a(1512);
            return Collections.emptyMap();
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Map map = (Map) obj;
        synchronized (this) {
            this.f23580b.f23572c = map;
        }
        if (this.f23580b.f23571a != null) {
            this.f23580b.f23571a.mo4284d();
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m21386a();
    }
}
