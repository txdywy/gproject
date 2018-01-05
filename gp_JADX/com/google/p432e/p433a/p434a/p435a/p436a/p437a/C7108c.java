package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7108c extends b {
    public static volatile C7108c[] f34768a;
    public String f34769b;
    public int f34770c;

    public static C7108c[] m32300d() {
        if (f34768a == null) {
            synchronized (C7219h.f35465b) {
                if (f34768a == null) {
                    f34768a = new C7108c[0];
                }
            }
        }
        return f34768a;
    }

    public C7108c() {
        this.f34769b = "";
        this.f34770c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32302a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f34769b == null || this.f34769b.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34769b);
        }
        if (this.f34770c != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f34770c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32303b() {
        int b = super.b();
        if (!(this.f34769b == null || this.f34769b.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f34769b);
        }
        if (this.f34770c != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f34770c);
        }
        return b;
    }

    public final /* synthetic */ i m32301a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34769b = c7213a.m33564f();
                    continue;
                case 16:
                    this.f34770c = c7213a.m33567i();
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
