package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class C5333s implements Callable {
    public /* synthetic */ Runnable f27447a;

    C5333s(Runnable runnable) {
        this.f27447a = runnable;
    }

    public final /* synthetic */ Object call() {
        this.f27447a.run();
        return null;
    }
}
