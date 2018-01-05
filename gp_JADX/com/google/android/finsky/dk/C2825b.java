package com.google.android.finsky.dk;

import android.content.pm.PackageStats;
import com.google.android.finsky.co.C2332j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

final class C2825b implements C2332j {
    public final /* synthetic */ PackageStats f15195a;
    public final /* synthetic */ AtomicInteger f15196b;
    public final /* synthetic */ CountDownLatch f15197c;
    public final /* synthetic */ C2495w f15198d;

    C2825b(PackageStats packageStats, AtomicInteger atomicInteger, CountDownLatch countDownLatch, C2495w c2495w) {
        this.f15195a = packageStats;
        this.f15196b = atomicInteger;
        this.f15197c = countDownLatch;
        this.f15198d = c2495w;
    }

    public final void mo3143a(PackageStats packageStats) {
        synchronized (this.f15195a) {
            PackageStats packageStats2 = this.f15195a;
            packageStats2.codeSize += packageStats.codeSize;
            packageStats2 = this.f15195a;
            packageStats2.dataSize += packageStats.dataSize;
            packageStats2 = this.f15195a;
            packageStats2.cacheSize += packageStats.cacheSize;
            packageStats2 = this.f15195a;
            packageStats2.externalCodeSize += packageStats.externalCodeSize;
            packageStats2 = this.f15195a;
            packageStats2.externalDataSize += packageStats.externalDataSize;
            packageStats2 = this.f15195a;
            packageStats2.externalCacheSize += packageStats.externalCacheSize;
            packageStats2 = this.f15195a;
            packageStats2.externalMediaSize += packageStats.externalMediaSize;
            packageStats2 = this.f15195a;
            packageStats2.externalObbSize += packageStats.externalObbSize;
        }
        this.f15196b.incrementAndGet();
        this.f15197c.countDown();
    }

    public final void mo3144a(String str, int i, Exception exception) {
        if (exception == null) {
            FinskyLog.m21665c("Failed to get status for package '%s' (%d)", str, Integer.valueOf(i));
        } else {
            FinskyLog.m21660a(exception, "Failed to get status for package '%s' (%d)", str, Integer.valueOf(i));
        }
        switch (i) {
            case 1600:
                FinskyLog.m21669e("Shouldn't have tried getting package stats if API wasunavailable", new Object[0]);
                C2824a.m14947a(this.f15198d, 1500);
                break;
            case 1601:
                C2824a.m14947a(this.f15198d, 1503);
                break;
            case 1602:
                C2824a.m14947a(this.f15198d, 1504);
                break;
            default:
                FinskyLog.m21669e("Unknown error code getting package stats: " + i, new Object[0]);
                C2824a.m14947a(this.f15198d, 1505);
                break;
        }
        this.f15197c.countDown();
    }
}
