package com.android.volley.p060a;

import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ag implements C0657w, C0660x, Future {
    public C0656n f4056a;
    public boolean f4057b = false;
    public Object f4058c;
    public VolleyError f4059d;

    public final synchronized boolean cancel(boolean z) {
        boolean z2 = false;
        synchronized (this) {
            if (this.f4056a != null) {
                if (!isDone()) {
                    this.f4056a.mo1057f();
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final Object get() {
        try {
            return m4413a(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return m4413a(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    private final synchronized Object m4413a(Long l) {
        Object obj;
        if (this.f4059d != null) {
            throw new ExecutionException(this.f4059d);
        } else if (this.f4057b) {
            obj = this.f4058c;
        } else {
            if (l == null) {
                wait(0);
            } else if (l.longValue() > 0) {
                wait(l.longValue());
            }
            if (this.f4059d != null) {
                throw new ExecutionException(this.f4059d);
            } else if (this.f4057b) {
                obj = this.f4058c;
            } else {
                throw new TimeoutException();
            }
        }
        return obj;
    }

    public final boolean isCancelled() {
        if (this.f4056a == null) {
            return false;
        }
        return this.f4056a.mo1073g();
    }

    public final synchronized boolean isDone() {
        boolean z;
        z = this.f4057b || this.f4059d != null || isCancelled();
        return z;
    }

    public final synchronized void b_(Object obj) {
        this.f4057b = true;
        this.f4058c = obj;
        notifyAll();
    }

    public final synchronized void mo1062a(VolleyError volleyError) {
        this.f4059d = volleyError;
        notifyAll();
    }
}
