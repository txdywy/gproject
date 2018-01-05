package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.C7320b;

public final class C7424n extends b {
    public int f37619a;
    public bl f37620b;
    public C7425o[] f37621c;
    public String[] f37622d;
    public boolean f37623e;
    public int f37624f;
    public int f37625g;
    public boolean f37626h;
    public boolean f37627i;
    public long f37628j;
    public ef f37629k;
    public boolean f37630l;
    public String f37631m;
    public ax f37632n;

    public C7424n() {
        this.f37619a = 0;
        this.f37620b = null;
        this.f37621c = C7425o.m35489d();
        this.f37622d = C7222l.f35477j;
        this.f37623e = false;
        this.f37624f = 0;
        this.f37625g = 0;
        this.f37626h = false;
        this.f37627i = false;
        this.f37628j = 0;
        this.f37629k = null;
        this.f37630l = false;
        this.f37631m = "";
        this.f37632n = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35487a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if (this.f37620b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37620b);
        }
        if ((this.f37619a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f37623e);
        }
        if ((this.f37619a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37624f);
        }
        if ((this.f37619a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f37625g);
        }
        if ((this.f37619a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f37626h);
        }
        if ((this.f37619a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(7, this.f37627i);
        }
        if ((this.f37619a & 32) != 0) {
            codedOutputByteBufferNano.m33531b(8, this.f37628j);
        }
        if (this.f37629k != null) {
            codedOutputByteBufferNano.m33532b(9, this.f37629k);
        }
        if ((this.f37619a & 64) != 0) {
            codedOutputByteBufferNano.m33522a(11, this.f37630l);
        }
        if (this.f37621c != null && this.f37621c.length > 0) {
            for (i iVar : this.f37621c) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(13, iVar);
                }
            }
        }
        if (this.f37622d != null && this.f37622d.length > 0) {
            while (i < this.f37622d.length) {
                String str = this.f37622d[i];
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(14, str);
                }
                i++;
            }
        }
        if ((this.f37619a & 128) != 0) {
            codedOutputByteBufferNano.m33521a(15, this.f37631m);
        }
        if (this.f37632n != null) {
            codedOutputByteBufferNano.m33532b(16, this.f37632n);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35488b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f37620b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37620b);
        }
        if ((this.f37619a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f37619a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f37624f);
        }
        if ((this.f37619a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f37625g);
        }
        if ((this.f37619a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if ((this.f37619a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(7) + 1;
        }
        if ((this.f37619a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33508f(8, this.f37628j);
        }
        if (this.f37629k != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f37629k);
        }
        if ((this.f37619a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33501d(11) + 1;
        }
        if (this.f37621c != null && this.f37621c.length > 0) {
            i = b;
            for (i iVar : this.f37621c) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(13, iVar);
                }
            }
            b = i;
        }
        if (this.f37622d != null && this.f37622d.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f37622d.length) {
                String str = this.f37622d[i2];
                if (str != null) {
                    i3++;
                    i += CodedOutputByteBufferNano.m33495b(str);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if ((this.f37619a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33493b(15, this.f37631m);
        }
        if (this.f37632n != null) {
            return b + CodedOutputByteBufferNano.m33503d(16, this.f37632n);
        }
        return b;
    }

    private final C7424n m35485b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37620b == null) {
                        this.f37620b = new bl();
                    }
                    c7213a.m33552a(this.f37620b);
                    continue;
                case 16:
                    this.f37623e = c7213a.m33563e();
                    this.f37619a |= 1;
                    continue;
                case 24:
                    this.f37619a |= 2;
                    o = c7213a.m33573o();
                    try {
                        this.f37624f = C7320b.m34689a(c7213a.m33567i());
                        this.f37619a |= 2;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 32:
                    this.f37619a |= 4;
                    o = c7213a.m33573o();
                    try {
                        this.f37625g = am.m35110a(c7213a.m33567i());
                        this.f37619a |= 4;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 48:
                    this.f37626h = c7213a.m33563e();
                    this.f37619a |= 8;
                    continue;
                case 56:
                    this.f37627i = c7213a.m33563e();
                    this.f37619a |= 16;
                    continue;
                case 64:
                    this.f37628j = c7213a.m33568j();
                    this.f37619a |= 32;
                    continue;
                case 74:
                    if (this.f37629k == null) {
                        this.f37629k = new ef();
                    }
                    c7213a.m33552a(this.f37629k);
                    continue;
                case 88:
                    this.f37630l = c7213a.m33563e();
                    this.f37619a |= 64;
                    continue;
                case 106:
                    o = C7222l.m33624a(c7213a, 106);
                    a = this.f37621c == null ? 0 : this.f37621c.length;
                    obj = new C7425o[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37621c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7425o();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7425o();
                    c7213a.m33552a(obj[a]);
                    this.f37621c = obj;
                    continue;
                case 114:
                    o = C7222l.m33624a(c7213a, 114);
                    a = this.f37622d == null ? 0 : this.f37622d.length;
                    obj = new String[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37622d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f37622d = obj;
                    continue;
                case 122:
                    this.f37631m = c7213a.m33564f();
                    this.f37619a |= 128;
                    continue;
                case 130:
                    if (this.f37632n == null) {
                        this.f37632n = new ax();
                    }
                    c7213a.m33552a(this.f37632n);
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

    public final /* synthetic */ i m35486a(C7213a c7213a) {
        return m35485b(c7213a);
    }
}
