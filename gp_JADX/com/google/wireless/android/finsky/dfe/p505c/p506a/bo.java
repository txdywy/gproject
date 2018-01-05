package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bo extends b {
    public bp f37219a;

    public bo() {
        this.f37219a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35202a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37219a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37219a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35203b() {
        int b = super.b();
        if (this.f37219a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f37219a);
        }
        return b;
    }

    public final /* synthetic */ i m35201a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37219a == null) {
                        this.f37219a = new bp();
                    }
                    c7213a.m33552a(this.f37219a);
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
