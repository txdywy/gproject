package io.reactivex.internal.p564g;

import io.reactivex.C7754h;
import io.reactivex.C7757j;
import io.reactivex.internal.p552a.C7795c;
import io.reactivex.p551b.C7756b;
import io.reactivex.p554d.C7773a;
import java.util.concurrent.TimeUnit;

public final class ab extends C7754h {
    public final C7757j mo6528a() {
        return new ae();
    }

    ab() {
    }

    public final C7756b mo6563a(Runnable runnable) {
        runnable.run();
        return C7795c.INSTANCE;
    }

    public final C7756b mo6527a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            runnable.run();
        } catch (Throwable e) {
            Thread.currentThread().interrupt();
            C7773a.m37567a(e);
        }
        return C7795c.INSTANCE;
    }

    static {
        ab abVar = new ab();
    }
}
