package com.google.android.libraries.performance.primes;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import com.google.android.libraries.p326c.p327a.C5916a;
import java.io.File;

final class cp implements Runnable {
    public final /* synthetic */ cx f29883a;
    public final /* synthetic */ eo f29884b;
    public final /* synthetic */ eo f29885c;
    public final /* synthetic */ cq f29886d;
    public final /* synthetic */ co f29887e;

    cp(co coVar, cx cxVar, eo eoVar, eo eoVar2, cq cqVar) {
        this.f29887e = coVar;
        this.f29883a = cxVar;
        this.f29884b = eoVar;
        this.f29885c = eoVar2;
        this.f29886d = cqVar;
    }

    public final void run() {
        try {
            co coVar = this.f29887e;
            cx cxVar = this.f29883a;
            eo eoVar = this.f29884b;
            eo eoVar2 = this.f29885c;
            cq cqVar = this.f29886d;
            C5916a.m27406a(Integer.valueOf(eh.primes_marker));
            ek ekVar = ek.f30037a;
            Context context = coVar.f29880a;
            ekVar.m27846a(context);
            if (!ekVar.f30040d) {
                context.registerReceiver(new el(), new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
            }
            if (ek.f30037a.f30040d) {
                ((cn) coVar.f29882c.getAndSet(new cd())).mo5219c();
                try {
                    C6018r.m27895b(coVar.f29880a);
                    return;
                } catch (RuntimeException e) {
                    C5989do.m27824a(5, "Primes", "Failed to shutdown app lifecycle monitor", new Object[0]);
                    return;
                }
            }
            SharedPreferences sharedPreferences = (SharedPreferences) eoVar2.mo5221a();
            cv a = cxVar.mo2911a();
            dj djVar = (dj) eoVar.mo5221a();
            if (ek.f30037a.f30040d) {
                ((cn) coVar.f29882c.getAndSet(new cd())).mo5219c();
                try {
                    C6018r.m27895b(coVar.f29880a);
                    return;
                } catch (RuntimeException e2) {
                    C5989do.m27824a(5, "Primes", "Failed to shutdown app lifecycle monitor", new Object[0]);
                    return;
                }
            }
            ab abVar = new ab(coVar.f29880a, coVar.f29881b, a, djVar, sharedPreferences);
            if (ek.f30037a.f30040d) {
                ((cn) coVar.f29882c.getAndSet(new cd())).mo5219c();
                try {
                    C6018r.m27895b(coVar.f29880a);
                    return;
                } catch (RuntimeException e3) {
                    C5989do.m27824a(5, "Primes", "Failed to shutdown app lifecycle monitor", new Object[0]);
                    return;
                }
            }
            cn cnVar = (cn) coVar.f29882c.get();
            if ((cnVar instanceof ch) && coVar.f29882c.compareAndSet(cnVar, abVar)) {
                for (dy dyVar : abVar.m27589a()) {
                    dyVar.mo5223d();
                    synchronized (cqVar) {
                        if (cqVar.f29890c) {
                            dyVar.mo5224e();
                        } else {
                            cqVar.f29889b.add(dyVar);
                        }
                    }
                }
                if (!ek.f30037a.f30040d) {
                    ((ch) cnVar).m27786a(abVar);
                }
                cnVar.mo5219c();
            } else {
                C5989do.m27824a(3, "Primes", "Primes shutdown during initialization", new Object[0]);
            }
            File a2 = dl.m27818a(coVar.f29880a);
            if (a2.exists()) {
                a2.delete();
            }
            dl.m27820c(coVar.f29880a);
        } catch (Throwable e4) {
            C5989do.m27828b("Primes", "Primes failed to initialized in the background", e4, new Object[0]);
            co coVar2 = this.f29887e;
            ((cn) coVar2.f29882c.getAndSet(new cd())).mo5219c();
            try {
                Application application = coVar2.f29880a;
                synchronized (C6018r.class) {
                    if (C6018r.f30075a != null) {
                        C6019s c6019s = C6018r.f30075a.f30076b;
                        application.unregisterActivityLifecycleCallbacks(c6019s.f30077a);
                        application.unregisterComponentCallbacks(c6019s.f30077a);
                        C6018r.f30075a = null;
                    }
                }
            } catch (RuntimeException e5) {
                C5989do.m27824a(5, "Primes", "Failed to shutdown app lifecycle monitor", new Object[0]);
            }
        }
    }
}
