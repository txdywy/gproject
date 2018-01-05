package org.chromium.net.impl;

final class C7951k implements Runnable {
    public final /* synthetic */ CronetUploadDataStream f40918a;

    C7951k(CronetUploadDataStream cronetUploadDataStream) {
        this.f40918a = cronetUploadDataStream;
    }

    public final void run() {
        synchronized (this.f40918a.f40703j) {
            if (this.f40918a.f40704k == 0) {
                return;
            }
            this.f40918a.m38001a(C7953m.NOT_IN_CALLBACK);
            this.f40918a.f40705l = C7953m.REWIND;
            try {
                this.f40918a.f40697d.m38022f();
                this.f40918a.f40696c.mo6577a(this.f40918a);
            } catch (Throwable e) {
                this.f40918a.m38000a(e);
            }
        }
    }
}
