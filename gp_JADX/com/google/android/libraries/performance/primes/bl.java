package com.google.android.libraries.performance.primes;

import android.app.Activity;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class bl implements C5952o {
    public final /* synthetic */ bk f29797a;

    bl(bk bkVar) {
        this.f29797a = bkVar;
    }

    public final void mo5226b(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f29797a.f29790b.mo5246a(2, simpleName);
        bk bkVar = this.f29797a;
        if (bkVar.f29791c != null) {
            bkVar.f29791c.cancel(true);
            bkVar.f29791c = null;
        }
        if (bkVar.f29792d != null) {
            bkVar.f29792d.cancel(true);
            bkVar.f29792d = null;
        }
        this.f29797a.f29792d = ((ScheduledExecutorService) this.f29797a.f29793e.mo5221a()).schedule(new bm(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
