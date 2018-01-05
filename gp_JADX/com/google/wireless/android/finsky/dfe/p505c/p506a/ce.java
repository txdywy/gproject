package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ce extends b {
    public int f37285a;
    public cg f37286b;
    public de f37287c;
    public de f37288d;
    public de f37289e;
    public boolean f37290f;

    public ce() {
        this.f37285a = 0;
        this.f37286b = null;
        this.f37287c = null;
        this.f37288d = null;
        this.f37289e = null;
        this.f37290f = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35257a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37286b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37286b);
        }
        if (this.f37287c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37287c);
        }
        if (this.f37288d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37288d);
        }
        if (this.f37289e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37289e);
        }
        if ((this.f37285a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f37290f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35258b() {
        int b = super.b();
        if (this.f37286b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37286b);
        }
        if (this.f37287c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37287c);
        }
        if (this.f37288d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37288d);
        }
        if (this.f37289e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37289e);
        }
        if ((this.f37285a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(5) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35256a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37286b == null) {
                        this.f37286b = new cg();
                    }
                    c7213a.m33552a(this.f37286b);
                    continue;
                case 18:
                    if (this.f37287c == null) {
                        this.f37287c = new de();
                    }
                    c7213a.m33552a(this.f37287c);
                    continue;
                case 26:
                    if (this.f37288d == null) {
                        this.f37288d = new de();
                    }
                    c7213a.m33552a(this.f37288d);
                    continue;
                case 34:
                    if (this.f37289e == null) {
                        this.f37289e = new de();
                    }
                    c7213a.m33552a(this.f37289e);
                    continue;
                case 40:
                    this.f37290f = c7213a.m33563e();
                    this.f37285a |= 1;
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
