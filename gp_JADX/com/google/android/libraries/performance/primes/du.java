package com.google.android.libraries.performance.primes;

import com.google.android.libraries.p326c.p327a.C5916a;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class du implements ScheduledExecutorService {
    public final dx f29997a;
    public final ScheduledExecutorService f29998b;

    du(ScheduledExecutorService scheduledExecutorService, dx dxVar) {
        this.f29998b = (ScheduledExecutorService) C5916a.m27406a((Object) scheduledExecutorService);
        this.f29997a = (dx) C5916a.m27406a((Object) dxVar);
    }

    private final Runnable m27831a(Runnable runnable) {
        return new dv(this, runnable);
    }

    private final Callable m27833a(Callable callable) {
        return new dw(this, callable);
    }

    private final List m27832a(Collection collection) {
        List linkedList = new LinkedList();
        for (Callable a : collection) {
            linkedList.add(m27833a(a));
        }
        return linkedList;
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f29998b.schedule(m27831a(runnable), j, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.f29998b.schedule(m27833a(callable), j, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f29998b.scheduleAtFixedRate(m27831a(runnable), j, j2, timeUnit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.f29998b.scheduleWithFixedDelay(m27831a(runnable), j, j2, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f29998b.execute(m27831a(runnable));
    }

    public final Future submit(Runnable runnable) {
        return this.f29998b.submit(m27831a(runnable));
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f29998b.submit(m27831a(runnable), obj);
    }

    public final Future submit(Callable callable) {
        return this.f29998b.submit(m27833a(callable));
    }

    public final void shutdown() {
        this.f29998b.shutdown();
    }

    public final List shutdownNow() {
        return this.f29998b.shutdownNow();
    }

    public final boolean isShutdown() {
        return this.f29998b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f29998b.isTerminated();
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f29998b.awaitTermination(j, timeUnit);
    }

    public final Object invokeAny(Collection collection) {
        return this.f29998b.invokeAny(m27832a(collection));
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f29998b.invokeAny(m27832a(collection), j, timeUnit);
    }

    public final List invokeAll(Collection collection) {
        return this.f29998b.invokeAll(m27832a(collection));
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f29998b.invokeAll(m27832a(collection), j, timeUnit);
    }
}
