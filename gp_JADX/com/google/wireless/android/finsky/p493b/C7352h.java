package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7352h extends b {
    public int f36758a;
    public int f36759b;
    public int f36760c;

    public C7352h() {
        this.f36758a = 0;
        this.f36759b = 0;
        this.f36760c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34855a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36758a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36759b);
        }
        if ((this.f36758a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36760c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34856b() {
        int b = super.b();
        if ((this.f36758a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36759b);
        }
        if ((this.f36758a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f36760c);
        }
        return b;
    }

    public final /* synthetic */ i m34854a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36759b = c7213a.m33567i();
                    this.f36758a |= 1;
                    continue;
                case 16:
                    this.f36760c = c7213a.m33567i();
                    this.f36758a |= 2;
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
