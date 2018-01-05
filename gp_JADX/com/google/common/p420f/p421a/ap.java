package com.google.common.p420f.p421a;

import com.google.common.p414a.C6937m;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class ap extends af {
    public static final Logger f34394a = Logger.getLogger(ap.class.getName());

    ap() {
    }

    public abstract Object get();

    public final void mo5927a(Runnable runnable, Executor executor) {
        C6937m.m31624a((Object) runnable, (Object) "Runnable was null.");
        C6937m.m31624a((Object) executor, (Object) "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            f34394a.logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), e);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public Object get(long j, TimeUnit timeUnit) {
        C6937m.m31623a((Object) timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
