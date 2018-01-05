package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cn extends b {
    public cg f37321a;
    public de f37322b;
    public de f37323c;
    public bp f37324d;
    public cg f37325e;
    public bl f37326f;

    public cn() {
        this.f37321a = null;
        this.f37322b = null;
        this.f37323c = null;
        this.f37324d = null;
        this.f37325e = null;
        this.f37326f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35288a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37321a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37321a);
        }
        if (this.f37322b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37322b);
        }
        if (this.f37323c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37323c);
        }
        if (this.f37324d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37324d);
        }
        if (this.f37325e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37325e);
        }
        if (this.f37326f != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37326f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35289b() {
        int b = super.b();
        if (this.f37321a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37321a);
        }
        if (this.f37322b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37322b);
        }
        if (this.f37323c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37323c);
        }
        if (this.f37324d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37324d);
        }
        if (this.f37325e != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37325e);
        }
        if (this.f37326f != null) {
            return b + CodedOutputByteBufferNano.m33503d(6, this.f37326f);
        }
        return b;
    }

    public final /* synthetic */ i m35287a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37321a == null) {
                        this.f37321a = new cg();
                    }
                    c7213a.m33552a(this.f37321a);
                    continue;
                case 18:
                    if (this.f37322b == null) {
                        this.f37322b = new de();
                    }
                    c7213a.m33552a(this.f37322b);
                    continue;
                case 26:
                    if (this.f37323c == null) {
                        this.f37323c = new de();
                    }
                    c7213a.m33552a(this.f37323c);
                    continue;
                case 34:
                    if (this.f37324d == null) {
                        this.f37324d = new bp();
                    }
                    c7213a.m33552a(this.f37324d);
                    continue;
                case 42:
                    if (this.f37325e == null) {
                        this.f37325e = new cg();
                    }
                    c7213a.m33552a(this.f37325e);
                    continue;
                case 50:
                    if (this.f37326f == null) {
                        this.f37326f = new bl();
                    }
                    c7213a.m33552a(this.f37326f);
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
