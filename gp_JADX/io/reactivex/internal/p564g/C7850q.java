package io.reactivex.internal.p564g;

import io.reactivex.C7754h;
import io.reactivex.C7757j;
import java.util.concurrent.ThreadFactory;

public final class C7850q extends C7754h {
    public static final C7852t f40444b = new C7852t("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    public final ThreadFactory f40445a;

    public C7850q() {
        this(f40444b);
    }

    private C7850q(ThreadFactory threadFactory) {
        this.f40445a = threadFactory;
    }

    public final C7757j mo6528a() {
        return new C7837r(this.f40445a);
    }
}
