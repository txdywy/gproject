package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.p505c.p506a.an;
import com.google.wireless.android.finsky.dfe.p511f.p512a.C7446a;
import com.google.wireless.android.finsky.dfe.p515h.p516a.C7485j;

public final class gy extends b {
    public dl f39143a;
    public ei f39144b;
    public C7485j f39145c;
    public dy f39146d;
    public cn f39147e;
    public C7446a f39148f;
    public an f39149g;
    public be f39150h;
    public bo f39151i;

    public gy() {
        this.f39143a = null;
        this.f39144b = null;
        this.f39145c = null;
        this.f39146d = null;
        this.f39147e = null;
        this.f39148f = null;
        this.f39149g = null;
        this.f39150h = null;
        this.f39151i = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36545a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39143a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39143a);
        }
        if (this.f39144b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39144b);
        }
        if (this.f39145c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f39145c);
        }
        if (this.f39146d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f39146d);
        }
        if (this.f39147e != null) {
            codedOutputByteBufferNano.m33532b(7, this.f39147e);
        }
        if (this.f39148f != null) {
            codedOutputByteBufferNano.m33532b(8, this.f39148f);
        }
        if (this.f39149g != null) {
            codedOutputByteBufferNano.m33532b(9, this.f39149g);
        }
        if (this.f39150h != null) {
            codedOutputByteBufferNano.m33532b(10, this.f39150h);
        }
        if (this.f39151i != null) {
            codedOutputByteBufferNano.m33532b(11, this.f39151i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36546b() {
        int b = super.b();
        if (this.f39143a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39143a);
        }
        if (this.f39144b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f39144b);
        }
        if (this.f39145c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f39145c);
        }
        if (this.f39146d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f39146d);
        }
        if (this.f39147e != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f39147e);
        }
        if (this.f39148f != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f39148f);
        }
        if (this.f39149g != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f39149g);
        }
        if (this.f39150h != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f39150h);
        }
        if (this.f39151i != null) {
            return b + CodedOutputByteBufferNano.m33503d(11, this.f39151i);
        }
        return b;
    }

    public final /* synthetic */ i m36544a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39143a == null) {
                        this.f39143a = new dl();
                    }
                    c7213a.m33552a(this.f39143a);
                    continue;
                case 18:
                    if (this.f39144b == null) {
                        this.f39144b = new ei();
                    }
                    c7213a.m33552a(this.f39144b);
                    continue;
                case 26:
                    if (this.f39145c == null) {
                        this.f39145c = new C7485j();
                    }
                    c7213a.m33552a(this.f39145c);
                    continue;
                case 34:
                    if (this.f39146d == null) {
                        this.f39146d = new dy();
                    }
                    c7213a.m33552a(this.f39146d);
                    continue;
                case 58:
                    if (this.f39147e == null) {
                        this.f39147e = new cn();
                    }
                    c7213a.m33552a(this.f39147e);
                    continue;
                case 66:
                    if (this.f39148f == null) {
                        this.f39148f = new C7446a();
                    }
                    c7213a.m33552a(this.f39148f);
                    continue;
                case 74:
                    if (this.f39149g == null) {
                        this.f39149g = new an();
                    }
                    c7213a.m33552a(this.f39149g);
                    continue;
                case 82:
                    if (this.f39150h == null) {
                        this.f39150h = new be();
                    }
                    c7213a.m33552a(this.f39150h);
                    continue;
                case 90:
                    if (this.f39151i == null) {
                        this.f39151i = new bo();
                    }
                    c7213a.m33552a(this.f39151i);
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
