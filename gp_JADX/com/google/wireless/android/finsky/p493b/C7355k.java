package com.google.wireless.android.finsky.p493b;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7355k extends b {
    public int f36768a;
    public int f36769b;
    public String f36770c;
    public String f36771d;

    public C7355k() {
        this.f36768a = 0;
        this.f36769b = 1;
        this.f36770c = "";
        this.f36771d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34865a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36768a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36769b);
        }
        if ((this.f36768a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36770c);
        }
        if ((this.f36768a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36771d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34866b() {
        int b = super.b();
        if ((this.f36768a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36769b);
        }
        if ((this.f36768a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36770c);
        }
        if ((this.f36768a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f36771d);
        }
        return b;
    }

    public final /* synthetic */ i m34864a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36769b = c7213a.m33567i();
                    this.f36768a |= 1;
                    continue;
                case 18:
                    this.f36770c = c7213a.m33564f();
                    this.f36768a |= 2;
                    continue;
                case 26:
                    this.f36771d = c7213a.m33564f();
                    this.f36768a |= 4;
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
