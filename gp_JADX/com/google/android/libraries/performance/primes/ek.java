package com.google.android.libraries.performance.primes;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

final class ek {
    public static volatile ek f30037a = new ek(new at());
    public final at f30038b;
    public final List f30039c = new ArrayList();
    public volatile boolean f30040d;

    private ek(at atVar) {
        this.f30038b = atVar;
    }

    private final synchronized void m27845a() {
        if (!this.f30040d) {
            this.f30040d = true;
            C5989do.m27824a(3, "PrimesShutdown", "Shutdown ...", new Object[0]);
            synchronized (this.f30039c) {
                for (en a : this.f30039c) {
                    try {
                        a.mo5239a();
                    } catch (Throwable e) {
                        C5989do.m27826a("PrimesShutdown", "ShutdownListener crashed", e, new Object[0]);
                    }
                }
                this.f30039c.clear();
                C5989do.m27824a(3, "PrimesShutdown", "All ShutdownListeners notified.", new Object[0]);
            }
        }
    }

    final void m27846a(Context context) {
        if (!this.f30040d && this.f30038b.m27648a(context, "primes::shutdown_primes", false)) {
            m27845a();
        }
    }
}
