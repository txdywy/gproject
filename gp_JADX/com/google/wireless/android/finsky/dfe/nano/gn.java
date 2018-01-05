package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gn extends b {
    public int f39108a;
    public int f39109b;

    public final boolean m36519d() {
        return (this.f39108a & 1) != 0;
    }

    public gn() {
        this.f39108a = 0;
        this.f39109b = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36517a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39108a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f39109b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36518b() {
        int b = super.b();
        if ((this.f39108a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(1, this.f39109b);
        }
        return b;
    }

    public final /* synthetic */ i m36516a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f39109b = c7213a.m33567i();
                    this.f39108a |= 1;
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
