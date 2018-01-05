package com.google.wireless.android.finsky.p493b;

import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.az;
import com.google.android.finsky.cv.a.bp;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7364t extends b {
    public static volatile C7364t[] f36800a;
    public int f36801b;
    public ax f36802c;
    public int f36803d;
    public long f36804e;
    public boolean f36805f;
    public long f36806g;
    public boolean f36807h;
    public C7361q f36808i;
    public C7366v f36809j;
    public C7363s f36810k;
    public C7362r f36811l;
    public az f36812m;
    public long f36813n;
    public C7365u[] f36814o;

    public static C7364t[] m34894d() {
        if (f36800a == null) {
            synchronized (C7219h.f35465b) {
                if (f36800a == null) {
                    f36800a = new C7364t[0];
                }
            }
        }
        return f36800a;
    }

    public C7364t() {
        this.f36801b = 0;
        this.f36802c = null;
        this.f36803d = 1;
        this.f36804e = 0;
        this.f36805f = false;
        this.f36806g = 0;
        this.f36807h = false;
        this.f36808i = null;
        this.f36809j = null;
        this.f36810k = null;
        this.f36811l = null;
        this.f36812m = null;
        this.f36813n = 0;
        this.f36814o = C7365u.f36816b;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34896a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36802c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36802c);
        }
        if ((this.f36801b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36803d);
        }
        if ((this.f36801b & 2) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f36804e);
        }
        if ((this.f36801b & 4) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f36805f);
        }
        if (this.f36808i != null) {
            codedOutputByteBufferNano.m33532b(5, this.f36808i);
        }
        if (this.f36809j != null) {
            codedOutputByteBufferNano.m33532b(6, this.f36809j);
        }
        if (this.f36810k != null) {
            codedOutputByteBufferNano.m33532b(7, this.f36810k);
        }
        if ((this.f36801b & 8) != 0) {
            codedOutputByteBufferNano.m33531b(8, this.f36806g);
        }
        if ((this.f36801b & 16) != 0) {
            codedOutputByteBufferNano.m33522a(9, this.f36807h);
        }
        if (this.f36811l != null) {
            codedOutputByteBufferNano.m33532b(10, this.f36811l);
        }
        if (this.f36812m != null) {
            codedOutputByteBufferNano.m33532b(11, this.f36812m);
        }
        if ((this.f36801b & 32) != 0) {
            codedOutputByteBufferNano.m33531b(12, this.f36813n);
        }
        if (this.f36814o != null && this.f36814o.length > 0) {
            for (i iVar : this.f36814o) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(13, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34897b() {
        int b = super.b();
        if (this.f36802c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36802c);
        }
        if ((this.f36801b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36803d);
        }
        if ((this.f36801b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f36804e);
        }
        if ((this.f36801b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if (this.f36808i != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f36808i);
        }
        if (this.f36809j != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f36809j);
        }
        if (this.f36810k != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f36810k);
        }
        if ((this.f36801b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(8, this.f36806g);
        }
        if ((this.f36801b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(9) + 1;
        }
        if (this.f36811l != null) {
            b += CodedOutputByteBufferNano.m33503d(10, this.f36811l);
        }
        if (this.f36812m != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f36812m);
        }
        if ((this.f36801b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33508f(12, this.f36813n);
        }
        if (this.f36814o == null || this.f36814o.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f36814o) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(13, iVar);
            }
        }
        return i;
    }

    private final C7364t m34893b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int o;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36802c == null) {
                        this.f36802c = new ax();
                    }
                    c7213a.m33552a(this.f36802c);
                    continue;
                case 16:
                    this.f36801b |= 1;
                    o = c7213a.m33573o();
                    try {
                        this.f36803d = bp.a(c7213a.m33567i());
                        this.f36801b |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 24:
                    this.f36804e = c7213a.m33568j();
                    this.f36801b |= 2;
                    continue;
                case 32:
                    this.f36805f = c7213a.m33563e();
                    this.f36801b |= 4;
                    continue;
                case 42:
                    if (this.f36808i == null) {
                        this.f36808i = new C7361q();
                    }
                    c7213a.m33552a(this.f36808i);
                    continue;
                case 50:
                    if (this.f36809j == null) {
                        this.f36809j = new C7366v();
                    }
                    c7213a.m33552a(this.f36809j);
                    continue;
                case 58:
                    if (this.f36810k == null) {
                        this.f36810k = new C7363s();
                    }
                    c7213a.m33552a(this.f36810k);
                    continue;
                case 64:
                    this.f36806g = c7213a.m33568j();
                    this.f36801b |= 8;
                    continue;
                case 72:
                    this.f36807h = c7213a.m33563e();
                    this.f36801b |= 16;
                    continue;
                case 82:
                    if (this.f36811l == null) {
                        this.f36811l = new C7362r();
                    }
                    c7213a.m33552a(this.f36811l);
                    continue;
                case 90:
                    if (this.f36812m == null) {
                        this.f36812m = new az();
                    }
                    c7213a.m33552a(this.f36812m);
                    continue;
                case 96:
                    this.f36813n = c7213a.m33568j();
                    this.f36801b |= 32;
                    continue;
                case 106:
                    o = C7222l.m33624a(c7213a, 106);
                    a = this.f36814o == null ? 0 : this.f36814o.length;
                    Object obj = new C7365u[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36814o, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7365u();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7365u();
                    c7213a.m33552a(obj[a]);
                    this.f36814o = obj;
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

    public final /* synthetic */ i m34895a(C7213a c7213a) {
        return m34893b(c7213a);
    }
}
