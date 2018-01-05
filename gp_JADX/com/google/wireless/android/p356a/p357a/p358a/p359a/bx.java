package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bx extends b {
    public int f35849a;
    public long f35850b;
    public long f35851c;

    public bx() {
        this.f35849a = 0;
        this.f35850b = 0;
        this.f35851c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34244a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35849a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f35850b);
        }
        if ((this.f35849a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f35851c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34245b() {
        int b = super.b();
        if ((this.f35849a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f35850b);
        }
        if ((this.f35849a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(2, this.f35851c);
        }
        return b;
    }

    public final /* synthetic */ i m34243a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35850b = c7213a.m33568j();
                    this.f35849a |= 1;
                    continue;
                case 16:
                    this.f35851c = c7213a.m33568j();
                    this.f35849a |= 2;
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
