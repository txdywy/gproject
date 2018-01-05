package org.chromium.net.impl;

import java.util.concurrent.Executor;

final class bh implements Executor {
    public final /* synthetic */ Executor f40852a;
    public final /* synthetic */ bg f40853b;

    bh(bg bgVar, Executor executor) {
        this.f40853b = bgVar;
        this.f40852a = executor;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f40852a.execute(runnable);
        } catch (Throwable e) {
            this.f40853b.f40851l.m38070a(e);
        }
    }
}
