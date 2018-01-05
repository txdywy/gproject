package com.google.wireless.android.finsky.dfe.p515h.p516a;

import android.support.v7.widget.eq;
import com.google.android.finsky.cv.a.ac;
import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.am;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C7476a extends b {
    public int f37968a;
    public String f37969b;
    public String f37970c;
    public bd f37971d;
    public String f37972e;
    public String f37973f;
    public String f37974g;
    public String[] f37975h;
    public ac[] f37976i;
    public C7477b[] f37977j;
    public boolean f37978k;
    public String f37979l;
    public bd f37980m;
    public String f37981n;
    public String f37982o;
    public String f37983p;
    public String f37984q;
    public String f37985r;
    public am f37986s;
    public String f37987t;
    public String f37988u;
    public String f37989v;
    public String f37990w;

    public C7476a() {
        this.f37968a = 0;
        this.f37969b = "";
        this.f37970c = "";
        this.f37971d = null;
        this.f37972e = "";
        this.f37973f = "";
        this.f37974g = "";
        this.f37975h = C7222l.f35477j;
        this.f37976i = ac.aA_();
        this.f37977j = C7477b.m35778d();
        this.f37978k = false;
        this.f37979l = "";
        this.f37980m = null;
        this.f37981n = "";
        this.f37982o = "";
        this.f37983p = "";
        this.f37984q = "";
        this.f37985r = "";
        this.f37986s = null;
        this.f37987t = "";
        this.f37988u = "";
        this.f37989v = "";
        this.f37990w = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35717a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f37968a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37969b);
        }
        if ((this.f37968a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37970c);
        }
        if (this.f37971d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37971d);
        }
        if ((this.f37968a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37972e);
        }
        if ((this.f37968a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f37973f);
        }
        if ((this.f37968a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f37974g);
        }
        if (this.f37975h != null && this.f37975h.length > 0) {
            for (String str : this.f37975h) {
                if (str != null) {
                    codedOutputByteBufferNano.m33521a(7, str);
                }
            }
        }
        if (this.f37976i != null && this.f37976i.length > 0) {
            for (i iVar : this.f37976i) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(8, iVar);
                }
            }
        }
        if (this.f37977j != null && this.f37977j.length > 0) {
            while (i < this.f37977j.length) {
                i iVar2 = this.f37977j[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(9, iVar2);
                }
                i++;
            }
        }
        if ((this.f37968a & 32) != 0) {
            codedOutputByteBufferNano.m33522a(10, this.f37978k);
        }
        if ((this.f37968a & 64) != 0) {
            codedOutputByteBufferNano.m33521a(11, this.f37979l);
        }
        if (this.f37980m != null) {
            codedOutputByteBufferNano.m33532b(12, this.f37980m);
        }
        if ((this.f37968a & 128) != 0) {
            codedOutputByteBufferNano.m33521a(13, this.f37981n);
        }
        if ((this.f37968a & 256) != 0) {
            codedOutputByteBufferNano.m33521a(14, this.f37982o);
        }
        if ((this.f37968a & 512) != 0) {
            codedOutputByteBufferNano.m33521a(15, this.f37983p);
        }
        if ((this.f37968a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33521a(16, this.f37984q);
        }
        if ((this.f37968a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33521a(17, this.f37985r);
        }
        if (this.f37986s != null) {
            codedOutputByteBufferNano.m33532b(18, this.f37986s);
        }
        if ((this.f37968a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33521a(19, this.f37987t);
        }
        if ((this.f37968a & 8192) != 0) {
            codedOutputByteBufferNano.m33521a(20, this.f37988u);
        }
        if ((this.f37968a & 16384) != 0) {
            codedOutputByteBufferNano.m33521a(21, this.f37989v);
        }
        if ((this.f37968a & 32768) != 0) {
            codedOutputByteBufferNano.m33521a(22, this.f37990w);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35718b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if ((this.f37968a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37969b);
        }
        if ((this.f37968a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37970c);
        }
        if (this.f37971d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37971d);
        }
        if ((this.f37968a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37972e);
        }
        if ((this.f37968a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f37973f);
        }
        if ((this.f37968a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f37974g);
        }
        if (this.f37975h != null && this.f37975h.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f37975h) {
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.m33495b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f37976i != null && this.f37976i.length > 0) {
            i = b;
            for (i iVar : this.f37976i) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(8, iVar);
                }
            }
            b = i;
        }
        if (this.f37977j != null && this.f37977j.length > 0) {
            while (i2 < this.f37977j.length) {
                i iVar2 = this.f37977j[i2];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(9, iVar2);
                }
                i2++;
            }
        }
        if ((this.f37968a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(10) + 1;
        }
        if ((this.f37968a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33493b(11, this.f37979l);
        }
        if (this.f37980m != null) {
            b += CodedOutputByteBufferNano.m33503d(12, this.f37980m);
        }
        if ((this.f37968a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33493b(13, this.f37981n);
        }
        if ((this.f37968a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33493b(14, this.f37982o);
        }
        if ((this.f37968a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33493b(15, this.f37983p);
        }
        if ((this.f37968a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33493b(16, this.f37984q);
        }
        if ((this.f37968a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33493b(17, this.f37985r);
        }
        if (this.f37986s != null) {
            b += CodedOutputByteBufferNano.m33503d(18, this.f37986s);
        }
        if ((this.f37968a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33493b(19, this.f37987t);
        }
        if ((this.f37968a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33493b(20, this.f37988u);
        }
        if ((this.f37968a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33493b(21, this.f37989v);
        }
        if ((this.f37968a & 32768) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(22, this.f37990w);
        }
        return b;
    }

    public final /* synthetic */ i m35716a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37969b = c7213a.m33564f();
                    this.f37968a |= 1;
                    continue;
                case 18:
                    this.f37970c = c7213a.m33564f();
                    this.f37968a |= 2;
                    continue;
                case 26:
                    if (this.f37971d == null) {
                        this.f37971d = new bd();
                    }
                    c7213a.m33552a(this.f37971d);
                    continue;
                case 34:
                    this.f37972e = c7213a.m33564f();
                    this.f37968a |= 4;
                    continue;
                case 42:
                    this.f37973f = c7213a.m33564f();
                    this.f37968a |= 8;
                    continue;
                case 50:
                    this.f37974g = c7213a.m33564f();
                    this.f37968a |= 16;
                    continue;
                case 58:
                    a2 = C7222l.m33624a(c7213a, 58);
                    a = this.f37975h == null ? 0 : this.f37975h.length;
                    obj = new String[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37975h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = c7213a.m33564f();
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = c7213a.m33564f();
                    this.f37975h = obj;
                    continue;
                case 66:
                    a2 = C7222l.m33624a(c7213a, 66);
                    a = this.f37976i == null ? 0 : this.f37976i.length;
                    obj = new ac[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37976i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ac();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new ac();
                    c7213a.m33552a(obj[a]);
                    this.f37976i = obj;
                    continue;
                case 74:
                    a2 = C7222l.m33624a(c7213a, 74);
                    a = this.f37977j == null ? 0 : this.f37977j.length;
                    obj = new C7477b[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37977j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7477b();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7477b();
                    c7213a.m33552a(obj[a]);
                    this.f37977j = obj;
                    continue;
                case 80:
                    this.f37978k = c7213a.m33563e();
                    this.f37968a |= 32;
                    continue;
                case 90:
                    this.f37979l = c7213a.m33564f();
                    this.f37968a |= 64;
                    continue;
                case 98:
                    if (this.f37980m == null) {
                        this.f37980m = new bd();
                    }
                    c7213a.m33552a(this.f37980m);
                    continue;
                case 106:
                    this.f37981n = c7213a.m33564f();
                    this.f37968a |= 128;
                    continue;
                case 114:
                    this.f37982o = c7213a.m33564f();
                    this.f37968a |= 256;
                    continue;
                case 122:
                    this.f37983p = c7213a.m33564f();
                    this.f37968a |= 512;
                    continue;
                case 130:
                    this.f37984q = c7213a.m33564f();
                    this.f37968a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    this.f37985r = c7213a.m33564f();
                    this.f37968a |= eq.FLAG_MOVED;
                    continue;
                case 146:
                    if (this.f37986s == null) {
                        this.f37986s = new am();
                    }
                    c7213a.m33552a(this.f37986s);
                    continue;
                case 154:
                    this.f37987t = c7213a.m33564f();
                    this.f37968a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 162:
                    this.f37988u = c7213a.m33564f();
                    this.f37968a |= 8192;
                    continue;
                case 170:
                    this.f37989v = c7213a.m33564f();
                    this.f37968a |= 16384;
                    continue;
                case 178:
                    this.f37990w = c7213a.m33564f();
                    this.f37968a |= 32768;
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
