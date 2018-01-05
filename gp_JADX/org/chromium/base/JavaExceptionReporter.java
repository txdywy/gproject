package org.chromium.base;

import java.lang.Thread.UncaughtExceptionHandler;
import org.chromium.base.annotations.CalledByNative;

public class JavaExceptionReporter implements UncaughtExceptionHandler {
    public final UncaughtExceptionHandler f40491a;
    public final boolean f40492b;
    public boolean f40493c;

    private JavaExceptionReporter(UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.f40491a = uncaughtExceptionHandler;
        this.f40492b = z;
    }

    private static native void nativeReportJavaException(boolean z, Throwable th);

    private static native void nativeReportJavaStackTrace(String str);

    public void uncaughtException(Thread thread, Throwable th) {
        if (!this.f40493c) {
            this.f40493c = true;
            nativeReportJavaException(this.f40492b, th);
        }
        if (this.f40491a != null) {
            this.f40491a.uncaughtException(thread, th);
        }
    }

    @CalledByNative
    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }
}
