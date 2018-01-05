package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cd extends b {
    public cg f37280a;
    public cg f37281b;
    public cg f37282c;
    public cg f37283d;
    public de f37284e;

    public cd() {
        this.f37280a = null;
        this.f37281b = null;
        this.f37282c = null;
        this.f37283d = null;
        this.f37284e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35254a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37280a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37280a);
        }
        if (this.f37281b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37281b);
        }
        if (this.f37282c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37282c);
        }
        if (this.f37283d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37283d);
        }
        if (this.f37284e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37284e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35255b() {
        int b = super.b();
        if (this.f37280a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37280a);
        }
        if (this.f37281b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37281b);
        }
        if (this.f37282c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37282c);
        }
        if (this.f37283d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37283d);
        }
        if (this.f37284e != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f37284e);
        }
        return b;
    }

    public final /* synthetic */ i m35253a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37280a == null) {
                        this.f37280a = new cg();
                    }
                    c7213a.m33552a(this.f37280a);
                    continue;
                case 18:
                    if (this.f37281b == null) {
                        this.f37281b = new cg();
                    }
                    c7213a.m33552a(this.f37281b);
                    continue;
                case 26:
                    if (this.f37282c == null) {
                        this.f37282c = new cg();
                    }
                    c7213a.m33552a(this.f37282c);
                    continue;
                case 34:
                    if (this.f37283d == null) {
                        this.f37283d = new cg();
                    }
                    c7213a.m33552a(this.f37283d);
                    continue;
                case 42:
                    if (this.f37284e == null) {
                        this.f37284e = new de();
                    }
                    c7213a.m33552a(this.f37284e);
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
