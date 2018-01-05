package org.chromium.net.impl;

import org.chromium.base.C7893j;

final class C7957q implements Runnable {
    public final /* synthetic */ CronetUrlRequest f40930a;

    C7957q(CronetUrlRequest cronetUrlRequest) {
        this.f40930a = cronetUrlRequest;
    }

    public final void run() {
        synchronized (this.f40930a.f40713f) {
            if (this.f40930a.m38021e()) {
                return;
            }
            this.f40930a.m38011a(0);
            try {
                this.f40930a.f40718k.mo6584b(this.f40930a, this.f40930a.f40726s);
                this.f40930a.m38023g();
            } catch (Exception e) {
                C7893j.m37818b(CronetUrlRequestContext.f40731a, "Exception in onSucceeded method", e);
            }
        }
    }
}
