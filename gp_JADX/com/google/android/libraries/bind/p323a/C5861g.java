package com.google.android.libraries.bind.p323a;

final class C5861g implements Runnable {
    public final /* synthetic */ C5860f f29371a;

    C5861g(C5860f c5860f) {
        this.f29371a = c5860f;
    }

    public final void run() {
        C5860f c5860f = this.f29371a;
        C5855a.m27294a();
        c5860f.f29367b.lock();
        try {
            c5860f.f29369d = false;
            c5860f.f29368c.signalAll();
        } finally {
            c5860f.f29367b.unlock();
        }
    }
}
