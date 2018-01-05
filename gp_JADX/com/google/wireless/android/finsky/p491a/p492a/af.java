package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.p505c.p506a.dv;

public final class af extends b {
    public dv f36340a;

    public af() {
        this.f36340a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34617a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36340a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36340a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34618b() {
        int b = super.b();
        if (this.f36340a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f36340a);
        }
        return b;
    }

    public final /* synthetic */ i m34616a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36340a == null) {
                        this.f36340a = new dv();
                    }
                    c7213a.m33552a(this.f36340a);
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
