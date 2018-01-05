package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ap extends b {
    public int f35638a;
    public boolean f35639b;
    public String f35640c;

    public ap() {
        this.f35638a = 0;
        this.f35639b = false;
        this.f35640c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34114a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35638a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f35639b);
        }
        if ((this.f35638a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f35640c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34115b() {
        int b = super.b();
        if ((this.f35638a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f35638a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f35640c);
        }
        return b;
    }

    public final /* synthetic */ i m34113a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35639b = c7213a.m33563e();
                    this.f35638a |= 1;
                    continue;
                case 18:
                    this.f35640c = c7213a.m33564f();
                    this.f35638a |= 2;
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
