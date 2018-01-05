package com.google.p432e.p433a.p434a.p435a.p436a.p437a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7110e extends b {
    public C7114i f34772a;
    public C7112g f34773b;
    public boolean f34774c;
    public boolean f34775d;
    public boolean f34776e;

    public C7110e() {
        this.f34772a = null;
        this.f34773b = null;
        this.f34774c = false;
        this.f34775d = false;
        this.f34776e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m32308a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f34772a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f34772a);
        }
        if (this.f34773b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f34773b);
        }
        if (this.f34774c) {
            codedOutputByteBufferNano.m33522a(3, this.f34774c);
        }
        if (this.f34775d) {
            codedOutputByteBufferNano.m33522a(4, this.f34775d);
        }
        if (this.f34776e) {
            codedOutputByteBufferNano.m33522a(7, this.f34776e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32309b() {
        int b = super.b();
        if (this.f34772a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f34772a);
        }
        if (this.f34773b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f34773b);
        }
        if (this.f34774c) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if (this.f34775d) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if (this.f34776e) {
            return b + (CodedOutputByteBufferNano.m33501d(7) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m32307a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34772a == null) {
                        this.f34772a = new C7114i();
                    }
                    c7213a.m33552a(this.f34772a);
                    continue;
                case 18:
                    if (this.f34773b == null) {
                        this.f34773b = new C7112g();
                    }
                    c7213a.m33552a(this.f34773b);
                    continue;
                case 24:
                    this.f34774c = c7213a.m33563e();
                    continue;
                case 32:
                    this.f34775d = c7213a.m33563e();
                    continue;
                case 56:
                    this.f34776e = c7213a.m33563e();
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
