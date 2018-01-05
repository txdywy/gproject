package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.Thread.State;
import org.chromium.base.annotations.CalledByNative;

public class JavaHandlerThread {
    public final HandlerThread f40494a;

    private JavaHandlerThread(String str) {
        this.f40494a = new HandlerThread(str);
    }

    private native void nativeInitializeThread(long j, long j2);

    private native void nativeOnLooperStopped(long j);

    private native void nativeStopThread(long j);

    @CalledByNative
    private static JavaHandlerThread create(String str) {
        return new JavaHandlerThread(str);
    }

    @CalledByNative
    private void startAndInitialize(long j, long j2) {
        if ((this.f40494a.getState() != State.NEW ? 1 : null) == null) {
            this.f40494a.start();
        }
        new Handler(this.f40494a.getLooper()).post(new C7890g(this, j, j2));
    }

    @CalledByNative
    private void stopOnThread(long j) {
        nativeStopThread(j);
        Looper.myQueue().addIdleHandler(new C7891h(this, j));
    }

    @CalledByNative
    private void joinThread() {
        Object obj = null;
        while (obj == null) {
            try {
                this.f40494a.join();
                obj = 1;
            } catch (InterruptedException e) {
            }
        }
    }

    @CalledByNative
    private void stop(long j) {
        new Handler(this.f40494a.getLooper()).post(new C7892i(this, j));
        joinThread();
    }

    @CalledByNative
    private boolean isAlive() {
        return this.f40494a.isAlive();
    }
}
