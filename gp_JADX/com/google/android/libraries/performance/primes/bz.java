package com.google.android.libraries.performance.primes;

import android.app.Activity;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class bz implements C5952o {
    public final /* synthetic */ by f29849a;

    bz(by byVar) {
        this.f29849a = byVar;
    }

    public final void mo5226b(Activity activity) {
        this.f29849a.m27756d();
        this.f29849a.f29846l = ((ScheduledExecutorService) this.f29849a.f29839c.mo5221a()).schedule(new ca(this), 10, TimeUnit.SECONDS);
    }
}
