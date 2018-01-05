package com.google.android.libraries.performance.primes;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

final class ch implements cn {
    public volatile ab f29872a;
    public final Queue f29873b = new ConcurrentLinkedQueue();

    ch() {
    }

    private final void m27784a(cl clVar) {
        synchronized (this.f29873b) {
            if (this.f29872a == null) {
                this.f29873b.add(clVar);
                return;
            }
            clVar.mo5249a(this.f29872a);
        }
    }

    final void m27786a(ab abVar) {
        m27785b(abVar);
        synchronized (this.f29873b) {
            this.f29872a = abVar;
        }
        m27785b(abVar);
    }

    private final void m27785b(ab abVar) {
        cl clVar = (cl) this.f29873b.poll();
        while (clVar != null) {
            clVar.mo5249a(abVar);
            clVar = (cl) this.f29873b.poll();
        }
    }

    public final void mo5220d() {
        m27784a(new ci());
    }

    public final void mo5216a(String str) {
        m27784a(new cj(str));
    }

    public final void mo5217a(String str, boolean z) {
        m27784a(new ck(str, z));
    }

    public final void mo5219c() {
        this.f29873b.clear();
    }

    public final eo mo5218b() {
        throw new RuntimeException();
    }
}
