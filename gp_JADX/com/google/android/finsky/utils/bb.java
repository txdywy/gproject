package com.google.android.finsky.utils;

import android.os.AsyncTask;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class bb {
    public static final ExecutorService f24053a = Executors.newSingleThreadScheduledExecutor(new bc());

    public static void m21791a() {
        if (!m21795c()) {
            throw new IllegalStateException("This method must be called from the UI thread.");
        }
    }

    public static void m21793b() {
        if (m21795c()) {
            throw new IllegalStateException("This method must be called from the worker thread.");
        }
    }

    public static boolean m21795c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void m21792a(AsyncTask asyncTask, Object... objArr) {
        asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, objArr);
    }

    public static void m21794b(AsyncTask asyncTask, Object... objArr) {
        asyncTask.executeOnExecutor(f24053a, objArr);
    }
}
