package com.google.android.libraries.performance.primes;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

final class db implements eo {
    public volatile ScheduledExecutorService f29941a;
    public final /* synthetic */ ScheduledExecutorService f29942b;
    public final /* synthetic */ int f29943c;
    public final /* synthetic */ int f29944d;

    db(ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.f29942b = scheduledExecutorService;
        this.f29943c = i;
        this.f29944d = i2;
    }

    private final ScheduledExecutorService m27814b() {
        if (this.f29941a == null) {
            synchronized (this) {
                if (this.f29941a == null) {
                    if (this.f29942b != null) {
                        this.f29941a = da.m27813a(this.f29942b);
                    } else {
                        this.f29941a = da.m27813a(new ScheduledThreadPoolExecutor(this.f29944d, new de(this.f29943c), new dd()));
                    }
                }
            }
        }
        return this.f29941a;
    }

    public final /* synthetic */ Object mo5221a() {
        return m27814b();
    }
}
