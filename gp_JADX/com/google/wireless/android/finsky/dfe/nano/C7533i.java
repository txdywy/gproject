package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7533i extends b {
    public cv f39153a;

    public C7533i() {
        this.f39153a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36551a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39153a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39153a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36552b() {
        int b = super.b();
        if (this.f39153a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f39153a);
        }
        return b;
    }

    public final /* synthetic */ i m36550a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39153a == null) {
                        this.f39153a = new cv();
                    }
                    c7213a.m33552a(this.f39153a);
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
