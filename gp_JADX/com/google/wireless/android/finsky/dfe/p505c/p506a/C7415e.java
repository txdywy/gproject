package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7415e extends b {
    public int f37515a;
    public int f37516b;
    public int f37517c;

    public C7415e() {
        this.f37515a = 0;
        this.f37516b = 0;
        this.f37517c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35427a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37515a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37516b);
        }
        if ((this.f37515a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37517c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35428b() {
        int b = super.b();
        if ((this.f37515a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37516b);
        }
        if ((this.f37515a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f37517c);
        }
        return b;
    }

    public final /* synthetic */ i m35426a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37516b = c7213a.m33567i();
                    this.f37515a |= 1;
                    continue;
                case 16:
                    this.f37517c = c7213a.m33567i();
                    this.f37515a |= 2;
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
