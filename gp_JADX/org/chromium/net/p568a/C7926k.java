package org.chromium.net.p568a;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

final class C7926k implements Executor {
    public final BlockingQueue f40645a = new LinkedBlockingQueue();
    public boolean f40646b = false;
    public boolean f40647c = false;

    C7926k() {
    }

    private final Runnable m37925a(boolean z, long j) {
        Runnable runnable;
        if (z) {
            runnable = (Runnable) this.f40645a.poll(j, TimeUnit.NANOSECONDS);
        } else {
            try {
                runnable = (Runnable) this.f40645a.take();
            } catch (Throwable e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException();
                interruptedIOException.initCause(e);
                throw interruptedIOException;
            }
        }
        if (runnable != null) {
            return runnable;
        }
        throw new SocketTimeoutException();
    }

    public final void m37926a(int i) {
        InterruptedIOException e;
        long nanoTime = System.nanoTime();
        long convert = TimeUnit.NANOSECONDS.convert((long) i, TimeUnit.MILLISECONDS);
        if (this.f40647c) {
            throw new IllegalStateException("Cannot run loop as an exception has occurred previously.");
        } else if (this.f40646b) {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        } else {
            this.f40646b = true;
            while (this.f40646b) {
                if (i == 0) {
                    try {
                        m37925a(false, 0).run();
                    } catch (InterruptedIOException e2) {
                        e = e2;
                    } catch (RuntimeException e3) {
                        e = e3;
                    }
                } else {
                    m37925a(true, (convert - System.nanoTime()) + nanoTime).run();
                }
            }
            return;
        }
        this.f40646b = false;
        this.f40647c = true;
        throw e;
    }

    public final void execute(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.f40645a.put(runnable);
        } catch (Throwable e) {
            throw new RejectedExecutionException(e);
        }
    }
}
