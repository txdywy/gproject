package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7452c extends b {
    public aa f37848a;

    public C7452c() {
        this.f37848a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35630a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37848a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37848a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35631b() {
        int b = super.b();
        if (this.f37848a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f37848a);
        }
        return b;
    }

    public final /* synthetic */ i m35629a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37848a == null) {
                        this.f37848a = new aa();
                    }
                    c7213a.m33552a(this.f37848a);
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
