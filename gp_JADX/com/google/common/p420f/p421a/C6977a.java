package com.google.common.p420f.p421a;

import com.google.common.p414a.C6927b;
import com.google.common.p414a.C6935k;
import com.google.common.p414a.C6937m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C6977a extends af {
    public static final boolean f34371a = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger f34372b = Logger.getLogger(C6977a.class.getName());
    public static final C6984b f34373c;
    public static final Object f34374d = new Object();
    public volatile C6989f listeners;
    public volatile Object value;
    public volatile C6995m waiters;

    private final void m31833a(C6995m c6995m) {
        c6995m.thread = null;
        while (true) {
            C6995m c6995m2 = this.waiters;
            if (c6995m2 != C6995m.f34436a) {
                C6995m c6995m3 = null;
                while (c6995m2 != null) {
                    C6995m c6995m4 = c6995m2.next;
                    if (c6995m2.thread == null) {
                        if (c6995m3 != null) {
                            c6995m3.next = c6995m4;
                            if (c6995m3.thread == null) {
                            }
                        } else if (f34373c.mo5950a(this, c6995m2, c6995m4)) {
                        }
                        c6995m2 = c6995m3;
                    }
                    c6995m3 = c6995m2;
                    c6995m2 = c6995m4;
                }
                return;
            }
            return;
        }
    }

    protected C6977a() {
    }

    public Object get(long j, TimeUnit timeUnit) {
        long toNanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (((obj != null ? 1 : 0) & (!(obj instanceof C6991h) ? 1 : 0)) != 0) {
            return C6977a.mo5952b(obj);
        }
        long nanoTime;
        long j2;
        Object obj2;
        if (toNanos > 0) {
            nanoTime = System.nanoTime() + toNanos;
        } else {
            nanoTime = 0;
        }
        if (toNanos >= 1000) {
            C6995m c6995m = this.waiters;
            if (c6995m != C6995m.f34436a) {
                C6995m c6995m2 = new C6995m((byte) 0);
                do {
                    c6995m2.m31922a(c6995m);
                    if (f34373c.mo5950a(this, c6995m, c6995m2)) {
                        j2 = toNanos;
                        do {
                            LockSupport.parkNanos(this, j2);
                            if (Thread.interrupted()) {
                                m31833a(c6995m2);
                                throw new InterruptedException();
                            }
                            obj2 = this.value;
                            if (((obj2 != null ? 1 : 0) & (!(obj2 instanceof C6991h) ? 1 : 0)) != 0) {
                                return C6977a.mo5952b(obj2);
                            }
                            j2 = nanoTime - System.nanoTime();
                        } while (j2 >= 1000);
                        m31833a(c6995m2);
                    } else {
                        c6995m = this.waiters;
                    }
                } while (c6995m != C6995m.f34436a);
            }
            return C6977a.mo5952b(this.value);
        }
        j2 = toNanos;
        while (j2 > 0) {
            obj2 = this.value;
            if (((obj2 != null ? 1 : 0) & (!(obj2 instanceof C6991h) ? 1 : 0)) != 0) {
                return C6977a.mo5952b(obj2);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            j2 = nanoTime - System.nanoTime();
        }
        String c6977a = toString();
        if (isDone()) {
            String a = C6927b.m31615a(timeUnit.toString());
            throw new TimeoutException(new StringBuilder(String.valueOf(a).length() + 68).append("Waited ").append(j).append(" ").append(a).append(" but future completed as timeout expired").toString());
        }
        String a2 = C6927b.m31615a(timeUnit.toString());
        throw new TimeoutException(new StringBuilder((String.valueOf(a2).length() + 33) + String.valueOf(c6977a).length()).append("Waited ").append(j).append(" ").append(a2).append(" for ").append(c6977a).toString());
    }

    public Object get() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if (((obj != null ? 1 : 0) & (!(obj instanceof C6991h) ? 1 : 0)) != 0) {
            return C6977a.mo5952b(obj);
        }
        C6995m c6995m = this.waiters;
        if (c6995m != C6995m.f34436a) {
            C6995m c6995m2 = new C6995m((byte) 0);
            do {
                c6995m2.m31922a(c6995m);
                if (f34373c.mo5950a(this, c6995m, c6995m2)) {
                    Object obj2;
                    int i;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m31833a(c6995m2);
                            throw new InterruptedException();
                        }
                        obj2 = this.value;
                        if (obj2 != null) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } while ((i & (!(obj2 instanceof C6991h) ? 1 : 0)) == 0);
                    return C6977a.mo5952b(obj2);
                }
                c6995m = this.waiters;
            } while (c6995m != C6995m.f34436a);
        }
        return C6977a.mo5952b(this.value);
    }

    private static Object mo5952b(Object obj) {
        if (obj instanceof C6986c) {
            Throwable th = ((C6986c) obj).f34417d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C6987d) {
            throw new ExecutionException(((C6987d) obj).f34419b);
        } else if (obj == f34374d) {
            return null;
        } else {
            return obj;
        }
    }

    public boolean isDone() {
        int i = 1;
        Object obj = this.value;
        int i2 = obj != null ? 1 : 0;
        if (obj instanceof C6991h) {
            i = 0;
        }
        return i2 & i;
    }

    public boolean isCancelled() {
        return this.value instanceof C6986c;
    }

    public boolean cancel(boolean z) {
        Object obj = this.value;
        if (((obj == null ? 1 : 0) | (obj instanceof C6991h)) == 0) {
            return false;
        }
        if (f34371a) {
            Object c6986c = new C6986c(z, new CancellationException("Future.cancel() was called."));
        } else if (z) {
            r3 = C6986c.f34414a;
        } else {
            r3 = C6986c.f34415b;
        }
        Object obj2 = obj;
        boolean z2 = false;
        while (true) {
            if (f34373c.mo5951a(this, obj2, c6986c)) {
                C6977a.m31832a(this);
                if (!(obj2 instanceof C6991h)) {
                    return true;
                }
                au auVar = ((C6991h) obj2).f34429b;
                if (auVar instanceof C6980j) {
                    int i;
                    C6977a c6977a = (C6977a) auVar;
                    obj = c6977a.value;
                    if (obj == null) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i | (obj instanceof C6991h)) == 0) {
                        return true;
                    }
                    this = c6977a;
                    obj2 = obj;
                    z2 = true;
                } else {
                    auVar.cancel(z);
                    return true;
                }
            }
            obj2 = this.value;
            if (!(obj2 instanceof C6991h)) {
                return z2;
            }
        }
    }

    protected final boolean m31839a() {
        Object obj = this.value;
        return (obj instanceof C6986c) && ((C6986c) obj).f34416c;
    }

    public final void mo5927a(Runnable runnable, Executor executor) {
        C6937m.m31624a((Object) runnable, (Object) "Runnable was null.");
        C6937m.m31624a((Object) executor, (Object) "Executor was null.");
        C6989f c6989f = this.listeners;
        if (c6989f != C6989f.f34420a) {
            C6989f c6989f2 = new C6989f(runnable, executor);
            do {
                c6989f2.next = c6989f;
                if (!f34373c.mo5949a(this, c6989f, c6989f2)) {
                    c6989f = this.listeners;
                } else {
                    return;
                }
            } while (c6989f != C6989f.f34420a);
        }
        C6977a.m31837b(runnable, executor);
    }

    protected boolean mo5942a(Object obj) {
        if (obj == null) {
            obj = f34374d;
        }
        if (!f34373c.mo5951a(this, null, obj)) {
            return false;
        }
        C6977a.m31832a(this);
        return true;
    }

    protected boolean mo5943a(Throwable th) {
        if (!f34373c.mo5951a(this, null, new C6987d((Throwable) C6937m.m31623a((Object) th)))) {
            return false;
        }
        C6977a.m31832a(this);
        return true;
    }

    protected final boolean m31840a(au auVar) {
        Object c6991h;
        C6937m.m31623a((Object) auVar);
        Object obj = this.value;
        if (obj == null) {
            if (auVar.isDone()) {
                if (!f34373c.mo5951a(this, null, C6977a.m31835b(auVar))) {
                    return false;
                }
                C6977a.m31832a(this);
                return true;
            }
            c6991h = new C6991h(this, auVar);
            if (f34373c.mo5951a(this, null, c6991h)) {
                try {
                    auVar.mo5927a(c6991h, ba.f34405a);
                } catch (Throwable th) {
                    obj = C6987d.f34418a;
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof C6986c) {
            auVar.cancel(((C6986c) obj).f34416c);
        }
        return false;
        f34373c.mo5951a(this, c6991h, obj);
        return true;
    }

    static Object m31835b(au auVar) {
        if (auVar instanceof C6980j) {
            Object obj = ((C6977a) auVar).value;
            if (!(obj instanceof C6986c)) {
                return obj;
            }
            C6986c c6986c = (C6986c) obj;
            if (!c6986c.f34416c) {
                return obj;
            }
            if (c6986c.f34417d != null) {
                c6986c = new C6986c(false, c6986c.f34417d);
            } else {
                c6986c = C6986c.f34415b;
            }
            return c6986c;
        }
        Object a;
        try {
            a = ak.m31879a((Future) auVar);
            if (a == null) {
                a = f34374d;
            }
        } catch (ExecutionException e) {
            a = new C6987d(e.getCause());
        } catch (Throwable e2) {
            a = new C6986c(false, e2);
        } catch (Throwable e22) {
            a = new C6987d(e22);
        }
        return a;
    }

    static void m31832a(C6977a c6977a) {
        Thread thread = null;
        while (true) {
            C6995m c6995m = c6977a.waiters;
            if (f34373c.mo5950a(c6977a, c6995m, C6995m.f34436a)) {
                C6989f c6989f;
                C6989f c6989f2;
                while (c6995m != null) {
                    Thread thread2 = c6995m.thread;
                    if (thread2 != null) {
                        c6995m.thread = null;
                        LockSupport.unpark(thread2);
                    }
                    c6995m = c6995m.next;
                }
                c6977a.mo5933b();
                do {
                    c6989f = c6977a.listeners;
                } while (!f34373c.mo5949a(c6977a, c6989f, C6989f.f34420a));
                Thread thread3 = thread;
                C6989f c6989f3 = c6989f;
                c6989f = thread3;
                while (c6989f3 != null) {
                    c6989f2 = c6989f3.next;
                    c6989f3.next = c6989f;
                    c6989f = c6989f3;
                    c6989f3 = c6989f2;
                }
                c6989f2 = c6989f;
                while (c6989f2 != null) {
                    c6989f = c6989f2.next;
                    Runnable runnable = c6989f2.f34421b;
                    if (runnable instanceof C6991h) {
                        Object obj = (C6991h) runnable;
                        c6977a = obj.f34428a;
                        if (c6977a.value == obj) {
                            if (f34373c.mo5951a(c6977a, obj, C6977a.m31835b(obj.f34429b))) {
                                thread = c6989f;
                            }
                        }
                        c6989f2 = c6989f;
                    } else {
                        C6977a.m31837b(runnable, c6989f2.f34422c);
                        c6989f2 = c6989f;
                    }
                }
                return;
            }
        }
    }

    protected void mo5933b() {
    }

    public String toString() {
        StringBuilder append = new StringBuilder().append(super.toString()).append("[status=");
        if (isCancelled()) {
            append.append("CANCELLED");
        } else if (isDone()) {
            m31834a(append);
        } else {
            String c;
            try {
                c = mo5934c();
            } catch (RuntimeException e) {
                c = String.valueOf(e.getClass());
                c = new StringBuilder(String.valueOf(c).length() + 38).append("Exception thrown from implementation: ").append(c).toString();
            }
            if (!C6935k.m31621a(c)) {
                append.append("PENDING, info=[").append(c).append("]");
            } else if (isDone()) {
                m31834a(append);
            } else {
                append.append("PENDING");
            }
        }
        return append.append("]").toString();
    }

    protected String mo5934c() {
        Object obj = this.value;
        if (obj instanceof C6991h) {
            String valueOf = String.valueOf(((C6991h) obj).f34429b);
            return new StringBuilder(String.valueOf(valueOf).length() + 12).append("setFuture=[").append(valueOf).append("]").toString();
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    private final void m31834a(StringBuilder stringBuilder) {
        try {
            stringBuilder.append("SUCCESS, result=[").append(ak.m31879a((Future) this)).append("]");
        } catch (ExecutionException e) {
            stringBuilder.append("FAILURE, cause=[").append(e.getCause()).append("]");
        } catch (CancellationException e2) {
            stringBuilder.append("CANCELLED");
        } catch (RuntimeException e3) {
            stringBuilder.append("UNKNOWN, cause=[").append(e3.getClass()).append(" thrown from get()]");
        }
    }

    private static void m31837b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            f34372b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), e);
        }
    }

    static {
        C6984b c6993k;
        Throwable th;
        Throwable th2 = null;
        try {
            c6993k = new C6993k();
            th = null;
        } catch (Throwable th3) {
            th2 = th3;
            th = th;
            c6993k = new C6992i();
        }
        f34373c = c6993k;
        if (th2 != null) {
            f34372b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            f34372b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }
}
