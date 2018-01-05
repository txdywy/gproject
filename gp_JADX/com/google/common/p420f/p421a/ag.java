package com.google.common.p420f.p421a;

import com.google.common.p415b.ao;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class ag extends ao implements Future {
    protected ag() {
    }

    protected abstract Future mo5936a();

    public boolean cancel(boolean z) {
        return mo5936a().cancel(z);
    }

    public boolean isCancelled() {
        return mo5936a().isCancelled();
    }

    public boolean isDone() {
        return mo5936a().isDone();
    }

    public Object get() {
        return mo5936a().get();
    }

    public Object get(long j, TimeUnit timeUnit) {
        return mo5936a().get(j, timeUnit);
    }

    protected /* synthetic */ Object mo5879b() {
        return mo5936a();
    }
}
