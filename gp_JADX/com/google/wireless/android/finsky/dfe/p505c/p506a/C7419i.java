package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7419i extends b {
    public int f37573a;
    public cg f37574b;
    public de f37575c;
    public de f37576d;
    public de f37577e;
    public de f37578f;
    public de f37579g;
    public de f37580h;
    public de f37581i;
    public String f37582j;
    public String f37583k;

    public C7419i() {
        this.f37573a = 0;
        this.f37574b = null;
        this.f37575c = null;
        this.f37576d = null;
        this.f37577e = null;
        this.f37578f = null;
        this.f37579g = null;
        this.f37580h = null;
        this.f37581i = null;
        this.f37582j = "";
        this.f37583k = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35468a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37574b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37574b);
        }
        if (this.f37575c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37575c);
        }
        if (this.f37576d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37576d);
        }
        if (this.f37577e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37577e);
        }
        if (this.f37578f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37578f);
        }
        if (this.f37579g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37579g);
        }
        if (this.f37580h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f37580h);
        }
        if (this.f37581i != null) {
            codedOutputByteBufferNano.m33532b(8, this.f37581i);
        }
        if ((this.f37573a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f37582j);
        }
        if ((this.f37573a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f37583k);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35469b() {
        int b = super.b();
        if (this.f37574b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37574b);
        }
        if (this.f37575c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37575c);
        }
        if (this.f37576d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37576d);
        }
        if (this.f37577e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37577e);
        }
        if (this.f37578f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37578f);
        }
        if (this.f37579g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f37579g);
        }
        if (this.f37580h != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f37580h);
        }
        if (this.f37581i != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f37581i);
        }
        if ((this.f37573a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f37582j);
        }
        if ((this.f37573a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(10, this.f37583k);
        }
        return b;
    }

    public final /* synthetic */ i m35467a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37574b == null) {
                        this.f37574b = new cg();
                    }
                    c7213a.m33552a(this.f37574b);
                    continue;
                case 18:
                    if (this.f37575c == null) {
                        this.f37575c = new de();
                    }
                    c7213a.m33552a(this.f37575c);
                    continue;
                case 26:
                    if (this.f37576d == null) {
                        this.f37576d = new de();
                    }
                    c7213a.m33552a(this.f37576d);
                    continue;
                case 34:
                    if (this.f37577e == null) {
                        this.f37577e = new de();
                    }
                    c7213a.m33552a(this.f37577e);
                    continue;
                case 42:
                    if (this.f37578f == null) {
                        this.f37578f = new de();
                    }
                    c7213a.m33552a(this.f37578f);
                    continue;
                case 50:
                    if (this.f37579g == null) {
                        this.f37579g = new de();
                    }
                    c7213a.m33552a(this.f37579g);
                    continue;
                case 58:
                    if (this.f37580h == null) {
                        this.f37580h = new de();
                    }
                    c7213a.m33552a(this.f37580h);
                    continue;
                case 66:
                    if (this.f37581i == null) {
                        this.f37581i = new de();
                    }
                    c7213a.m33552a(this.f37581i);
                    continue;
                case 74:
                    this.f37582j = c7213a.m33564f();
                    this.f37573a |= 1;
                    continue;
                case 82:
                    this.f37583k = c7213a.m33564f();
                    this.f37573a |= 2;
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
