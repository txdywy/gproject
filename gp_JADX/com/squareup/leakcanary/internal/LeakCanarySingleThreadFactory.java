package com.squareup.leakcanary.internal;

import java.util.concurrent.ThreadFactory;

final class LeakCanarySingleThreadFactory implements ThreadFactory {
    public final String threadName;

    LeakCanarySingleThreadFactory(String str) {
        String str2 = "LeakCanary-";
        String valueOf = String.valueOf(str);
        this.threadName = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.threadName);
    }
}
