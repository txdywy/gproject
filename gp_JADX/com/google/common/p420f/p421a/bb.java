package com.google.common.p420f.p421a;

import com.google.common.p414a.C6937m;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class bb extends C6985n {
    public final ExecutorService f34407a;

    public bb(ExecutorService executorService) {
        this.f34407a = (ExecutorService) C6937m.m31623a((Object) executorService);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f34407a.awaitTermination(j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.f34407a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f34407a.isTerminated();
    }

    public final void shutdown() {
        this.f34407a.shutdown();
    }

    public final List shutdownNow() {
        return this.f34407a.shutdownNow();
    }

    public final void execute(Runnable runnable) {
        this.f34407a.execute(runnable);
    }
}
