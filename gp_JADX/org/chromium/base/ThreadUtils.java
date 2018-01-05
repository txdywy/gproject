package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import org.chromium.base.annotations.CalledByNative;

public class ThreadUtils {
    public static final Object f40506a = new Object();
    public static boolean f40507b;
    public static Handler f40508c;

    public static Handler m37806a() {
        Handler handler;
        synchronized (f40506a) {
            if (f40508c == null) {
                if (f40507b) {
                    throw new RuntimeException("Did not yet override the UI thread");
                }
                f40508c = new Handler(Looper.getMainLooper());
            }
            handler = f40508c;
        }
        return handler;
    }

    public static void m37807a(Runnable runnable) {
        m37806a().post(runnable);
    }

    @CalledByNative
    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }

    @CalledByNative
    private static boolean isThreadPriorityAudio(int i) {
        return Process.getThreadPriority(i) == -16;
    }
}
