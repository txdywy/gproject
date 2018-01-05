package com.squareup.leakcanary;

import android.util.Log;

public final class CanaryLog {
    public static volatile Logger logger = new DefaultLogger();

    public interface Logger {
        void mo6395d(String str, Object... objArr);

        void mo6396d(Throwable th, String str, Object... objArr);
    }

    class DefaultLogger implements Logger {
        DefaultLogger() {
        }

        public void mo6395d(String str, Object... objArr) {
            String format = String.format(str, objArr);
            if (format.length() < 4000) {
                Log.d("LeakCanary", format);
                return;
            }
            for (String d : format.split("\n")) {
                Log.d("LeakCanary", d);
            }
        }

        public void mo6396d(Throwable th, String str, Object... objArr) {
            String format = String.format(str, objArr);
            String stackTraceString = Log.getStackTraceString(th);
            mo6395d(new StringBuilder((String.valueOf(format).length() + 1) + String.valueOf(stackTraceString).length()).append(format).append('\n').append(stackTraceString).toString(), new Object[0]);
        }
    }

    public static void setLogger(Logger logger) {
        logger = logger;
    }

    public static void m36611d(String str, Object... objArr) {
        Logger logger = logger;
        if (logger != null) {
            logger.mo6395d(str, objArr);
        }
    }

    public static void m36612d(Throwable th, String str, Object... objArr) {
        Logger logger = logger;
        if (logger != null) {
            logger.mo6396d(th, str, objArr);
        }
    }

    private CanaryLog() {
        throw new AssertionError();
    }
}
