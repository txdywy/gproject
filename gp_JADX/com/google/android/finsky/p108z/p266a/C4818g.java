package com.google.android.finsky.p108z.p266a;

import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p108z.C4819c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class C4818g implements C4817d {
    public final Executor f25096a;

    public C4818g(Executor executor) {
        this.f25096a = executor;
    }

    public final C4819c mo4399a(ExecutorService executorService) {
        return new C4820h(executorService, this.f25096a);
    }

    public final C4809e mo4400a(Iterable iterable) {
        return new C4814d(iterable, this.f25096a);
    }

    public final C4809e mo4401a(Object obj) {
        return new C4811a(obj, this.f25096a);
    }

    public final C4809e mo4402a(Throwable th) {
        return new C4811a(th, this.f25096a);
    }
}
