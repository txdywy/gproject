package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ab extends b {
    public bl f37010a;
    public bl f37011b;
    public bl f37012c;

    public ab() {
        this.f37010a = null;
        this.f37011b = null;
        this.f37012c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35064a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37010a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37010a);
        }
        if (this.f37011b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37011b);
        }
        if (this.f37012c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37012c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35065b() {
        int b = super.b();
        if (this.f37010a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37010a);
        }
        if (this.f37011b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37011b);
        }
        if (this.f37012c != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f37012c);
        }
        return b;
    }

    public final /* synthetic */ i m35063a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37010a == null) {
                        this.f37010a = new bl();
                    }
                    c7213a.m33552a(this.f37010a);
                    continue;
                case 18:
                    if (this.f37011b == null) {
                        this.f37011b = new bl();
                    }
                    c7213a.m33552a(this.f37011b);
                    continue;
                case 26:
                    if (this.f37012c == null) {
                        this.f37012c = new bl();
                    }
                    c7213a.m33552a(this.f37012c);
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
