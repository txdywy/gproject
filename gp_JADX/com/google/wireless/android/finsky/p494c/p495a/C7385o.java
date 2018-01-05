package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7385o extends b {
    public int f36906a;
    public int f36907b;
    public int f36908c;

    public C7385o() {
        this.f36906a = 0;
        this.f36907b = 0;
        this.f36908c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34972a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36906a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36907b);
        }
        if ((this.f36906a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36908c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34973b() {
        int b = super.b();
        if ((this.f36906a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36907b);
        }
        if ((this.f36906a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f36908c);
        }
        return b;
    }

    public final /* synthetic */ i m34971a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36907b = c7213a.m33567i();
                    this.f36906a |= 1;
                    continue;
                case 16:
                    this.f36908c = c7213a.m33567i();
                    this.f36906a |= 2;
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
