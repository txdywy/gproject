package com.google.wireless.android.finsky.dfe.p519j.p520a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7513e extends b {
    public int f38215a;
    public int f38216b;

    public C7513e() {
        this.f38215a = 0;
        this.f38216b = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35916a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38215a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38216b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35917b() {
        int b = super.b();
        if ((this.f38215a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(1, this.f38216b);
        }
        return b;
    }

    public final /* synthetic */ i m35915a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f38216b = c7213a.m33567i();
                    this.f38215a |= 1;
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
