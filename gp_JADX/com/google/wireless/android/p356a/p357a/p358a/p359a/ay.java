package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ay extends b {
    public int f35686a;
    public boolean f35687b;
    public boolean f35688c;
    public int f35689d;

    public final ay m34144a(boolean z) {
        this.f35686a |= 1;
        this.f35687b = z;
        return this;
    }

    public final ay m34143a(int i) {
        this.f35686a |= 4;
        this.f35689d = i;
        return this;
    }

    public ay() {
        this.f35686a = 0;
        this.f35687b = false;
        this.f35688c = false;
        this.f35689d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34145a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35686a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f35687b);
        }
        if ((this.f35686a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f35688c);
        }
        if ((this.f35686a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f35689d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34146b() {
        int b = super.b();
        if ((this.f35686a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f35686a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f35686a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f35689d);
        }
        return b;
    }

    public final /* synthetic */ i m34142a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35687b = c7213a.m33563e();
                    this.f35686a |= 1;
                    continue;
                case 16:
                    this.f35688c = c7213a.m33563e();
                    this.f35686a |= 2;
                    continue;
                case 24:
                    this.f35689d = c7213a.m33567i();
                    this.f35686a |= 4;
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
