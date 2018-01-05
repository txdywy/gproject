package com.android.volley.a;

import com.android.volley.VolleyError;
import com.android.volley.n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final synchronized class com.android.volley.a.ag implements com.android.volley.w, com.android.volley.x, Future
{

    public com.android.volley.n a;
    public boolean b;
    public Object c;
    public VolleyError d;

    ag() {
        this.b = 0;
    }

    private final synchronized Object a(Long p0) {
  2:    enter this;
  3:    try {
  5:        if (this.d != 0)
 14:            throw new ExecutionException(this.d);
        }
        catch (Throwable ex) {
 16:        exit this;
 17:        throw ex;
        }
  6:    goto 18;
 16:    exit this;
 17:    throw ex;
 20:    if (this.b == 0) goto 26;
 22:    v0 = this.c;
 24:    exit this;
 25:    return v0;
 26:    if (p0 != 0) goto 45;
 30:    this.wait(0);
 35:    if (this.d != 0)
 44:        throw new ExecutionException(this.d);
 36:    goto 61;
 51:    if (p0.longValue() > 0)
 57:        this.wait(p0.longValue());
 60:    goto 33;
 63:    if (this.b == 0)
 70:        throw new TimeoutException();
 71:    v0 = this.c;
 73:    goto 24;
 74:    try
            run 30...73
        catch (Throwable ex) {
 30:        goto 15;
        }
 75:    try
            run 18...24
        catch (Throwable ex) {
 18:        goto 15;
        }
    }

    public final synchronized void a(VolleyError p0) {
        enter this;
        try {
            this.d = p0;
            this.notifyAll();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void b_(Object p0) {
        enter this;
        try {
            this.b = 1;
            this.c = p0;
            this.notifyAll();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized boolean cancel(boolean p0) {
        v0 = 0;
        enter this;
        try {
            if (this.a == 0) {
            }
            else {
                try {
                    if (!this.isDone()) {
                        this.a.f();
                        v0 = 1;
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    public final Object get() {
        try {
            return this.a(0);
        }
        catch (TimeoutException ex) {
            throw new AssertionError(ex);
        }
    }

    public final Object get(long p0, TimeUnit p2) {
        return this.a(Long.valueOf(TimeUnit.MILLISECONDS.convert(p0, p2)));
    }

    public final boolean isCancelled() {
        if (this.a == 0)
            v0 = 0;
        else
            v0 = this.a.g();
        return v0;
    }

    public final synchronized boolean isDone() {
        enter this;
        try {
            if (this.b != 0 || this.d != 0 || this.isCancelled())
                v0 = 1;
            else
                v0 = 0;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

}
