package com.google.android.gms.internal;

import com.google.android.gms.ads.p270c.C4909c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C5302b
public final class ay implements Future {
    public final Object f26495a = new Object();
    public Object f26496b;
    public Throwable f26497c;
    public boolean f26498d;
    public boolean f26499e;
    public final at f26500f = new at();

    public final void m24197a(Throwable th) {
        synchronized (this.f26495a) {
            if (this.f26499e) {
            } else if (m24198a()) {
                C4909c.m22927a().f25264d.m24772a(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
            } else {
                this.f26497c = th;
                this.f26495a.notifyAll();
                this.f26500f.m24196a();
            }
        }
    }

    final boolean m24198a() {
        return this.f26497c != null || this.f26498d;
    }

    public final boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f26495a) {
            if (m24198a()) {
                return false;
            }
            this.f26499e = true;
            this.f26498d = true;
            this.f26495a.notifyAll();
            this.f26500f.m24196a();
            return true;
        }
    }

    public final Object get() {
        Object obj;
        synchronized (this.f26495a) {
            if (!m24198a()) {
                try {
                    this.f26495a.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f26497c != null) {
                throw new ExecutionException(this.f26497c);
            } else if (this.f26499e) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else {
                obj = this.f26496b;
            }
        }
        return obj;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        Object obj;
        synchronized (this.f26495a) {
            if (!m24198a()) {
                try {
                    long toMillis = timeUnit.toMillis(j);
                    if (toMillis != 0) {
                        this.f26495a.wait(toMillis);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f26497c != null) {
                throw new ExecutionException(this.f26497c);
            } else if (!this.f26498d) {
                throw new TimeoutException("SettableFuture timed out.");
            } else if (this.f26499e) {
                throw new CancellationException("SettableFuture was cancelled.");
            } else {
                obj = this.f26496b;
            }
        }
        return obj;
    }

    public final boolean isCancelled() {
        boolean z;
        synchronized (this.f26495a) {
            z = this.f26499e;
        }
        return z;
    }

    public final boolean isDone() {
        boolean a;
        synchronized (this.f26495a) {
            a = m24198a();
        }
        return a;
    }
}
