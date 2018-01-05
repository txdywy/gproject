package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.k;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p526e.C7726f;

final class C7660k extends C7656g {
    public final /* synthetic */ C7655f f39651c;
    public long f39652d;

    public C7660k(C7655f c7655f, long j) {
        this.f39651c = c7655f;
        super(c7655f);
        this.f39652d = j;
        if (this.f39652d == 0) {
            m36944b();
        }
    }

    public final long mo6423a(C7726f c7726f, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.b) {
            throw new IllegalStateException("closed");
        } else if (this.f39652d == 0) {
            return -1;
        } else {
            long a = this.f39651c.f39633b.mo6423a(c7726f, Math.min(this.f39652d, j));
            if (a == -1) {
                m36945c();
                throw new ProtocolException("unexpected end of stream");
            }
            this.f39652d -= a;
            if (this.f39652d == 0) {
                m36944b();
            }
            return a;
        }
    }

    public final void close() {
        if (!this.b) {
            if (!(this.f39652d == 0 || k.a(this, TimeUnit.MILLISECONDS))) {
                m36945c();
            }
            this.b = true;
        }
    }
}
