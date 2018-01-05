package com.google.common.p420f.p421a;

import java.util.concurrent.Executor;

final class ay implements Executor {
    public boolean f34400a = true;
    public final /* synthetic */ Executor f34401b;
    public final /* synthetic */ C6977a f34402c;

    ay(Executor executor, C6977a c6977a) {
        this.f34401b = executor;
        this.f34402c = c6977a;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f34401b.execute(new az(this, runnable));
        } catch (Throwable e) {
            if (this.f34400a) {
                this.f34402c.mo5943a(e);
            }
        }
    }
}
