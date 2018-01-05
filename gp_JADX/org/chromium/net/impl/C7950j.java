package org.chromium.net.impl;

final class C7950j implements Runnable {
    public final /* synthetic */ CronetUploadDataStream f40917a;

    C7950j(CronetUploadDataStream cronetUploadDataStream) {
        this.f40917a = cronetUploadDataStream;
    }

    public final void run() {
        synchronized (this.f40917a.f40703j) {
            if (this.f40917a.f40704k == 0) {
                return;
            }
            this.f40917a.m38001a(C7953m.NOT_IN_CALLBACK);
            if (this.f40917a.f40702i == null) {
                throw new IllegalStateException("Unexpected readData call. Buffer is null");
            }
            this.f40917a.f40705l = C7953m.READ;
            try {
                this.f40917a.f40697d.m38022f();
                this.f40917a.f40696c.mo6578a(this.f40917a, this.f40917a.f40702i);
            } catch (Throwable e) {
                this.f40917a.m38000a(e);
            }
        }
    }
}
