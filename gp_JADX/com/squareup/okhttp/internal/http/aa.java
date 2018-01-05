package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.k;
import java.net.ProtocolException;
import p526e.C7631z;
import p526e.C7726f;
import p526e.ab;

public final class aa implements C7631z {
    public boolean f39596a;
    public final int f39597b;
    public final C7726f f39598c;

    public aa(int i) {
        this.f39598c = new C7726f();
        this.f39597b = i;
    }

    public aa() {
        this(-1);
    }

    public final void close() {
        if (!this.f39596a) {
            this.f39596a = true;
            if (this.f39598c.f40188c < ((long) this.f39597b)) {
                throw new ProtocolException("content-length promised " + this.f39597b + " bytes, but received " + this.f39598c.f40188c);
            }
        }
    }

    public final void a_(C7726f c7726f, long j) {
        if (this.f39596a) {
            throw new IllegalStateException("closed");
        }
        k.a(c7726f.f40188c, j);
        if (this.f39597b == -1 || this.f39598c.f40188c <= ((long) this.f39597b) - j) {
            this.f39598c.a_(c7726f, j);
            return;
        }
        throw new ProtocolException("exceeded content-length limit of " + this.f39597b + " bytes");
    }

    public final void flush() {
    }

    public final ab mo6454a() {
        return ab.f39527h;
    }

    public final void m36901a(C7631z c7631z) {
        C7726f c7726f = new C7726f();
        this.f39598c.m37376a(c7726f, 0, this.f39598c.f40188c);
        c7631z.a_(c7726f, c7726f.f40188c);
    }
}
