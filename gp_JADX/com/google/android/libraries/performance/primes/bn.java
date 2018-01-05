package com.google.android.libraries.performance.primes;

import android.app.Activity;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class bn implements C5974p {
    public final /* synthetic */ bk f29800a;

    bn(bk bkVar) {
        this.f29800a = bkVar;
    }

    public final void mo5240a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f29800a.f29790b.mo5246a(3, simpleName);
        bk bkVar = this.f29800a;
        if (bkVar.f29791c != null) {
            bkVar.f29791c.cancel(true);
            bkVar.f29791c = null;
        }
        if (bkVar.f29792d != null) {
            bkVar.f29792d.cancel(true);
            bkVar.f29792d = null;
        }
        this.f29800a.f29791c = ((ScheduledExecutorService) this.f29800a.f29793e.mo5221a()).schedule(new bo(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
