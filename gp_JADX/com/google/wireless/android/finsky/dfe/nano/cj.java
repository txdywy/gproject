package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cj extends b {
    public com.google.wireless.android.b.a.b f38576a;

    public cj() {
        this.f38576a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36163a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38576a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38576a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36164b() {
        int b = super.b();
        if (this.f38576a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f38576a);
        }
        return b;
    }

    public final /* synthetic */ i m36162a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38576a == null) {
                        this.f38576a = new com.google.wireless.android.b.a.b();
                    }
                    c7213a.m33552a(this.f38576a);
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
