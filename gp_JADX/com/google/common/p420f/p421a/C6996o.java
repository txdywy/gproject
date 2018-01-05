package com.google.common.p420f.p421a;

import com.google.common.p414a.C6930e;
import com.google.common.p414a.C6937m;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

abstract class C6996o extends C6980j implements Runnable {
    public au f34437e;
    public Object f34438f;

    static au m31924a(au auVar, C6983y c6983y, Executor executor) {
        C6937m.m31623a((Object) executor);
        au c6997p = new C6997p(auVar, c6983y);
        auVar.mo5927a(c6997p, ax.m31890a(executor, c6997p));
        return c6997p;
    }

    abstract Object mo5953a(Object obj, Object obj2);

    abstract void mo5952b(Object obj);

    static au m31923a(au auVar, C6930e c6930e, Executor executor) {
        C6937m.m31623a((Object) c6930e);
        au c6998q = new C6998q(auVar, c6930e);
        auVar.mo5927a(c6998q, ax.m31890a(executor, c6998q));
        return c6998q;
    }

    C6996o(au auVar, Object obj) {
        this.f34437e = (au) C6937m.m31623a((Object) auVar);
        this.f34438f = C6937m.m31623a(obj);
    }

    public final void run() {
        int i;
        int i2 = 1;
        Future future = this.f34437e;
        Object obj = this.f34438f;
        boolean isCancelled = isCancelled();
        if (future == null) {
            i = 1;
        } else {
            i = 0;
        }
        i |= isCancelled;
        if (obj != null) {
            i2 = 0;
        }
        if ((i2 | i) == 0) {
            this.f34437e = null;
            this.f34438f = null;
            try {
                try {
                    mo5952b(mo5953a(obj, ak.m31879a(future)));
                } catch (UndeclaredThrowableException e) {
                    mo5943a(e.getCause());
                } catch (Throwable th) {
                    mo5943a(th);
                }
            } catch (CancellationException e2) {
                cancel(false);
            } catch (ExecutionException e3) {
                mo5943a(e3.getCause());
            } catch (Throwable th2) {
                mo5943a(th2);
            } catch (Throwable th22) {
                mo5943a(th22);
            }
        }
    }

    protected final void mo5933b() {
        Future future = this.f34437e;
        if (((future != null ? 1 : 0) & isCancelled()) != 0) {
            future.cancel(m31839a());
        }
        this.f34437e = null;
        this.f34438f = null;
    }

    protected final String mo5934c() {
        au auVar = this.f34437e;
        Object obj = this.f34438f;
        if (auVar == null || obj == null) {
            return null;
        }
        String valueOf = String.valueOf(auVar);
        String valueOf2 = String.valueOf(obj);
        return new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(valueOf2).length()).append("inputFuture=[").append(valueOf).append("], function=[").append(valueOf2).append("]").toString();
    }
}
