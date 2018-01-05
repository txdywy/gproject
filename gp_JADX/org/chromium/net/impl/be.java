package org.chromium.net.impl;

import java.util.concurrent.Executor;

final class be implements Executor {
    public final Executor f40836a;

    be(Executor executor) {
        this.f40836a = executor;
    }

    public final void execute(Runnable runnable) {
        bf bfVar = new bf(runnable, Thread.currentThread());
        this.f40836a.execute(bfVar);
        if (bfVar.f40839c != null) {
            throw bfVar.f40839c;
        }
        bfVar.f40838b = null;
    }
}
