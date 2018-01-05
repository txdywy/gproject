package com.google.android.finsky.instantapps.appmanagement;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.finsky.instantapps.p214b.C3379a;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.instantappscompatibility.InstantAppInfo;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class C3391j implements C3379a {
    public final PackageManager f17376a;
    public final C3600b f17377b;
    public final UsageStatsManager f17378c;
    public final C3385r f17379d;
    public final C3396o f17380e;
    public final C5710a f17381f;
    public final boolean f17382g;

    C3391j(boolean z, Context context, PackageManager packageManager, C3600b c3600b, C3385r c3385r, C3396o c3396o, C5710a c5710a) {
        this.f17378c = (UsageStatsManager) context.getSystemService("usagestats");
        this.f17376a = packageManager;
        this.f17377b = c3600b;
        this.f17379d = c3385r;
        this.f17380e = c3396o;
        this.f17381f = c5710a;
        this.f17382g = z;
    }

    private static List m16891a(UsageStatsManager usageStatsManager, List list, C3385r c3385r) {
        long currentTimeMillis = System.currentTimeMillis();
        Map queryAndAggregateUsageStats = usageStatsManager.queryAndAggregateUsageStats(currentTimeMillis - c3385r.mo3503a().longValue(), currentTimeMillis);
        List arrayList = new ArrayList();
        for (InstantAppInfo instantAppInfo : list) {
            if (!queryAndAggregateUsageStats.containsKey(instantAppInfo.m17188a())) {
                arrayList.add(instantAppInfo.m17188a());
            }
        }
        String valueOf = String.valueOf(arrayList);
        Log.i("InstantAppGCAction", new StringBuilder(String.valueOf(valueOf).length() + 20).append("Garbage collecting: ").append(valueOf).toString());
        return arrayList;
    }

    public final /* synthetic */ Object call() {
        this.f17381f.mo5136a(2104);
        List<InstantAppInfo> a = this.f17377b.m17194a();
        if (a.isEmpty()) {
            this.f17381f.mo5136a(2105);
            return Boolean.valueOf(true);
        }
        List list;
        if (this.f17382g) {
            this.f17381f.mo5136a(2124);
            List arrayList = new ArrayList(a.size());
            for (InstantAppInfo instantAppInfo : a) {
                if ("com.android.vending".equalsIgnoreCase(this.f17376a.getInstallerPackageName(instantAppInfo.m17188a()))) {
                    arrayList.add(instantAppInfo.m17188a());
                }
            }
            list = arrayList;
        } else {
            list = C3391j.m16891a(this.f17378c, a, this.f17379d);
        }
        if (list.isEmpty()) {
            this.f17381f.mo5136a(2105);
            return Boolean.valueOf(true);
        }
        boolean a2 = this.f17380e.m16897a(list);
        if (a2) {
            this.f17381f.mo5136a(2107);
        } else {
            this.f17381f.mo5136a(2106);
        }
        return Boolean.valueOf(a2);
    }
}
