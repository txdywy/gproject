package com.google.android.libraries.performance.primes;

import android.app.Application;
import com.google.android.libraries.performance.primes.p336h.C5984a;

public final class es extends C5949a {
    public static volatile es f30050e;

    static synchronized es m27855a(C5984a c5984a, Application application, eo eoVar, ef efVar) {
        es esVar;
        synchronized (es.class) {
            if (f30050e == null) {
                synchronized (es.class) {
                    if (f30050e == null) {
                        f30050e = new es(c5984a, application, eoVar, efVar.f30033c);
                    }
                }
            }
            esVar = f30050e;
        }
        return esVar;
    }

    es(C5984a c5984a, Application application, eo eoVar, int i) {
        super(c5984a, application, eoVar, bv.BACKGROUND_THREAD, i);
    }

    final void mo5222c() {
    }
}
