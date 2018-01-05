package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ax extends b {
    public int f35677a;
    public int f35678b;
    public int f35679c;
    public String f35680d;
    public int f35681e;
    public String f35682f;
    public boolean f35683g;
    public int f35684h;
    public boolean f35685i;

    public ax() {
        this.f35677a = 0;
        this.f35678b = 0;
        this.f35679c = 0;
        this.f35680d = "";
        this.f35681e = 0;
        this.f35682f = "";
        this.f35683g = false;
        this.f35684h = 0;
        this.f35685i = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34140a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35677a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35678b);
        }
        if ((this.f35677a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35679c);
        }
        if ((this.f35677a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f35680d);
        }
        if ((this.f35677a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35681e);
        }
        if ((this.f35677a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f35682f);
        }
        if ((this.f35677a & 32) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f35683g);
        }
        if ((this.f35677a & 64) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f35684h);
        }
        if ((this.f35677a & 128) != 0) {
            codedOutputByteBufferNano.m33522a(8, this.f35685i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34141b() {
        int b = super.b();
        if ((this.f35677a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35678b);
        }
        if ((this.f35677a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35679c);
        }
        if ((this.f35677a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f35680d);
        }
        if ((this.f35677a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f35681e);
        }
        if ((this.f35677a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f35682f);
        }
        if ((this.f35677a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if ((this.f35677a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(7, this.f35684h);
        }
        if ((this.f35677a & 128) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(8) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34139a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35678b = c7213a.m33567i();
                    this.f35677a |= 1;
                    continue;
                case 16:
                    this.f35679c = c7213a.m33567i();
                    this.f35677a |= 2;
                    continue;
                case 26:
                    this.f35680d = c7213a.m33564f();
                    this.f35677a |= 4;
                    continue;
                case 32:
                    this.f35681e = c7213a.m33567i();
                    this.f35677a |= 8;
                    continue;
                case 42:
                    this.f35682f = c7213a.m33564f();
                    this.f35677a |= 16;
                    continue;
                case 48:
                    this.f35683g = c7213a.m33563e();
                    this.f35677a |= 32;
                    continue;
                case 56:
                    this.f35684h = c7213a.m33567i();
                    this.f35677a |= 64;
                    continue;
                case 64:
                    this.f35685i = c7213a.m33563e();
                    this.f35677a |= 128;
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
