package org.chromium.net.impl;

import android.os.Process;

final class ad implements Runnable {
    public final /* synthetic */ Runnable f40755a;
    public final /* synthetic */ ac f40756b;

    ad(ac acVar, Runnable runnable) {
        this.f40756b = acVar;
        this.f40755a = runnable;
    }

    public final void run() {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(this.f40756b.f40754a);
        this.f40755a.run();
    }
}
