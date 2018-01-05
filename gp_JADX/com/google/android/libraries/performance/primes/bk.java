package com.google.android.libraries.performance.primes;

import android.app.Application;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

final class bk {
    public final AtomicBoolean f29789a;
    public final bp f29790b;
    public ScheduledFuture f29791c;
    public ScheduledFuture f29792d;
    public final eo f29793e;
    public final C6018r f29794f;
    public final C5952o f29795g;
    public final C5974p f29796h;

    bk(bp bpVar, Application application, eo eoVar) {
        this(bpVar, eoVar, C6018r.m27894a(application));
    }

    private bk(bp bpVar, eo eoVar, C6018r c6018r) {
        this.f29789a = new AtomicBoolean(false);
        this.f29795g = new bl(this);
        this.f29796h = new bn(this);
        this.f29790b = bpVar;
        this.f29793e = eoVar;
        this.f29794f = c6018r;
    }
}
