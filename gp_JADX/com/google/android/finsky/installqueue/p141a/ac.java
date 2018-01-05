package com.google.android.finsky.installqueue.p141a;

import java.util.concurrent.CountDownLatch;

final /* synthetic */ class ac implements Runnable {
    public final C3342k f17182a;
    public final C3339i f17183b;
    public final CountDownLatch f17184c;

    ac(C3342k c3342k, C3339i c3339i, CountDownLatch countDownLatch) {
        this.f17182a = c3342k;
        this.f17183b = c3339i;
        this.f17184c = countDownLatch;
    }

    public final void run() {
        C3342k c3342k = this.f17182a;
        C3339i c3339i = this.f17183b;
        CountDownLatch countDownLatch = this.f17184c;
        c3339i.m5802b(null);
        c3342k.m16778b(c3339i);
        c3342k.m16783c().m18887a(c3339i.f17205f).mo4398a(new C3350s(countDownLatch));
    }
}
