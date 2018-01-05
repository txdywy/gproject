package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.ao;

public final class C7483h extends b {
    public ao f38092a;

    public C7483h() {
        this.f38092a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35800a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38092a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38092a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35801b() {
        int b = super.b();
        if (this.f38092a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f38092a);
        }
        return b;
    }

    public final /* synthetic */ i m35799a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38092a == null) {
                        this.f38092a = new ao();
                    }
                    c7213a.m33552a(this.f38092a);
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
