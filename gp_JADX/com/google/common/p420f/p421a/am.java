package com.google.common.p420f.p421a;

import com.google.common.p414a.C6932g;
import com.google.common.p414a.C6933h;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class am implements Runnable {
    public final Future f34392a;
    public final aj f34393b;

    am(Future future, aj ajVar) {
        this.f34392a = future;
        this.f34393b = ajVar;
    }

    public final void run() {
        Throwable e;
        try {
            this.f34393b.m31872a(ak.m31879a(this.f34392a));
        } catch (ExecutionException e2) {
            this.f34393b.m31873a(e2.getCause());
        } catch (RuntimeException e3) {
            e = e3;
            this.f34393b.m31873a(e);
        } catch (Error e4) {
            e = e4;
            this.f34393b.m31873a(e);
        }
    }

    public final String toString() {
        C6932g c6932g = new C6932g(getClass().getSimpleName());
        aj ajVar = this.f34393b;
        C6933h c6933h = new C6933h();
        c6932g.f34262c.f34266c = c6933h;
        c6932g.f34262c = c6933h;
        c6933h.f34265b = ajVar;
        return c6932g.toString();
    }
}
