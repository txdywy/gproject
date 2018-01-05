package com.google.android.finsky.services;

import java.util.concurrent.CountDownLatch;

final class C4083q implements Runnable {
    public final /* synthetic */ CountDownLatch f20447a;

    C4083q(CountDownLatch countDownLatch) {
        this.f20447a = countDownLatch;
    }

    public final void run() {
        this.f20447a.countDown();
    }
}
