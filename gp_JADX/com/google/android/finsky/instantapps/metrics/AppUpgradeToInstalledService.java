package com.google.android.finsky.instantapps.metrics;

import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.bm;
import android.text.TextUtils;
import com.google.android.finsky.instantapps.p216c.C3410c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.android.instantapps.common.p221d.p222a.ac;
import com.google.android.instantapps.common.p221d.p222a.ad;
import com.google.android.instantapps.common.p221d.p222a.af;
import com.google.android.p306h.p307a.p308a.C5678o;
import com.google.android.p306h.p307a.p308a.C5684u;
import java.util.concurrent.TimeUnit;

public class AppUpgradeToInstalledService extends bm {
    public C5710a f17779i;

    public AppUpgradeToInstalledService() {
        ((C3410c) C3947d.m18649a(C3410c.class)).mo3514a(this);
    }

    static void m17105a(Context context, Intent intent) {
        bm.m1346a(context, AppUpgradeToInstalledService.class, 68461794, intent);
    }

    protected final void mo3486a(Intent intent) {
        Object authority = intent.getData().getAuthority();
        int intExtra = intent.getIntExtra("instantAppVersionCode", -1);
        if (!TextUtils.isEmpty(authority)) {
            C5684u c5684u = new C5684u();
            c5684u.f28824d = authority;
            c5684u.f28825e = Integer.valueOf(intExtra);
            C5678o c5678o = new C5678o();
            UsageStatsManager usageStatsManager = (UsageStatsManager) getSystemService("usagestats");
            long currentTimeMillis = System.currentTimeMillis();
            UsageStats usageStats = (UsageStats) usageStatsManager.queryAndAggregateUsageStats(currentTimeMillis - TimeUnit.DAYS.toMillis(30), currentTimeMillis).get(authority);
            if (usageStats != null) {
                c5678o.f28787d = Long.valueOf(usageStats.getLastTimeUsed());
            } else {
                c5678o.f28787d = Long.valueOf(0);
            }
            ad adVar = new ad(1102);
            adVar.f28913f = c5678o;
            ac a = adVar.m26987a();
            af a2 = this.f17779i.mo5135a();
            a2.mo5138a(c5684u);
            a2.mo5139a(a);
        }
    }
}
