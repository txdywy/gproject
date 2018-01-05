package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class au extends b {
    public int f35668a;
    public long f35669b;
    public long f35670c;

    public au() {
        this.f35668a = 0;
        this.f35669b = 0;
        this.f35670c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34130a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35668a & 1) != 0) {
            codedOutputByteBufferNano.m33519a(1, this.f35669b);
        }
        if ((this.f35668a & 2) != 0) {
            codedOutputByteBufferNano.m33519a(2, this.f35670c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34131b() {
        int b = super.b();
        if ((this.f35668a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33505e(1, this.f35669b);
        }
        if ((this.f35668a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33505e(2, this.f35670c);
        }
        return b;
    }

    public final /* synthetic */ i m34129a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35669b = c7213a.m33568j();
                    this.f35668a |= 1;
                    continue;
                case 16:
                    this.f35670c = c7213a.m33568j();
                    this.f35668a |= 2;
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
