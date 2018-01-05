package com.google.common.p420f.p421a;

import java.util.concurrent.atomic.AtomicReference;

abstract class as extends AtomicReference implements Runnable {
    public static final Runnable f34397a = new at();
    public static final Runnable f34398b = new at();

    as() {
    }

    abstract void mo5944a(Object obj, Throwable th);

    abstract boolean mo5945a();

    abstract Object mo5946b();

    public final void run() {
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            Object b;
            Object obj = !mo5945a() ? 1 : null;
            if (obj != null) {
                try {
                    b = mo5946b();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f34397a)) {
                        while (get() == f34398b) {
                            Thread.yield();
                        }
                    }
                    if (obj != null) {
                        mo5944a(null, null);
                    }
                }
            } else {
                b = null;
            }
            if (!compareAndSet(currentThread, f34397a)) {
                while (get() == f34398b) {
                    Thread.yield();
                }
            }
            if (obj != null) {
                mo5944a(b, null);
            }
        }
    }
}
