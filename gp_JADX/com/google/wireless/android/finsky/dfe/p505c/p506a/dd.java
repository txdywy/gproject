package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dd extends b {
    public de f37411a;
    public bl f37412b;

    public dd() {
        this.f37411a = null;
        this.f37412b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35351a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37411a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37411a);
        }
        if (this.f37412b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37412b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35352b() {
        int b = super.b();
        if (this.f37411a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37411a);
        }
        if (this.f37412b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37412b);
        }
        return b;
    }

    public final /* synthetic */ i m35350a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37411a == null) {
                        this.f37411a = new de();
                    }
                    c7213a.m33552a(this.f37411a);
                    continue;
                case 18:
                    if (this.f37412b == null) {
                        this.f37412b = new bl();
                    }
                    c7213a.m33552a(this.f37412b);
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
