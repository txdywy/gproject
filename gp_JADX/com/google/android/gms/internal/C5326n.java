package com.google.android.gms.internal;

final class C5326n implements Runnable {
    public /* synthetic */ C5301m f27205a;

    C5326n(C5301m c5301m) {
        this.f27205a = c5301m;
    }

    public final void run() {
        this.f27205a.f26482b = Thread.currentThread();
        this.f27205a.mo4696a();
    }
}
