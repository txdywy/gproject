package com.google.wireless.android.finsky.p493b;

import android.support.v7.widget.eq;
import com.google.android.finsky.cv.a.jt;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7214c;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C7345a extends b {
    public int f36645a;
    public long f36646b;
    public long f36647c;
    public String f36648d;
    public String f36649e;
    public String f36650f;
    public String f36651g;
    public C7350f f36652h;
    public C7355k f36653i;
    public C7349e[] f36654j;
    public C7356l[] f36655k;
    public boolean f36656l;
    public long f36657m;
    public long f36658n;
    public boolean f36659o;
    public boolean f36660p;
    public C7348d f36661q;
    public ae[] f36662r;
    public int f36663s;
    public boolean f36664t;

    public final boolean m34800d() {
        return (this.f36645a & 1) != 0;
    }

    public final boolean m34801e() {
        return (this.f36645a & 4) != 0;
    }

    public final boolean m34802f() {
        return (this.f36645a & 32) != 0;
    }

    public C7345a() {
        this.f36645a = 0;
        this.f36646b = 0;
        this.f36647c = 0;
        this.f36648d = "";
        this.f36649e = "";
        this.f36650f = "";
        this.f36651g = "";
        this.f36652h = null;
        this.f36653i = null;
        this.f36654j = C7349e.m34837d();
        this.f36655k = C7356l.m34867d();
        this.f36656l = false;
        this.f36657m = 0;
        this.f36658n = 0;
        this.f36659o = true;
        this.f36660p = false;
        this.f36661q = null;
        this.f36662r = ae.m34814d();
        this.f36663s = 0;
        this.f36664t = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34798a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f36645a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f36646b);
        }
        if ((this.f36645a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36648d);
        }
        if ((this.f36645a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36650f);
        }
        if (this.f36654j != null && this.f36654j.length > 0) {
            for (i iVar : this.f36654j) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(4, iVar);
                }
            }
        }
        if (this.f36655k != null && this.f36655k.length > 0) {
            for (i iVar2 : this.f36655k) {
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(5, iVar2);
                }
            }
        }
        if ((this.f36645a & 64) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f36656l);
        }
        if ((this.f36645a & 128) != 0) {
            codedOutputByteBufferNano.m33531b(7, this.f36657m);
        }
        if ((this.f36645a & 512) != 0) {
            codedOutputByteBufferNano.m33522a(8, this.f36659o);
        }
        if ((this.f36645a & 256) != 0) {
            codedOutputByteBufferNano.m33531b(9, this.f36658n);
        }
        if ((this.f36645a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33522a(10, this.f36660p);
        }
        if (this.f36661q != null) {
            codedOutputByteBufferNano.m33532b(11, this.f36661q);
        }
        if (this.f36653i != null) {
            codedOutputByteBufferNano.m33532b(12, this.f36653i);
        }
        if ((this.f36645a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(13, this.f36651g);
        }
        if ((this.f36645a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(14, this.f36647c);
        }
        if (this.f36662r != null && this.f36662r.length > 0) {
            while (i < this.f36662r.length) {
                i iVar3 = this.f36662r[i];
                if (iVar3 != null) {
                    codedOutputByteBufferNano.m33532b(15, iVar3);
                }
                i++;
            }
        }
        if ((this.f36645a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33518a(16, this.f36663s);
        }
        if ((this.f36645a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33522a(17, this.f36664t);
        }
        if (this.f36652h != null) {
            codedOutputByteBufferNano.m33532b(18, this.f36652h);
        }
        if ((this.f36645a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(19, this.f36649e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34799b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if ((this.f36645a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f36646b);
        }
        if ((this.f36645a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36648d);
        }
        if ((this.f36645a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36650f);
        }
        if (this.f36654j != null && this.f36654j.length > 0) {
            i = b;
            for (i iVar : this.f36654j) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(4, iVar);
                }
            }
            b = i;
        }
        if (this.f36655k != null && this.f36655k.length > 0) {
            i = b;
            for (i iVar2 : this.f36655k) {
                if (iVar2 != null) {
                    i += CodedOutputByteBufferNano.m33503d(5, iVar2);
                }
            }
            b = i;
        }
        if ((this.f36645a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if ((this.f36645a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33508f(7, this.f36657m);
        }
        if ((this.f36645a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33501d(8) + 1;
        }
        if ((this.f36645a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33508f(9, this.f36658n);
        }
        if ((this.f36645a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33501d(10) + 1;
        }
        if (this.f36661q != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f36661q);
        }
        if (this.f36653i != null) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f36653i);
        }
        if ((this.f36645a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(13, this.f36651g);
        }
        if ((this.f36645a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(14, this.f36647c);
        }
        if (this.f36662r != null && this.f36662r.length > 0) {
            while (i2 < this.f36662r.length) {
                i iVar3 = this.f36662r[i2];
                if (iVar3 != null) {
                    b += CodedOutputByteBufferNano.m33503d(15, iVar3);
                }
                i2++;
            }
        }
        if ((this.f36645a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33502d(16, this.f36663s);
        }
        if ((this.f36645a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33501d(17) + 1;
        }
        if (this.f36652h != null) {
            b += CodedOutputByteBufferNano.m33503d(18, this.f36652h);
        }
        if ((this.f36645a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(19, this.f36649e);
        }
        return b;
    }

    private final C7345a m34796b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36646b = c7213a.m33568j();
                    this.f36645a |= 1;
                    continue;
                case 18:
                    this.f36648d = c7213a.m33564f();
                    this.f36645a |= 4;
                    continue;
                case 26:
                    this.f36650f = c7213a.m33564f();
                    this.f36645a |= 16;
                    continue;
                case 34:
                    a2 = C7222l.m33624a(c7213a, 34);
                    a = this.f36654j == null ? 0 : this.f36654j.length;
                    obj = new C7349e[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36654j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7349e();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7349e();
                    c7213a.m33552a(obj[a]);
                    this.f36654j = obj;
                    continue;
                case 42:
                    a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f36655k == null ? 0 : this.f36655k.length;
                    obj = new C7356l[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36655k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7356l();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7356l();
                    c7213a.m33552a(obj[a]);
                    this.f36655k = obj;
                    continue;
                case 48:
                    this.f36656l = c7213a.m33563e();
                    this.f36645a |= 64;
                    continue;
                case 56:
                    this.f36657m = c7213a.m33568j();
                    this.f36645a |= 128;
                    continue;
                case 64:
                    this.f36659o = c7213a.m33563e();
                    this.f36645a |= 512;
                    continue;
                case 72:
                    this.f36658n = c7213a.m33568j();
                    this.f36645a |= 256;
                    continue;
                case 80:
                    this.f36660p = c7213a.m33563e();
                    this.f36645a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 90:
                    if (this.f36661q == null) {
                        this.f36661q = new C7348d();
                    }
                    c7213a.m33552a(this.f36661q);
                    continue;
                case 98:
                    if (this.f36653i == null) {
                        this.f36653i = new C7355k();
                    }
                    c7213a.m33552a(this.f36653i);
                    continue;
                case 106:
                    this.f36651g = c7213a.m33564f();
                    this.f36645a |= 32;
                    continue;
                case 112:
                    this.f36647c = c7213a.m33568j();
                    this.f36645a |= 2;
                    continue;
                case 122:
                    a2 = C7222l.m33624a(c7213a, 122);
                    a = this.f36662r == null ? 0 : this.f36662r.length;
                    obj = new ae[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36662r, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ae();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ae();
                    c7213a.m33552a(obj[a]);
                    this.f36662r = obj;
                    continue;
                case 128:
                    this.f36645a |= eq.FLAG_MOVED;
                    a2 = c7213a.m33573o();
                    try {
                        this.f36663s = jt.d(c7213a.m33567i());
                        this.f36645a |= eq.FLAG_MOVED;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(a2);
                        a(c7213a, a);
                        break;
                    }
                case 136:
                    this.f36664t = c7213a.m33563e();
                    this.f36645a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 146:
                    if (this.f36652h == null) {
                        this.f36652h = new C7350f();
                    }
                    c7213a.m33552a(this.f36652h);
                    continue;
                case 154:
                    this.f36649e = c7213a.m33564f();
                    this.f36645a |= 8;
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

    public static C7345a m34795a(byte[] bArr) {
        return (C7345a) i.a(new C7345a(), bArr);
    }

    public final /* synthetic */ i m34797a(C7213a c7213a) {
        return m34796b(c7213a);
    }

    static {
        C7214c.m33574a(C7345a.class, 208355146);
    }
}
