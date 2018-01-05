package android.support.v4.p035f;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class C0297j {
    public final Object f1687a = new Object();
    public HandlerThread f1688b;
    public Handler f1689c;
    public int f1690d;
    public Callback f1691e = new C0298k(this);
    public final int f1692f;
    public final int f1693g;
    public final String f1694h;

    public C0297j(String str) {
        this.f1694h = str;
        this.f1693g = 10;
        this.f1692f = 10000;
        this.f1690d = 0;
    }

    final void m1616a(Runnable runnable) {
        synchronized (this.f1687a) {
            if (this.f1688b == null) {
                this.f1688b = new HandlerThread(this.f1694h, this.f1693g);
                this.f1688b.start();
                this.f1689c = new Handler(this.f1688b.getLooper(), this.f1691e);
                this.f1690d++;
            }
            this.f1689c.removeMessages(0);
            this.f1689c.sendMessage(this.f1689c.obtainMessage(1, runnable));
        }
    }

    public final Object m1615a(Callable callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m1616a(new C0301n(atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            Object obj;
            if (atomicBoolean.get()) {
                long toNanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                while (true) {
                    try {
                        toNanos = newCondition.awaitNanos(toNanos);
                    } catch (InterruptedException e) {
                    }
                    if (!atomicBoolean.get()) {
                        break;
                    } else if (toNanos <= 0) {
                        throw new InterruptedException("timeout");
                    }
                }
                obj = atomicReference.get();
                reentrantLock.unlock();
            } else {
                obj = atomicReference.get();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
