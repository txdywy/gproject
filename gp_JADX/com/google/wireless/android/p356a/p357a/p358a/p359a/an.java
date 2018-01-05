package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class an extends b {
    public int f35631a;
    public int f35632b;
    public int f35633c;
    public boolean f35634d;

    public final an m34103a(int i) {
        this.f35632b = i;
        this.f35631a |= 1;
        return this;
    }

    public final an m34106b(int i) {
        this.f35633c = i;
        this.f35631a |= 2;
        return this;
    }

    public an() {
        this.f35631a = 0;
        this.f35632b = 0;
        this.f35633c = 0;
        this.f35634d = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34104a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35631a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35632b);
        }
        if ((this.f35631a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35633c);
        }
        if ((this.f35631a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f35634d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34105b() {
        int b = super.b();
        if ((this.f35631a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35632b);
        }
        if ((this.f35631a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35633c);
        }
        if ((this.f35631a & 4) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(3) + 1);
        }
        return b;
    }

    private final an m34101b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35631a |= 1;
                    o = c7213a.m33573o();
                    try {
                        this.f35632b = am.m34099a(c7213a.m33567i());
                        this.f35631a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    this.f35631a |= 2;
                    o = c7213a.m33573o();
                    try {
                        this.f35633c = am.m34099a(c7213a.m33567i());
                        this.f35631a |= 2;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 24:
                    this.f35634d = c7213a.m33563e();
                    this.f35631a |= 4;
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

    public final /* synthetic */ i m34102a(C7213a c7213a) {
        return m34101b(c7213a);
    }
}
