package com.google.android.libraries.bind.p323a;

final class C5859e implements Runnable {
    public final /* synthetic */ C5858d f29365a;

    C5859e(C5858d c5858d) {
        this.f29365a = c5858d;
    }

    public final void run() {
        synchronized (this.f29365a.f29360a) {
            this.f29365a.f29364e = -1;
        }
        this.f29365a.f29361b.run();
    }
}
