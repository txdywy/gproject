package com.google.android.finsky.setup.p242d.p244a;

import java.util.concurrent.CountDownLatch;

final /* synthetic */ class C4157m implements Runnable {
    public final CountDownLatch f21019a;

    C4157m(CountDownLatch countDownLatch) {
        this.f21019a = countDownLatch;
    }

    public final void run() {
        this.f21019a.countDown();
    }
}
