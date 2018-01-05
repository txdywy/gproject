package org.chromium.net.impl;

import java.util.concurrent.Executor;

final class aw {
    public final cg f40817a;
    public final Executor f40818b;
    public final Executor f40819c;
    public final /* synthetic */ af f40820d;

    aw(af afVar, org.chromium.net.aw awVar, Executor executor) {
        this.f40820d = afVar;
        this.f40817a = new cg(awVar);
        if (afVar.f40783j) {
            this.f40818b = executor;
            this.f40819c = null;
            return;
        }
        this.f40818b = new be(executor);
        this.f40819c = executor;
    }

    final void m38086a(bd bdVar) {
        try {
            this.f40818b.execute(new av(this.f40820d, bdVar));
        } catch (Throwable e) {
            this.f40820d.m38072a(new CronetExceptionImpl("Exception posting task to executor", e));
        }
    }

    final void m38085a() {
        m38086a(new ay(this));
    }
}
