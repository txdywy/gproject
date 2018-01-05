package com.google.wireless.android.finsky.p491a.p492a;

import android.support.v7.widget.eq;
import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.p485c.p486a.p487a.C7298a;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class ao extends b {
    public static volatile ao[] f36379a;
    public String[] f36380A;
    public int f36381b;
    public String f36382c;
    public String f36383d;
    public bd f36384e;
    public int f36385f;
    public int f36386g;
    public C7298a f36387h;
    public C7321c f36388i;
    public ai f36389j;
    public C7323e f36390k;
    public az f36391l;
    public C7322d f36392m;
    public an f36393n;
    public au f36394o;
    public bf f36395p;
    public int f36396q;
    public ak[] f36397r;
    public String f36398s;
    public byte[] f36399t;
    public String f36400u;
    public byte[] f36401v;
    public ap f36402w;
    public String f36403x;
    public boolean f36404y;
    public byte[] f36405z;

    public static ao[] m34651d() {
        if (f36379a == null) {
            synchronized (C7219h.f35465b) {
                if (f36379a == null) {
                    f36379a = new ao[0];
                }
            }
        }
        return f36379a;
    }

    public final boolean m34655e() {
        return (this.f36381b & 512) != 0;
    }

    public ao() {
        this.f36381b = 0;
        this.f36382c = "";
        this.f36383d = "";
        this.f36384e = null;
        this.f36385f = 0;
        this.f36386g = 0;
        this.f36387h = null;
        this.f36388i = null;
        this.f36389j = null;
        this.f36390k = null;
        this.f36391l = null;
        this.f36392m = null;
        this.f36393n = null;
        this.f36394o = null;
        this.f36395p = null;
        this.f36396q = 0;
        this.f36397r = ak.m34634d();
        this.f36398s = "";
        this.f36399t = C7222l.f35479l;
        this.f36400u = "";
        this.f36401v = C7222l.f35479l;
        this.f36402w = null;
        this.f36403x = "";
        this.f36404y = false;
        this.f36405z = C7222l.f35479l;
        this.f36380A = C7222l.f35477j;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34653a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f36381b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36382c);
        }
        if (this.f36387h != null) {
            codedOutputByteBufferNano.m33532b(2, this.f36387h);
        }
        if (this.f36389j != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36389j);
        }
        if (this.f36388i != null) {
            codedOutputByteBufferNano.m33532b(5, this.f36388i);
        }
        if ((this.f36381b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f36385f);
        }
        if (this.f36390k != null) {
            codedOutputByteBufferNano.m33532b(7, this.f36390k);
        }
        if ((this.f36381b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f36383d);
        }
        if ((this.f36381b & 16) != 0) {
            codedOutputByteBufferNano.m33518a(10, this.f36396q);
        }
        if (this.f36391l != null) {
            codedOutputByteBufferNano.m33532b(11, this.f36391l);
        }
        if (this.f36397r != null && this.f36397r.length > 0) {
            for (i iVar : this.f36397r) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(12, iVar);
                }
            }
        }
        if ((this.f36381b & 32) != 0) {
            codedOutputByteBufferNano.m33521a(13, this.f36398s);
        }
        if (this.f36384e != null) {
            codedOutputByteBufferNano.m33532b(14, this.f36384e);
        }
        if ((this.f36381b & 64) != 0) {
            codedOutputByteBufferNano.m33523a(15, this.f36399t);
        }
        if ((this.f36381b & 128) != 0) {
            codedOutputByteBufferNano.m33521a(16, this.f36400u);
        }
        if ((this.f36381b & 256) != 0) {
            codedOutputByteBufferNano.m33523a(17, this.f36401v);
        }
        if (this.f36402w != null) {
            codedOutputByteBufferNano.m33532b(18, this.f36402w);
        }
        if ((this.f36381b & 512) != 0) {
            codedOutputByteBufferNano.m33521a(19, this.f36403x);
        }
        if ((this.f36381b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33522a(20, this.f36404y);
        }
        if ((this.f36381b & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33523a(21, this.f36405z);
        }
        if ((this.f36381b & 8) != 0) {
            codedOutputByteBufferNano.m33518a(22, this.f36386g);
        }
        if (this.f36380A != null && this.f36380A.length > 0) {
            while (i < this.f36380A.length) {
                String str = this.f36380A[i];
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(23, str);
                }
                i++;
            }
        }
        if (this.f36393n != null) {
            codedOutputByteBufferNano.m33532b(25, this.f36393n);
        }
        if (this.f36394o != null) {
            codedOutputByteBufferNano.m33532b(26, this.f36394o);
        }
        if (this.f36392m != null) {
            codedOutputByteBufferNano.m33532b(27, this.f36392m);
        }
        if (this.f36395p != null) {
            codedOutputByteBufferNano.m33532b(28, this.f36395p);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34654b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if ((this.f36381b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36382c);
        }
        if (this.f36387h != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f36387h);
        }
        if (this.f36389j != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f36389j);
        }
        if (this.f36388i != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f36388i);
        }
        if ((this.f36381b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f36385f);
        }
        if (this.f36390k != null) {
            b += CodedOutputByteBufferNano.m33503d(7, this.f36390k);
        }
        if ((this.f36381b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f36383d);
        }
        if ((this.f36381b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(10, this.f36396q);
        }
        if (this.f36391l != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f36391l);
        }
        if (this.f36397r != null && this.f36397r.length > 0) {
            i = b;
            for (i iVar : this.f36397r) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(12, iVar);
                }
            }
            b = i;
        }
        if ((this.f36381b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(13, this.f36398s);
        }
        if (this.f36384e != null) {
            b += CodedOutputByteBufferNano.m33503d(14, this.f36384e);
        }
        if ((this.f36381b & 64) != 0) {
            b += CodedOutputByteBufferNano.m33494b(15, this.f36399t);
        }
        if ((this.f36381b & 128) != 0) {
            b += CodedOutputByteBufferNano.m33493b(16, this.f36400u);
        }
        if ((this.f36381b & 256) != 0) {
            b += CodedOutputByteBufferNano.m33494b(17, this.f36401v);
        }
        if (this.f36402w != null) {
            b += CodedOutputByteBufferNano.m33503d(18, this.f36402w);
        }
        if ((this.f36381b & 512) != 0) {
            b += CodedOutputByteBufferNano.m33493b(19, this.f36403x);
        }
        if ((this.f36381b & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33501d(20) + 1;
        }
        if ((this.f36381b & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33494b(21, this.f36405z);
        }
        if ((this.f36381b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(22, this.f36386g);
        }
        if (this.f36380A != null && this.f36380A.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f36380A.length) {
                String str = this.f36380A[i2];
                if (str != null) {
                    i3++;
                    i += CodedOutputByteBufferNano.m33495b(str);
                }
                i2++;
            }
            b = (b + i) + (i3 * 2);
        }
        if (this.f36393n != null) {
            b += CodedOutputByteBufferNano.m33503d(25, this.f36393n);
        }
        if (this.f36394o != null) {
            b += CodedOutputByteBufferNano.m33503d(26, this.f36394o);
        }
        if (this.f36392m != null) {
            b += CodedOutputByteBufferNano.m33503d(27, this.f36392m);
        }
        if (this.f36395p != null) {
            return b + CodedOutputByteBufferNano.m33503d(28, this.f36395p);
        }
        return b;
    }

    private final ao m34650b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36382c = c7213a.m33564f();
                    this.f36381b |= 1;
                    continue;
                case 18:
                    if (this.f36387h == null) {
                        this.f36387h = new C7298a();
                    }
                    c7213a.m33552a(this.f36387h);
                    continue;
                case 26:
                    if (this.f36389j == null) {
                        this.f36389j = new ai();
                    }
                    c7213a.m33552a(this.f36389j);
                    continue;
                case 42:
                    if (this.f36388i == null) {
                        this.f36388i = new C7321c();
                    }
                    c7213a.m33552a(this.f36388i);
                    continue;
                case 48:
                    this.f36381b |= 4;
                    o = c7213a.m33573o();
                    try {
                        this.f36385f = ar.m34664a(c7213a.m33567i());
                        this.f36381b |= 4;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 58:
                    if (this.f36390k == null) {
                        this.f36390k = new C7323e();
                    }
                    c7213a.m33552a(this.f36390k);
                    continue;
                case 66:
                    this.f36383d = c7213a.m33564f();
                    this.f36381b |= 2;
                    continue;
                case 80:
                    this.f36396q = c7213a.m33567i();
                    this.f36381b |= 16;
                    continue;
                case 90:
                    if (this.f36391l == null) {
                        this.f36391l = new az();
                    }
                    c7213a.m33552a(this.f36391l);
                    continue;
                case 98:
                    o = C7222l.m33624a(c7213a, 98);
                    a = this.f36397r == null ? 0 : this.f36397r.length;
                    obj = new ak[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36397r, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ak();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ak();
                    c7213a.m33552a(obj[a]);
                    this.f36397r = obj;
                    continue;
                case 106:
                    this.f36398s = c7213a.m33564f();
                    this.f36381b |= 32;
                    continue;
                case 114:
                    if (this.f36384e == null) {
                        this.f36384e = new bd();
                    }
                    c7213a.m33552a(this.f36384e);
                    continue;
                case 122:
                    this.f36399t = c7213a.m33565g();
                    this.f36381b |= 64;
                    continue;
                case 130:
                    this.f36400u = c7213a.m33564f();
                    this.f36381b |= 128;
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f36401v = c7213a.m33565g();
                    this.f36381b |= 256;
                    continue;
                case 146:
                    if (this.f36402w == null) {
                        this.f36402w = new ap();
                    }
                    c7213a.m33552a(this.f36402w);
                    continue;
                case 154:
                    this.f36403x = c7213a.m33564f();
                    this.f36381b |= 512;
                    continue;
                case 160:
                    this.f36404y = c7213a.m33563e();
                    this.f36381b |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 170:
                    this.f36405z = c7213a.m33565g();
                    this.f36381b |= eq.FLAG_MOVED;
                    continue;
                case 176:
                    this.f36381b |= 8;
                    o = c7213a.m33573o();
                    try {
                        this.f36386g = ar.m34664a(c7213a.m33567i());
                        this.f36381b |= 8;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 186:
                    o = C7222l.m33624a(c7213a, 186);
                    a = this.f36380A == null ? 0 : this.f36380A.length;
                    obj = new String[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36380A, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f36380A = obj;
                    continue;
                case 202:
                    if (this.f36393n == null) {
                        this.f36393n = new an();
                    }
                    c7213a.m33552a(this.f36393n);
                    continue;
                case 210:
                    if (this.f36394o == null) {
                        this.f36394o = new au();
                    }
                    c7213a.m33552a(this.f36394o);
                    continue;
                case 218:
                    if (this.f36392m == null) {
                        this.f36392m = new C7322d();
                    }
                    c7213a.m33552a(this.f36392m);
                    continue;
                case 226:
                    if (this.f36395p == null) {
                        this.f36395p = new bf();
                    }
                    c7213a.m33552a(this.f36395p);
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

    public final /* synthetic */ i m34652a(C7213a c7213a) {
        return m34650b(c7213a);
    }
}
