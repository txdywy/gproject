package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bd extends b {
    public bc f37170a;

    public bd() {
        this.f37170a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35167a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37170a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37170a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35168b() {
        int b = super.b();
        if (this.f37170a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f37170a);
        }
        return b;
    }

    public final /* synthetic */ i m35166a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37170a == null) {
                        this.f37170a = new bc();
                    }
                    c7213a.m33552a(this.f37170a);
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
