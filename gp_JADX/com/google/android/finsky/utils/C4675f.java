package com.google.android.finsky.utils;

import android.os.Process;

final class C4675f implements Runnable {
    public final /* synthetic */ Runnable f24057a;

    C4675f(Runnable runnable) {
        this.f24057a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(10);
        this.f24057a.run();
    }
}
