package com.google.android.libraries.p326c.p327a;

import android.os.Handler;
import android.os.Looper;

public final class C5917b {
    public static volatile Thread f29482a;
    public static volatile Handler f29483b;

    public static boolean m27413a() {
        if (f29482a == null) {
            f29482a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f29482a;
    }

    public static void m27414b() {
        if (C5917b.m27413a()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    public static void m27412a(Runnable runnable) {
        if (f29483b == null) {
            f29483b = new Handler(Looper.getMainLooper());
        }
        f29483b.post(runnable);
    }
}
