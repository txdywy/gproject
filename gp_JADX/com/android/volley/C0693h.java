package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

final class C0693h implements Executor {
    public final /* synthetic */ Handler f4155a;

    C0693h(Handler handler) {
        this.f4155a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f4155a.post(runnable);
    }
}
