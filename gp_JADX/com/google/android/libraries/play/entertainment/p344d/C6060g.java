package com.google.android.libraries.play.entertainment.p344d;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class C6060g implements Executor {
    public final Handler f30189a = new Handler(Looper.getMainLooper());

    C6060g() {
    }

    public final void execute(Runnable runnable) {
        this.f30189a.post(runnable);
    }
}
