package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class as extends b {
    public ax f37121a;

    public as() {
        this.f37121a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35129a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37121a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37121a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35130b() {
        int b = super.b();
        if (this.f37121a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f37121a);
        }
        return b;
    }

    public final /* synthetic */ i m35128a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37121a == null) {
                        this.f37121a = new ax();
                    }
                    c7213a.m33552a(this.f37121a);
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
