package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7286r extends b {
    public int f36132a;
    public int f36133b;

    public C7286r() {
        this.f36132a = 0;
        this.f36133b = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34441a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36132a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36133b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34442b() {
        int b = super.b();
        if ((this.f36132a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(1, this.f36133b);
        }
        return b;
    }

    public final /* synthetic */ i m34440a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36133b = c7213a.m33567i();
                    this.f36132a |= 1;
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
