package com.google.android.libraries.bind.p323a;

import java.util.concurrent.Executor;

final class C5865k implements Executor {
    public final /* synthetic */ C5864j f29384a;

    C5865k(C5864j c5864j) {
        this.f29384a = c5864j;
    }

    public final void execute(Runnable runnable) {
        if (C5855a.m27295b()) {
            this.f29384a.execute(runnable);
        } else {
            runnable.run();
        }
    }
}
