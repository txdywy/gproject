package org.chromium.net.impl;

import org.chromium.base.C7893j;

final class C7960t implements Runnable {
    public final /* synthetic */ CronetUrlRequest f40934a;

    C7960t(CronetUrlRequest cronetUrlRequest) {
        this.f40934a = cronetUrlRequest;
    }

    public final void run() {
        try {
            this.f40934a.f40718k.mo6583a(this.f40934a, this.f40934a.f40726s, this.f40934a.f40727t);
            this.f40934a.m38023g();
        } catch (Exception e) {
            C7893j.m37818b(CronetUrlRequestContext.f40731a, "Exception in onFailed method", e);
        }
    }
}
