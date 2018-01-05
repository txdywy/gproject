package com.google.common.p420f.p421a;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class C6985n extends AbstractExecutorService implements aw {
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return bg.m31899a(runnable, obj);
    }

    protected final RunnableFuture newTaskFor(Callable callable) {
        return bg.m31900a(callable);
    }

    public final au mo5940a(Callable callable) {
        return (au) super.submit(callable);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return mo5940a(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (au) super.submit(runnable, obj);
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return (au) super.submit(runnable);
    }
}
