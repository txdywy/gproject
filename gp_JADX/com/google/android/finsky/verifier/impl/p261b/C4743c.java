package com.google.android.finsky.verifier.impl.p261b;

final class C4743c implements Runnable {
    public final /* synthetic */ C4740a f24427a;

    C4743c(C4740a c4740a) {
        this.f24427a = c4740a;
    }

    public final void run() {
        this.f24427a.mo4344c();
        synchronized (this.f24427a) {
            C4727e c4727e = this.f24427a.f24385F;
        }
        if (c4727e != null) {
            c4727e.mo4334a(this.f24427a);
        }
    }
}
