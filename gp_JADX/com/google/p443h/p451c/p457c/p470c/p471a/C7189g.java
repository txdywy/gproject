package com.google.p443h.p451c.p457c.p470c.p471a;

import com.google.a.a.a.a.b.a.c.d;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7189g extends b {
    public d f35060a;
    public C7187e f35061b;

    public C7189g() {
        this.f35060a = null;
        this.f35061b = null;
        this.aP = -1;
    }

    public final void m32563a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35060a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f35060a);
        }
        if (this.f35061b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35061b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32564b() {
        int b = super.b();
        if (this.f35060a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f35060a);
        }
        if (this.f35061b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f35061b);
        }
        return b;
    }

    public final /* synthetic */ i m32562a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f35060a == null) {
                        this.f35060a = new d();
                    }
                    c7213a.m33552a(this.f35060a);
                    continue;
                case 18:
                    if (this.f35061b == null) {
                        this.f35061b = new C7187e();
                    }
                    c7213a.m33552a(this.f35061b);
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
