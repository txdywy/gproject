package com.google.android.finsky.by.p132a;

import java.util.concurrent.CountDownLatch;

final class C2208g implements Runnable {
    public final /* synthetic */ CountDownLatch f11047a;

    C2208g(CountDownLatch countDownLatch) {
        this.f11047a = countDownLatch;
    }

    public final void run() {
        this.f11047a.countDown();
    }
}
