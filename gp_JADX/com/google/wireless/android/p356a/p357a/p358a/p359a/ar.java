package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ar extends b {
    public int f35647a;
    public String f35648b;
    public String f35649c;
    public long f35650d;
    public long f35651e;
    public String f35652f;

    public ar() {
        this.f35647a = 0;
        this.f35648b = "";
        this.f35649c = "";
        this.f35650d = 0;
        this.f35651e = 0;
        this.f35652f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34120a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35647a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f35648b);
        }
        if ((this.f35647a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f35649c);
        }
        if ((this.f35647a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f35650d);
        }
        if ((this.f35647a & 8) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f35651e);
        }
        if ((this.f35647a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f35652f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34121b() {
        int b = super.b();
        if ((this.f35647a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35648b);
        }
        if ((this.f35647a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f35649c);
        }
        if ((this.f35647a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f35650d);
        }
        if ((this.f35647a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f35651e);
        }
        if ((this.f35647a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f35652f);
        }
        return b;
    }

    public final /* synthetic */ i m34119a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f35648b = c7213a.m33564f();
                    this.f35647a |= 1;
                    continue;
                case 18:
                    this.f35649c = c7213a.m33564f();
                    this.f35647a |= 2;
                    continue;
                case 24:
                    this.f35650d = c7213a.m33568j();
                    this.f35647a |= 4;
                    continue;
                case 32:
                    this.f35651e = c7213a.m33568j();
                    this.f35647a |= 8;
                    continue;
                case 42:
                    this.f35652f = c7213a.m33564f();
                    this.f35647a |= 16;
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
