package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final /* synthetic */ class au implements Runnable {
    public final Executor f26491a;
    public final Runnable f26492b;

    au(Executor executor, Runnable runnable) {
        this.f26491a = executor;
        this.f26492b = runnable;
    }

    public final void run() {
        this.f26491a.execute(this.f26492b);
    }
}
