package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7386p extends b {
    public int f36909a;
    public byte[] f36910b;
    public int f36911c;

    public C7386p() {
        this.f36909a = 0;
        this.f36910b = C7222l.f35479l;
        this.f36911c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34975a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36909a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(1, this.f36910b);
        }
        if ((this.f36909a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36911c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34976b() {
        int b = super.b();
        if ((this.f36909a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(1, this.f36910b);
        }
        if ((this.f36909a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f36911c);
        }
        return b;
    }

    public final /* synthetic */ i m34974a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36910b = c7213a.m33565g();
                    this.f36909a |= 1;
                    continue;
                case 16:
                    this.f36911c = c7213a.m33567i();
                    this.f36909a |= 2;
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
