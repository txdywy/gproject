package org.chromium.net.impl;

final class C7954n implements Runnable {
    public final /* synthetic */ CronetUrlRequest f40925a;

    C7954n(CronetUrlRequest cronetUrlRequest) {
        this.f40925a = cronetUrlRequest;
    }

    public final void run() {
        CronetUploadDataStream cronetUploadDataStream = this.f40925a.f40725r;
        synchronized (cronetUploadDataStream.f40703j) {
            cronetUploadDataStream.f40705l = C7953m.GET_LENGTH;
        }
        try {
            cronetUploadDataStream.f40697d.m38022f();
            cronetUploadDataStream.f40698e = cronetUploadDataStream.f40696c.mo6576a();
            cronetUploadDataStream.f40699f = cronetUploadDataStream.f40698e;
        } catch (Throwable th) {
            cronetUploadDataStream.m38000a(th);
        }
        synchronized (cronetUploadDataStream.f40703j) {
            cronetUploadDataStream.f40705l = C7953m.NOT_IN_CALLBACK;
        }
        synchronized (this.f40925a.f40713f) {
            if (this.f40925a.m38021e()) {
                return;
            }
            this.f40925a.f40725r.m37997a(this.f40925a.f40709b);
            this.f40925a.m38020d();
        }
    }
}
