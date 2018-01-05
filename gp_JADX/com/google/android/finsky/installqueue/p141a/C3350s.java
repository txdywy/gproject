package com.google.android.finsky.installqueue.p141a;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4830g;
import java.util.concurrent.CountDownLatch;

final /* synthetic */ class C3350s implements C0978f {
    public final CountDownLatch f17243a;

    C3350s(CountDownLatch countDownLatch) {
        this.f17243a = countDownLatch;
    }

    public final void mo1172a(C4809e c4809e) {
        CountDownLatch countDownLatch = this.f17243a;
        C4830g.m22622a(c4809e);
        countDownLatch.countDown();
    }
}
