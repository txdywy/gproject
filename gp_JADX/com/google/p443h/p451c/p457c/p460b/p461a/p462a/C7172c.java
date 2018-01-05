package com.google.p443h.p451c.p457c.p460b.p461a.p462a;

import com.google.a.a.a.a.b.a.c.d;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7172c extends b {
    public d f35008a;
    public C7170a f35009b;

    public C7172c() {
        this.f35008a = null;
        this.f35009b = null;
        this.aP = -1;
    }

    public final void m32514a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35008a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f35008a);
        }
        if (this.f35009b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35009b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32515b() {
        int b = super.b();
        if (this.f35008a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f35008a);
        }
        if (this.f35009b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f35009b);
        }
        return b;
    }

    public final /* synthetic */ i m32513a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f35008a == null) {
                        this.f35008a = new d();
                    }
                    c7213a.m33552a(this.f35008a);
                    continue;
                case 18:
                    if (this.f35009b == null) {
                        this.f35009b = new C7170a();
                    }
                    c7213a.m33552a(this.f35009b);
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
