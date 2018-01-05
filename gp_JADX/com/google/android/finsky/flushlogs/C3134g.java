package com.google.android.finsky.flushlogs;

import java.util.concurrent.CountDownLatch;

final class C3134g implements Runnable {
    public final /* synthetic */ CountDownLatch f16139a;

    C3134g(CountDownLatch countDownLatch) {
        this.f16139a = countDownLatch;
    }

    public final void run() {
        this.f16139a.countDown();
    }
}
