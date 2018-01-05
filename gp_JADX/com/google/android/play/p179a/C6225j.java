package com.google.android.play.p179a;

import android.os.HandlerThread;
import java.util.concurrent.Semaphore;

final class C6225j extends HandlerThread {
    public final /* synthetic */ Semaphore f31156a;

    C6225j(String str, Semaphore semaphore) {
        this.f31156a = semaphore;
        super(str, 10);
    }

    protected final void onLooperPrepared() {
        this.f31156a.release();
    }
}
