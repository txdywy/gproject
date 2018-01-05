package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bb extends b {
    public int f35732a;
    public int f35733b;
    public long f35734c;
    public long f35735d;
    public float f35736e;

    public bb() {
        this.f35732a = 0;
        this.f35733b = 0;
        this.f35734c = 0;
        this.f35735d = 0;
        this.f35736e = 0.0f;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34161a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35732a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35733b);
        }
        if ((this.f35732a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f35734c);
        }
        if ((this.f35732a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f35735d);
        }
        if ((this.f35732a & 8) != 0) {
            codedOutputByteBufferNano.m33517a(4, this.f35736e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34162b() {
        int b = super.b();
        if ((this.f35732a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35733b);
        }
        if ((this.f35732a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f35734c);
        }
        if ((this.f35732a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f35735d);
        }
        if ((this.f35732a & 8) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(4) + 4);
        }
        return b;
    }

    private final bb m34159b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35732a |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f35733b = ce.m34285a(c7213a.m33567i());
                        this.f35732a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    this.f35734c = c7213a.m33568j();
                    this.f35732a |= 2;
                    continue;
                case 24:
                    this.f35735d = c7213a.m33568j();
                    this.f35732a |= 4;
                    continue;
                case 37:
                    this.f35736e = Float.intBitsToFloat(c7213a.m33569k());
                    this.f35732a |= 8;
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

    public final /* synthetic */ i m34160a(C7213a c7213a) {
        return m34159b(c7213a);
    }
}
