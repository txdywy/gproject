package com.google.android.finsky.verifier.impl.p261b;

import java.util.concurrent.CountDownLatch;

final class C4744d implements C4727e {
    public final /* synthetic */ CountDownLatch f24428a;

    C4744d(CountDownLatch countDownLatch) {
        this.f24428a = countDownLatch;
    }

    public final void mo4334a(C4740a c4740a) {
        this.f24428a.countDown();
    }
}
