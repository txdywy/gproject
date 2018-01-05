package io.reactivex.p548a.p550b;

import android.os.Handler;
import io.reactivex.p551b.C7756b;
import io.reactivex.p554d.C7773a;

final class C7759f implements C7756b, Runnable {
    public final Handler f40278a;
    public final Runnable f40279b;
    public volatile boolean f40280c;

    C7759f(Handler handler, Runnable runnable) {
        this.f40278a = handler;
        this.f40279b = runnable;
    }

    public final void run() {
        try {
            this.f40279b.run();
        } catch (Throwable th) {
            Throwable illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.", th);
            C7773a.m37567a(illegalStateException);
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, illegalStateException);
        }
    }

    public final void mo6530a() {
        this.f40280c = true;
        this.f40278a.removeCallbacks(this);
    }
}
