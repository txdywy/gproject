package com.google.wireless.android.finsky.dfe.p505c.p506a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.C7320b;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C7422l extends b {
    public int f37596a;
    public C7423m[] f37597b;
    public boolean f37598c;
    public boolean f37599d;
    public boolean f37600e;
    public int f37601f;
    public int f37602g;
    public int f37603h;
    public long f37604i;
    public boolean f37605j;
    public boolean f37606k;
    public boolean f37607l;
    public String f37608m;
    public boolean f37609n;
    public boolean f37610o;
    public String f37611p;
    public boolean f37612q;
    public long f37613r;
    public boolean f37614s;

    public C7422l() {
        this.f37596a = 0;
        this.f37597b = C7423m.m35481d();
        this.f37598c = false;
        this.f37599d = false;
        this.f37600e = false;
        this.f37601f = 0;
        this.f37602g = 0;
        this.f37603h = 0;
        this.f37604i = 0;
        this.f37605j = false;
        this.f37606k = false;
        this.f37607l = false;
        this.f37608m = "";
        this.f37609n = false;
        this.f37610o = false;
        this.f37611p = "";
        this.f37612q = false;
        this.f37613r = 0;
        this.f37614s = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35479a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37596a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f37598c);
        }
        if ((this.f37596a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f37599d);
        }
        if ((this.f37596a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f37600e);
        }
        if ((this.f37596a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f37601f);
        }
        if ((this.f37596a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f37602g);
        }
        if ((this.f37596a & 32) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f37603h);
        }
        if ((this.f37596a & 64) != 0) {
            codedOutputByteBufferNano.m33531b(8, this.f37604i);
        }
        if ((this.f37596a & 128) != 0) {
            codedOutputByteBufferNano.m33522a(9, this.f37605j);
        }
        if ((this.f37596a & 256) != 0) {
            codedOutputByteBufferNano.m33522a(10, this.f37606k);
        }
        if ((this.f37596a & 512) != 0) {
            codedOutputByteBufferNano.m33522a(11, this.f37607l);
        }
        if ((this.f37596a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33521a(12, this.f37608m);
        }
        if ((this.f37596a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33522a(15, this.f37609n);
        }
        if ((this.f37596a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33522a(16, this.f37610o);
        }
        if (this.f37597b != null && this.f37597b.length > 0) {
            for (i iVar : this.f37597b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(18, iVar);
                }
            }
        }
        if ((this.f37596a & 8192) != 0) {
            codedOutputByteBufferNano.m33521a(19, this.f37611p);
        }
        if ((this.f37596a & 16384) != 0) {
            codedOutputByteBufferNano.m33522a(20, this.f37612q);
        }
        if ((this.f37596a & 32768) != 0) {
            codedOutputByteBufferNano.m33531b(21, this.f37613r);
        }
        if ((this.f37596a & 65536) != 0) {
            codedOutputByteBufferNano.m33522a(22, this.f37614s);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35480b() {
        int b = super.b();
        if ((this.f37596a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f37596a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f37596a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f37596a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f37601f);
        }
        if ((this.f37596a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f37602g);
        }
        if ((this.f37596a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f37603h);
        }
        if ((this.f37596a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33508f(8, this.f37604i);
        }
        if ((this.f37596a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33501d(9) + 1;
        }
        if ((this.f37596a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33501d(10) + 1;
        }
        if ((this.f37596a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33501d(11) + 1;
        }
        if ((this.f37596a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33493b(12, this.f37608m);
        }
        if ((this.f37596a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33501d(15) + 1;
        }
        if ((this.f37596a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33501d(16) + 1;
        }
        if (this.f37597b != null && this.f37597b.length > 0) {
            int i = b;
            for (i iVar : this.f37597b) {
                if (iVar != null) {
                    i += CodedOutputByteBufferNano.m33503d(18, iVar);
                }
            }
            b = i;
        }
        if ((this.f37596a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33493b(19, this.f37611p);
        }
        if ((this.f37596a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33501d(20) + 1;
        }
        if ((this.f37596a & 32768) != 0) {
            b += CodedOutputByteBufferNano.m33508f(21, this.f37613r);
        }
        if ((this.f37596a & 65536) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(22) + 1);
        }
        return b;
    }

    private final C7422l m35477b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37598c = c7213a.m33563e();
                    this.f37596a |= 1;
                    continue;
                case 16:
                    this.f37599d = c7213a.m33563e();
                    this.f37596a |= 2;
                    continue;
                case 24:
                    this.f37600e = c7213a.m33563e();
                    this.f37596a |= 4;
                    continue;
                case 32:
                    this.f37596a |= 8;
                    o = c7213a.m33573o();
                    try {
                        this.f37601f = C7320b.m34689a(c7213a.m33567i());
                        this.f37596a |= 8;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 40:
                    this.f37596a |= 16;
                    o = c7213a.m33573o();
                    try {
                        this.f37602g = C7320b.m34689a(c7213a.m33567i());
                        this.f37596a |= 16;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 48:
                    this.f37596a |= 32;
                    o = c7213a.m33573o();
                    try {
                        this.f37603h = am.m35110a(c7213a.m33567i());
                        this.f37596a |= 32;
                        continue;
                    } catch (IllegalArgumentException e3) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 64:
                    this.f37604i = c7213a.m33568j();
                    this.f37596a |= 64;
                    continue;
                case 72:
                    this.f37605j = c7213a.m33563e();
                    this.f37596a |= 128;
                    continue;
                case 80:
                    this.f37606k = c7213a.m33563e();
                    this.f37596a |= 256;
                    continue;
                case 88:
                    this.f37607l = c7213a.m33563e();
                    this.f37596a |= 512;
                    continue;
                case 98:
                    this.f37608m = c7213a.m33564f();
                    this.f37596a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 120:
                    this.f37609n = c7213a.m33563e();
                    this.f37596a |= eq.FLAG_MOVED;
                    continue;
                case 128:
                    this.f37610o = c7213a.m33563e();
                    this.f37596a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 146:
                    o = C7222l.m33624a(c7213a, 146);
                    a = this.f37597b == null ? 0 : this.f37597b.length;
                    Object obj = new C7423m[(o + a)];
                    if (a != 0) {
                        System.arraycopy(this.f37597b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new C7423m();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new C7423m();
                    c7213a.m33552a(obj[a]);
                    this.f37597b = obj;
                    continue;
                case 154:
                    this.f37611p = c7213a.m33564f();
                    this.f37596a |= 8192;
                    continue;
                case 160:
                    this.f37612q = c7213a.m33563e();
                    this.f37596a |= 16384;
                    continue;
                case 168:
                    this.f37613r = c7213a.m33568j();
                    this.f37596a |= 32768;
                    continue;
                case 176:
                    this.f37614s = c7213a.m33563e();
                    this.f37596a |= 65536;
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

    public final /* synthetic */ i m35478a(C7213a c7213a) {
        return m35477b(c7213a);
    }
}
