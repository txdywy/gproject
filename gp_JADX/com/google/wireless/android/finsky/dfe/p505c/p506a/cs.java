package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cs extends b {
    public de f37348a;
    public de f37349b;
    public de f37350c;
    public de f37351d;

    public cs() {
        this.f37348a = null;
        this.f37349b = null;
        this.f37350c = null;
        this.f37351d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35312a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37348a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37348a);
        }
        if (this.f37349b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37349b);
        }
        if (this.f37350c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37350c);
        }
        if (this.f37351d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37351d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35313b() {
        int b = super.b();
        if (this.f37348a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37348a);
        }
        if (this.f37349b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37349b);
        }
        if (this.f37350c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37350c);
        }
        if (this.f37351d != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f37351d);
        }
        return b;
    }

    public final /* synthetic */ i m35311a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37348a == null) {
                        this.f37348a = new de();
                    }
                    c7213a.m33552a(this.f37348a);
                    continue;
                case 18:
                    if (this.f37349b == null) {
                        this.f37349b = new de();
                    }
                    c7213a.m33552a(this.f37349b);
                    continue;
                case 26:
                    if (this.f37350c == null) {
                        this.f37350c = new de();
                    }
                    c7213a.m33552a(this.f37350c);
                    continue;
                case 34:
                    if (this.f37351d == null) {
                        this.f37351d = new de();
                    }
                    c7213a.m33552a(this.f37351d);
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
