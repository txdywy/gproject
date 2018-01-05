package com.google.android.libraries.performance.primes;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class de implements ThreadFactory {
    public final AtomicInteger f29945a;
    public final int f29946b;
    public final String f29947c;

    de(int i) {
        this("Primes", i);
    }

    de(String str, int i) {
        this.f29945a = new AtomicInteger(1);
        this.f29946b = i;
        this.f29947c = str;
    }

    public final Thread newThread(Runnable runnable) {
        Runnable dfVar = new df(this, runnable);
        String str = this.f29947c;
        Thread thread = new Thread(dfVar, new StringBuilder(String.valueOf(str).length() + 12).append(str).append("-").append(this.f29945a.getAndIncrement()).toString());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
