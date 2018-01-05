package com.google.android.libraries.performance.primes.p335c;

import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.C5989do;
import java.lang.ref.ReferenceQueue;

public final class C5978c {
    public C5979d f29853a;
    public boolean f29854b;
    public C5976b f29855c;

    public C5978c() {
        this(new C5982g());
    }

    private C5978c(C5982g c5982g) {
        this.f29854b = false;
        C5916a.m27406a((Object) c5982g);
    }

    public final synchronized void m27761a(Object obj, String str) {
        if (this.f29854b) {
            if (this.f29853a == null) {
                this.f29853a = new C5979d(new ReferenceQueue(), new C5981f(), this.f29855c);
                this.f29853a.start();
                C5989do.m27824a(3, "LeakWatcher", "Starting leak watcher thread.", new Object[0]);
            }
            C5979d c5979d = this.f29853a;
            C5916a.m27406a((Object) str);
            C5916a.m27406a(obj);
            C5989do.m27824a(3, "LeakWatcherThread", "Watching %s", str);
            C5977a a = c5979d.f29861f.mo5247a(obj, str, c5979d.f29856a);
            synchronized (c5979d.f29859d) {
                a.m27759a(c5979d.f29859d);
            }
        }
    }

    public final synchronized void m27760a() {
        this.f29854b = true;
    }

    public final synchronized void m27762b() {
        if (this.f29854b) {
            this.f29854b = false;
            if (this.f29853a != null) {
                this.f29853a.interrupt();
                this.f29853a = null;
            }
            C5989do.m27824a(3, "LeakWatcher", "Stopping leak watcher thread.", new Object[0]);
        }
    }
}
