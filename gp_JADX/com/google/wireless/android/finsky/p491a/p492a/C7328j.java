package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7328j extends b {
    public int f36514a;
    public String f36515b;
    public String f36516c;
    public ac f36517d;
    public ac f36518e;
    public ac f36519f;
    public ab f36520g;
    public ab f36521h;
    public C7344z f36522i;
    public String f36523j;
    public am f36524k;
    public String f36525l;
    public C7342x f36526m;

    public C7328j() {
        this.f36514a = 0;
        this.f36515b = "";
        this.f36516c = "";
        this.f36517d = null;
        this.f36518e = null;
        this.f36519f = null;
        this.f36520g = null;
        this.f36521h = null;
        this.f36522i = null;
        this.f36523j = "";
        this.f36524k = null;
        this.f36525l = "";
        this.f36526m = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34741a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36514a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36515b);
        }
        if ((this.f36514a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36516c);
        }
        if (this.f36517d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36517d);
        }
        if (this.f36518e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f36518e);
        }
        if (this.f36519f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f36519f);
        }
        if (this.f36520g != null) {
            codedOutputByteBufferNano.m33532b(6, this.f36520g);
        }
        if (this.f36521h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f36521h);
        }
        if (this.f36524k != null) {
            codedOutputByteBufferNano.m33532b(8, this.f36524k);
        }
        if ((this.f36514a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f36525l);
        }
        if (this.f36526m != null) {
            codedOutputByteBufferNano.m33532b(10, this.f36526m);
        }
        if (this.f36522i != null) {
            codedOutputByteBufferNano.m33532b(11, this.f36522i);
        }
        if ((this.f36514a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(12, this.f36523j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34742b() {
        int b = super.b();
        if ((this.f36514a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36515b);
        }
        if ((this.f36514a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36516c);
        }
        if (this.f36517d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f36517d);
        }
        if (this.f36518e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f36518e);
        }
        if (this.f36519f != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f36519f);
        }
        if (this.f36520g != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f36520g);
        }
        if (this.f36521h != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f36521h);
        }
        if (this.f36524k != null) {
            b += CodedOutputByteBufferNano.m33503d(8, this.f36524k);
        }
        if ((this.f36514a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f36525l);
        }
        if (this.f36526m != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f36526m);
        }
        if (this.f36522i != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f36522i);
        }
        if ((this.f36514a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(12, this.f36523j);
        }
        return b;
    }

    public final /* synthetic */ i m34740a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36515b = c7213a.m33564f();
                    this.f36514a |= 1;
                    continue;
                case 18:
                    this.f36516c = c7213a.m33564f();
                    this.f36514a |= 2;
                    continue;
                case 26:
                    if (this.f36517d == null) {
                        this.f36517d = new ac();
                    }
                    c7213a.m33552a(this.f36517d);
                    continue;
                case 34:
                    if (this.f36518e == null) {
                        this.f36518e = new ac();
                    }
                    c7213a.m33552a(this.f36518e);
                    continue;
                case 42:
                    if (this.f36519f == null) {
                        this.f36519f = new ac();
                    }
                    c7213a.m33552a(this.f36519f);
                    continue;
                case 50:
                    if (this.f36520g == null) {
                        this.f36520g = new ab();
                    }
                    c7213a.m33552a(this.f36520g);
                    continue;
                case 58:
                    if (this.f36521h == null) {
                        this.f36521h = new ab();
                    }
                    c7213a.m33552a(this.f36521h);
                    continue;
                case 66:
                    if (this.f36524k == null) {
                        this.f36524k = new am();
                    }
                    c7213a.m33552a(this.f36524k);
                    continue;
                case 74:
                    this.f36525l = c7213a.m33564f();
                    this.f36514a |= 8;
                    continue;
                case 82:
                    if (this.f36526m == null) {
                        this.f36526m = new C7342x();
                    }
                    c7213a.m33552a(this.f36526m);
                    continue;
                case 90:
                    if (this.f36522i == null) {
                        this.f36522i = new C7344z();
                    }
                    c7213a.m33552a(this.f36522i);
                    continue;
                case 98:
                    this.f36523j = c7213a.m33564f();
                    this.f36514a |= 4;
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
