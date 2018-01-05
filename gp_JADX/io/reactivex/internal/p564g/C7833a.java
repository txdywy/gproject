package io.reactivex.internal.p564g;

import io.reactivex.internal.p557b.C7798a;
import io.reactivex.p551b.C7756b;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

class C7833a extends AtomicReference implements C7756b {
    public static final FutureTask f40374c = new FutureTask(C7798a.f40319a, null);
    public static final FutureTask f40375d = new FutureTask(C7798a.f40319a, null);
    public final Runnable f40376a;
    public Thread f40377b;

    C7833a(Runnable runnable) {
        this.f40376a = runnable;
    }

    public final void mo6530a() {
        Future future = (Future) get();
        if (future != f40374c && future != f40375d && compareAndSet(future, f40375d) && future != null) {
            future.cancel(this.f40377b != Thread.currentThread());
        }
    }

    public final void m37675a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f40374c) {
                return;
            }
            if (future2 == f40375d) {
                future.cancel(this.f40377b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }
}
