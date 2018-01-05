package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aq extends b {
    public int f35641a;
    public int f35642b;
    public long f35643c;
    public long f35644d;
    public boolean f35645e;
    public int f35646f;

    public aq() {
        this.f35641a = 0;
        this.f35642b = 0;
        this.f35643c = 0;
        this.f35644d = 0;
        this.f35645e = false;
        this.f35646f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34117a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35641a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35642b);
        }
        if ((this.f35641a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f35643c);
        }
        if ((this.f35641a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f35644d);
        }
        if ((this.f35641a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f35645e);
        }
        if ((this.f35641a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f35646f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34118b() {
        int b = super.b();
        if ((this.f35641a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35642b);
        }
        if ((this.f35641a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f35643c);
        }
        if ((this.f35641a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f35644d);
        }
        if ((this.f35641a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if ((this.f35641a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(5, this.f35646f);
        }
        return b;
    }

    public final /* synthetic */ i m34116a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35642b = c7213a.m33567i();
                    this.f35641a |= 1;
                    continue;
                case 16:
                    this.f35643c = c7213a.m33568j();
                    this.f35641a |= 2;
                    continue;
                case 24:
                    this.f35644d = c7213a.m33568j();
                    this.f35641a |= 4;
                    continue;
                case 32:
                    this.f35645e = c7213a.m33563e();
                    this.f35641a |= 8;
                    continue;
                case 40:
                    this.f35646f = c7213a.m33567i();
                    this.f35641a |= 16;
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
