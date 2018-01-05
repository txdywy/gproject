package com.google.android.gms.gcm;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class C5206m implements ThreadFactory {
    public final AtomicInteger f26256a = new AtomicInteger(1);

    C5206m() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "gcm-task#" + this.f26256a.getAndIncrement());
        thread.setPriority(4);
        return thread;
    }
}
