package android.support.v4.p035f;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

final class C0301n implements Runnable {
    public final /* synthetic */ AtomicReference f1701a;
    public final /* synthetic */ Callable f1702b;
    public final /* synthetic */ ReentrantLock f1703c;
    public final /* synthetic */ AtomicBoolean f1704d;
    public final /* synthetic */ Condition f1705e;

    C0301n(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
        this.f1701a = atomicReference;
        this.f1702b = callable;
        this.f1703c = reentrantLock;
        this.f1704d = atomicBoolean;
        this.f1705e = condition;
    }

    public final void run() {
        try {
            this.f1701a.set(this.f1702b.call());
        } catch (Exception e) {
        }
        this.f1703c.lock();
        try {
            this.f1704d.set(false);
            this.f1705e.signal();
        } finally {
            this.f1703c.unlock();
        }
    }
}
