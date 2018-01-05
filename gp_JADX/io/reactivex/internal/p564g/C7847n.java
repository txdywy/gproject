package io.reactivex.internal.p564g;

import io.reactivex.p551b.C7762a;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

final class C7847n implements Runnable {
    public final long f40433a;
    public final ConcurrentLinkedQueue f40434b;
    public final C7762a f40435c;
    public final ScheduledExecutorService f40436d;
    public final Future f40437e;
    public final ThreadFactory f40438f;

    C7847n(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        Future scheduleWithFixedDelay;
        ScheduledExecutorService scheduledExecutorService = null;
        this.f40433a = timeUnit != null ? timeUnit.toNanos(j) : 0;
        this.f40434b = new ConcurrentLinkedQueue();
        this.f40435c = new C7762a();
        this.f40438f = threadFactory;
        if (timeUnit != null) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, C7846m.f40427b);
            scheduledExecutorService = newScheduledThreadPool;
            scheduleWithFixedDelay = newScheduledThreadPool.scheduleWithFixedDelay(this, this.f40433a, this.f40433a, TimeUnit.NANOSECONDS);
        } else {
            scheduleWithFixedDelay = null;
        }
        this.f40436d = scheduledExecutorService;
        this.f40437e = scheduleWithFixedDelay;
    }

    public final void run() {
        if (!this.f40434b.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = this.f40434b.iterator();
            while (it.hasNext()) {
                C7849p c7849p = (C7849p) it.next();
                if (c7849p.f40443a > nanoTime) {
                    return;
                }
                if (this.f40434b.remove(c7849p)) {
                    this.f40435c.mo6532b(c7849p);
                }
            }
        }
    }

    final C7849p m37708a() {
        if (this.f40435c.f40282b) {
            return C7846m.f40429d;
        }
        C7849p c7849p;
        while (!this.f40434b.isEmpty()) {
            c7849p = (C7849p) this.f40434b.poll();
            if (c7849p != null) {
                return c7849p;
            }
        }
        c7849p = new C7849p(this.f40438f);
        this.f40435c.mo6531a(c7849p);
        return c7849p;
    }

    final void m37709b() {
        this.f40435c.mo6530a();
        if (this.f40437e != null) {
            this.f40437e.cancel(true);
        }
        if (this.f40436d != null) {
            this.f40436d.shutdownNow();
        }
    }
}
