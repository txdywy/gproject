package com.google.android.finsky.uninstall.v2a;

import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.os.AsyncTask;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class ag extends AsyncTask {
    public final /* synthetic */ Context f23727a;
    public final /* synthetic */ af f23728b;

    ag(af afVar, Context context) {
        this.f23728b = afVar;
        this.f23727a = context;
    }

    private final Map m21465a() {
        try {
            UsageStatsManager usageStatsManager = (UsageStatsManager) this.f23727a.getSystemService("usagestats");
            if (usageStatsManager == null) {
                this.f23728b.m21459a(1510);
                return Collections.emptyMap();
            }
            long currentTimeMillis = System.currentTimeMillis();
            Map queryAndAggregateUsageStats = usageStatsManager.queryAndAggregateUsageStats(currentTimeMillis - 31449600000L, currentTimeMillis);
            if (queryAndAggregateUsageStats == null) {
                this.f23728b.m21459a(1511);
                return Collections.emptyMap();
            }
            Map hashMap = new HashMap();
            for (String str : queryAndAggregateUsageStats.keySet()) {
                hashMap.put(str, Long.valueOf(((UsageStats) queryAndAggregateUsageStats.get(str)).getLastTimeUsed()));
            }
            return hashMap;
        } catch (Exception e) {
            FinskyLog.m21665c("Unable to invoke method: %s", e.getMessage());
            this.f23728b.m21459a(1512);
            return Collections.emptyMap();
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Map map = (Map) obj;
        synchronized (this) {
            this.f23728b.f23720c = map;
        }
        if (this.f23728b.f23719a != null) {
            this.f23728b.f23719a.mo4308h();
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m21465a();
    }
}
