package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bf extends b {
    public int f35771a;
    public long f35772b;
    public long f35773c;
    public long f35774d;
    public long f35775e;
    public int f35776f;

    public bf() {
        this.f35771a = 0;
        this.f35772b = 0;
        this.f35773c = 0;
        this.f35774d = 0;
        this.f35775e = 0;
        this.f35776f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34176a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35771a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f35776f);
        }
        if ((this.f35771a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(6, this.f35772b);
        }
        if ((this.f35771a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(7, this.f35773c);
        }
        if ((this.f35771a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(8, this.f35774d);
        }
        if ((this.f35771a & 8) != 0) {
            codedOutputByteBufferNano.m33531b(9, this.f35775e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34177b() {
        int b = super.b();
        if ((this.f35771a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f35776f);
        }
        if ((this.f35771a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(6, this.f35772b);
        }
        if ((this.f35771a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(7, this.f35773c);
        }
        if ((this.f35771a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(8, this.f35774d);
        }
        if ((this.f35771a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(9, this.f35775e);
        }
        return b;
    }

    public final /* synthetic */ i m34175a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 40:
                    this.f35776f = c7213a.m33567i();
                    this.f35771a |= 16;
                    continue;
                case 48:
                    this.f35772b = c7213a.m33568j();
                    this.f35771a |= 1;
                    continue;
                case 56:
                    this.f35773c = c7213a.m33568j();
                    this.f35771a |= 2;
                    continue;
                case 64:
                    this.f35774d = c7213a.m33568j();
                    this.f35771a |= 4;
                    continue;
                case 72:
                    this.f35775e = c7213a.m33568j();
                    this.f35771a |= 8;
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
