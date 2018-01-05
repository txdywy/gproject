package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bd extends b {
    public int f35758a;
    public String f35759b;
    public int f35760c;

    public bd() {
        this.f35758a = 0;
        this.f35759b = "";
        this.f35760c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34168a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35758a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f35759b);
        }
        if ((this.f35758a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35760c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34169b() {
        int b = super.b();
        if ((this.f35758a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35759b);
        }
        if ((this.f35758a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f35760c);
        }
        return b;
    }

    public final /* synthetic */ i m34167a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f35759b = c7213a.m33564f();
                    this.f35758a |= 1;
                    continue;
                case 16:
                    this.f35760c = c7213a.m33567i();
                    this.f35758a |= 2;
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
