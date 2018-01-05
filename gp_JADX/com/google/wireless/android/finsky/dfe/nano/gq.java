package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.p505c.p506a.an;

public final class gq extends b {
    public int f39114a;
    public dl f39115b;
    public eh f39116c;
    public int f39117d;
    public cn f39118e;
    public an f39119f;
    public bn f39120g;

    public gq() {
        this.f39114a = 0;
        this.f39115b = null;
        this.f39116c = null;
        this.f39117d = 0;
        this.f39118e = null;
        this.f39119f = null;
        this.f39120g = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36526a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39115b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39115b);
        }
        if (this.f39116c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f39116c);
        }
        if ((this.f39114a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f39117d);
        }
        if (this.f39118e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f39118e);
        }
        if (this.f39119f != null) {
            codedOutputByteBufferNano.m33532b(6, this.f39119f);
        }
        if (this.f39120g != null) {
            codedOutputByteBufferNano.m33532b(7, this.f39120g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36527b() {
        int b = super.b();
        if (this.f39115b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f39115b);
        }
        if (this.f39116c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f39116c);
        }
        if ((this.f39114a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f39117d);
        }
        if (this.f39118e != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f39118e);
        }
        if (this.f39119f != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f39119f);
        }
        if (this.f39120g != null) {
            return b + CodedOutputByteBufferNano.m33503d(7, this.f39120g);
        }
        return b;
    }

    private final gq m36524b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    if (this.f39115b == null) {
                        this.f39115b = new dl();
                    }
                    c7213a.m33552a(this.f39115b);
                    continue;
                case 26:
                    if (this.f39116c == null) {
                        this.f39116c = new eh();
                    }
                    c7213a.m33552a(this.f39116c);
                    continue;
                case 32:
                    this.f39114a |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f39117d = dx.m36294a(c7213a.m33567i());
                        this.f39114a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 42:
                    if (this.f39118e == null) {
                        this.f39118e = new cn();
                    }
                    c7213a.m33552a(this.f39118e);
                    continue;
                case 50:
                    if (this.f39119f == null) {
                        this.f39119f = new an();
                    }
                    c7213a.m33552a(this.f39119f);
                    continue;
                case 58:
                    if (this.f39120g == null) {
                        this.f39120g = new bn();
                    }
                    c7213a.m33552a(this.f39120g);
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

    public final /* synthetic */ i m36525a(C7213a c7213a) {
        return m36524b(c7213a);
    }
}
