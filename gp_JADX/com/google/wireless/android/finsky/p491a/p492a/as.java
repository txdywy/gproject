package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class as extends b {
    public static volatile as[] f36422a;
    public int f36423b;
    public int f36424c;
    public boolean f36425d;
    public C7327i f36426e;
    public at f36427f;
    public String[] f36428g;

    public static as[] m34667d() {
        if (f36422a == null) {
            synchronized (C7219h.f35465b) {
                if (f36422a == null) {
                    f36422a = new as[0];
                }
            }
        }
        return f36422a;
    }

    public as() {
        this.f36423b = 0;
        this.f36424c = 0;
        this.f36425d = false;
        this.f36426e = null;
        this.f36427f = null;
        this.f36428g = C7222l.f35477j;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34669a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36423b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36424c);
        }
        if ((this.f36423b & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f36425d);
        }
        if (this.f36426e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36426e);
        }
        if (this.f36427f != null) {
            codedOutputByteBufferNano.m33532b(4, this.f36427f);
        }
        if (this.f36428g != null && this.f36428g.length > 0) {
            for (String str : this.f36428g) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(5, str);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34670b() {
        int i = 0;
        int b = super.b();
        if ((this.f36423b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36424c);
        }
        if ((this.f36423b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if (this.f36426e != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f36426e);
        }
        if (this.f36427f != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f36427f);
        }
        if (this.f36428g == null || this.f36428g.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f36428g.length) {
            String str = this.f36428g[i];
            if (str != null) {
                i3++;
                i2 += CodedOutputByteBufferNano.m33495b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private final as m34666b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36423b |= 1;
                    o = c7213a.m33573o();
                    try {
                        this.f36424c = ar.m34664a(c7213a.m33567i());
                        this.f36423b |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    this.f36425d = c7213a.m33563e();
                    this.f36423b |= 2;
                    continue;
                case 26:
                    if (this.f36426e == null) {
                        this.f36426e = new C7327i();
                    }
                    c7213a.m33552a(this.f36426e);
                    continue;
                case 34:
                    if (this.f36427f == null) {
                        this.f36427f = new at();
                    }
                    c7213a.m33552a(this.f36427f);
                    continue;
                case 42:
                    o = C7222l.m33624a(c7213a, 42);
                    a = this.f36428g == null ? 0 : this.f36428g.length;
                    Object obj = new String[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36428g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f36428g = obj;
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

    public final /* synthetic */ i m34668a(C7213a c7213a) {
        return m34666b(c7213a);
    }
}
