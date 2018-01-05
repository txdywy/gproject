package io.reactivex.internal.p564g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class C7852t extends AtomicLong implements ThreadFactory {
    public final String f40446a;
    public final int f40447b;
    public final boolean f40448c;

    public C7852t(String str) {
        this(str, 5, false);
    }

    public C7852t(String str, int i) {
        this(str, i, false);
    }

    public C7852t(String str, int i, boolean z) {
        this.f40446a = str;
        this.f40447b = i;
        this.f40448c = z;
    }

    public final Thread newThread(Runnable runnable) {
        String stringBuilder = new StringBuilder(this.f40446a).append('-').append(incrementAndGet()).toString();
        Thread c7853u = this.f40448c ? new C7853u(runnable, stringBuilder) : new Thread(runnable, stringBuilder);
        c7853u.setPriority(this.f40447b);
        c7853u.setDaemon(true);
        return c7853u;
    }

    public final String toString() {
        return "RxThreadFactory[" + this.f40446a + "]";
    }
}
