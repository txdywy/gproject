package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ch extends b {
    public int f37298a;
    public int f37299b;

    public ch() {
        this.f37298a = 0;
        this.f37299b = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35266a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37298a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37299b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35267b() {
        int b = super.b();
        if ((this.f37298a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(1, this.f37299b);
        }
        return b;
    }

    public final /* synthetic */ i m35265a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37299b = c7213a.m33567i();
                    this.f37298a |= 1;
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
