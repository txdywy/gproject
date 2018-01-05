package com.google.common.p420f.p421a;

import com.google.common.p414a.C6937m;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class bc extends bb implements aw, ScheduledExecutorService {
    public final ScheduledExecutorService f34408b;

    public bc(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f34408b = (ScheduledExecutorService) C6937m.m31623a((Object) scheduledExecutorService);
    }

    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object beVar = new be(runnable);
        return new bd(beVar, this.f34408b.scheduleWithFixedDelay(beVar, j, j2, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Object beVar = new be(runnable);
        return new bd(beVar, this.f34408b.scheduleAtFixedRate(beVar, j, j2, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        Object a = bg.m31900a(callable);
        return new bd(a, this.f34408b.schedule(a, j, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Object a = bg.m31899a(runnable, null);
        return new bd(a, this.f34408b.schedule(a, j, timeUnit));
    }
}
