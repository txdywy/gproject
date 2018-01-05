package io.reactivex.internal.p564g;

import io.reactivex.C7757j;
import io.reactivex.internal.p552a.C7795c;
import io.reactivex.p551b.C7756b;
import io.reactivex.p551b.C7762a;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class aa extends C7757j {
    public final ScheduledExecutorService f40378a;
    public final C7762a f40379b = new C7762a();
    public volatile boolean f40380c;

    aa(ScheduledExecutorService scheduledExecutorService) {
        this.f40378a = scheduledExecutorService;
    }

    public final C7756b mo6529a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f40380c) {
            return C7795c.INSTANCE;
        }
        Future submit;
        C7756b c7855w = new C7855w(C7773a.m37566a(runnable), this.f40379b);
        this.f40379b.mo6531a(c7855w);
        if (j <= 0) {
            try {
                submit = this.f40378a.submit(c7855w);
            } catch (Throwable e) {
                mo6530a();
                C7773a.m37567a(e);
                return C7795c.INSTANCE;
            }
        }
        submit = this.f40378a.schedule(c7855w, j, timeUnit);
        c7855w.m37715a(submit);
        return c7855w;
    }

    public final void mo6530a() {
        if (!this.f40380c) {
            this.f40380c = true;
            this.f40379b.mo6530a();
        }
    }
}
