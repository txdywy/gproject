package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ae extends b {
    public int f35585a;
    public long f35586b;
    public long f35587c;

    public ae() {
        this.f35585a = 0;
        this.f35586b = 0;
        this.f35587c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34067a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35585a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f35586b);
        }
        if ((this.f35585a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f35587c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34068b() {
        int b = super.b();
        if ((this.f35585a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f35586b);
        }
        if ((this.f35585a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(2, this.f35587c);
        }
        return b;
    }

    public final /* synthetic */ i m34066a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35586b = c7213a.m33568j();
                    this.f35585a |= 1;
                    continue;
                case 16:
                    this.f35587c = c7213a.m33568j();
                    this.f35585a |= 2;
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
