package com.google.android.libraries.bind.p323a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class C5866l implements ThreadFactory {
    public final AtomicInteger f29385a = new AtomicInteger(1);
    public final /* synthetic */ C5864j f29386b;

    C5866l(C5864j c5864j) {
        this.f29386b = c5864j;
    }

    public final Thread newThread(Runnable runnable) {
        Runnable c5867m = new C5867m(runnable);
        String valueOf = String.valueOf(this.f29386b);
        Thread thread = new Thread(this.f29386b.f29383e, c5867m, new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append(" #").append(this.f29385a.getAndIncrement()).toString());
        thread.setPriority(1);
        return thread;
    }
}
