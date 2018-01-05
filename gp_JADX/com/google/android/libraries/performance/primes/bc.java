package com.google.android.libraries.performance.primes;

import android.app.Activity;
import android.app.Application;
import com.google.android.libraries.performance.primes.p336h.C5984a;

final class bc extends C5949a implements dy, C5952o, C5974p {
    public static volatile bc f29767e;
    public boolean f29768f;

    static bc m27716a(C5984a c5984a, Application application, eo eoVar) {
        if (f29767e == null) {
            synchronized (bc.class) {
                if (f29767e == null) {
                    f29767e = new bc(c5984a, application, eoVar);
                }
            }
        }
        return f29767e;
    }

    private bc(C5984a c5984a, Application application, eo eoVar) {
        super(c5984a, application, eoVar, bv.SAME_THREAD);
    }

    public final void mo5223d() {
        m27718f();
    }

    public final void mo5224e() {
    }

    public final void mo5226b(Activity activity) {
        m27717a(2);
        C5989do.m27824a(3, "MagicEyeLogService", "Logging APP_TO_BACKGROUND", new Object[0]);
    }

    public final void mo5240a(Activity activity) {
        m27717a(1);
        C5989do.m27824a(3, "MagicEyeLogService", "Logging APP_TO_FOREGROUND", new Object[0]);
    }

    private final synchronized void m27718f() {
        if (!(this.f29768f || this.f29615d)) {
            C6018r.m27894a(this.f29613b).m27896a((C5950g) this);
            this.f29768f = true;
        }
    }

    private final synchronized void m27719g() {
        if (this.f29768f) {
            C6018r.m27894a(this.f29613b).m27897b((C5950g) this);
            this.f29768f = false;
        }
    }

    private final void m27717a(int i) {
        m27581b().submit(new bd(this, i));
    }

    final void mo5222c() {
        m27719g();
    }
}
