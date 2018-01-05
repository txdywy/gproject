package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bk extends b {
    public bj f35809a;
    public bl f35810b;

    public bk() {
        this.f35809a = null;
        this.f35810b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34198a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35809a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f35809a);
        }
        if (this.f35810b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35810b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34199b() {
        int b = super.b();
        if (this.f35809a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f35809a);
        }
        if (this.f35810b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f35810b);
        }
        return b;
    }

    public final /* synthetic */ i m34197a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f35809a == null) {
                        this.f35809a = new bj();
                    }
                    c7213a.m33552a(this.f35809a);
                    continue;
                case 18:
                    if (this.f35810b == null) {
                        this.f35810b = new bl();
                    }
                    c7213a.m33552a(this.f35810b);
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
