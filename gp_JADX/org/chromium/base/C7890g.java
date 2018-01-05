package org.chromium.base;

final class C7890g implements Runnable {
    public final /* synthetic */ long f40521a;
    public final /* synthetic */ long f40522b;
    public final /* synthetic */ JavaHandlerThread f40523c;

    C7890g(JavaHandlerThread javaHandlerThread, long j, long j2) {
        this.f40523c = javaHandlerThread;
        this.f40521a = j;
        this.f40522b = j2;
    }

    public final void run() {
        this.f40523c.nativeInitializeThread(this.f40521a, this.f40522b);
    }
}
