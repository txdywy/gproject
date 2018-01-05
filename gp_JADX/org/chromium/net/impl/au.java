package org.chromium.net.impl;

final class au implements Runnable {
    public final /* synthetic */ bd f40813a;
    public final /* synthetic */ af f40814b;

    au(af afVar, bd bdVar) {
        this.f40814b = afVar;
        this.f40813a = bdVar;
    }

    public final void run() {
        try {
            this.f40813a.mo6615a();
        } catch (Throwable th) {
            this.f40814b.m38072a(new CronetExceptionImpl("System error", th));
        }
    }
}
