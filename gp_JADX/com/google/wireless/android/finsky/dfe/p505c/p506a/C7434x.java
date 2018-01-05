package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7434x extends b {
    public cg f37710a;
    public de f37711b;
    public de f37712c;
    public cg f37713d;
    public cg f37714e;

    public C7434x() {
        this.f37710a = null;
        this.f37711b = null;
        this.f37712c = null;
        this.f37713d = null;
        this.f37714e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35526a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37710a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37710a);
        }
        if (this.f37711b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37711b);
        }
        if (this.f37712c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37712c);
        }
        if (this.f37713d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37713d);
        }
        if (this.f37714e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37714e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35527b() {
        int b = super.b();
        if (this.f37710a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37710a);
        }
        if (this.f37711b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37711b);
        }
        if (this.f37712c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37712c);
        }
        if (this.f37713d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37713d);
        }
        if (this.f37714e != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f37714e);
        }
        return b;
    }

    public final /* synthetic */ i m35525a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37710a == null) {
                        this.f37710a = new cg();
                    }
                    c7213a.m33552a(this.f37710a);
                    continue;
                case 18:
                    if (this.f37711b == null) {
                        this.f37711b = new de();
                    }
                    c7213a.m33552a(this.f37711b);
                    continue;
                case 26:
                    if (this.f37712c == null) {
                        this.f37712c = new de();
                    }
                    c7213a.m33552a(this.f37712c);
                    continue;
                case 34:
                    if (this.f37713d == null) {
                        this.f37713d = new cg();
                    }
                    c7213a.m33552a(this.f37713d);
                    continue;
                case 42:
                    if (this.f37714e == null) {
                        this.f37714e = new cg();
                    }
                    c7213a.m33552a(this.f37714e);
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
