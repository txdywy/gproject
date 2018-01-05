package com.google.android.libraries.performance.primes;

import android.app.Application;
import android.os.Build.VERSION;
import com.google.android.libraries.p326c.p327a.C5916a;
import java.util.concurrent.atomic.AtomicReference;

final class co implements cn {
    public final Application f29880a;
    public final eo f29881b;
    public final AtomicReference f29882c = new AtomicReference(new ch());

    co(Application application, eo eoVar) {
        C5916a.m27410b(m27798a());
        this.f29881b = eoVar;
        this.f29880a = application;
    }

    private final cn m27799e() {
        return (cn) this.f29882c.get();
    }

    public final void mo5219c() {
        ((cn) this.f29882c.getAndSet(new cd())).mo5219c();
        try {
            Application application = this.f29880a;
            synchronized (C6018r.class) {
                if (C6018r.f30075a != null) {
                    C6019s c6019s = C6018r.f30075a.f30076b;
                    application.unregisterActivityLifecycleCallbacks(c6019s.f30077a);
                    application.unregisterComponentCallbacks(c6019s.f30077a);
                    C6018r.f30075a = null;
                }
            }
        } catch (RuntimeException e) {
            C5989do.m27824a(5, "Primes", "Failed to shutdown app lifecycle monitor", new Object[0]);
        }
    }

    static boolean m27798a() {
        if (VERSION.SDK_INT >= 16) {
            return true;
        }
        C5989do.m27824a(5, "Primes", "Primes calls will be ignored. API's < 16 are not supported.", new Object[0]);
        return false;
    }

    public final eo mo5218b() {
        return m27799e().mo5218b();
    }

    public final void mo5220d() {
        m27799e().mo5220d();
    }

    public final void mo5216a(String str) {
        m27799e().mo5216a(str);
    }

    public final void mo5217a(String str, boolean z) {
        m27799e().mo5217a(str, z);
    }
}
