package org.chromium.base;

final class C7892i implements Runnable {
    public final /* synthetic */ long f40526a;
    public final /* synthetic */ JavaHandlerThread f40527b;

    C7892i(JavaHandlerThread javaHandlerThread, long j) {
        this.f40527b = javaHandlerThread;
        this.f40526a = j;
    }

    public final void run() {
        this.f40527b.stopOnThread(this.f40526a);
    }
}
