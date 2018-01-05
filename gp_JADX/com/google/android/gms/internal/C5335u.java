package com.google.android.gms.internal;

import java.util.concurrent.Future;

final class C5335u implements Runnable {
    public /* synthetic */ ay f27508a;
    public /* synthetic */ Future f27509b;

    C5335u(ay ayVar, Future future) {
        this.f27508a = ayVar;
        this.f27509b = future;
    }

    public final void run() {
        if (this.f27508a.isCancelled()) {
            this.f27509b.cancel(true);
        }
    }
}
