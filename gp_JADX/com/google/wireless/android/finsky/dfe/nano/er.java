package com.google.wireless.android.finsky.dfe.nano;

import android.support.v7.widget.eq;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.C7331m;
import com.google.wireless.android.finsky.p491a.p492a.ao;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class er extends b {
    public String f38806A;
    public String f38807B;
    public boolean f38808C;
    public int f38809a;
    public String f38810b;
    public String f38811c;
    public String f38812d;
    public String f38813e;
    public al f38814f;
    public String f38815g;
    public al f38816h;
    public String f38817i;
    public String f38818j;
    public String f38819k;
    public ao f38820l;
    public String[] f38821m;
    public eo[] f38822n;
    public String[] f38823o;
    public String f38824p;
    public String f38825q;
    public String f38826r;
    public C7331m f38827s;
    public cv[] f38828t;
    public int[] f38829u;
    public ep[] f38830v;
    public bd f38831w;
    public fd f38832x;
    public String f38833y;
    public String f38834z;

    public er() {
        this.f38809a = 0;
        this.f38810b = "";
        this.f38811c = "";
        this.f38812d = "";
        this.f38813e = "";
        this.f38814f = null;
        this.f38815g = "";
        this.f38816h = null;
        this.f38817i = "";
        this.f38818j = "";
        this.f38819k = "";
        this.f38820l = null;
        this.f38821m = C7222l.f35477j;
        this.f38822n = eo.m36346d();
        this.f38823o = C7222l.f35477j;
        this.f38824p = "";
        this.f38825q = "";
        this.f38826r = "";
        this.f38827s = null;
        this.f38828t = cv.aS_();
        this.f38829u = C7222l.f35472e;
        this.f38830v = ep.m36350d();
        this.f38831w = null;
        this.f38832x = null;
        this.f38833y = "";
        this.f38834z = "";
        this.f38806A = "";
        this.f38807B = "";
        this.f38808C = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36358a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f38809a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38810b);
        }
        if ((this.f38809a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38813e);
        }
        if ((this.f38809a & 128) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38819k);
        }
        if (this.f38820l != null) {
            codedOutputByteBufferNano.m33532b(4, this.f38820l);
        }
        if (this.f38823o != null && this.f38823o.length > 0) {
            for (String str : this.f38823o) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(5, str);
                }
            }
        }
        if ((this.f38809a & 256) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38824p);
        }
        if ((this.f38809a & 512) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f38825q);
        }
        if ((this.f38809a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f38826r);
        }
        if (this.f38827s != null) {
            codedOutputByteBufferNano.m33532b(9, this.f38827s);
        }
        if ((this.f38809a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f38817i);
        }
        if (this.f38821m != null && this.f38821m.length > 0) {
            for (String str2 : this.f38821m) {
                if (str2 != null) {
                    codedOutputByteBufferNano.m33521a(11, str2);
                }
            }
        }
        if (this.f38828t != null && this.f38828t.length > 0) {
            for (i iVar : this.f38828t) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(12, iVar);
                }
            }
        }
        if (this.f38829u != null && this.f38829u.length > 0) {
            for (int a : this.f38829u) {
                codedOutputByteBufferNano.m33518a(13, a);
            }
        }
        if (this.f38830v != null && this.f38830v.length > 0) {
            for (i iVar2 : this.f38830v) {
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(14, iVar2);
                }
            }
        }
        if ((this.f38809a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(15, this.f38815g);
        }
        if ((this.f38809a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(16, this.f38818j);
        }
        if (this.f38831w != null) {
            codedOutputByteBufferNano.m33532b(17, this.f38831w);
        }
        if (this.f38832x != null) {
            codedOutputByteBufferNano.m33532b(18, this.f38832x);
        }
        if ((this.f38809a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(19, this.f38811c);
        }
        if (this.f38816h != null) {
            codedOutputByteBufferNano.m33532b(20, this.f38816h);
        }
        if ((this.f38809a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33521a(21, this.f38833y);
        }
        if ((this.f38809a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33521a(22, this.f38834z);
        }
        if ((this.f38809a & 8192) != 0) {
            codedOutputByteBufferNano.m33521a(23, this.f38806A);
        }
        if ((this.f38809a & 16384) != 0) {
            codedOutputByteBufferNano.m33521a(24, this.f38807B);
        }
        if ((this.f38809a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(25, this.f38812d);
        }
        if ((this.f38809a & 32768) != 0) {
            codedOutputByteBufferNano.m33522a(26, this.f38808C);
        }
        if (this.f38814f != null) {
            codedOutputByteBufferNano.m33532b(27, this.f38814f);
        }
        if (this.f38822n != null && this.f38822n.length > 0) {
            while (i < this.f38822n.length) {
                i iVar3 = this.f38822n[i];
                if (iVar3 != null) {
                    codedOutputByteBufferNano.m33532b(28, iVar3);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36359b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.b();
        if ((this.f38809a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38810b);
        }
        if ((this.f38809a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38813e);
        }
        if ((this.f38809a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38819k);
        }
        if (this.f38820l != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f38820l);
        }
        if (this.f38823o != null && this.f38823o.length > 0) {
            i = 0;
            i2 = 0;
            for (String str : this.f38823o) {
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if ((this.f38809a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f38824p);
        }
        if ((this.f38809a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f38825q);
        }
        if ((this.f38809a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f38826r);
        }
        if (this.f38827s != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f38827s);
        }
        if ((this.f38809a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f38817i);
        }
        if (this.f38821m != null && this.f38821m.length > 0) {
            i = 0;
            i2 = 0;
            for (String str2 : this.f38821m) {
                if (str2 != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.m33495b(str2);
                }
            }
            b = (b + i) + (i2 * 1);
        }
        if (this.f38828t != null && this.f38828t.length > 0) {
            i3 = b;
            for (i iVar : this.f38828t) {
                if (iVar != null) {
                    i3 += CodedOutputByteBufferNano.m33503d(12, iVar);
                }
            }
            b = i3;
        }
        if (this.f38829u != null && this.f38829u.length > 0) {
            i = 0;
            for (int i22 : this.f38829u) {
                i += CodedOutputByteBufferNano.m33498c(i22);
            }
            b = (b + i) + (this.f38829u.length * 1);
        }
        if (this.f38830v != null && this.f38830v.length > 0) {
            i3 = b;
            for (i iVar2 : this.f38830v) {
                if (iVar2 != null) {
                    i3 += CodedOutputByteBufferNano.m33503d(14, iVar2);
                }
            }
            b = i3;
        }
        if ((this.f38809a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(15, this.f38815g);
        }
        if ((this.f38809a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(16, this.f38818j);
        }
        if (this.f38831w != null) {
            b += CodedOutputByteBufferNano.m33503d(17, this.f38831w);
        }
        if (this.f38832x != null) {
            b += CodedOutputByteBufferNano.m33503d(18, this.f38832x);
        }
        if ((this.f38809a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(19, this.f38811c);
        }
        if (this.f38816h != null) {
            b += CodedOutputByteBufferNano.m33503d(20, this.f38816h);
        }
        if ((this.f38809a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33493b(21, this.f38833y);
        }
        if ((this.f38809a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33493b(22, this.f38834z);
        }
        if ((this.f38809a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33493b(23, this.f38806A);
        }
        if ((this.f38809a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33493b(24, this.f38807B);
        }
        if ((this.f38809a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(25, this.f38812d);
        }
        if ((this.f38809a & 32768) != 0) {
            b += CodedOutputByteBufferNano.m33501d(26) + 1;
        }
        if (this.f38814f != null) {
            b += CodedOutputByteBufferNano.m33503d(27, this.f38814f);
        }
        if (this.f38822n != null && this.f38822n.length > 0) {
            while (i4 < this.f38822n.length) {
                i iVar3 = this.f38822n[i4];
                if (iVar3 != null) {
                    b += CodedOutputByteBufferNano.m33503d(28, iVar3);
                }
                i4++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m36357a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38810b = c7213a.m33564f();
                    this.f38809a |= 1;
                    continue;
                case 18:
                    this.f38813e = c7213a.m33564f();
                    this.f38809a |= 8;
                    continue;
                case 26:
                    this.f38819k = c7213a.m33564f();
                    this.f38809a |= 128;
                    continue;
                case 34:
                    if (this.f38820l == null) {
                        this.f38820l = new ao();
                    }
                    c7213a.m33552a(this.f38820l);
                    continue;
                case 42:
                    a2 = C7222l.m33624a(c7213a, 42);
                    a = this.f38823o == null ? 0 : this.f38823o.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38823o, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38823o = obj;
                    continue;
                case 50:
                    this.f38824p = c7213a.m33564f();
                    this.f38809a |= 256;
                    continue;
                case 58:
                    this.f38825q = c7213a.m33564f();
                    this.f38809a |= 512;
                    continue;
                case 66:
                    this.f38826r = c7213a.m33564f();
                    this.f38809a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 74:
                    if (this.f38827s == null) {
                        this.f38827s = new C7331m();
                    }
                    c7213a.m33552a(this.f38827s);
                    continue;
                case 82:
                    this.f38817i = c7213a.m33564f();
                    this.f38809a |= 32;
                    continue;
                case 90:
                    a2 = C7222l.m33624a(c7213a, 90);
                    a = this.f38821m == null ? 0 : this.f38821m.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38821m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f38821m = obj;
                    continue;
                case 98:
                    a2 = C7222l.m33624a(c7213a, 98);
                    a = this.f38828t == null ? 0 : this.f38828t.length;
                    obj = new cv[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38828t, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new cv();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new cv();
                    c7213a.m33552a(obj[a]);
                    this.f38828t = obj;
                    continue;
                case 104:
                    a2 = C7222l.m33624a(c7213a, 104);
                    if (this.f38829u == null) {
                        a = 0;
                    } else {
                        a = this.f38829u.length;
                    }
                    obj = new int[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38829u, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33567i();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33567i();
                    this.f38829u = obj;
                    continue;
                case 106:
                    int c = c7213a.m33558c(c7213a.m33567i());
                    a2 = c7213a.m33573o();
                    a = 0;
                    while (c7213a.m33571m() > 0) {
                        c7213a.m33567i();
                        a++;
                    }
                    c7213a.m33562e(a2);
                    a2 = this.f38829u == null ? 0 : this.f38829u.length;
                    Object obj2 = new int[(a + a2)];
                    if (a2 != 0) {
                        System.arraycopy(this.f38829u, 0, obj2, 0, a2);
                    }
                    while (a2 < obj2.length) {
                        obj2[a2] = c7213a.m33567i();
                        a2++;
                    }
                    this.f38829u = obj2;
                    c7213a.m33561d(c);
                    continue;
                case 114:
                    a2 = C7222l.m33624a(c7213a, 114);
                    a = this.f38830v == null ? 0 : this.f38830v.length;
                    obj = new ep[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38830v, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ep();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ep();
                    c7213a.m33552a(obj[a]);
                    this.f38830v = obj;
                    continue;
                case 122:
                    this.f38815g = c7213a.m33564f();
                    this.f38809a |= 16;
                    continue;
                case 130:
                    this.f38818j = c7213a.m33564f();
                    this.f38809a |= 64;
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    if (this.f38831w == null) {
                        this.f38831w = new bd();
                    }
                    c7213a.m33552a(this.f38831w);
                    continue;
                case 146:
                    if (this.f38832x == null) {
                        this.f38832x = new fd();
                    }
                    c7213a.m33552a(this.f38832x);
                    continue;
                case 154:
                    this.f38811c = c7213a.m33564f();
                    this.f38809a |= 2;
                    continue;
                case 162:
                    if (this.f38816h == null) {
                        this.f38816h = new al();
                    }
                    c7213a.m33552a(this.f38816h);
                    continue;
                case 170:
                    this.f38833y = c7213a.m33564f();
                    this.f38809a |= eq.FLAG_MOVED;
                    continue;
                case 178:
                    this.f38834z = c7213a.m33564f();
                    this.f38809a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 186:
                    this.f38806A = c7213a.m33564f();
                    this.f38809a |= 8192;
                    continue;
                case 194:
                    this.f38807B = c7213a.m33564f();
                    this.f38809a |= 16384;
                    continue;
                case 202:
                    this.f38812d = c7213a.m33564f();
                    this.f38809a |= 4;
                    continue;
                case 208:
                    this.f38808C = c7213a.m33563e();
                    this.f38809a |= 32768;
                    continue;
                case 218:
                    if (this.f38814f == null) {
                        this.f38814f = new al();
                    }
                    c7213a.m33552a(this.f38814f);
                    continue;
                case 226:
                    a2 = C7222l.m33624a(c7213a, 226);
                    a = this.f38822n == null ? 0 : this.f38822n.length;
                    obj = new eo[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f38822n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new eo();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new eo();
                    c7213a.m33552a(obj[a]);
                    this.f38822n = obj;
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
