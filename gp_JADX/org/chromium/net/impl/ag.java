package org.chromium.net.impl;

import java.util.concurrent.Executor;

final class ag implements Executor {
    public final /* synthetic */ Executor f40794a;
    public final /* synthetic */ af f40795b;

    ag(af afVar, Executor executor) {
        this.f40795b = afVar;
        this.f40794a = executor;
    }

    public final void execute(Runnable runnable) {
        this.f40794a.execute(new ah(this, runnable));
    }
}
