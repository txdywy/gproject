package com.google.android.libraries.performance.primes;

import android.app.Application;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class C5992e implements C5991f {
    C5992e() {
    }

    public final C5983c mo5255a(Application application, cx cxVar, eo eoVar, eo eoVar2, ec ecVar) {
        if (!co.m27798a()) {
            return new C5988d(new cd());
        }
        ExecutorService newSingleThreadExecutor;
        co coVar = new co(application, new db(ecVar.f30020a, ecVar.f30022c, ecVar.f30023d));
        ExecutorService executorService = ecVar.f30020a;
        if (executorService == null) {
            newSingleThreadExecutor = Executors.newSingleThreadExecutor(new de("Primes-init", ecVar.f30021b));
        } else {
            newSingleThreadExecutor = executorService;
        }
        try {
            newSingleThreadExecutor.submit(new cp(coVar, cxVar, eoVar, eoVar2, new cq(C6018r.m27894a(coVar.f29880a))));
        } catch (Throwable e) {
            C5989do.m27828b("Primes", "Primes failed to initialized", e, new Object[0]);
            ((cn) coVar.f29882c.getAndSet(new cd())).mo5219c();
            try {
                Application application2 = coVar.f29880a;
                synchronized (C6018r.class) {
                    if (C6018r.f30075a != null) {
                        C6019s c6019s = C6018r.f30075a.f30076b;
                        application2.unregisterActivityLifecycleCallbacks(c6019s.f30077a);
                        application2.unregisterComponentCallbacks(c6019s.f30077a);
                        C6018r.f30075a = null;
                    }
                }
            } catch (RuntimeException e2) {
                C5989do.m27824a(5, "Primes", "Failed to shutdown app lifecycle monitor", new Object[0]);
            }
        }
        if (newSingleThreadExecutor != executorService) {
            newSingleThreadExecutor.shutdown();
        }
        return new C5988d(coVar);
    }
}
