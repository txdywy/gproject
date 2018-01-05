package com.google.android.finsky.splitinstallservice;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class C4197a {
    public final Executor f21149a = Executors.newSingleThreadScheduledExecutor(C4199b.f21226a);

    final void m19541a(Runnable runnable) {
        this.f21149a.execute(new C4200c(runnable));
    }
}
