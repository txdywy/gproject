package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.iz;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7550z extends b {
    public static volatile C7550z[] f39260a;
    public int f39261b;
    public String f39262c;
    public bd f39263d;
    public byte[] f39264e;
    public String f39265f;
    public ag[] f39266g;
    public boolean f39267h;
    public int f39268i;

    public static C7550z[] m36603d() {
        if (f39260a == null) {
            synchronized (C7219h.f35465b) {
                if (f39260a == null) {
                    f39260a = new C7550z[0];
                }
            }
        }
        return f39260a;
    }

    public C7550z() {
        this.f39261b = 0;
        this.f39262c = "";
        this.f39263d = null;
        this.f39264e = C7222l.f35479l;
        this.f39265f = "";
        this.f39266g = ag.m35988d();
        this.f39267h = false;
        this.f39268i = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36605a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39261b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39262c);
        }
        if (this.f39263d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f39263d);
        }
        if ((this.f39261b & 2) != 0) {
            codedOutputByteBufferNano.m33523a(3, this.f39264e);
        }
        if ((this.f39261b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f39265f);
        }
        if (this.f39266g != null && this.f39266g.length > 0) {
            for (i iVar : this.f39266g) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar);
                }
            }
        }
        if ((this.f39261b & 8) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f39267h);
        }
        if ((this.f39261b & 16) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f39268i);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36606b() {
        int b = super.b();
        if ((this.f39261b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39262c);
        }
        if (this.f39263d != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f39263d);
        }
        if ((this.f39261b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33494b(3, this.f39264e);
        }
        if ((this.f39261b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f39265f);
        }
        if (this.f39266g != null && this.f39266g.length > 0) {
            int i = b;
            for (i iVar : this.f39266g) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(5, iVar);
                }
            }
            b = i;
        }
        if ((this.f39261b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if ((this.f39261b & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(7, this.f39268i);
        }
        return b;
    }

    private final C7550z m36602b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39262c = c7213a.m33564f();
                    this.f39261b |= 1;
                    continue;
                case 18:
                    if (this.f39263d == null) {
                        this.f39263d = new bd();
                    }
                    c7213a.m33552a(this.f39263d);
                    continue;
                case 26:
                    this.f39264e = c7213a.m33565g();
                    this.f39261b |= 2;
                    continue;
                case 34:
                    this.f39265f = c7213a.m33564f();
                    this.f39261b |= 4;
                    continue;
                case 42:
                    a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f39266g == null ? 0 : this.f39266g.length;
                    Object obj = new ag[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39266g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ag();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ag();
                    c7213a.m33552a(obj[a]);
                    this.f39266g = obj;
                    continue;
                case 48:
                    this.f39267h = c7213a.m33563e();
                    this.f39261b |= 8;
                    continue;
                case 56:
                    this.f39261b |= 16;
                    a2 = c7213a.m33573o();
                    try {
                        this.f39268i = iz.a(c7213a.m33567i());
                        this.f39261b |= 16;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(a2);
                        a(c7213a, a);
                        break;
                    }
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ i m36604a(C7213a c7213a) {
        return m36602b(c7213a);
    }
}
