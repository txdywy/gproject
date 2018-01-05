package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7535k extends b {
    public int f39154a;
    public C7536l f39155b;
    public C7526c f39156c;
    public C7539o f39157d;
    public C7541q f39158e;
    public C7527d f39159f;
    public C7538n f39160g;
    public C7542r f39161h;
    public C7531g f39162i;
    public byte[] f39163j;

    public C7535k() {
        this.f39154a = 0;
        this.f39155b = null;
        this.f39156c = null;
        this.f39157d = null;
        this.f39158e = null;
        this.f39159f = null;
        this.f39160g = null;
        this.f39161h = null;
        this.f39162i = null;
        this.f39163j = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36555a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39155b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39155b);
        }
        if (this.f39156c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39156c);
        }
        if (this.f39157d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f39157d);
        }
        if (this.f39158e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f39158e);
        }
        if (this.f39159f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f39159f);
        }
        if (this.f39160g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f39160g);
        }
        if (this.f39161h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f39161h);
        }
        if (this.f39162i != null) {
            codedOutputByteBufferNano.m33532b(8, this.f39162i);
        }
        if ((this.f39154a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(9, this.f39163j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36556b() {
        int b = super.b();
        if (this.f39155b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39155b);
        }
        if (this.f39156c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f39156c);
        }
        if (this.f39157d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f39157d);
        }
        if (this.f39158e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f39158e);
        }
        if (this.f39159f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f39159f);
        }
        if (this.f39160g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f39160g);
        }
        if (this.f39161h != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f39161h);
        }
        if (this.f39162i != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f39162i);
        }
        if ((this.f39154a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(9, this.f39163j);
        }
        return b;
    }

    public final /* synthetic */ i m36554a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39155b == null) {
                        this.f39155b = new C7536l();
                    }
                    c7213a.m33552a(this.f39155b);
                    continue;
                case 18:
                    if (this.f39156c == null) {
                        this.f39156c = new C7526c();
                    }
                    c7213a.m33552a(this.f39156c);
                    continue;
                case 26:
                    if (this.f39157d == null) {
                        this.f39157d = new C7539o();
                    }
                    c7213a.m33552a(this.f39157d);
                    continue;
                case 34:
                    if (this.f39158e == null) {
                        this.f39158e = new C7541q();
                    }
                    c7213a.m33552a(this.f39158e);
                    continue;
                case 42:
                    if (this.f39159f == null) {
                        this.f39159f = new C7527d();
                    }
                    c7213a.m33552a(this.f39159f);
                    continue;
                case 50:
                    if (this.f39160g == null) {
                        this.f39160g = new C7538n();
                    }
                    c7213a.m33552a(this.f39160g);
                    continue;
                case 58:
                    if (this.f39161h == null) {
                        this.f39161h = new C7542r();
                    }
                    c7213a.m33552a(this.f39161h);
                    continue;
                case 66:
                    if (this.f39162i == null) {
                        this.f39162i = new C7531g();
                    }
                    c7213a.m33552a(this.f39162i);
                    continue;
                case 74:
                    this.f39163j = c7213a.m33565g();
                    this.f39154a |= 1;
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
