package com.google.android.finsky.utils;

import java.util.concurrent.ThreadFactory;

final class bc implements ThreadFactory {
    bc() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "ThreadUtils.lowPriority");
        thread.setPriority(1);
        return thread;
    }
}
