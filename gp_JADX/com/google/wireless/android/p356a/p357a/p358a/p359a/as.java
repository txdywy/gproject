package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class as extends b {
    public int f35653a;
    public int f35654b;
    public int f35655c;
    public int f35656d;
    public int f35657e;
    public int f35658f;
    public int f35659g;

    public as() {
        this.f35653a = 0;
        this.f35654b = 0;
        this.f35655c = 0;
        this.f35656d = 0;
        this.f35657e = 0;
        this.f35658f = 0;
        this.f35659g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34123a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f35653a);
        codedOutputByteBufferNano.m33518a(2, this.f35654b);
        codedOutputByteBufferNano.m33518a(3, this.f35655c);
        codedOutputByteBufferNano.m33518a(4, this.f35656d);
        codedOutputByteBufferNano.m33518a(5, this.f35657e);
        codedOutputByteBufferNano.m33518a(6, this.f35658f);
        codedOutputByteBufferNano.m33518a(7, this.f35659g);
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34124b() {
        return ((((((super.b() + CodedOutputByteBufferNano.m33502d(1, this.f35653a)) + CodedOutputByteBufferNano.m33502d(2, this.f35654b)) + CodedOutputByteBufferNano.m33502d(3, this.f35655c)) + CodedOutputByteBufferNano.m33502d(4, this.f35656d)) + CodedOutputByteBufferNano.m33502d(5, this.f35657e)) + CodedOutputByteBufferNano.m33502d(6, this.f35658f)) + CodedOutputByteBufferNano.m33502d(7, this.f35659g);
    }

    public final /* synthetic */ i m34122a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35653a = c7213a.m33567i();
                    continue;
                case 16:
                    this.f35654b = c7213a.m33567i();
                    continue;
                case 24:
                    this.f35655c = c7213a.m33567i();
                    continue;
                case 32:
                    this.f35656d = c7213a.m33567i();
                    continue;
                case 40:
                    this.f35657e = c7213a.m33567i();
                    continue;
                case 48:
                    this.f35658f = c7213a.m33567i();
                    continue;
                case 56:
                    this.f35659g = c7213a.m33567i();
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
