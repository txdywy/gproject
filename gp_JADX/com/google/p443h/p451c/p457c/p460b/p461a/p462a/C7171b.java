package com.google.p443h.p451c.p457c.p460b.p461a.p462a;

import com.google.a.a.a.a.b.a.a.i.a.c;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7171b extends b {
    public c f35007a;

    public C7171b() {
        this.f35007a = null;
        this.aP = -1;
    }

    public final void m32511a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35007a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f35007a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32512b() {
        int b = super.b();
        if (this.f35007a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f35007a);
        }
        return b;
    }

    public final /* synthetic */ i m32510a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f35007a == null) {
                        this.f35007a = new c();
                    }
                    c7213a.m33552a(this.f35007a);
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
