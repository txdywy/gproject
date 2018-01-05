package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final class ax implements Executor {
    ax() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
