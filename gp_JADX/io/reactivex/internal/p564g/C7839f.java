package io.reactivex.internal.p564g;

import io.reactivex.p551b.C7756b;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

final class C7839f implements Future {
    public final C7756b f40410a;

    C7839f(C7756b c7756b) {
        this.f40410a = c7756b;
    }

    public final boolean cancel(boolean z) {
        this.f40410a.mo6530a();
        return false;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }

    public final Object get() {
        return null;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }
}
