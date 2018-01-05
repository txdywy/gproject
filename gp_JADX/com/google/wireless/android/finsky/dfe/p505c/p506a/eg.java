package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class eg extends b {
    public int f37551a;
    public int f37552b;
    public int f37553c;
    public int f37554d;
    public int f37555e;
    public int f37556f;
    public int f37557g;
    public int f37558h;
    public int f37559i;

    public eg() {
        this.f37551a = 0;
        this.f37552b = 0;
        this.f37553c = 0;
        this.f37554d = 0;
        this.f37555e = 0;
        this.f37556f = 0;
        this.f37557g = 0;
        this.f37558h = 0;
        this.f37559i = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35452a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37551a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37552b);
        }
        if ((this.f37551a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37553c);
        }
        if ((this.f37551a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37554d);
        }
        if ((this.f37551a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f37555e);
        }
        if ((this.f37551a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f37556f);
        }
        if ((this.f37551a & 32) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f37557g);
        }
        if ((this.f37551a & 64) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f37558h);
        }
        if ((this.f37551a & 128) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f37559i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35453b() {
        int b = super.b();
        if ((this.f37551a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37552b);
        }
        if ((this.f37551a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f37553c);
        }
        if ((this.f37551a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f37554d);
        }
        if ((this.f37551a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f37555e);
        }
        if ((this.f37551a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f37556f);
        }
        if ((this.f37551a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f37557g);
        }
        if ((this.f37551a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(7, this.f37558h);
        }
        if ((this.f37551a & 128) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(8, this.f37559i);
        }
        return b;
    }

    public final /* synthetic */ i m35451a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37552b = c7213a.m33567i();
                    this.f37551a |= 1;
                    continue;
                case 16:
                    this.f37553c = c7213a.m33567i();
                    this.f37551a |= 2;
                    continue;
                case 24:
                    this.f37554d = c7213a.m33567i();
                    this.f37551a |= 4;
                    continue;
                case 32:
                    this.f37555e = c7213a.m33567i();
                    this.f37551a |= 8;
                    continue;
                case 40:
                    this.f37556f = c7213a.m33567i();
                    this.f37551a |= 16;
                    continue;
                case 48:
                    this.f37557g = c7213a.m33567i();
                    this.f37551a |= 32;
                    continue;
                case 56:
                    this.f37558h = c7213a.m33567i();
                    this.f37551a |= 64;
                    continue;
                case 64:
                    this.f37559i = c7213a.m33567i();
                    this.f37551a |= 128;
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
