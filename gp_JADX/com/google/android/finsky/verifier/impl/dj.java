package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.verifier.impl.p261b.C4727e;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import java.util.concurrent.CountDownLatch;

final class dj implements C4727e {
    public final /* synthetic */ CountDownLatch f24594a;

    dj(CountDownLatch countDownLatch) {
        this.f24594a = countDownLatch;
    }

    public final void mo4334a(C4740a c4740a) {
        this.f24594a.countDown();
    }
}
