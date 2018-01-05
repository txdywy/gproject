package com.google.android.finsky.verifier.impl.p261b;

import java.util.concurrent.CountDownLatch;

public final class C4745g implements C4727e {
    public final C4740a f24429a;
    public final CountDownLatch f24430b;
    public final boolean f24431c;
    public final C4746h f24432d;

    private C4745g(C4740a c4740a, C4746h c4746h) {
        this.f24429a = c4740a;
        this.f24430b = new CountDownLatch(1);
        this.f24431c = true;
        c4740a.m22064a((C4727e) this);
        this.f24432d = c4746h;
    }

    public C4745g(C4740a c4740a, C4746h c4746h, byte b) {
        this(c4740a, c4746h);
    }

    public final void mo4334a(C4740a c4740a) {
        this.f24430b.countDown();
        if (this.f24432d != null) {
            this.f24432d.mo4377a(this);
        }
    }
}
