package com.google.common.p420f.p421a;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class bd extends ai implements au, ScheduledFuture {
    public final ScheduledFuture f34409b;

    public bd(au auVar, ScheduledFuture scheduledFuture) {
        super(auVar);
        this.f34409b = scheduledFuture;
    }

    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.f34409b.cancel(z);
        }
        return cancel;
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f34409b.getDelay(timeUnit);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f34409b.compareTo((Delayed) obj);
    }
}
