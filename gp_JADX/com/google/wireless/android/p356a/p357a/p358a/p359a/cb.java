package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cb extends b {
    public int f35896a;
    public String f35897b;
    public String f35898c;
    public String f35899d;

    public cb() {
        m34267d();
    }

    public final cb m34267d() {
        this.f35896a = 0;
        this.f35897b = "";
        this.f35898c = "";
        this.f35899d = "";
        this.aO = null;
        this.aP = -1;
        return this;
    }

    public final void m34265a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35896a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f35897b);
        }
        if ((this.f35896a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f35898c);
        }
        if ((this.f35896a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f35899d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34266b() {
        int b = super.b();
        if ((this.f35896a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35897b);
        }
        if ((this.f35896a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f35898c);
        }
        if ((this.f35896a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f35899d);
        }
        return b;
    }

    public final /* synthetic */ i m34264a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f35897b = c7213a.m33564f();
                    this.f35896a |= 1;
                    continue;
                case 18:
                    this.f35898c = c7213a.m33564f();
                    this.f35896a |= 2;
                    continue;
                case 26:
                    this.f35899d = c7213a.m33564f();
                    this.f35896a |= 4;
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
