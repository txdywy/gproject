package com.google.android.libraries.performance.primes;

import android.os.Process;

final class df implements Runnable {
    public final /* synthetic */ Runnable f29948a;
    public final /* synthetic */ de f29949b;

    df(de deVar, Runnable runnable) {
        this.f29949b = deVar;
        this.f29948a = runnable;
    }

    public final void run() {
        if (this.f29949b.f29946b != 0) {
            Process.setThreadPriority(this.f29949b.f29946b);
        }
        this.f29948a.run();
    }
}
