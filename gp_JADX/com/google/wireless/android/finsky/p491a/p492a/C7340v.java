package com.google.wireless.android.finsky.p491a.p492a;

import android.support.v7.widget.eq;
import com.google.android.finsky.cv.a.ac;
import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C7340v extends b {
    public int f36606a;
    public String f36607b;
    public String f36608c;
    public String f36609d;
    public C7341w f36610e;
    public String f36611f;
    public bd f36612g;
    public ac f36613h;
    public String f36614i;
    public String f36615j;
    public bd f36616k;
    public String f36617l;
    public String[] f36618m;
    public ac[] f36619n;
    public String f36620o;
    public bd f36621p;
    public String f36622q;
    public String f36623r;
    public String f36624s;
    public String f36625t;
    public am f36626u;
    public String f36627v;
    public String f36628w;
    public String f36629x;

    public C7340v() {
        this.f36606a = 0;
        this.f36607b = "";
        this.f36608c = "";
        this.f36609d = "";
        this.f36610e = null;
        this.f36611f = "";
        this.f36612g = null;
        this.f36613h = null;
        this.f36614i = "";
        this.f36615j = "";
        this.f36616k = null;
        this.f36617l = "";
        this.f36618m = C7222l.f35477j;
        this.f36619n = ac.aA_();
        this.f36620o = "";
        this.f36621p = null;
        this.f36622q = "";
        this.f36623r = "";
        this.f36624s = "";
        this.f36625t = "";
        this.f36626u = null;
        this.f36627v = "";
        this.f36628w = "";
        this.f36629x = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34780a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f36606a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36607b);
        }
        if ((this.f36606a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36608c);
        }
        if (this.f36610e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36610e);
        }
        if ((this.f36606a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f36611f);
        }
        if (this.f36612g != null) {
            codedOutputByteBufferNano.m33532b(5, this.f36612g);
        }
        if (this.f36613h != null) {
            codedOutputByteBufferNano.m33532b(6, this.f36613h);
        }
        if ((this.f36606a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f36614i);
        }
        if ((this.f36606a & 32) != 0) {
            codedOutputByteBufferNano.m33521a(8, this.f36615j);
        }
        if (this.f36616k != null) {
            codedOutputByteBufferNano.m33532b(9, this.f36616k);
        }
        if ((this.f36606a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(10, this.f36617l);
        }
        if (this.f36618m != null && this.f36618m.length > 0) {
            for (String str : this.f36618m) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(11, str);
                }
            }
        }
        if (this.f36619n != null && this.f36619n.length > 0) {
            while (i < this.f36619n.length) {
                i iVar = this.f36619n[i];
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(12, iVar);
                }
                i++;
            }
        }
        if ((this.f36606a & 128) != 0) {
            codedOutputByteBufferNano.m33521a(13, this.f36620o);
        }
        if (this.f36621p != null) {
            codedOutputByteBufferNano.m33532b(14, this.f36621p);
        }
        if ((this.f36606a & 256) != 0) {
            codedOutputByteBufferNano.m33521a(15, this.f36622q);
        }
        if ((this.f36606a & 512) != 0) {
            codedOutputByteBufferNano.m33521a(16, this.f36623r);
        }
        if ((this.f36606a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33521a(17, this.f36624s);
        }
        if ((this.f36606a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33521a(18, this.f36625t);
        }
        if ((this.f36606a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(19, this.f36609d);
        }
        if (this.f36626u != null) {
            codedOutputByteBufferNano.m33532b(20, this.f36626u);
        }
        if ((this.f36606a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33521a(21, this.f36627v);
        }
        if ((this.f36606a & 8192) != 0) {
            codedOutputByteBufferNano.m33521a(22, this.f36628w);
        }
        if ((this.f36606a & 16384) != 0) {
            codedOutputByteBufferNano.m33521a(23, this.f36629x);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34781b() {
        int i = 0;
        int b = super.b();
        if ((this.f36606a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36607b);
        }
        if ((this.f36606a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36608c);
        }
        if (this.f36610e != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f36610e);
        }
        if ((this.f36606a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f36611f);
        }
        if (this.f36612g != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f36612g);
        }
        if (this.f36613h != null) {
            b += CodedOutputByteBufferNano.m33503d(6, this.f36613h);
        }
        if ((this.f36606a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(7, this.f36614i);
        }
        if ((this.f36606a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33493b(8, this.f36615j);
        }
        if (this.f36616k != null) {
            b += CodedOutputByteBufferNano.m33503d(9, this.f36616k);
        }
        if ((this.f36606a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(10, this.f36617l);
        }
        if (this.f36618m != null && this.f36618m.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f36618m) {
                if (str != null) {
                    i3++;
                    i2 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f36619n != null && this.f36619n.length > 0) {
            while (i < this.f36619n.length) {
                i iVar = this.f36619n[i];
                if (iVar != null) {
                    b += CodedOutputByteBufferNano.m33503d(12, iVar);
                }
                i++;
            }
        }
        if ((this.f36606a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33493b(13, this.f36620o);
        }
        if (this.f36621p != null) {
            b += CodedOutputByteBufferNano.m33503d(14, this.f36621p);
        }
        if ((this.f36606a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33493b(15, this.f36622q);
        }
        if ((this.f36606a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33493b(16, this.f36623r);
        }
        if ((this.f36606a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33493b(17, this.f36624s);
        }
        if ((this.f36606a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33493b(18, this.f36625t);
        }
        if ((this.f36606a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(19, this.f36609d);
        }
        if (this.f36626u != null) {
            b += CodedOutputByteBufferNano.m33503d(20, this.f36626u);
        }
        if ((this.f36606a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33493b(21, this.f36627v);
        }
        if ((this.f36606a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33493b(22, this.f36628w);
        }
        if ((this.f36606a & 16384) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(23, this.f36629x);
        }
        return b;
    }

    public final /* synthetic */ i m34779a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36607b = c7213a.m33564f();
                    this.f36606a |= 1;
                    continue;
                case 18:
                    this.f36608c = c7213a.m33564f();
                    this.f36606a |= 2;
                    continue;
                case 26:
                    if (this.f36610e == null) {
                        this.f36610e = new C7341w();
                    }
                    c7213a.m33552a(this.f36610e);
                    continue;
                case 34:
                    this.f36611f = c7213a.m33564f();
                    this.f36606a |= 8;
                    continue;
                case 42:
                    if (this.f36612g == null) {
                        this.f36612g = new bd();
                    }
                    c7213a.m33552a(this.f36612g);
                    continue;
                case 50:
                    if (this.f36613h == null) {
                        this.f36613h = new ac();
                    }
                    c7213a.m33552a(this.f36613h);
                    continue;
                case 58:
                    this.f36614i = c7213a.m33564f();
                    this.f36606a |= 16;
                    continue;
                case 66:
                    this.f36615j = c7213a.m33564f();
                    this.f36606a |= 32;
                    continue;
                case 74:
                    if (this.f36616k == null) {
                        this.f36616k = new bd();
                    }
                    c7213a.m33552a(this.f36616k);
                    continue;
                case 82:
                    this.f36617l = c7213a.m33564f();
                    this.f36606a |= 64;
                    continue;
                case 90:
                    a2 = C7222l.m33624a(c7213a, 90);
                    a = this.f36618m == null ? 0 : this.f36618m.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36618m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f36618m = obj;
                    continue;
                case 98:
                    a2 = C7222l.m33624a(c7213a, 98);
                    a = this.f36619n == null ? 0 : this.f36619n.length;
                    obj = new ac[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f36619n, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ac();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ac();
                    c7213a.m33552a(obj[a]);
                    this.f36619n = obj;
                    continue;
                case 106:
                    this.f36620o = c7213a.m33564f();
                    this.f36606a |= 128;
                    continue;
                case 114:
                    if (this.f36621p == null) {
                        this.f36621p = new bd();
                    }
                    c7213a.m33552a(this.f36621p);
                    continue;
                case 122:
                    this.f36622q = c7213a.m33564f();
                    this.f36606a |= 256;
                    continue;
                case 130:
                    this.f36623r = c7213a.m33564f();
                    this.f36606a |= 512;
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f36624s = c7213a.m33564f();
                    this.f36606a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 146:
                    this.f36625t = c7213a.m33564f();
                    this.f36606a |= eq.FLAG_MOVED;
                    continue;
                case 154:
                    this.f36609d = c7213a.m33564f();
                    this.f36606a |= 4;
                    continue;
                case 162:
                    if (this.f36626u == null) {
                        this.f36626u = new am();
                    }
                    c7213a.m33552a(this.f36626u);
                    continue;
                case 170:
                    this.f36627v = c7213a.m33564f();
                    this.f36606a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 178:
                    this.f36628w = c7213a.m33564f();
                    this.f36606a |= 8192;
                    continue;
                case 186:
                    this.f36629x = c7213a.m33564f();
                    this.f36606a |= 16384;
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
