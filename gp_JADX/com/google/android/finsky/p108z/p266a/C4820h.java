package com.google.android.finsky.p108z.p266a;

import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4819c;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

final class C4820h extends AbstractExecutorService implements C4819c {
    public final ExecutorService f25097a;
    public final Executor f25098b;

    C4820h(ExecutorService executorService, Executor executor) {
        this.f25097a = executorService;
        this.f25098b = executor;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f25097a.awaitTermination(j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.f25097a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f25097a.isTerminated();
    }

    public final void shutdown() {
        this.f25097a.shutdown();
    }

    public final List shutdownNow() {
        return this.f25097a.shutdownNow();
    }

    public final void execute(Runnable runnable) {
        this.f25097a.execute(runnable);
    }

    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new C4810i(runnable, obj, this.f25098b);
    }

    protected final RunnableFuture newTaskFor(Callable callable) {
        return new C4810i(callable, this.f25098b);
    }

    public final C4809e mo4403a(Callable callable) {
        return (C4809e) super.submit(callable);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return mo4403a(callable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (C4809e) super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (C4809e) super.submit(runnable);
    }
}
