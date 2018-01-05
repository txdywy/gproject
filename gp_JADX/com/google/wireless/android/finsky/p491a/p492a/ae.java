package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ae extends b {
    public int f36337a;
    public ay f36338b;
    public boolean f36339c;

    public ae() {
        this.f36337a = 0;
        this.f36338b = null;
        this.f36339c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34614a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36338b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36338b);
        }
        if ((this.f36337a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f36339c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34615b() {
        int b = super.b();
        if (this.f36338b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36338b);
        }
        if ((this.f36337a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34613a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36338b == null) {
                        this.f36338b = new ay();
                    }
                    c7213a.m33552a(this.f36338b);
                    continue;
                case 16:
                    this.f36339c = c7213a.m33563e();
                    this.f36337a |= 1;
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
