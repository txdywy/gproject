package io.reactivex;

import io.reactivex.internal.p564g.C7837r;
import io.reactivex.p551b.C7756b;

final class C7790i implements C7756b, Runnable {
    public final Runnable f40309a;
    public final C7757j f40310b;
    public Thread f40311c;

    C7790i(Runnable runnable, C7757j c7757j) {
        this.f40309a = runnable;
        this.f40310b = c7757j;
    }

    public final void run() {
        this.f40311c = Thread.currentThread();
        try {
            this.f40309a.run();
        } finally {
            mo6530a();
            this.f40311c = null;
        }
    }

    public final void mo6530a() {
        if (this.f40311c == Thread.currentThread() && (this.f40310b instanceof C7837r)) {
            C7837r c7837r = (C7837r) this.f40310b;
            if (!c7837r.f40409c) {
                c7837r.f40409c = true;
                c7837r.f40408b.shutdown();
                return;
            }
            return;
        }
        this.f40310b.mo6530a();
    }
}
