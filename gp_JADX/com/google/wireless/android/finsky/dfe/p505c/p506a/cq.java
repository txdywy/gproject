package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cq extends b {
    public cr f37338a;
    public bl f37339b;

    public cq() {
        this.f37338a = null;
        this.f37339b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35303a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37338a != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37338a);
        }
        if (this.f37339b != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37339b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35304b() {
        int b = super.b();
        if (this.f37338a != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37338a);
        }
        if (this.f37339b != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f37339b);
        }
        return b;
    }

    public final /* synthetic */ i m35302a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    if (this.f37338a == null) {
                        this.f37338a = new cr();
                    }
                    c7213a.m33552a(this.f37338a);
                    continue;
                case 26:
                    if (this.f37339b == null) {
                        this.f37339b = new bl();
                    }
                    c7213a.m33552a(this.f37339b);
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
