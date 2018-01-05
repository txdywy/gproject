package io.reactivex.internal.p564g;

import io.reactivex.C7754h;
import io.reactivex.C7757j;
import io.reactivex.p551b.C7756b;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class C7834b extends C7754h {
    public static final C7836d f40394a;
    public static final C7852t f40395b = new C7852t("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
    public static final int f40396c;
    public static final C7838e f40397d;
    public final ThreadFactory f40398e;
    public final AtomicReference f40399f;

    public C7834b() {
        this(f40395b);
    }

    private C7834b(ThreadFactory threadFactory) {
        this.f40398e = threadFactory;
        this.f40399f = new AtomicReference(f40394a);
        mo6565b();
    }

    public final C7757j mo6528a() {
        return new C7835c(((C7836d) this.f40399f.get()).m37691a());
    }

    public final C7756b mo6527a(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C7836d) this.f40399f.get()).m37691a().m37697b(runnable, j, timeUnit);
    }

    public final void mo6565b() {
        C7836d c7836d = new C7836d(f40396c, this.f40398e);
        if (!this.f40399f.compareAndSet(f40394a, c7836d)) {
            c7836d.m37692b();
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f40396c = intValue;
        C7837r c7838e = new C7838e(new C7852t("RxComputationShutdown"));
        f40397d = c7838e;
        c7838e.mo6530a();
        C7836d c7836d = new C7836d(0, f40395b);
        f40394a = c7836d;
        c7836d.m37692b();
    }
}
