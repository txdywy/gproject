package io.reactivex;

import io.reactivex.p551b.C7756b;
import java.util.concurrent.TimeUnit;

public abstract class C7757j implements C7756b {
    public abstract C7756b mo6529a(Runnable runnable, long j, TimeUnit timeUnit);

    public C7756b mo6564a(Runnable runnable) {
        return mo6529a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public static long m37533a(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }
}
