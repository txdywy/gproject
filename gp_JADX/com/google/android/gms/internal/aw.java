package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class aw implements Executor {
    public final Handler f26494a = new Handler(Looper.getMainLooper());

    aw() {
    }

    public final void execute(Runnable runnable) {
        this.f26494a.post(runnable);
    }
}
