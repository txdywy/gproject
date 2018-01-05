package org.chromium.net.impl;

final class ai implements Runnable {
    public final /* synthetic */ bd f40798a;
    public final /* synthetic */ af f40799b;

    ai(af afVar, bd bdVar) {
        this.f40799b = afVar;
        this.f40798a = bdVar;
    }

    public final void run() {
        try {
            this.f40798a.mo6615a();
        } catch (Throwable th) {
            this.f40799b.m38070a(th);
        }
    }
}
