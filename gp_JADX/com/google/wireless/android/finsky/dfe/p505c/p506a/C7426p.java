package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7426p extends b {
    public bl f37637a;
    public dx f37638b;

    public C7426p() {
        this.f37637a = null;
        this.f37638b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35494a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37637a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37637a);
        }
        if (this.f37638b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37638b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35495b() {
        int b = super.b();
        if (this.f37637a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37637a);
        }
        if (this.f37638b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37638b);
        }
        return b;
    }

    public final /* synthetic */ i m35493a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37637a == null) {
                        this.f37637a = new bl();
                    }
                    c7213a.m33552a(this.f37637a);
                    continue;
                case 18:
                    if (this.f37638b == null) {
                        this.f37638b = new dx();
                    }
                    c7213a.m33552a(this.f37638b);
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
