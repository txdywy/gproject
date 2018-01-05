package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;

final class C5592i implements C5585b, C5586c {
    public final CountDownLatch f28509a = new CountDownLatch(1);

    C5592i() {
    }

    public final void mo5052a() {
        this.f28509a.countDown();
    }

    public final void mo5053b() {
        this.f28509a.countDown();
    }
}
