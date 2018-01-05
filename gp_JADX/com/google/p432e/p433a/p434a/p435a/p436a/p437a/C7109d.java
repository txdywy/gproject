package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7109d extends b {
    public int f34771a;

    public C7109d() {
        this.f34771a = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32305a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34771a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f34771a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32306b() {
        int b = super.b();
        if (this.f34771a != 0) {
            return b + CodedOutputByteBufferNano.m33502d(1, this.f34771a);
        }
        return b;
    }

    public final /* synthetic */ i m32304a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34771a = c7213a.m33567i();
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
