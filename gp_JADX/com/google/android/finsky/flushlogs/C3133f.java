package com.google.android.finsky.flushlogs;

import java.util.concurrent.CountDownLatch;

final class C3133f implements Runnable {
    public final /* synthetic */ CountDownLatch f16138a;

    C3133f(CountDownLatch countDownLatch) {
        this.f16138a = countDownLatch;
    }

    public final void run() {
        this.f16138a.countDown();
    }
}
