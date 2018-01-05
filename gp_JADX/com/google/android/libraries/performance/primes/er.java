package com.google.android.libraries.performance.primes;

import android.app.Application;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import java.util.concurrent.ConcurrentHashMap;

final class er extends C5949a {
    public static volatile er f30048e;
    public final ConcurrentHashMap f30049f = new ConcurrentHashMap();

    private static er m27853a(C5984a c5984a, Application application, eo eoVar, ee eeVar, bv bvVar) {
        if (f30048e == null) {
            synchronized (er.class) {
                if (f30048e == null) {
                    f30048e = new er(c5984a, application, eoVar, bvVar, eeVar.f30030c);
                }
            }
        }
        return f30048e;
    }

    static er m27852a(C5984a c5984a, Application application, eo eoVar, ee eeVar) {
        return m27853a(c5984a, application, eoVar, eeVar, bv.BACKGROUND_THREAD);
    }

    private er(C5984a c5984a, Application application, eo eoVar, bv bvVar, int i) {
        super(c5984a, application, eoVar, bvVar, i);
    }

    protected final void mo5222c() {
        this.f30049f.clear();
    }
}
