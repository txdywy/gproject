package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ar extends b {
    public int f37113a;
    public String f37114b;
    public String f37115c;
    public String f37116d;
    public long f37117e;
    public long f37118f;
    public String f37119g;
    public int f37120h;

    public ar() {
        this.f37113a = 0;
        this.f37114b = "";
        this.f37115c = "";
        this.f37116d = "";
        this.f37117e = 0;
        this.f37118f = 0;
        this.f37119g = "";
        this.f37120h = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35126a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37113a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37114b);
        }
        if ((this.f37113a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37115c);
        }
        if ((this.f37113a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37116d);
        }
        if ((this.f37113a & 8) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f37117e);
        }
        if ((this.f37113a & 16) != 0) {
            codedOutputByteBufferNano.m33531b(5, this.f37118f);
        }
        if ((this.f37113a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37119g);
        }
        if ((this.f37113a & 64) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f37120h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35127b() {
        int b = super.b();
        if ((this.f37113a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37114b);
        }
        if ((this.f37113a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37115c);
        }
        if ((this.f37113a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37116d);
        }
        if ((this.f37113a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f37117e);
        }
        if ((this.f37113a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33508f(5, this.f37118f);
        }
        if ((this.f37113a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f37119g);
        }
        if ((this.f37113a & 64) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(7, this.f37120h);
        }
        return b;
    }

    public final /* synthetic */ i m35125a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37114b = c7213a.m33564f();
                    this.f37113a |= 1;
                    continue;
                case 18:
                    this.f37115c = c7213a.m33564f();
                    this.f37113a |= 2;
                    continue;
                case 26:
                    this.f37116d = c7213a.m33564f();
                    this.f37113a |= 4;
                    continue;
                case 32:
                    this.f37117e = c7213a.m33568j();
                    this.f37113a |= 8;
                    continue;
                case 40:
                    this.f37118f = c7213a.m33568j();
                    this.f37113a |= 16;
                    continue;
                case 50:
                    this.f37119g = c7213a.m33564f();
                    this.f37113a |= 32;
                    continue;
                case 56:
                    this.f37120h = c7213a.m33567i();
                    this.f37113a |= 64;
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
