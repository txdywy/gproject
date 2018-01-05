package com.squareup.okhttp.internal.http;

import p526e.C7631z;
import p526e.C7726f;
import p526e.C7730m;
import p526e.ab;

final class C7657h implements C7631z {
    public final C7730m f39640a = new C7730m(this.f39642c.f39634c.mo6454a());
    public boolean f39641b;
    public final /* synthetic */ C7655f f39642c;

    C7657h(C7655f c7655f) {
        this.f39642c = c7655f;
    }

    public final ab mo6454a() {
        return this.f39640a;
    }

    public final void a_(C7726f c7726f, long j) {
        if (this.f39641b) {
            throw new IllegalStateException("closed");
        } else if (j != 0) {
            this.f39642c.f39634c.mo6498g(j);
            this.f39642c.f39634c.mo6483a("\r\n");
            this.f39642c.f39634c.a_(c7726f, j);
            this.f39642c.f39634c.mo6483a("\r\n");
        }
    }

    public final synchronized void flush() {
        if (!this.f39641b) {
            this.f39642c.f39634c.flush();
        }
    }

    public final synchronized void close() {
        if (!this.f39641b) {
            this.f39641b = true;
            this.f39642c.f39634c.mo6483a("0\r\n\r\n");
            C7730m c7730m = this.f39640a;
            ab abVar = c7730m.f40198a;
            ab abVar2 = ab.f39527h;
            if (abVar2 == null) {
                throw new IllegalArgumentException("delegate == null");
            }
            c7730m.f40198a = abVar2;
            abVar.mo6512e();
            abVar.mo6511d();
            this.f39642c.f39636e = 3;
        }
    }
}
