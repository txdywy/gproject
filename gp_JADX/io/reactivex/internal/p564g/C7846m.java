package io.reactivex.internal.p564g;

import io.reactivex.C7754h;
import io.reactivex.C7757j;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class C7846m extends C7754h {
    public static final C7852t f40426a;
    public static final C7852t f40427b;
    public static final TimeUnit f40428c = TimeUnit.SECONDS;
    public static final C7849p f40429d;
    public static final C7847n f40430g;
    public final ThreadFactory f40431e;
    public final AtomicReference f40432f;

    public C7846m() {
        this(f40426a);
    }

    private C7846m(ThreadFactory threadFactory) {
        this.f40431e = threadFactory;
        this.f40432f = new AtomicReference(f40430g);
        mo6565b();
    }

    public final void mo6565b() {
        C7847n c7847n = new C7847n(60, f40428c, this.f40431e);
        if (!this.f40432f.compareAndSet(f40430g, c7847n)) {
            c7847n.m37709b();
        }
    }

    public final C7757j mo6528a() {
        return new C7848o((C7847n) this.f40432f.get());
    }

    static {
        C7837r c7849p = new C7849p(new C7852t("RxCachedThreadSchedulerShutdown"));
        f40429d = c7849p;
        c7849p.mo6530a();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f40426a = new C7852t("RxCachedThreadScheduler", max);
        f40427b = new C7852t("RxCachedWorkerPoolEvictor", max);
        C7847n c7847n = new C7847n(0, null, f40426a);
        f40430g = c7847n;
        c7847n.m37709b();
    }
}
