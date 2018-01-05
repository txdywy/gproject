package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7377g extends b {
    public int f36869a;
    public boolean f36870b;
    public boolean f36871c;

    public C7377g() {
        this.f36869a = 0;
        this.f36870b = false;
        this.f36871c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34946a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36869a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f36870b);
        }
        if ((this.f36869a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f36871c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34947b() {
        int b = super.b();
        if ((this.f36869a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f36869a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34945a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36870b = c7213a.m33563e();
                    this.f36869a |= 1;
                    continue;
                case 16:
                    this.f36871c = c7213a.m33563e();
                    this.f36869a |= 2;
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
