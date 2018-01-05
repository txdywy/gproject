package io.reactivex.internal.p564g;

import io.reactivex.C7757j;
import io.reactivex.internal.p552a.C7795c;
import io.reactivex.internal.p557b.C7811n;
import io.reactivex.p551b.C7756b;
import io.reactivex.p551b.C7764d;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

final class ae extends C7757j implements C7756b {
    public final PriorityBlockingQueue f40388a = new PriorityBlockingQueue();
    public final AtomicInteger f40389b = new AtomicInteger();
    public final AtomicInteger f40390c = new AtomicInteger();
    public volatile boolean f40391d;

    ae() {
    }

    public final C7756b mo6564a(Runnable runnable) {
        return m37681a(runnable, C7757j.m37533a(TimeUnit.MILLISECONDS));
    }

    public final C7756b mo6529a(Runnable runnable, long j, TimeUnit timeUnit) {
        long a = C7757j.m37533a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
        return m37681a(new ac(runnable, this, a), a);
    }

    private final C7756b m37681a(Runnable runnable, long j) {
        if (this.f40391d) {
            return C7795c.INSTANCE;
        }
        ad adVar = new ad(runnable, Long.valueOf(j), this.f40390c.incrementAndGet());
        this.f40388a.add(adVar);
        if (this.f40389b.getAndIncrement() == 0) {
            int i = 1;
            while (true) {
                adVar = (ad) this.f40388a.poll();
                if (adVar == null) {
                    int addAndGet = this.f40389b.addAndGet(-i);
                    if (addAndGet == 0) {
                        return C7795c.INSTANCE;
                    }
                    i = addAndGet;
                } else if (!adVar.f40387d) {
                    adVar.f40384a.run();
                }
            }
        } else {
            Object afVar = new af(this, adVar);
            C7811n.m37615a(afVar, "run is null");
            return new C7764d(afVar);
        }
    }

    public final void mo6530a() {
        this.f40391d = true;
    }
}
