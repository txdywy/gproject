package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7120o extends b {
    public boolean f34828a;
    public boolean f34829b;

    public C7120o() {
        this.f34828a = false;
        this.f34829b = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32340a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34828a) {
            codedOutputByteBufferNano.m33522a(2, this.f34828a);
        }
        if (this.f34829b) {
            codedOutputByteBufferNano.m33522a(3, this.f34829b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32341b() {
        int b = super.b();
        if (this.f34828a) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if (this.f34829b) {
            return b + (CodedOutputByteBufferNano.m33501d(3) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m32339a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    this.f34828a = c7213a.m33563e();
                    continue;
                case 24:
                    this.f34829b = c7213a.m33563e();
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
