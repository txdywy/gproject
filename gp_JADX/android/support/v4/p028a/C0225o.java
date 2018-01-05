package android.support.v4.p028a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class C0225o implements ThreadFactory {
    public final AtomicInteger f1243a = new AtomicInteger(1);

    C0225o() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ModernAsyncTask #" + this.f1243a.getAndIncrement());
    }
}
