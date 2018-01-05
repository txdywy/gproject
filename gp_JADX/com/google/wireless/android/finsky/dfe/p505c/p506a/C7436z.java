package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7436z extends b {
    public cj f37721a;
    public de f37722b;
    public de f37723c;
    public de f37724d;
    public de f37725e;

    public C7436z() {
        this.f37721a = null;
        this.f37722b = null;
        this.f37723c = null;
        this.f37724d = null;
        this.f37725e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35532a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37721a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37721a);
        }
        if (this.f37722b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37722b);
        }
        if (this.f37723c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37723c);
        }
        if (this.f37724d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37724d);
        }
        if (this.f37725e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37725e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35533b() {
        int b = super.b();
        if (this.f37721a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37721a);
        }
        if (this.f37722b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37722b);
        }
        if (this.f37723c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37723c);
        }
        if (this.f37724d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37724d);
        }
        if (this.f37725e != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f37725e);
        }
        return b;
    }

    public final /* synthetic */ i m35531a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37721a == null) {
                        this.f37721a = new cj();
                    }
                    c7213a.m33552a(this.f37721a);
                    continue;
                case 18:
                    if (this.f37722b == null) {
                        this.f37722b = new de();
                    }
                    c7213a.m33552a(this.f37722b);
                    continue;
                case 26:
                    if (this.f37723c == null) {
                        this.f37723c = new de();
                    }
                    c7213a.m33552a(this.f37723c);
                    continue;
                case 34:
                    if (this.f37724d == null) {
                        this.f37724d = new de();
                    }
                    c7213a.m33552a(this.f37724d);
                    continue;
                case 42:
                    if (this.f37725e == null) {
                        this.f37725e = new de();
                    }
                    c7213a.m33552a(this.f37725e);
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
