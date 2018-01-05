package org.chromium.net.impl;

import org.chromium.base.C7893j;

final class C7958r implements Runnable {
    public final /* synthetic */ CronetUrlRequest f40931a;

    C7958r(CronetUrlRequest cronetUrlRequest) {
        this.f40931a = cronetUrlRequest;
    }

    public final void run() {
        try {
            this.f40931a.f40718k.mo6585c(this.f40931a, this.f40931a.f40726s);
            this.f40931a.m38023g();
        } catch (Exception e) {
            C7893j.m37818b(CronetUrlRequestContext.f40731a, "Exception in onCanceled method", e);
        }
    }
}
