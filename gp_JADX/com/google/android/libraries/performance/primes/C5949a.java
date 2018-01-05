package com.google.android.libraries.performance.primes;

import android.app.Application;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import d.a.a.a.a.a.al;
import d.a.a.a.a.a.bp;
import java.util.concurrent.ScheduledExecutorService;

abstract class C5949a {
    public final bt f29612a;
    public final Application f29613b;
    public final eo f29614c;
    public volatile boolean f29615d;

    protected C5949a(C5984a c5984a, Application application, eo eoVar, bv bvVar) {
        this(c5984a, application, eoVar, bvVar, Integer.MAX_VALUE);
    }

    abstract void mo5222c();

    protected C5949a(C5984a c5984a, Application application, eo eoVar, bv bvVar, int i) {
        C5916a.m27406a((Object) c5984a);
        C5916a.m27406a((Object) application);
        this.f29613b = application;
        this.f29614c = eoVar;
        this.f29612a = new bt(c5984a, bw.m27748b(application), eoVar, bvVar, i);
        ek ekVar = ek.f30037a;
        Object c5973b = new C5973b(this);
        synchronized (ekVar.f30039c) {
            if (!ekVar.f30040d) {
                ekVar.f30039c.add((en) C5916a.m27406a(c5973b));
            }
        }
    }

    protected final boolean m27580a() {
        return !this.f29612a.f29816a.m27857a();
    }

    protected final void m27579a(String str, boolean z, bp bpVar, al alVar) {
        if (!this.f29615d) {
            bt btVar = this.f29612a;
            if (btVar.f29820e == bv.SAME_THREAD) {
                btVar.m27746a(str, z, bpVar, alVar);
            } else {
                ((ScheduledExecutorService) btVar.f29819d.mo5221a()).submit(new bu(btVar, str, z, bpVar, alVar));
            }
        }
    }

    protected final void m27577a(bp bpVar) {
        m27579a(null, true, bpVar, null);
    }

    protected final void m27578a(String str, boolean z, bp bpVar) {
        m27579a(str, z, bpVar, null);
    }

    final ScheduledExecutorService m27581b() {
        return (ScheduledExecutorService) this.f29614c.mo5221a();
    }
}
