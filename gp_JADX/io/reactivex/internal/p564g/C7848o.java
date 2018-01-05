package io.reactivex.internal.p564g;

import io.reactivex.C7757j;
import io.reactivex.internal.p552a.C7795c;
import io.reactivex.p551b.C7756b;
import io.reactivex.p551b.C7762a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

final class C7848o extends C7757j {
    public final C7762a f40439a;
    public final C7847n f40440b;
    public final C7849p f40441c;
    public final AtomicBoolean f40442d = new AtomicBoolean();

    C7848o(C7847n c7847n) {
        this.f40440b = c7847n;
        this.f40439a = new C7762a();
        this.f40441c = c7847n.m37708a();
    }

    public final void mo6530a() {
        if (this.f40442d.compareAndSet(false, true)) {
            this.f40439a.mo6530a();
            C7847n c7847n = this.f40440b;
            C7849p c7849p = this.f40441c;
            c7849p.f40443a = System.nanoTime() + c7847n.f40433a;
            c7847n.f40434b.offer(c7849p);
        }
    }

    public final C7756b mo6529a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f40439a.f40282b) {
            return C7795c.INSTANCE;
        }
        return this.f40441c.m37695a(runnable, j, timeUnit, this.f40439a);
    }
}
