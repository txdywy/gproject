package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class co extends b {
    public int f35983a;
    public long f35984b;
    public long f35985c;
    public long f35986d;
    public long f35987e;
    public boolean f35988f;
    public long f35989g;
    public long f35990h;
    public long f35991i;
    public C7291w f35992j;
    public boolean f35993k;

    public final co m34345a(long j) {
        this.f35983a |= 32;
        this.f35989g = j;
        return this;
    }

    public final co m34348b(long j) {
        this.f35983a |= 64;
        this.f35990h = j;
        return this;
    }

    public final co m34349c(long j) {
        this.f35983a |= 128;
        this.f35991i = j;
        return this;
    }

    public final co m34350d() {
        this.f35983a |= 256;
        this.f35993k = true;
        return this;
    }

    public co() {
        this.f35983a = 0;
        this.f35984b = 0;
        this.f35985c = 0;
        this.f35986d = 0;
        this.f35987e = 0;
        this.f35988f = false;
        this.f35989g = 0;
        this.f35990h = 0;
        this.f35991i = 0;
        this.f35992j = null;
        this.f35993k = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34346a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35983a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f35984b);
        }
        if ((this.f35983a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f35985c);
        }
        if ((this.f35983a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f35986d);
        }
        if ((this.f35983a & 8) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f35987e);
        }
        if ((this.f35983a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f35988f);
        }
        if ((this.f35983a & 32) != 0) {
            codedOutputByteBufferNano.m33531b(6, this.f35989g);
        }
        if ((this.f35983a & 64) != 0) {
            codedOutputByteBufferNano.m33531b(7, this.f35990h);
        }
        if ((this.f35983a & 128) != 0) {
            codedOutputByteBufferNano.m33531b(8, this.f35991i);
        }
        if (this.f35992j != null) {
            codedOutputByteBufferNano.m33532b(9, this.f35992j);
        }
        if ((this.f35983a & 256) != 0) {
            codedOutputByteBufferNano.m33522a(10, this.f35993k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34347b() {
        int b = super.b();
        if ((this.f35983a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f35984b);
        }
        if ((this.f35983a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f35985c);
        }
        if ((this.f35983a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f35986d);
        }
        if ((this.f35983a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f35987e);
        }
        if ((this.f35983a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f35983a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33508f(6, this.f35989g);
        }
        if ((this.f35983a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33508f(7, this.f35990h);
        }
        if ((this.f35983a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33508f(8, this.f35991i);
        }
        if (this.f35992j != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f35992j);
        }
        if ((this.f35983a & 256) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(10) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34344a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35984b = c7213a.m33568j();
                    this.f35983a |= 1;
                    continue;
                case 16:
                    this.f35985c = c7213a.m33568j();
                    this.f35983a |= 2;
                    continue;
                case 24:
                    this.f35986d = c7213a.m33568j();
                    this.f35983a |= 4;
                    continue;
                case 32:
                    this.f35987e = c7213a.m33568j();
                    this.f35983a |= 8;
                    continue;
                case 40:
                    this.f35988f = c7213a.m33563e();
                    this.f35983a |= 16;
                    continue;
                case 48:
                    this.f35989g = c7213a.m33568j();
                    this.f35983a |= 32;
                    continue;
                case 56:
                    this.f35990h = c7213a.m33568j();
                    this.f35983a |= 64;
                    continue;
                case 64:
                    this.f35991i = c7213a.m33568j();
                    this.f35983a |= 128;
                    continue;
                case 74:
                    if (this.f35992j == null) {
                        this.f35992j = new C7291w();
                    }
                    c7213a.m33552a(this.f35992j);
                    continue;
                case 80:
                    this.f35993k = c7213a.m33563e();
                    this.f35983a |= 256;
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
