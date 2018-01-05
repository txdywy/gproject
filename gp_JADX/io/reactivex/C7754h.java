package io.reactivex;

import io.reactivex.p551b.C7756b;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.TimeUnit;

public abstract class C7754h {
    public abstract C7757j mo6528a();

    public void mo6565b() {
    }

    public C7756b mo6563a(Runnable runnable) {
        return mo6527a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public C7756b mo6527a(Runnable runnable, long j, TimeUnit timeUnit) {
        C7757j a = mo6528a();
        Object c7790i = new C7790i(C7773a.m37566a(runnable), a);
        a.mo6529a(c7790i, j, timeUnit);
        return c7790i;
    }

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());
    }
}
