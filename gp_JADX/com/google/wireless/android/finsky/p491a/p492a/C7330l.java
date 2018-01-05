package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.nano.C7545u;

public final class C7330l extends b {
    public int f36550a;
    public C7545u f36551b;
    public boolean f36552c;

    public C7330l() {
        this.f36550a = 0;
        this.f36551b = null;
        this.f36552c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34748a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36551b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36551b);
        }
        if ((this.f36550a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f36552c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34749b() {
        int b = super.b();
        if (this.f36551b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36551b);
        }
        if ((this.f36550a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34747a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36551b == null) {
                        this.f36551b = new C7545u();
                    }
                    c7213a.m33552a(this.f36551b);
                    continue;
                case 16:
                    this.f36552c = c7213a.m33563e();
                    this.f36550a |= 1;
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
