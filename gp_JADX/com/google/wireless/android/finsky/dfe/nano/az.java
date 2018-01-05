package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class az extends b {
    public int f38404a;
    public boolean f38405b;

    public az() {
        this.f38404a = 0;
        this.f38405b = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36048a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38404a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f38405b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36049b() {
        int b = super.b();
        if ((this.f38404a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(1) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m36047a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f38405b = c7213a.m33563e();
                    this.f38404a |= 1;
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
