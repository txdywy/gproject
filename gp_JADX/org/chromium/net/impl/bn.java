package org.chromium.net.impl;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class bn implements Executor {
    public final Executor f40861a;
    public final Runnable f40862b = new bo(this);
    public final ArrayDeque f40863c = new ArrayDeque();
    public boolean f40864d;

    bn(Executor executor) {
        this.f40861a = executor;
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f40863c) {
            this.f40863c.addLast(runnable);
            try {
                this.f40861a.execute(this.f40862b);
            } catch (RejectedExecutionException e) {
                this.f40863c.removeLast();
            }
        }
    }
}
