package io.reactivex.internal.p564g;

import io.reactivex.internal.p552a.C7761a;
import io.reactivex.p551b.C7756b;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class C7855w extends AtomicReferenceArray implements C7756b, Runnable, Callable {
    public static final Object f40449b = new Object();
    public static final Object f40450c = new Object();
    public final Runnable f40451a;

    public C7855w(Runnable runnable, C7761a c7761a) {
        super(3);
        this.f40451a = runnable;
        lazySet(0, c7761a);
    }

    public final Object call() {
        run();
        return null;
    }

    public final void run() {
        Object obj;
        lazySet(2, Thread.currentThread());
        try {
            this.f40451a.run();
        } catch (Throwable th) {
            Throwable th2 = th;
            lazySet(2, null);
            obj = get(0);
            if (!(obj == f40449b || obj == null || !compareAndSet(0, obj, f40450c))) {
                ((C7761a) obj).mo6533c(this);
            }
            do {
                obj = get(1);
                if (obj == f40449b) {
                    break;
                }
            } while (!compareAndSet(1, obj, f40450c));
        }
        lazySet(2, null);
        obj = get(0);
        if (!(obj == f40449b || obj == null || !compareAndSet(0, obj, f40450c))) {
            ((C7761a) obj).mo6533c(this);
        }
        do {
            obj = get(1);
            if (obj == f40449b) {
                return;
            }
        } while (!compareAndSet(1, obj, f40450c));
    }

    public final void m37715a(Future future) {
        boolean z = true;
        Object obj;
        do {
            obj = get(1);
            if (obj != f40450c) {
                if (obj == f40449b) {
                    if (get(2) == Thread.currentThread()) {
                        z = false;
                    }
                    future.cancel(z);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public final void mo6530a() {
        Object obj;
        boolean z = true;
        do {
            obj = get(1);
            if (obj == f40450c || obj == f40449b) {
                break;
            }
        } while (!compareAndSet(1, obj, f40449b));
        if (obj != null) {
            Future future = (Future) obj;
            if (get(2) == Thread.currentThread()) {
                z = false;
            }
            future.cancel(z);
        }
        do {
            obj = get(0);
            if (obj == f40450c || obj == f40449b || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, f40449b));
        ((C7761a) obj).mo6533c(this);
    }
}
