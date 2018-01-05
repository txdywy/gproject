package com.google.android.finsky.installer.p207a;

import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.support.v4.os.C0327a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;

final class C3278a implements Comparator {
    public final Context f16855a;
    public final C1461c f16856b;
    public Map f16857c;
    public HashSet f16858d;

    public C3278a(Context context, C1461c c1461c) {
        this.f16855a = context;
        this.f16856b = c1461c;
    }

    private final long m16396a(String str) {
        UsageStats usageStats;
        if (this.f16857c == null) {
            UsageStatsManager usageStatsManager = (UsageStatsManager) this.f16855a.getSystemService("usagestats");
            if (usageStatsManager != null) {
                this.f16857c = usageStatsManager.queryAndAggregateUsageStats(0, System.currentTimeMillis());
            }
            if (this.f16857c == null) {
                FinskyLog.m21665c("Failed to get usage stats", new Object[0]);
                usageStats = null;
                return usageStats != null ? 0 : usageStats.getTotalTimeInForeground();
            }
        }
        usageStats = (UsageStats) this.f16857c.get(str);
        if (usageStats != null) {
        }
    }

    private final boolean m16397a(C3647b c3647b) {
        if (this.f16858d == null) {
            this.f16858d = new HashSet(Arrays.asList(C4680k.m21818a((String) C0955b.iI.m28964b())));
        }
        return this.f16858d.contains(c3647b.f18029d.f10801H);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        long j = 0;
        C3647b c3647b = (C3647b) obj;
        C3647b c3647b2 = (C3647b) obj2;
        if (c3647b == c3647b2) {
            return 0;
        }
        if (c3647b.f18029d == null || c3647b2.f18029d == null) {
            FinskyLog.m21669e("null installerData should be impossible here", new Object[0]);
            return 0;
        } else if (c3647b.f18029d.m11118b() < c3647b2.f18029d.m11118b()) {
            return -1;
        } else {
            if (c3647b.f18029d.m11118b() > c3647b2.f18029d.m11118b()) {
                return 1;
            }
            if (C0327a.m1722b() || this.f16856b.dj().mo2294a(12631302)) {
                long a;
                if (m16397a(c3647b)) {
                    a = m16396a(c3647b.f18026a);
                } else {
                    a = 0;
                }
                if (m16397a(c3647b2)) {
                    j = m16396a(c3647b2.f18026a);
                }
                if (a != j) {
                    if (a < j) {
                        return 1;
                    }
                    return -1;
                }
            }
            if (c3647b.f18029d.f10800G < c3647b2.f18029d.f10800G) {
                return -1;
            }
            if (c3647b.f18029d.f10800G > c3647b2.f18029d.f10800G) {
                return 1;
            }
            int compareTo = c3647b.f18026a.compareTo(c3647b2.f18026a);
            if (compareTo != 0) {
                return compareTo;
            }
            FinskyLog.m21669e("Duplicate packages should not be added", new Object[0]);
            return compareTo;
        }
    }
}
