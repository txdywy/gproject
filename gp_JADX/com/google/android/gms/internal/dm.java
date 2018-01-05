package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class dm implements Executor {
    public final Handler f26658a;

    public dm(Looper looper) {
        this.f26658a = new Handler(looper);
    }

    public final void execute(Runnable runnable) {
        this.f26658a.post(runnable);
    }
}
