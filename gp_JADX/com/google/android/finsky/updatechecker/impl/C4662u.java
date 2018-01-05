package com.google.android.finsky.updatechecker.impl;

import android.os.PowerManager.WakeLock;

final class C4662u implements Runnable {
    public int f23998a;
    public final /* synthetic */ Runnable f23999b;
    public final /* synthetic */ WakeLock f24000c;

    C4662u(Runnable runnable, WakeLock wakeLock) {
        this.f23999b = runnable;
        this.f24000c = wakeLock;
    }

    public final void run() {
        this.f23998a++;
        if (this.f23998a == 3) {
            this.f23999b.run();
            this.f24000c.release();
        }
    }
}
