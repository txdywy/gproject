package org.chromium.base;

import android.os.Looper;
import android.util.Printer;
import org.chromium.base.annotations.CalledByNative;

public class TraceEvent implements AutoCloseable {
    public static volatile boolean f40509a;
    public static volatile boolean f40510b;

    private static native void nativeBegin(String str, String str2);

    private static native void nativeBeginToplevel(String str);

    private static native void nativeEnd(String str, String str2);

    private static native void nativeEndToplevel();

    private static native void nativeFinishAsync(String str, long j);

    private static native void nativeInstant(String str, String str2);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String str, long j);

    private static native void nativeStopATrace();

    public void close() {
        throw new NoSuchMethodError();
    }

    @CalledByNative
    public static void setEnabled(boolean z) {
        if (z) {
            synchronized (EarlyTraceEvent.f40486a) {
                if (EarlyTraceEvent.m37794b()) {
                    EarlyTraceEvent.f40487b = 2;
                    EarlyTraceEvent.m37795c();
                }
            }
        }
        if (f40509a != z) {
            f40509a = z;
            if (!f40510b) {
                Printer printer;
                Looper looper = ThreadUtils.m37806a().getLooper();
                if (z) {
                    printer = C7913y.f40562a;
                } else {
                    printer = null;
                }
                looper.setMessageLogging(printer);
            }
        }
    }

    public static void m37810a(String str, String str2) {
        if (f40509a) {
            nativeInstant(str, str2);
        }
    }

    public static void m37812b(String str, String str2) {
        EarlyTraceEvent.m37791a(str);
        if (f40509a) {
            nativeBegin(str, str2);
        }
    }

    public static void m37809a(String str) {
        EarlyTraceEvent.m37793b(str);
        if (f40509a) {
            nativeEnd(str, null);
        }
    }
}
