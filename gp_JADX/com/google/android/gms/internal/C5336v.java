package com.google.android.gms.internal;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class C5336v implements ThreadFactory {
    public final AtomicInteger f27548a = new AtomicInteger(1);
    public /* synthetic */ String f27549b;

    C5336v(String str) {
        this.f27549b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f27549b;
        return new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 23).append("AdWorker(").append(str).append(") #").append(this.f27548a.getAndIncrement()).toString());
    }
}
