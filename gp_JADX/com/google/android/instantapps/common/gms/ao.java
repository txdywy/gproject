package com.google.android.instantapps.common.gms;

import android.os.Process;

final class ao implements Runnable {
    public final /* synthetic */ Runnable f29216a;
    public final /* synthetic */ an f29217b;

    ao(an anVar, Runnable runnable) {
        this.f29217b = anVar;
        this.f29216a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(this.f29217b.f29214c);
        this.f29216a.run();
    }
}
