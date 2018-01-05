package io.reactivex.internal.p564g;

import io.reactivex.C7757j;
import io.reactivex.internal.p552a.C7795c;
import io.reactivex.internal.p552a.C7796d;
import io.reactivex.p551b.C7756b;
import io.reactivex.p551b.C7762a;
import java.util.concurrent.TimeUnit;

final class C7835c extends C7757j {
    public final C7796d f40400a = new C7796d();
    public final C7762a f40401b = new C7762a();
    public final C7796d f40402c = new C7796d();
    public final C7838e f40403d;
    public volatile boolean f40404e;

    C7835c(C7838e c7838e) {
        this.f40403d = c7838e;
        this.f40402c.mo6531a(this.f40400a);
        this.f40402c.mo6531a(this.f40401b);
    }

    public final void mo6530a() {
        if (!this.f40404e) {
            this.f40404e = true;
            this.f40402c.mo6530a();
        }
    }

    public final C7756b mo6564a(Runnable runnable) {
        if (this.f40404e) {
            return C7795c.INSTANCE;
        }
        return this.f40403d.m37695a(runnable, 0, TimeUnit.MILLISECONDS, this.f40400a);
    }

    public final C7756b mo6529a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f40404e) {
            return C7795c.INSTANCE;
        }
        return this.f40403d.m37695a(runnable, j, timeUnit, this.f40401b);
    }
}
