package org.chromium.net.impl;

final class C7955o implements Runnable {
    public final /* synthetic */ bx f40926a;
    public final /* synthetic */ String f40927b;
    public final /* synthetic */ CronetUrlRequest f40928c;

    C7955o(CronetUrlRequest cronetUrlRequest, bx bxVar, String str) {
        this.f40928c = cronetUrlRequest;
        this.f40926a = bxVar;
        this.f40927b = str;
    }

    public final void run() {
        this.f40928c.m38022f();
        synchronized (this.f40928c.f40713f) {
            if (this.f40928c.m38021e()) {
                return;
            }
            this.f40928c.f40711d = true;
            try {
                this.f40928c.f40718k.mo6581a(this.f40928c, this.f40926a, this.f40927b);
            } catch (Exception e) {
                this.f40928c.m38012a(e);
            }
        }
    }
}
