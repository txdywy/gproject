package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ch extends b {
    public int f35945a;
    public boolean f35946b;
    public boolean f35947c;
    public int f35948d;
    public int f35949e;
    public int f35950f;

    public ch() {
        this.f35945a = 0;
        this.f35946b = false;
        this.f35947c = false;
        this.f35948d = 0;
        this.f35949e = 0;
        this.f35950f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34305a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35945a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f35946b);
        }
        if ((this.f35945a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f35947c);
        }
        if ((this.f35945a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f35948d);
        }
        if ((this.f35945a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35949e);
        }
        if ((this.f35945a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f35950f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34306b() {
        int b = super.b();
        if ((this.f35945a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f35945a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f35945a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f35948d);
        }
        if ((this.f35945a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f35949e);
        }
        if ((this.f35945a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(5, this.f35950f);
        }
        return b;
    }

    public final /* synthetic */ i m34304a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35946b = c7213a.m33563e();
                    this.f35945a |= 1;
                    continue;
                case 16:
                    this.f35947c = c7213a.m33563e();
                    this.f35945a |= 2;
                    continue;
                case 24:
                    this.f35948d = c7213a.m33567i();
                    this.f35945a |= 4;
                    continue;
                case 32:
                    this.f35949e = c7213a.m33567i();
                    this.f35945a |= 8;
                    continue;
                case 40:
                    this.f35950f = c7213a.m33567i();
                    this.f35945a |= 16;
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
