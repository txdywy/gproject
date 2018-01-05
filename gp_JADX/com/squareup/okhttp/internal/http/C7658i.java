package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.k;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p526e.C7726f;

final class C7658i extends C7656g {
    public final /* synthetic */ C7655f f39643c;
    public long f39644d = -1;
    public boolean f39645e = true;
    public final C7666q f39646f;

    C7658i(C7655f c7655f, C7666q c7666q) {
        this.f39643c = c7655f;
        super(c7655f);
        this.f39646f = c7666q;
    }

    public final long mo6423a(C7726f c7726f, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.b) {
            throw new IllegalStateException("closed");
        } else if (!this.f39645e) {
            return -1;
        } else {
            if (this.f39644d == 0 || this.f39644d == -1) {
                if (this.f39644d != -1) {
                    this.f39643c.f39633b.mo6504n();
                }
                try {
                    this.f39644d = this.f39643c.f39633b.mo6503k();
                    String trim = this.f39643c.f39633b.mo6504n().trim();
                    if (this.f39644d < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f39644d + trim + "\"");
                    }
                    if (this.f39644d == 0) {
                        this.f39645e = false;
                        this.f39646f.m36967a(this.f39643c.m36942d());
                        m36944b();
                    }
                    if (!this.f39645e) {
                        return -1;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long a = this.f39643c.f39633b.mo6423a(c7726f, Math.min(j, this.f39644d));
            if (a == -1) {
                m36945c();
                throw new ProtocolException("unexpected end of stream");
            }
            this.f39644d -= a;
            return a;
        }
    }

    public final void close() {
        if (!this.b) {
            if (this.f39645e && !k.a(this, TimeUnit.MILLISECONDS)) {
                m36945c();
            }
            this.b = true;
        }
    }
}
