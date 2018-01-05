package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bn extends b {
    public int f35816a;
    public int f35817b;
    public int f35818c;

    public bn() {
        this.f35816a = 0;
        this.f35817b = -1;
        this.f35818c = -1;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34209a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35816a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35817b);
        }
        if ((this.f35816a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35818c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34210b() {
        int b = super.b();
        if ((this.f35816a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35817b);
        }
        if ((this.f35816a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f35818c);
        }
        return b;
    }

    public final /* synthetic */ i m34208a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35817b = c7213a.m33567i();
                    this.f35816a |= 1;
                    continue;
                case 16:
                    this.f35818c = c7213a.m33567i();
                    this.f35816a |= 2;
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
