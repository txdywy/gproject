package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7460k extends b {
    public int f37873a;
    public C7456g f37874b;
    public C7458i f37875c;
    public C7465p f37876d;
    public C7461l f37877e;
    public C7459j f37878f;

    public final C7456g m35651d() {
        if (this.f37873a == 0) {
            return this.f37874b;
        }
        return null;
    }

    public final C7458i m35652e() {
        if (this.f37873a == 1) {
            return this.f37875c;
        }
        return null;
    }

    public final C7465p m35653f() {
        if (this.f37873a == 2) {
            return this.f37876d;
        }
        return null;
    }

    public final C7461l m35654g() {
        if (this.f37873a == 3) {
            return this.f37877e;
        }
        return null;
    }

    public C7460k() {
        this.f37873a = -1;
        this.f37873a = -1;
        this.f37874b = null;
        this.f37873a = -1;
        this.f37875c = null;
        this.f37873a = -1;
        this.f37876d = null;
        this.f37873a = -1;
        this.f37877e = null;
        this.f37873a = -1;
        this.f37878f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35649a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37873a == 0) {
            codedOutputByteBufferNano.m33532b(1, this.f37874b);
        }
        if (this.f37873a == 1) {
            codedOutputByteBufferNano.m33532b(2, this.f37875c);
        }
        if (this.f37873a == 2) {
            codedOutputByteBufferNano.m33532b(3, this.f37876d);
        }
        if (this.f37873a == 3) {
            codedOutputByteBufferNano.m33532b(4, this.f37877e);
        }
        if (this.f37873a == 4) {
            codedOutputByteBufferNano.m33532b(5, this.f37878f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35650b() {
        int b = super.b();
        if (this.f37873a == 0) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37874b);
        }
        if (this.f37873a == 1) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37875c);
        }
        if (this.f37873a == 2) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37876d);
        }
        if (this.f37873a == 3) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37877e);
        }
        if (this.f37873a == 4) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f37878f);
        }
        return b;
    }

    public final /* synthetic */ i m35648a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37874b == null) {
                        this.f37874b = new C7456g();
                    }
                    c7213a.m33552a(this.f37874b);
                    this.f37873a = 0;
                    continue;
                case 18:
                    if (this.f37875c == null) {
                        this.f37875c = new C7458i();
                    }
                    c7213a.m33552a(this.f37875c);
                    this.f37873a = 1;
                    continue;
                case 26:
                    if (this.f37876d == null) {
                        this.f37876d = new C7465p();
                    }
                    c7213a.m33552a(this.f37876d);
                    this.f37873a = 2;
                    continue;
                case 34:
                    if (this.f37877e == null) {
                        this.f37877e = new C7461l();
                    }
                    c7213a.m33552a(this.f37877e);
                    this.f37873a = 3;
                    continue;
                case 42:
                    if (this.f37878f == null) {
                        this.f37878f = new C7459j();
                    }
                    c7213a.m33552a(this.f37878f);
                    this.f37873a = 4;
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
