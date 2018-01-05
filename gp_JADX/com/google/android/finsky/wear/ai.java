package com.google.android.finsky.wear;

import java.util.concurrent.Semaphore;

final class ai implements Runnable {
    public final /* synthetic */ Semaphore f24788a;

    ai(Semaphore semaphore) {
        this.f24788a = semaphore;
    }

    public final void run() {
        this.f24788a.release();
    }
}
