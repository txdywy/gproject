package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dy extends b {
    public ax f37513a;

    public dy() {
        this.f37513a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35421a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37513a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37513a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35422b() {
        int b = super.b();
        if (this.f37513a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f37513a);
        }
        return b;
    }

    public final /* synthetic */ i m35420a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37513a == null) {
                        this.f37513a = new ax();
                    }
                    c7213a.m33552a(this.f37513a);
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
