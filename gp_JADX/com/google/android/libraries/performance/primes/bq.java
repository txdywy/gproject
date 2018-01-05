package com.google.android.libraries.performance.primes;

import android.app.Application;
import com.google.android.libraries.performance.primes.p336h.C5984a;

final class bq extends C5949a {
    public static volatile bq f29803e;
    public bk f29804f;
    public final boolean f29805g;
    public final bj f29806h;
    public final boolean f29807i;
    public final boolean f29808j;

    static bq m27742a(C5984a c5984a, Application application, eo eoVar, dp dpVar, boolean z) {
        if (f29803e == null) {
            synchronized (bq.class) {
                if (f29803e == null) {
                    f29803e = new bq(c5984a, application, eoVar, dpVar.f29985d, dpVar.f29986e, dpVar.f29987f, dpVar.f29988g, z);
                }
            }
        }
        return f29803e;
    }

    private bq(C5984a c5984a, Application application, eo eoVar, int i, boolean z, bj bjVar, boolean z2, boolean z3) {
        super(c5984a, application, eoVar, bv.SAME_THREAD, i);
        this.f29805g = z;
        this.f29806h = bjVar;
        this.f29807i = z2;
        this.f29808j = z3;
    }

    final synchronized void m27744d() {
        if (!this.f29615d && this.f29804f == null) {
            this.f29804f = new bk(new br(this), this.f29613b, this.f29614c);
            bk bkVar = this.f29804f;
            if (bkVar.f29789a.getAndSet(true)) {
                C5989do.m27824a(5, "MemoryMetricMonitor", "Memory Monitor has already started. This MemoryMetricMonitor.start() is ignored.", new Object[0]);
            } else {
                bkVar.f29794f.m27896a(bkVar.f29795g);
                bkVar.f29794f.m27896a(bkVar.f29796h);
            }
        }
    }

    protected final synchronized void mo5222c() {
        if (this.f29804f != null) {
            bk bkVar = this.f29804f;
            bkVar.f29794f.m27897b(bkVar.f29795g);
            bkVar.f29794f.m27897b(bkVar.f29796h);
            this.f29804f = null;
        }
    }
}
