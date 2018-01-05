package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ao extends b {
    public int f35635a;
    public int f35636b;
    public int f35637c;

    public final ao m34109a(int i) {
        this.f35636b = i;
        this.f35635a |= 1;
        return this;
    }

    public final ao m34112b(int i) {
        this.f35635a |= 2;
        this.f35637c = i;
        return this;
    }

    public ao() {
        this.f35635a = 0;
        this.f35636b = 0;
        this.f35637c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34110a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35635a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35636b);
        }
        if ((this.f35635a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35637c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34111b() {
        int b = super.b();
        if ((this.f35635a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35636b);
        }
        if ((this.f35635a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f35637c);
        }
        return b;
    }

    private final ao m34107b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35635a |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f35636b = am.m34099a(c7213a.m33567i());
                        this.f35635a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    this.f35637c = c7213a.m33567i();
                    this.f35635a |= 2;
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

    public final /* synthetic */ i m34108a(C7213a c7213a) {
        return m34107b(c7213a);
    }
}
