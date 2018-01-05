package com.google.android.libraries.bind.p323a;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class C5868n extends ThreadPoolExecutor {
    public final /* synthetic */ boolean f29388a = true;

    C5868n(int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 10, timeUnit, blockingQueue, threadFactory);
    }

    protected final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        if (this.f29388a) {
            C5860f c5860f = C5860f.f29366a;
            if (!C5855a.m27295b()) {
                c5860f.f29367b.lock();
                while (c5860f.f29369d) {
                    try {
                        c5860f.f29368c.awaitUninterruptibly();
                    } finally {
                        c5860f.f29367b.unlock();
                    }
                }
            }
        }
    }
}
