package com.squareup.okhttp.internal.http;

import p526e.C7726f;

final class C7661l extends C7656g {
    public final /* synthetic */ C7655f f39653c;
    public boolean f39654d;

    C7661l(C7655f c7655f) {
        this.f39653c = c7655f;
        super(c7655f);
    }

    public final long mo6423a(C7726f c7726f, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.b) {
            throw new IllegalStateException("closed");
        } else if (this.f39654d) {
            return -1;
        } else {
            long a = this.f39653c.f39633b.mo6423a(c7726f, j);
            if (a != -1) {
                return a;
            }
            this.f39654d = true;
            m36944b();
            return -1;
        }
    }

    public final void close() {
        if (!this.b) {
            if (!this.f39654d) {
                m36945c();
            }
            this.b = true;
        }
    }
}
