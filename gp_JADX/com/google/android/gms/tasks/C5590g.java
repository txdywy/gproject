package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class C5590g implements Executor {
    public final Handler f28508a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f28508a.post(runnable);
    }
}
