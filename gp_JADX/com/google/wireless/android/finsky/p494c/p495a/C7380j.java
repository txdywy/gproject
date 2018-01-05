package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7380j extends b {
    public C7379i f36878a;
    public C7379i f36879b;

    public C7380j() {
        this.f36878a = null;
        this.f36879b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34955a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36878a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36878a);
        }
        if (this.f36879b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f36879b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34956b() {
        int b = super.b();
        if (this.f36878a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36878a);
        }
        if (this.f36879b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f36879b);
        }
        return b;
    }

    public final /* synthetic */ i m34954a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36878a == null) {
                        this.f36878a = new C7379i();
                    }
                    c7213a.m33552a(this.f36878a);
                    continue;
                case 18:
                    if (this.f36879b == null) {
                        this.f36879b = new C7379i();
                    }
                    c7213a.m33552a(this.f36879b);
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
