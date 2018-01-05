package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class al extends b {
    public int f35629a;
    public boolean f35630b;

    public al() {
        this.f35629a = 0;
        this.f35630b = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34097a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35629a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f35630b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34098b() {
        int b = super.b();
        if ((this.f35629a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(1) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34096a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35630b = c7213a.m33563e();
                    this.f35629a |= 1;
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
