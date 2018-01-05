package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.eu;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7532h extends b {
    public eu f39152a;

    public C7532h() {
        this.f39152a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36548a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39152a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39152a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36549b() {
        int b = super.b();
        if (this.f39152a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f39152a);
        }
        return b;
    }

    public final /* synthetic */ i m36547a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39152a == null) {
                        this.f39152a = new eu();
                    }
                    c7213a.m33552a(this.f39152a);
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
