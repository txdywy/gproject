package org.chromium.net.impl;

import java.nio.ByteBuffer;

final class C7962v implements Runnable {
    public ByteBuffer f40935a;
    public final /* synthetic */ CronetUrlRequest f40936b;

    C7962v(CronetUrlRequest cronetUrlRequest) {
        this.f40936b = cronetUrlRequest;
    }

    public final void run() {
        this.f40936b.m38022f();
        ByteBuffer byteBuffer = this.f40935a;
        this.f40935a = null;
        try {
            synchronized (this.f40936b.f40713f) {
                if (this.f40936b.m38021e()) {
                    return;
                }
                this.f40936b.f40712e = true;
                this.f40936b.f40718k.mo6582a(this.f40936b, this.f40936b.f40726s, byteBuffer);
            }
        } catch (Exception e) {
            this.f40936b.m38012a(e);
        }
    }
}
