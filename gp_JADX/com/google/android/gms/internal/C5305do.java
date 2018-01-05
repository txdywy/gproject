package com.google.android.gms.internal;

import android.os.Process;

final class C5305do implements Runnable {
    public final Runnable f26662a;
    public final int f26663b = 0;

    public C5305do(Runnable runnable) {
        this.f26662a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(this.f26663b);
        this.f26662a.run();
    }
}
