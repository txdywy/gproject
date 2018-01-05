package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gi extends b {
    public int f39089a;
    public int f39090b;

    public gi() {
        this.f39089a = 0;
        this.f39090b = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36500a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39089a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f39090b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36501b() {
        int b = super.b();
        if ((this.f39089a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f39090b);
        }
        return b;
    }

    public final /* synthetic */ i m36499a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    this.f39090b = c7213a.m33567i();
                    this.f39089a |= 1;
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
