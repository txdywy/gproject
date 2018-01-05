package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cg extends b {
    public bd f38548a;

    public cg() {
        this.f38548a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36152a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38548a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38548a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36153b() {
        int b = super.b();
        if (this.f38548a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f38548a);
        }
        return b;
    }

    public final /* synthetic */ i m36151a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38548a == null) {
                        this.f38548a = new bd();
                    }
                    c7213a.m33552a(this.f38548a);
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
