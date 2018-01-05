package com.google.android.instantapps.common.gms;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class an implements ThreadFactory {
    public final ThreadFactory f29212a = Executors.defaultThreadFactory();
    public final AtomicInteger f29213b = new AtomicInteger(1);
    public final /* synthetic */ int f29214c;
    public final /* synthetic */ String f29215d;

    an(int i, String str) {
        this.f29214c = i;
        this.f29215d = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f29212a.newThread(new ao(this, runnable));
        String str = this.f29215d;
        newThread.setName(new StringBuilder(String.valueOf(str).length() + 11).append(str).append(this.f29213b.getAndIncrement()).toString());
        return newThread;
    }
}
