package com.google.android.libraries.performance.primes;

import android.os.SystemClock;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.metriccapture.C6010b;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture;
import d.a.a.a.a.a.as;
import d.a.a.a.a.a.at;
import d.a.a.a.a.a.bp;

final class cg implements Runnable {
    public final /* synthetic */ cf f29871a;

    cg(cf cfVar) {
        this.f29871a = cfVar;
    }

    public final void run() {
        if (!cf.m27779a(this.f29871a.f29868e)) {
            C5949a c5949a = this.f29871a;
            Object packageStats = PackageStatsCapture.getPackageStats(c5949a.f29613b);
            if (packageStats != null) {
                bp bpVar = new bp();
                C5916a.m27406a(packageStats);
                as asVar = new as();
                asVar.a = Long.valueOf(packageStats.cacheSize);
                asVar.b = Long.valueOf(packageStats.codeSize);
                asVar.c = Long.valueOf(packageStats.dataSize);
                asVar.d = Long.valueOf(packageStats.externalCacheSize);
                asVar.e = Long.valueOf(packageStats.externalCodeSize);
                asVar.f = Long.valueOf(packageStats.externalDataSize);
                asVar.g = Long.valueOf(packageStats.externalMediaSize);
                asVar.h = Long.valueOf(packageStats.externalObbSize);
                bpVar.i = asVar;
                if (c5949a.f29870g) {
                    at[] a = C6010b.m27877a(c5949a.f29613b);
                    if (a != null) {
                        bpVar.i.j = a;
                    }
                }
                String valueOf = String.valueOf(bpVar.i);
                C5989do.m27824a(3, "PackageMetricService", new StringBuilder(String.valueOf(valueOf).length() + 11).append("pkgMetric: ").append(valueOf).toString(), new Object[0]);
                c5949a.m27577a(bpVar);
                if ((!c5949a.f29868e.edit().putLong("primes.packageMetric.lastSendTime", SystemClock.elapsedRealtime()).commit() ? 1 : 0) != 0) {
                    C5989do.m27824a(3, "PackageMetricService", "Failure storing timestamp persistently", new Object[0]);
                    return;
                }
                return;
            }
            C5989do.m27824a(5, "PackageMetricService", "PackageStats capture failed.", new Object[0]);
        }
    }
}
