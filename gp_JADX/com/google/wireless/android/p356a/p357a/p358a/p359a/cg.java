package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cg extends b {
    public int f35942a;
    public int f35943b;
    public boolean f35944c;

    public cg() {
        this.f35942a = 0;
        this.f35943b = 0;
        this.f35944c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34302a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35942a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35943b);
        }
        if ((this.f35942a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f35944c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34303b() {
        int b = super.b();
        if ((this.f35942a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35943b);
        }
        if ((this.f35942a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34301a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35943b = c7213a.m33567i();
                    this.f35942a |= 1;
                    continue;
                case 16:
                    this.f35944c = c7213a.m33563e();
                    this.f35942a |= 2;
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
