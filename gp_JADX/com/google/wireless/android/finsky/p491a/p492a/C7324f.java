package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7324f extends b {
    public int f36489a;
    public C7325g f36490b;
    public C7325g f36491c;
    public boolean f36492d;
    public boolean f36493e;

    public C7324f() {
        this.f36489a = 0;
        this.f36490b = null;
        this.f36491c = null;
        this.f36492d = false;
        this.f36493e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34728a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36490b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36490b);
        }
        if (this.f36491c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f36491c);
        }
        if ((this.f36489a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f36492d);
        }
        if ((this.f36489a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f36493e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34729b() {
        int b = super.b();
        if (this.f36490b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36490b);
        }
        if (this.f36491c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f36491c);
        }
        if ((this.f36489a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f36489a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(4) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34727a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36490b == null) {
                        this.f36490b = new C7325g();
                    }
                    c7213a.m33552a(this.f36490b);
                    continue;
                case 18:
                    if (this.f36491c == null) {
                        this.f36491c = new C7325g();
                    }
                    c7213a.m33552a(this.f36491c);
                    continue;
                case 24:
                    this.f36492d = c7213a.m33563e();
                    this.f36489a |= 1;
                    continue;
                case 32:
                    this.f36493e = c7213a.m33563e();
                    this.f36489a |= 2;
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
