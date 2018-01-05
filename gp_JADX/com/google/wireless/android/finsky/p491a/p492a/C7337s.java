package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7337s extends b {
    public C7339u f36588a;
    public C7338t f36589b;

    public C7337s() {
        this.f36588a = null;
        this.f36589b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34771a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36588a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36588a);
        }
        if (this.f36589b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f36589b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34772b() {
        int b = super.b();
        if (this.f36588a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36588a);
        }
        if (this.f36589b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f36589b);
        }
        return b;
    }

    public final /* synthetic */ i m34770a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36588a == null) {
                        this.f36588a = new C7339u();
                    }
                    c7213a.m33552a(this.f36588a);
                    continue;
                case 18:
                    if (this.f36589b == null) {
                        this.f36589b = new C7338t();
                    }
                    c7213a.m33552a(this.f36589b);
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
