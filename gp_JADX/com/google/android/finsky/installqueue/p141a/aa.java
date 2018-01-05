package com.google.android.finsky.installqueue.p141a;

import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

final /* synthetic */ class aa implements Runnable {
    public final C3342k f17176a;
    public final List f17177b;
    public final Set f17178c;
    public final CountDownLatch f17179d;

    aa(C3342k c3342k, List list, Set set, CountDownLatch countDownLatch) {
        this.f17176a = c3342k;
        this.f17177b = list;
        this.f17178c = set;
        this.f17179d = countDownLatch;
    }

    public final void run() {
        C3342k c3342k = this.f17176a;
        List<C3369m> list = this.f17177b;
        Set set = this.f17178c;
        CountDownLatch countDownLatch = this.f17179d;
        for (C3369m c3369m : list) {
            int i;
            String str = c3369m.f17274d.f17171a.f17133c;
            C2129c a = ((C2127b) c3342k.f17215d.mo1a()).mo2657a(str);
            if (a == null) {
                i = 0;
            } else if (a.f10809c == -1) {
                i = 0;
            } else {
                if (!((Boolean) C0955b.iL.m28964b()).booleanValue()) {
                    C2322b a2 = ((C2320a) c3342k.f17216e.mo1a()).mo2854a(str);
                    if (a2 != null && a.f10809c < a2.f11419d) {
                        FinskyLog.m21669e("Inconsistent InstallerData for %s desiredVersion: %d, installedVersion: %d", str, Integer.valueOf(a.f10809c), Integer.valueOf(a2.f11419d));
                    }
                }
                i = 1;
            }
            if (i == 0) {
                set.add(c3369m.f17274d.f17171a.f17133c);
            }
        }
        countDownLatch.countDown();
    }
}
