package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.internal.k;
import java.net.ProtocolException;
import p526e.C7631z;
import p526e.C7726f;
import p526e.C7730m;
import p526e.ab;

final class C7659j implements C7631z {
    public final C7730m f39647a = new C7730m(this.f39650d.f39634c.mo6454a());
    public boolean f39648b;
    public long f39649c;
    public final /* synthetic */ C7655f f39650d;

    C7659j(C7655f c7655f, long j) {
        this.f39650d = c7655f;
        this.f39649c = j;
    }

    public final ab mo6454a() {
        return this.f39647a;
    }

    public final void a_(C7726f c7726f, long j) {
        if (this.f39648b) {
            throw new IllegalStateException("closed");
        }
        k.a(c7726f.f40188c, j);
        if (j > this.f39649c) {
            throw new ProtocolException("expected " + this.f39649c + " bytes but received " + j);
        }
        this.f39650d.f39634c.a_(c7726f, j);
        this.f39649c -= j;
    }

    public final void flush() {
        if (!this.f39648b) {
            this.f39650d.f39634c.flush();
        }
    }

    public final void close() {
        if (!this.f39648b) {
            this.f39648b = true;
            if (this.f39649c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            C7730m c7730m = this.f39647a;
            ab abVar = c7730m.f40198a;
            ab abVar2 = ab.f39527h;
            if (abVar2 == null) {
                throw new IllegalArgumentException("delegate == null");
            }
            c7730m.f40198a = abVar2;
            abVar.mo6512e();
            abVar.mo6511d();
            this.f39650d.f39636e = 3;
        }
    }
}
