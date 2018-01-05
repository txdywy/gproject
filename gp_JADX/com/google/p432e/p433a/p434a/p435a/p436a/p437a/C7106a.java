package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7106a extends b {
    public static volatile C7106a[] f34763a;
    public String f34764b;
    public int f34765c;

    public static C7106a[] m32292d() {
        if (f34763a == null) {
            synchronized (C7219h.f35465b) {
                if (f34763a == null) {
                    f34763a = new C7106a[0];
                }
            }
        }
        return f34763a;
    }

    public C7106a() {
        this.f34764b = "";
        this.f34765c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32294a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f34764b == null || this.f34764b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34764b);
        }
        if (this.f34765c != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f34765c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32295b() {
        int b = super.b();
        if (!(this.f34764b == null || this.f34764b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f34764b);
        }
        if (this.f34765c != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f34765c);
        }
        return b;
    }

    public final /* synthetic */ i m32293a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34764b = c7213a.m33564f();
                    continue;
                case 16:
                    this.f34765c = c7213a.m33567i();
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
