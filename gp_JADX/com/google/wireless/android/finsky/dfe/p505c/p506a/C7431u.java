package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bl;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7431u extends b {
    public int f37677a;
    public bl f37678b;
    public bl f37679c;
    public ax f37680d;
    public String f37681e;
    public int f37682f;
    public String f37683g;
    public int f37684h;
    public bl[] f37685i;
    public String f37686j;

    public C7431u() {
        this.f37677a = 0;
        this.f37678b = null;
        this.f37679c = null;
        this.f37680d = null;
        this.f37681e = "";
        this.f37682f = 0;
        this.f37683g = "";
        this.f37684h = 0;
        this.f37685i = bl.aK_();
        this.f37686j = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35510a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37678b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37678b);
        }
        if (this.f37679c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37679c);
        }
        if (this.f37680d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37680d);
        }
        if ((this.f37677a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37681e);
        }
        if ((this.f37677a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f37682f);
        }
        if ((this.f37677a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37683g);
        }
        if ((this.f37677a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f37684h);
        }
        if (this.f37685i != null && this.f37685i.length > 0) {
            for (i iVar : this.f37685i) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(8, iVar);
                }
            }
        }
        if ((this.f37677a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f37686j);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35511b() {
        int b = super.b();
        if (this.f37678b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37678b);
        }
        if (this.f37679c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37679c);
        }
        if (this.f37680d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37680d);
        }
        if ((this.f37677a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37681e);
        }
        if ((this.f37677a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f37682f);
        }
        if ((this.f37677a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f37683g);
        }
        if ((this.f37677a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(7, this.f37684h);
        }
        if (this.f37685i != null && this.f37685i.length > 0) {
            int i = b;
            for (i iVar : this.f37685i) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(8, iVar);
                }
            }
            b = i;
        }
        if ((this.f37677a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(9, this.f37686j);
        }
        return b;
    }

    public final /* synthetic */ i m35509a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37678b == null) {
                        this.f37678b = new bl();
                    }
                    c7213a.m33552a(this.f37678b);
                    continue;
                case 18:
                    if (this.f37679c == null) {
                        this.f37679c = new bl();
                    }
                    c7213a.m33552a(this.f37679c);
                    continue;
                case 26:
                    if (this.f37680d == null) {
                        this.f37680d = new ax();
                    }
                    c7213a.m33552a(this.f37680d);
                    continue;
                case 34:
                    this.f37681e = c7213a.m33564f();
                    this.f37677a |= 1;
                    continue;
                case 40:
                    this.f37682f = c7213a.m33567i();
                    this.f37677a |= 2;
                    continue;
                case 50:
                    this.f37683g = c7213a.m33564f();
                    this.f37677a |= 4;
                    continue;
                case 56:
                    this.f37684h = c7213a.m33567i();
                    this.f37677a |= 8;
                    continue;
                case 66:
                    int a2 = C7222l.m33624a(c7213a, 66);
                    a = this.f37685i == null ? 0 : this.f37685i.length;
                    Object obj = new bl[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37685i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bl();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bl();
                    c7213a.m33552a(obj[a]);
                    this.f37685i = obj;
                    continue;
                case 74:
                    this.f37686j = c7213a.m33564f();
                    this.f37677a |= 16;
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
