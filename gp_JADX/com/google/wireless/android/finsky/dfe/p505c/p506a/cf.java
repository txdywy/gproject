package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cf extends b {
    public cg f37291a;
    public bl f37292b;

    public cf() {
        this.f37291a = null;
        this.f37292b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35260a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37291a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37291a);
        }
        if (this.f37292b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37292b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35261b() {
        int b = super.b();
        if (this.f37291a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37291a);
        }
        if (this.f37292b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37292b);
        }
        return b;
    }

    public final /* synthetic */ i m35259a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37291a == null) {
                        this.f37291a = new cg();
                    }
                    c7213a.m33552a(this.f37291a);
                    continue;
                case 18:
                    if (this.f37292b == null) {
                        this.f37292b = new bl();
                    }
                    c7213a.m33552a(this.f37292b);
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
