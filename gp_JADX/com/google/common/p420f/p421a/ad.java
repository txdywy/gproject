package com.google.common.p420f.p421a;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ad {
    public static final Logger f34385a = Logger.getLogger(ad.class.getName());
    public ae f34386b;
    public boolean f34387c;

    static void m31862a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            f34385a.logp(Level.SEVERE, "com.google.common.util.concurrent.ExecutionList", "executeListener", new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), e);
        }
    }
}
