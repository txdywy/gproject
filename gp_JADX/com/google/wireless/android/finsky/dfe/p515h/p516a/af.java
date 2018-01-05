package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class af extends b {
    public C7491p f38036a;

    public af() {
        this.f38036a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35740a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38036a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38036a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35741b() {
        int b = super.b();
        if (this.f38036a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f38036a);
        }
        return b;
    }

    public final /* synthetic */ i m35739a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38036a == null) {
                        this.f38036a = new C7491p();
                    }
                    c7213a.m33552a(this.f38036a);
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
