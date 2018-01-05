package com.google.android.finsky.installqueue.p141a;

import com.google.android.finsky.installqueue.InstallConstraint;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.C0757i;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

final /* synthetic */ class C3345n implements Runnable {
    public final C3342k f17234a;
    public final Set f17235b;
    public final CountDownLatch f17236c;

    C3345n(C3342k c3342k, Set set, CountDownLatch countDownLatch) {
        this.f17234a = c3342k;
        this.f17235b = set;
        this.f17236c = countDownLatch;
    }

    public final void run() {
        C3342k c3342k = this.f17234a;
        Set<InstallConstraint> set = this.f17235b;
        CountDownLatch countDownLatch = this.f17236c;
        for (InstallConstraint installConstraint : set) {
            FinskyLog.m21659a("Creating job for %s", installConstraint);
            c3342k.m16783c().m18888a(((C3336h) c3342k.f17220i.mo1a()).m16723a(), installConstraint.toString(), C3339i.class, C3339i.m16734a(installConstraint, 0), new C4025c().m18851a("constraint", C0757i.m4909a(installConstraint.f17169b))).mo4398a(new C3349r(countDownLatch));
        }
    }
}
