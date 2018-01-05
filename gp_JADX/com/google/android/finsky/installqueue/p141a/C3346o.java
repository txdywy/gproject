package com.google.android.finsky.installqueue.p141a;

import java.util.concurrent.CountDownLatch;

final /* synthetic */ class C3346o implements Runnable {
    public final Runnable f17237a;
    public final CountDownLatch f17238b;

    C3346o(Runnable runnable, CountDownLatch countDownLatch) {
        this.f17237a = runnable;
        this.f17238b = countDownLatch;
    }

    public final void run() {
        Runnable runnable = this.f17237a;
        CountDownLatch countDownLatch = this.f17238b;
        runnable.run();
        countDownLatch.countDown();
    }
}
