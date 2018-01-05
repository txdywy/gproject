package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7119n extends b {
    public int f34826a;
    public boolean f34827b;

    public C7119n() {
        this.f34826a = 0;
        this.f34827b = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32337a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34826a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f34826a);
        }
        if (this.f34827b) {
            codedOutputByteBufferNano.m33522a(3, this.f34827b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32338b() {
        int b = super.b();
        if (this.f34826a != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f34826a);
        }
        if (this.f34827b) {
            return b + (CodedOutputByteBufferNano.m33501d(3) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m32336a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34826a = c7213a.m33567i();
                    continue;
                case 24:
                    this.f34827b = c7213a.m33563e();
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
