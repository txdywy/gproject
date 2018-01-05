package org.chromium.net.impl;

final class ao implements Runnable {
    public final /* synthetic */ af f40806a;

    ao(af afVar) {
        this.f40806a = afVar;
    }

    public final void run() {
        this.f40806a.f40788o = this.f40806a.f40791r;
        this.f40806a.f40791r = null;
        af afVar = this.f40806a;
        afVar.f40776c.execute(afVar.m38066a(new at(afVar)));
    }
}
