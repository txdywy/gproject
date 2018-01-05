package com.google.android.finsky.utils;

import android.os.HandlerThread;
import java.util.concurrent.ThreadFactory;

public final class C4674e implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return C4674e.m21809a(runnable);
    }

    public static Thread m21809a(Runnable runnable) {
        return new Thread(new C4675f(runnable));
    }

    public static HandlerThread m21808a(String str) {
        return new HandlerThread(str, 10);
    }
}
