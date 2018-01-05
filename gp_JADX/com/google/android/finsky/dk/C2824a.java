package com.google.android.finsky.dk;

import android.content.pm.PackageStats;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.co.C2323a;
import com.google.android.finsky.co.C2332j;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.a.a.a.a.av;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class C2824a {
    public final C2323a f15194a;

    public C2824a(C2323a c2323a) {
        this.f15194a = c2323a;
    }

    public final PackageStats m14948a(C2495w c2495w, List list) {
        if (this.f15194a.f11439i) {
            int i;
            if (C2830g.f15212d.get() || !bb.m21795c()) {
                i = 0;
            } else {
                i = 1;
            }
            if (i != 0) {
                FinskyLog.m21669e("StorageUtils.getDiskUsageForApp should not be called on the main thread", new Object[0]);
                return null;
            } else if (list.isEmpty()) {
                FinskyLog.m21669e("At least one package should be provided", new Object[0]);
                return null;
            } else {
                CountDownLatch countDownLatch = new CountDownLatch(list.size());
                AtomicInteger atomicInteger = new AtomicInteger(0);
                PackageStats a = m14946a(c2495w, list, countDownLatch, atomicInteger);
                try {
                    if (countDownLatch.await(Math.max(((long) list.size()) * ((Long) C0955b.hi.m28964b()).longValue(), ((Long) C0955b.hj.m28964b()).longValue()), TimeUnit.MILLISECONDS)) {
                        C2474c c2474c = new C2474c(2100);
                        int size = list.size();
                        int i2 = atomicInteger.get();
                        av avVar = new av();
                        avVar.a |= 2;
                        avVar.c = i2;
                        avVar.a |= 1;
                        avVar.b = size;
                        c2474c.f13342a.ad = avVar;
                        c2495w.m13367a(c2474c);
                        return a;
                    }
                    C2824a.m14947a(c2495w, 1501);
                    FinskyLog.m21667d("Latch timed out when fetching package size info for all packages", new Object[0]);
                    return null;
                } catch (Throwable e) {
                    C2824a.m14947a(c2495w, 1502);
                    FinskyLog.m21660a(e, "Latch interrupted when fetching package size info for all packages", new Object[0]);
                    return null;
                }
            }
        }
        C2824a.m14947a(c2495w, 1500);
        return null;
    }

    private final PackageStats m14946a(C2495w c2495w, List list, CountDownLatch countDownLatch, AtomicInteger atomicInteger) {
        PackageStats packageStats = new PackageStats(list.size() == 1 ? (String) list.get(0) : null);
        C2332j c2825b = new C2825b(packageStats, atomicInteger, countDownLatch, c2495w);
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                countDownLatch.countDown();
            } else {
                this.f15194a.m11892a(str, c2825b);
            }
        }
        return packageStats;
    }

    static void m14947a(C2495w c2495w, int i) {
        c2495w.m13367a(new C2474c(2100).m13254g(i));
    }
}
