package io.reactivex.internal.p564g;

import io.reactivex.C7757j;
import io.reactivex.internal.p552a.C7761a;
import io.reactivex.internal.p552a.C7795c;
import io.reactivex.p551b.C7756b;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class C7837r extends C7757j implements C7756b {
    public final ScheduledExecutorService f40408b;
    public volatile boolean f40409c;

    public C7837r(ThreadFactory threadFactory) {
        this.f40408b = C7856x.m37716a(threadFactory);
    }

    public final C7756b mo6564a(Runnable runnable) {
        return mo6529a(runnable, 0, null);
    }

    public final C7756b mo6529a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f40409c) {
            return C7795c.INSTANCE;
        }
        return m37695a(runnable, j, timeUnit, null);
    }

    public final C7756b m37697b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future submit;
        Object c7854v = new C7854v(C7773a.m37566a(runnable));
        if (j <= 0) {
            try {
                submit = this.f40408b.submit(c7854v);
            } catch (Throwable e) {
                C7773a.m37567a(e);
                return C7795c.INSTANCE;
            }
        }
        submit = this.f40408b.schedule(c7854v, j, timeUnit);
        c7854v.m37675a(submit);
        return c7854v;
    }

    public final C7855w m37695a(Runnable runnable, long j, TimeUnit timeUnit, C7761a c7761a) {
        Object c7855w = new C7855w(C7773a.m37566a(runnable), c7761a);
        if (c7761a == null || c7761a.mo6531a(c7855w)) {
            Future submit;
            if (j <= 0) {
                try {
                    submit = this.f40408b.submit(c7855w);
                } catch (Throwable e) {
                    if (c7761a != null) {
                        c7761a.mo6532b(c7855w);
                    }
                    C7773a.m37567a(e);
                }
            } else {
                submit = this.f40408b.schedule(c7855w, j, timeUnit);
            }
            c7855w.m37715a(submit);
        }
        return c7855w;
    }

    public final void mo6530a() {
        if (!this.f40409c) {
            this.f40409c = true;
            this.f40408b.shutdownNow();
        }
    }
}
