package io.reactivex.internal.p564g;

import io.reactivex.C7754h;
import io.reactivex.C7757j;
import io.reactivex.internal.p552a.C7795c;
import io.reactivex.p551b.C7756b;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class C7858z extends C7754h {
    public static final C7852t f40455c = new C7852t("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    public static final ScheduledExecutorService f40456d;
    public final ThreadFactory f40457a;
    public final AtomicReference f40458b;

    public C7858z() {
        this(f40455c);
    }

    private C7858z(ThreadFactory threadFactory) {
        this.f40458b = new AtomicReference();
        this.f40457a = threadFactory;
        this.f40458b.lazySet(C7856x.m37716a(threadFactory));
    }

    public final void mo6565b() {
        ScheduledExecutorService scheduledExecutorService = null;
        ScheduledExecutorService scheduledExecutorService2;
        do {
            scheduledExecutorService2 = (ScheduledExecutorService) this.f40458b.get();
            if (scheduledExecutorService2 != f40456d) {
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService == null) {
                scheduledExecutorService = C7856x.m37716a(this.f40457a);
            }
        } while (!this.f40458b.compareAndSet(scheduledExecutorService2, scheduledExecutorService));
    }

    public final C7757j mo6528a() {
        return new aa((ScheduledExecutorService) this.f40458b.get());
    }

    public final C7756b mo6527a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future submit;
        Callable c7854v = new C7854v(C7773a.m37566a(runnable));
        if (j <= 0) {
            try {
                submit = ((ScheduledExecutorService) this.f40458b.get()).submit(c7854v);
            } catch (Throwable e) {
                C7773a.m37567a(e);
                return C7795c.INSTANCE;
            }
        }
        submit = ((ScheduledExecutorService) this.f40458b.get()).schedule(c7854v, j, timeUnit);
        c7854v.m37675a(submit);
        return c7854v;
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f40456d = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }
}
