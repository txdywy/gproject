package com.google.android.libraries.performance.primes;

import android.app.Application;
import com.google.android.libraries.p326c.p327a.C5916a;

public class C6018r {
    public static volatile C6018r f30075a;
    public final C6019s f30076b = new C6019s();

    public static C6018r m27894a(Application application) {
        if (f30075a == null) {
            synchronized (C6018r.class) {
                if (f30075a == null) {
                    C6018r c6018r = new C6018r();
                    C6019s c6019s = c6018r.f30076b;
                    application.registerActivityLifecycleCallbacks(c6019s.f30077a);
                    application.registerComponentCallbacks(c6019s.f30077a);
                    f30075a = c6018r;
                }
            }
        }
        return f30075a;
    }

    static void m27895b(Application application) {
        synchronized (C6018r.class) {
            if (f30075a != null) {
                C6019s c6019s = f30075a.f30076b;
                application.unregisterActivityLifecycleCallbacks(c6019s.f30077a);
                application.unregisterComponentCallbacks(c6019s.f30077a);
                f30075a = null;
            }
        }
    }

    private C6018r() {
    }

    public final void m27896a(C5950g c5950g) {
        C6019s c6019s = this.f30076b;
        C5916a.m27406a((Object) c5950g);
        if (c5950g instanceof C5985h) {
            c6019s.f30077a.f30078a.add((C5985h) c5950g);
        }
        if (c5950g instanceof C5951m) {
            c6019s.f30077a.f30079b.add((C5951m) c5950g);
        }
        if (c5950g instanceof C5954k) {
            c6019s.f30077a.f30080c.add((C5954k) c5950g);
        }
        if (c5950g instanceof C5953j) {
            c6019s.f30077a.f30081d.add((C5953j) c5950g);
        }
        if (c5950g instanceof C6017n) {
            c6019s.f30077a.f30082e.add((C6017n) c5950g);
        }
        if (c5950g instanceof C6008l) {
            c6019s.f30077a.f30083f.add((C6008l) c5950g);
        }
        if (c5950g instanceof C5975i) {
            c6019s.f30077a.f30084g.add((C5975i) c5950g);
        }
        if (c5950g instanceof C5974p) {
            c6019s.f30077a.f30086i.add((C5974p) c5950g);
        }
        if (c5950g instanceof C5952o) {
            c6019s.f30077a.f30087j.add((C5952o) c5950g);
        }
        if (c5950g instanceof C5993q) {
            c6019s.f30077a.f30085h.add((C5993q) c5950g);
        }
    }

    public final void m27897b(C5950g c5950g) {
        C6019s c6019s = this.f30076b;
        C5916a.m27406a((Object) c5950g);
        if (c5950g instanceof C5985h) {
            c6019s.f30077a.f30078a.remove(c5950g);
        }
        if (c5950g instanceof C5951m) {
            c6019s.f30077a.f30079b.remove(c5950g);
        }
        if (c5950g instanceof C5954k) {
            c6019s.f30077a.f30080c.remove(c5950g);
        }
        if (c5950g instanceof C5953j) {
            c6019s.f30077a.f30081d.remove(c5950g);
        }
        if (c5950g instanceof C6017n) {
            c6019s.f30077a.f30082e.remove(c5950g);
        }
        if (c5950g instanceof C6008l) {
            c6019s.f30077a.f30083f.remove(c5950g);
        }
        if (c5950g instanceof C5975i) {
            c6019s.f30077a.f30084g.remove(c5950g);
        }
        if (c5950g instanceof C5974p) {
            c6019s.f30077a.f30086i.remove(c5950g);
        }
        if (c5950g instanceof C5952o) {
            c6019s.f30077a.f30087j.remove(c5950g);
        }
        if (c5950g instanceof C5993q) {
            c6019s.f30077a.f30085h.remove(c5950g);
        }
    }
}
