package com.google.android.libraries.bind.p323a;

import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class C5860f implements Executor {
    public static final C5860f f29366a = new C5860f();
    public final ReentrantLock f29367b = new ReentrantLock();
    public final Condition f29368c = this.f29367b.newCondition();
    public boolean f29369d;
    public final C5858d f29370e = new C5858d(C5855a.f29356a, new C5861g(this));

    public final boolean m27299a() {
        this.f29367b.lock();
        try {
            boolean z = this.f29369d;
            return z;
        } finally {
            this.f29367b.unlock();
        }
    }

    public final void execute(Runnable runnable) {
        Executor executor = C5855a.f29357b;
        Executor executor2 = C5869o.f29389a;
        Runnable c5862h = new C5862h(this, executor2, runnable, executor);
        if (m27299a()) {
            executor2.execute(c5862h);
        } else {
            c5862h.run();
        }
    }
}
