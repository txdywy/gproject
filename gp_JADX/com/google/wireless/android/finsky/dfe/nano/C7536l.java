package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.jl;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7536l extends b {
    public C7533i f39164a;
    public C7534j f39165b;
    public C7530f f39166c;
    public C7537m f39167d;
    public C7532h f39168e;
    public jl f39169f;

    public C7536l() {
        this.f39164a = null;
        this.f39165b = null;
        this.f39166c = null;
        this.f39167d = null;
        this.f39168e = null;
        this.f39169f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36558a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39164a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39164a);
        }
        if (this.f39165b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39165b);
        }
        if (this.f39166c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f39166c);
        }
        if (this.f39167d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f39167d);
        }
        if (this.f39168e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f39168e);
        }
        if (this.f39169f != null) {
            codedOutputByteBufferNano.m33532b(6, this.f39169f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36559b() {
        int b = super.b();
        if (this.f39164a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39164a);
        }
        if (this.f39165b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f39165b);
        }
        if (this.f39166c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f39166c);
        }
        if (this.f39167d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f39167d);
        }
        if (this.f39168e != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f39168e);
        }
        if (this.f39169f != null) {
            return b + CodedOutputByteBufferNano.m33503d(6, this.f39169f);
        }
        return b;
    }

    public final /* synthetic */ i m36557a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39164a == null) {
                        this.f39164a = new C7533i();
                    }
                    c7213a.m33552a(this.f39164a);
                    continue;
                case 18:
                    if (this.f39165b == null) {
                        this.f39165b = new C7534j();
                    }
                    c7213a.m33552a(this.f39165b);
                    continue;
                case 26:
                    if (this.f39166c == null) {
                        this.f39166c = new C7530f();
                    }
                    c7213a.m33552a(this.f39166c);
                    continue;
                case 34:
                    if (this.f39167d == null) {
                        this.f39167d = new C7537m();
                    }
                    c7213a.m33552a(this.f39167d);
                    continue;
                case 42:
                    if (this.f39168e == null) {
                        this.f39168e = new C7532h();
                    }
                    c7213a.m33552a(this.f39168e);
                    continue;
                case 50:
                    if (this.f39169f == null) {
                        this.f39169f = new jl();
                    }
                    c7213a.m33552a(this.f39169f);
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
