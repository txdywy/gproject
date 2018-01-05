package com.google.android.libraries.performance.primes;

import android.app.Application;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class ae extends C5949a implements dy {
    public static volatile ae f29634e;
    public final int f29635f;
    public final int f29636g;
    public final int f29637h;
    public ScheduledFuture f29638i;

    static ae m27600a(C5984a c5984a, Application application, eo eoVar, cy cyVar) {
        if (f29634e == null) {
            synchronized (ae.class) {
                if (f29634e == null) {
                    f29634e = new ae(c5984a, application, eoVar, cyVar);
                }
            }
        }
        return f29634e;
    }

    private ae(C5984a c5984a, Application application, eo eoVar, cy cyVar) {
        super(c5984a, application, eoVar, bv.BACKGROUND_THREAD);
        this.f29635f = cyVar.f29928e;
        this.f29636g = cyVar.f29927d;
        this.f29637h = cyVar.f29926c;
    }

    private final synchronized void m27601f() {
        if (this.f29638i == null && !this.f29615d) {
            this.f29638i = m27581b().scheduleAtFixedRate(new af(this), (long) this.f29636g, (long) this.f29635f, TimeUnit.MILLISECONDS);
        }
    }

    final synchronized void m27602a(boolean z) {
        if (this.f29638i != null) {
            this.f29638i.cancel(z);
            this.f29638i = null;
        }
    }

    final synchronized void mo5222c() {
        m27602a(true);
    }

    public final void mo5223d() {
    }

    public final void mo5224e() {
        m27601f();
    }
}
