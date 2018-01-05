package com.google.p443h.p451c.p455b.p456a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7165n extends b {
    public int f34990a;

    public C7165n() {
        this.f34990a = 0;
        this.aP = -1;
    }

    public final void m32492a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34990a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f34990a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32493b() {
        int b = super.b();
        if (this.f34990a != 0) {
            return b + CodedOutputByteBufferNano.m33502d(1, this.f34990a);
        }
        return b;
    }

    public final /* synthetic */ i m32491a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34990a = c7213a.m33567i();
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
