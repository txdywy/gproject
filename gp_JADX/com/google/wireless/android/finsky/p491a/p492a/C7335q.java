package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.p515h.p516a.C7476a;

public final class C7335q extends b {
    public C7336r f36580a;
    public C7476a f36581b;

    public C7335q() {
        this.f36580a = null;
        this.f36581b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34765a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36580a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36580a);
        }
        if (this.f36581b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f36581b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34766b() {
        int b = super.b();
        if (this.f36580a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36580a);
        }
        if (this.f36581b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f36581b);
        }
        return b;
    }

    public final /* synthetic */ i m34764a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36580a == null) {
                        this.f36580a = new C7336r();
                    }
                    c7213a.m33552a(this.f36580a);
                    continue;
                case 18:
                    if (this.f36581b == null) {
                        this.f36581b = new C7476a();
                    }
                    c7213a.m33552a(this.f36581b);
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
