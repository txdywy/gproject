package com.google.wireless.android.finsky.dfe.p517i.p518a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7506e extends b {
    public static volatile C7506e[] f38193a;
    public ax f38194b;
    public C7504c f38195c;
    public C7508g f38196d;

    public static C7506e[] m35886d() {
        if (f38193a == null) {
            synchronized (C7219h.f35465b) {
                if (f38193a == null) {
                    f38193a = new C7506e[0];
                }
            }
        }
        return f38193a;
    }

    public C7506e() {
        this.f38194b = null;
        this.f38195c = null;
        this.f38196d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35888a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38195c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38195c);
        }
        if (this.f38196d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38196d);
        }
        if (this.f38194b != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38194b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35889b() {
        int b = super.b();
        if (this.f38195c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38195c);
        }
        if (this.f38196d != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38196d);
        }
        if (this.f38194b != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f38194b);
        }
        return b;
    }

    public final /* synthetic */ i m35887a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38195c == null) {
                        this.f38195c = new C7504c();
                    }
                    c7213a.m33552a(this.f38195c);
                    continue;
                case 18:
                    if (this.f38196d == null) {
                        this.f38196d = new C7508g();
                    }
                    c7213a.m33552a(this.f38196d);
                    continue;
                case 26:
                    if (this.f38194b == null) {
                        this.f38194b = new ax();
                    }
                    c7213a.m33552a(this.f38194b);
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
