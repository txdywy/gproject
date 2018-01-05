package com.google.android.finsky.p108z.p266a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class C4829r implements Executor {
    public static final Handler f25110a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        f25110a.post(runnable);
    }
}
