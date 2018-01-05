package com.squareup.leakcanary.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class FutureResult {
    public final CountDownLatch latch = new CountDownLatch(1);
    public final AtomicReference resultHolder = new AtomicReference();

    public final boolean wait(long j, TimeUnit timeUnit) {
        try {
            return this.latch.await(j, timeUnit);
        } catch (Throwable e) {
            throw new RuntimeException("Did not expect thread to be interrupted", e);
        }
    }

    public final Object get() {
        if (this.latch.getCount() <= 0) {
            return this.resultHolder.get();
        }
        throw new IllegalStateException("Call wait() and check its result");
    }

    public final void set(Object obj) {
        this.resultHolder.set(obj);
        this.latch.countDown();
    }
}
