package com.google.android.libraries.bind.p323a;

import android.os.Process;

final class C5867m implements Runnable {
    public final /* synthetic */ Runnable f29387a;

    C5867m(Runnable runnable) {
        this.f29387a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.f29387a.run();
    }
}
