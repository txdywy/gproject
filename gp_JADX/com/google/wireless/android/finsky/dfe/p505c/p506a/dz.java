package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class dz extends b {
    public C7367w f37514a;

    public dz() {
        this.f37514a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35424a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37514a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37514a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35425b() {
        int b = super.b();
        if (this.f37514a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f37514a);
        }
        return b;
    }

    public final /* synthetic */ i m35423a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37514a == null) {
                        this.f37514a = new C7367w();
                    }
                    c7213a.m33552a(this.f37514a);
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
