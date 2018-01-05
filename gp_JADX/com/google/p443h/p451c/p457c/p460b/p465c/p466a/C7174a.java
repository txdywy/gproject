package com.google.p443h.p451c.p457c.p460b.p465c.p466a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7174a extends b {
    public long f35016a;
    public C7175b f35017b;

    public C7174a() {
        this.f35016a = 0;
        this.f35017b = null;
        this.aP = -1;
    }

    public final void m32521a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35016a != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f35016a);
        }
        if (this.f35017b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35017b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32522b() {
        int b = super.b();
        if (this.f35016a != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f35016a);
        }
        if (this.f35017b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f35017b);
        }
        return b;
    }

    public final /* synthetic */ i m32520a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35016a = c7213a.m33568j();
                    continue;
                case 18:
                    if (this.f35017b == null) {
                        this.f35017b = new C7175b();
                    }
                    c7213a.m33552a(this.f35017b);
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
