package com.google.android.libraries.performance.primes;

import android.app.Activity;
import android.app.Application;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.p333b.C5972l;
import com.google.android.libraries.performance.primes.p335c.C5978c;
import com.google.android.libraries.performance.primes.p336h.C5984a;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

final class be extends C5949a implements C5975i {
    public static be f29771e;
    public final Application f29772b;
    public final eo f29773c;
    public final C6018r f29774f;
    public final C5978c f29775g;
    public final boolean f29776h;
    public final boolean f29777i;
    public final boolean f29778j;
    public final AtomicLong f29779k = new AtomicLong();
    public final AtomicBoolean f29780l = new AtomicBoolean();
    public ScheduledFuture f29781m;

    private be(Application application, boolean z, boolean z2, C6018r c6018r, eo eoVar, C5978c c5978c, C5984a c5984a) {
        super(c5984a, application, eoVar, bv.BACKGROUND_THREAD);
        this.f29772b = (Application) C5916a.m27406a((Object) application);
        this.f29776h = z;
        this.f29777i = z2;
        this.f29774f = (C6018r) C5916a.m27406a((Object) c6018r);
        this.f29773c = (eo) C5916a.m27406a((Object) eoVar);
        this.f29775g = (C5978c) C5916a.m27406a((Object) c5978c);
        this.f29775g.f29855c = new bg(this);
        this.f29778j = C5972l.m27711a(application);
    }

    static synchronized be m27726a(C5984a c5984a, Application application, boolean z, eo eoVar, dr drVar, C6018r c6018r) {
        be beVar;
        synchronized (be.class) {
            if (f29771e == null) {
                f29771e = new be(application, z, drVar.f29991c, c6018r, eoVar, new C5978c(), c5984a);
            }
            beVar = f29771e;
        }
        return beVar;
    }

    final void mo5222c() {
        this.f29774f.m27897b((C5950g) this);
        this.f29775g.m27762b();
        m27729d();
    }

    public final void mo5241a(Activity activity) {
        if (!this.f29615d) {
            this.f29775g.m27761a(activity, activity.getClass().getName());
        }
    }

    final void m27729d() {
        if (this.f29781m != null) {
            if (!this.f29781m.isDone()) {
                this.f29781m.cancel(true);
            }
            this.f29781m = null;
        }
    }
}
