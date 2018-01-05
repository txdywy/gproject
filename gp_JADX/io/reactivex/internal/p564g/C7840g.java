package io.reactivex.internal.p564g;

import io.reactivex.C7754h;
import io.reactivex.C7757j;
import io.reactivex.internal.p552a.C7791b;
import io.reactivex.internal.p552a.C7795c;
import io.reactivex.p551b.C7756b;
import io.reactivex.p553c.C7770e;
import io.reactivex.p554d.C7773a;
import io.reactivex.p555e.C7775a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class C7840g extends C7754h {
    public static final C7754h f40411b;
    public final Executor f40412a;

    public C7840g(Executor executor) {
        this.f40412a = executor;
    }

    public final C7757j mo6528a() {
        return new C7843j(this.f40412a);
    }

    public final C7756b mo6563a(Runnable runnable) {
        Runnable a = C7773a.m37566a(runnable);
        try {
            if (this.f40412a instanceof ExecutorService) {
                C7756b c7854v = new C7854v(a);
                c7854v.m37675a(((ExecutorService) this.f40412a).submit(c7854v));
                return c7854v;
            }
            C7756b c7844k = new C7844k(a);
            this.f40412a.execute(c7844k);
            return c7844k;
        } catch (Throwable e) {
            C7773a.m37567a(e);
            return C7795c.INSTANCE;
        }
    }

    public final C7756b mo6527a(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable a = C7773a.m37566a(runnable);
        if (this.f40412a instanceof ScheduledExecutorService) {
            try {
                C7756b c7854v = new C7854v(a);
                c7854v.m37675a(((ScheduledExecutorService) this.f40412a).schedule(c7854v, j, timeUnit));
                return c7854v;
            } catch (Throwable e) {
                C7773a.m37567a(e);
                return C7795c.INSTANCE;
            }
        }
        C7756b c7842i = new C7842i(a);
        C7791b.m37588b(c7842i.f40415a, f40411b.mo6527a(new C7841h(this, c7842i), j, timeUnit));
        return c7842i;
    }

    static {
        C7754h c7754h;
        Object obj = C7775a.f40299a;
        C7770e c7770e = C7773a.f40290g;
        if (c7770e != null) {
            c7754h = (C7754h) C7773a.m37565a(c7770e, obj);
        }
        f40411b = c7754h;
    }
}
