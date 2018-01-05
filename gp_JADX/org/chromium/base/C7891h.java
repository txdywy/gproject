package org.chromium.base;

import android.os.MessageQueue.IdleHandler;

final class C7891h implements IdleHandler {
    public final /* synthetic */ long f40524a;
    public final /* synthetic */ JavaHandlerThread f40525b;

    C7891h(JavaHandlerThread javaHandlerThread, long j) {
        this.f40525b = javaHandlerThread;
        this.f40524a = j;
    }

    public final boolean queueIdle() {
        this.f40525b.f40494a.getLooper().quit();
        this.f40525b.nativeOnLooperStopped(this.f40524a);
        return false;
    }
}
