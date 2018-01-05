package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.lg;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gr extends b {
    public lg f39121a;

    public gr() {
        this.f39121a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36529a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39121a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39121a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36530b() {
        int b = super.b();
        if (this.f39121a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f39121a);
        }
        return b;
    }

    public final /* synthetic */ i m36528a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39121a == null) {
                        this.f39121a = new lg();
                    }
                    c7213a.m33552a(this.f39121a);
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
