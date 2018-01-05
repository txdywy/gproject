package com.google.wireless.android.p356a.p357a.p358a.p359a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class bg extends b {
    public int f35777a;
    public bi[] f35778b;
    public bh[] f35779c;
    public int f35780d;
    public int f35781e;
    public boolean f35782f;
    public boolean f35783g;
    public boolean f35784h;
    public boolean f35785i;
    public boolean f35786j;
    public int f35787k;
    public String f35788l;
    public int f35789m;
    public long f35790n;
    public int f35791o;
    public int f35792p;
    public long f35793q;
    public long f35794r;

    public static int m34178a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum WakeUpCause");
        }
    }

    public bg() {
        this.f35777a = 0;
        this.f35778b = bi.m34188d();
        this.f35779c = bh.m34183d();
        this.f35780d = 0;
        this.f35781e = 0;
        this.f35782f = false;
        this.f35783g = false;
        this.f35784h = false;
        this.f35785i = false;
        this.f35786j = false;
        this.f35787k = 0;
        this.f35788l = "";
        this.f35789m = 0;
        this.f35790n = 0;
        this.f35791o = 0;
        this.f35792p = 0;
        this.f35793q = 0;
        this.f35794r = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34180a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        int i = 0;
        if ((this.f35777a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35780d);
        }
        if ((this.f35777a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35781e);
        }
        if ((this.f35777a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f35782f);
        }
        if ((this.f35777a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f35783g);
        }
        if ((this.f35777a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f35784h);
        }
        if ((this.f35777a & 32) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f35785i);
        }
        if ((this.f35777a & 64) != 0) {
            codedOutputByteBufferNano.m33522a(7, this.f35786j);
        }
        if ((this.f35777a & 128) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f35787k);
        }
        if ((this.f35777a & 256) != 0) {
            codedOutputByteBufferNano.m33521a(9, this.f35788l);
        }
        if ((this.f35777a & 512) != 0) {
            codedOutputByteBufferNano.m33518a(10, this.f35789m);
        }
        if ((this.f35777a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33531b(11, this.f35790n);
        }
        if ((this.f35777a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33518a(12, this.f35791o);
        }
        if ((this.f35777a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33518a(13, this.f35792p);
        }
        if ((this.f35777a & 8192) != 0) {
            codedOutputByteBufferNano.m33531b(14, this.f35793q);
        }
        if ((this.f35777a & 16384) != 0) {
            codedOutputByteBufferNano.m33531b(15, this.f35794r);
        }
        if (this.f35778b != null && this.f35778b.length > 0) {
            for (i iVar : this.f35778b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(16, iVar);
                }
            }
        }
        if (this.f35779c != null && this.f35779c.length > 0) {
            while (i < this.f35779c.length) {
                i iVar2 = this.f35779c[i];
                if (iVar2 != null) {
                    codedOutputByteBufferNano.m33532b(17, iVar2);
                }
                i++;
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34181b() {
        int i = 0;
        int b = super.b();
        if ((this.f35777a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35780d);
        }
        if ((this.f35777a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35781e);
        }
        if ((this.f35777a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f35777a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if ((this.f35777a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f35777a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if ((this.f35777a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33501d(7) + 1;
        }
        if ((this.f35777a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f35787k);
        }
        if ((this.f35777a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33493b(9, this.f35788l);
        }
        if ((this.f35777a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33502d(10, this.f35789m);
        }
        if ((this.f35777a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33508f(11, this.f35790n);
        }
        if ((this.f35777a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33502d(12, this.f35791o);
        }
        if ((this.f35777a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33502d(13, this.f35792p);
        }
        if ((this.f35777a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33508f(14, this.f35793q);
        }
        if ((this.f35777a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33508f(15, this.f35794r);
        }
        if (this.f35778b != null && this.f35778b.length > 0) {
            int i2 = b;
            for (i iVar : this.f35778b) {
                if (iVar != null) {
                    i2 += CodedOutputByteBufferNano.m33503d(16, iVar);
                }
            }
            b = i2;
        }
        if (this.f35779c != null && this.f35779c.length > 0) {
            while (i < this.f35779c.length) {
                i iVar2 = this.f35779c[i];
                if (iVar2 != null) {
                    b += CodedOutputByteBufferNano.m33503d(17, iVar2);
                }
                i++;
            }
        }
        return b;
    }

    public final /* synthetic */ i m34179a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            int a2;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35780d = c7213a.m33567i();
                    this.f35777a |= 1;
                    continue;
                case 16:
                    this.f35781e = c7213a.m33567i();
                    this.f35777a |= 2;
                    continue;
                case 24:
                    this.f35782f = c7213a.m33563e();
                    this.f35777a |= 4;
                    continue;
                case 32:
                    this.f35783g = c7213a.m33563e();
                    this.f35777a |= 8;
                    continue;
                case 40:
                    this.f35784h = c7213a.m33563e();
                    this.f35777a |= 16;
                    continue;
                case 48:
                    this.f35785i = c7213a.m33563e();
                    this.f35777a |= 32;
                    continue;
                case 56:
                    this.f35786j = c7213a.m33563e();
                    this.f35777a |= 64;
                    continue;
                case 64:
                    this.f35787k = c7213a.m33567i();
                    this.f35777a |= 128;
                    continue;
                case 74:
                    this.f35788l = c7213a.m33564f();
                    this.f35777a |= 256;
                    continue;
                case 80:
                    this.f35789m = c7213a.m33567i();
                    this.f35777a |= 512;
                    continue;
                case 88:
                    this.f35790n = c7213a.m33568j();
                    this.f35777a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 96:
                    this.f35791o = c7213a.m33567i();
                    this.f35777a |= eq.FLAG_MOVED;
                    continue;
                case 104:
                    this.f35792p = c7213a.m33567i();
                    this.f35777a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 112:
                    this.f35793q = c7213a.m33568j();
                    this.f35777a |= 8192;
                    continue;
                case 120:
                    this.f35794r = c7213a.m33568j();
                    this.f35777a |= 16384;
                    continue;
                case 130:
                    a2 = C7222l.m33624a(c7213a, 130);
                    a = this.f35778b == null ? 0 : this.f35778b.length;
                    obj = new bi[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f35778b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bi();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bi();
                    c7213a.m33552a(obj[a]);
                    this.f35778b = obj;
                    continue;
                case HprofParser.ROOT_FINALIZING /*138*/:
                    a2 = C7222l.m33624a(c7213a, HprofParser.ROOT_FINALIZING);
                    a = this.f35779c == null ? 0 : this.f35779c.length;
                    obj = new bh[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f35779c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bh();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bh();
                    c7213a.m33552a(obj[a]);
                    this.f35779c = obj;
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
