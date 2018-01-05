package com.google.android.libraries.performance.primes;

import android.app.Application;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.metriccapture.C6011c;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import java.util.HashMap;
import java.util.Map;

final class az extends C5949a {
    public static volatile az f29689e;
    public final int f29690f;
    public final C6018r f29691g;
    public final Map f29692h = new HashMap();
    public final C5953j f29693i = new ba(this);

    static az m27651a(C5984a c5984a, Application application, eo eoVar, dm dmVar) {
        if (f29689e == null) {
            synchronized (az.class) {
                if (f29689e == null) {
                    f29689e = new az(c5984a, application, eoVar, C6018r.m27894a(application), dmVar.f29976f);
                }
            }
        }
        return f29689e;
    }

    private az(C5984a c5984a, Application application, eo eoVar, C6018r c6018r, int i) {
        super(c5984a, application, eoVar, bv.BACKGROUND_THREAD, i);
        this.f29691g = (C6018r) C5916a.m27406a((Object) c6018r);
        c6018r.m27896a(this.f29693i);
        this.f29690f = C6011c.m27878a(application);
    }

    final av m27652a(String str) {
        if (!m27580a()) {
            return null;
        }
        if (str == null) {
            C5989do.m27824a(5, "JankMetricService", "Can't start an event with null name.", new Object[0]);
            return null;
        }
        av avVar = new av(this.f29690f);
        synchronized (this) {
            av avVar2 = (av) this.f29692h.put(str, avVar);
        }
        if (avVar2 != null) {
            avVar2.m27650a();
        }
        return avVar;
    }

    final synchronized void m27654d() {
        if (!this.f29692h.isEmpty()) {
            for (av a : this.f29692h.values()) {
                a.m27650a();
            }
            this.f29692h.clear();
        }
    }

    protected final void mo5222c() {
        this.f29691g.m27897b(this.f29693i);
        m27654d();
    }
}
