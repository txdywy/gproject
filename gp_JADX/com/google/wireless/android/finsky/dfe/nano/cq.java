package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.lg;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cq extends b {
    public gy f38591a;
    public lg f38592b;

    public cq() {
        this.f38591a = null;
        this.f38592b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36185a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38591a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38591a);
        }
        if (this.f38592b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38592b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36186b() {
        int b = super.b();
        if (this.f38591a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38591a);
        }
        if (this.f38592b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f38592b);
        }
        return b;
    }

    public final /* synthetic */ i m36184a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38591a == null) {
                        this.f38591a = new gy();
                    }
                    c7213a.m33552a(this.f38591a);
                    continue;
                case 18:
                    if (this.f38592b == null) {
                        this.f38592b = new lg();
                    }
                    c7213a.m33552a(this.f38592b);
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
