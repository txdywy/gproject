package io.reactivex.internal.p564g;

import io.reactivex.C7757j;
import io.reactivex.internal.p552a.C7791b;
import io.reactivex.internal.p552a.C7795c;
import io.reactivex.internal.p552a.C7797e;
import io.reactivex.internal.p563f.C7830a;
import io.reactivex.p551b.C7756b;
import io.reactivex.p551b.C7762a;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class C7843j extends C7757j implements Runnable {
    public final Executor f40417a;
    public final C7830a f40418b;
    public volatile boolean f40419c;
    public final AtomicInteger f40420d = new AtomicInteger();
    public final C7762a f40421e = new C7762a();

    public C7843j(Executor executor) {
        this.f40417a = executor;
        this.f40418b = new C7830a();
    }

    public final C7756b mo6564a(Runnable runnable) {
        if (this.f40419c) {
            return C7795c.INSTANCE;
        }
        Object c7844k = new C7844k(C7773a.m37566a(runnable));
        this.f40418b.mo6537a(c7844k);
        if (this.f40420d.getAndIncrement() != 0) {
            return c7844k;
        }
        try {
            this.f40417a.execute(this);
            return c7844k;
        } catch (Throwable e) {
            this.f40419c = true;
            this.f40418b.mo6540d();
            C7773a.m37567a(e);
            return C7795c.INSTANCE;
        }
    }

    public final C7756b mo6529a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return mo6564a(runnable);
        }
        if (this.f40419c) {
            return C7795c.INSTANCE;
        }
        Object c7797e = new C7797e();
        C7797e c7797e2 = new C7797e(c7797e);
        C7855w c7855w = new C7855w(new C7845l(this, c7797e2, C7773a.m37566a(runnable)), this.f40421e);
        this.f40421e.mo6531a(c7855w);
        if (this.f40417a instanceof ScheduledExecutorService) {
            try {
                c7855w.m37715a(((ScheduledExecutorService) this.f40417a).schedule(c7855w, j, timeUnit));
            } catch (Throwable e) {
                this.f40419c = true;
                C7773a.m37567a(e);
                return C7795c.INSTANCE;
            }
        }
        c7855w.m37715a(new C7839f(C7840g.f40411b.mo6527a(c7855w, j, timeUnit)));
        C7791b.m37588b(c7797e, c7855w);
        return c7797e2;
    }

    public final void mo6530a() {
        if (!this.f40419c) {
            this.f40419c = true;
            this.f40421e.mo6530a();
            if (this.f40420d.getAndIncrement() == 0) {
                this.f40418b.mo6540d();
            }
        }
    }

    public final void run() {
        C7830a c7830a = this.f40418b;
        int i = 1;
        while (!this.f40419c) {
            while (true) {
                Runnable runnable = (Runnable) c7830a.mo6538b();
                if (runnable == null) {
                    break;
                }
                runnable.run();
                if (this.f40419c) {
                    c7830a.mo6540d();
                    return;
                }
            }
            if (this.f40419c) {
                c7830a.mo6540d();
                return;
            }
            int addAndGet = this.f40420d.addAndGet(-i);
            if (addAndGet != 0) {
                i = addAndGet;
            } else {
                return;
            }
        }
        c7830a.mo6540d();
    }
}
