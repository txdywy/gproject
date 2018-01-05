package com.google.p443h.p451c.p457c.p460b.p467d;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7180d extends b {
    public static volatile C7180d[] f35027a;
    public int f35028b;
    public com.google.a.a.a.a.b.a.c.b f35029c;

    public static C7180d[] m32534d() {
        if (f35027a == null) {
            synchronized (C7219h.f35465b) {
                if (f35027a == null) {
                    f35027a = new C7180d[0];
                }
            }
        }
        return f35027a;
    }

    public C7180d() {
        this.f35028b = 0;
        this.f35029c = null;
        this.aP = -1;
    }

    public final void m32536a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35028b != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35028b);
        }
        if (this.f35029c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f35029c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32537b() {
        int b = super.b();
        if (this.f35028b != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35028b);
        }
        if (this.f35029c != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f35029c);
        }
        return b;
    }

    public final /* synthetic */ i m32535a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35028b = c7213a.m33567i();
                    continue;
                case 18:
                    if (this.f35029c == null) {
                        this.f35029c = new com.google.a.a.a.a.b.a.c.b();
                    }
                    c7213a.m33552a(this.f35029c);
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
