package org.chromium.net.impl;

final class av implements Runnable {
    public final /* synthetic */ bd f40815a;
    public final /* synthetic */ af f40816b;

    av(af afVar, bd bdVar) {
        this.f40816b = afVar;
        this.f40815a = bdVar;
    }

    public final void run() {
        try {
            this.f40815a.mo6615a();
        } catch (Throwable th) {
            this.f40816b.m38072a(new CallbackExceptionImpl("Exception received from UrlRequest.Callback", th));
        }
    }
}
