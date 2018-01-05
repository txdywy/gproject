package com.google.wireless.android.p356a.p357a.p358a.p359a;

import android.support.v7.widget.eq;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.HprofParser;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class cc extends b {
    public int f35900a;
    public boolean f35901b;
    public boolean f35902c;
    public int f35903d;
    public int f35904e;
    public int f35905f;
    public int f35906g;
    public int f35907h;
    public int f35908i;
    public int f35909j;
    public boolean f35910k;
    public int f35911l;
    public boolean f35912m;
    public ch f35913n;
    public int f35914o;
    public int f35915p;
    public long f35916q;
    public long f35917r;
    public long f35918s;
    public long f35919t;
    public C7291w f35920u;

    public final cc m34271a(boolean z) {
        this.f35900a |= 1;
        this.f35901b = z;
        return this;
    }

    public final cc m34275b(boolean z) {
        this.f35900a |= 2;
        this.f35902c = z;
        return this;
    }

    public final cc m34269a(int i) {
        this.f35900a |= 8;
        this.f35904e = i;
        return this;
    }

    public final cc m34274b(int i) {
        this.f35900a |= 16;
        this.f35905f = i;
        return this;
    }

    public final cc m34276c(int i) {
        this.f35900a |= 32;
        this.f35906g = i;
        return this;
    }

    public final cc m34278d(int i) {
        this.f35900a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
        this.f35911l = i;
        return this;
    }

    public final cc m34277c(boolean z) {
        this.f35900a |= eq.FLAG_MOVED;
        this.f35912m = z;
        return this;
    }

    public final cc m34279e(int i) {
        this.f35900a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
        this.f35914o = i;
        return this;
    }

    public final cc m34280f(int i) {
        this.f35900a |= 8192;
        this.f35915p = i;
        return this;
    }

    public final cc m34270a(long j) {
        this.f35900a |= 16384;
        this.f35916q = j;
        return this;
    }

    public cc() {
        this.f35900a = 0;
        this.f35901b = false;
        this.f35902c = false;
        this.f35903d = 0;
        this.f35904e = 0;
        this.f35905f = 0;
        this.f35906g = 0;
        this.f35907h = 0;
        this.f35908i = 0;
        this.f35909j = 0;
        this.f35910k = false;
        this.f35911l = 0;
        this.f35912m = false;
        this.f35913n = null;
        this.f35914o = 0;
        this.f35915p = 0;
        this.f35916q = 0;
        this.f35917r = 0;
        this.f35918s = 0;
        this.f35919t = 0;
        this.f35920u = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34272a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35900a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f35901b);
        }
        if ((this.f35900a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f35902c);
        }
        if ((this.f35900a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f35903d);
        }
        if ((this.f35900a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f35904e);
        }
        if ((this.f35900a & 16) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f35905f);
        }
        if ((this.f35900a & 32) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f35906g);
        }
        if ((this.f35900a & 64) != 0) {
            codedOutputByteBufferNano.m33518a(7, this.f35907h);
        }
        if ((this.f35900a & 128) != 0) {
            codedOutputByteBufferNano.m33518a(8, this.f35908i);
        }
        if ((this.f35900a & 256) != 0) {
            codedOutputByteBufferNano.m33518a(9, this.f35909j);
        }
        if ((this.f35900a & 512) != 0) {
            codedOutputByteBufferNano.m33522a(10, this.f35910k);
        }
        if ((this.f35900a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            codedOutputByteBufferNano.m33518a(11, this.f35911l);
        }
        if ((this.f35900a & eq.FLAG_MOVED) != 0) {
            codedOutputByteBufferNano.m33522a(12, this.f35912m);
        }
        if (this.f35913n != null) {
            codedOutputByteBufferNano.m33532b(13, this.f35913n);
        }
        if ((this.f35900a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            codedOutputByteBufferNano.m33518a(14, this.f35914o);
        }
        if ((this.f35900a & 8192) != 0) {
            codedOutputByteBufferNano.m33518a(15, this.f35915p);
        }
        if ((this.f35900a & 16384) != 0) {
            codedOutputByteBufferNano.m33531b(16, this.f35916q);
        }
        if ((this.f35900a & 32768) != 0) {
            codedOutputByteBufferNano.m33531b(17, this.f35917r);
        }
        if ((this.f35900a & 65536) != 0) {
            codedOutputByteBufferNano.m33531b(18, this.f35918s);
        }
        if ((this.f35900a & 131072) != 0) {
            codedOutputByteBufferNano.m33531b(19, this.f35919t);
        }
        if (this.f35920u != null) {
            codedOutputByteBufferNano.m33532b(20, this.f35920u);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34273b() {
        int b = super.b();
        if ((this.f35900a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f35900a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f35900a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f35903d);
        }
        if ((this.f35900a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f35904e);
        }
        if ((this.f35900a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f35905f);
        }
        if ((this.f35900a & 32) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f35906g);
        }
        if ((this.f35900a & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(7, this.f35907h);
        }
        if ((this.f35900a & 128) != 0) {
            b += CodedOutputByteBufferNano.m33502d(8, this.f35908i);
        }
        if ((this.f35900a & 256) != 0) {
            b += CodedOutputByteBufferNano.m33502d(9, this.f35909j);
        }
        if ((this.f35900a & 512) != 0) {
            b += CodedOutputByteBufferNano.m33501d(10) + 1;
        }
        if ((this.f35900a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
            b += CodedOutputByteBufferNano.m33502d(11, this.f35911l);
        }
        if ((this.f35900a & eq.FLAG_MOVED) != 0) {
            b += CodedOutputByteBufferNano.m33501d(12) + 1;
        }
        if (this.f35913n != null) {
            b += CodedOutputByteBufferNano.m33503d(13, this.f35913n);
        }
        if ((this.f35900a & eq.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            b += CodedOutputByteBufferNano.m33502d(14, this.f35914o);
        }
        if ((this.f35900a & 8192) != 0) {
            b += CodedOutputByteBufferNano.m33502d(15, this.f35915p);
        }
        if ((this.f35900a & 16384) != 0) {
            b += CodedOutputByteBufferNano.m33508f(16, this.f35916q);
        }
        if ((this.f35900a & 32768) != 0) {
            b += CodedOutputByteBufferNano.m33508f(17, this.f35917r);
        }
        if ((this.f35900a & 65536) != 0) {
            b += CodedOutputByteBufferNano.m33508f(18, this.f35918s);
        }
        if ((this.f35900a & 131072) != 0) {
            b += CodedOutputByteBufferNano.m33508f(19, this.f35919t);
        }
        if (this.f35920u != null) {
            return b + CodedOutputByteBufferNano.m33503d(20, this.f35920u);
        }
        return b;
    }

    public final /* synthetic */ i m34268a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35901b = c7213a.m33563e();
                    this.f35900a |= 1;
                    continue;
                case 16:
                    this.f35902c = c7213a.m33563e();
                    this.f35900a |= 2;
                    continue;
                case 24:
                    this.f35903d = c7213a.m33567i();
                    this.f35900a |= 4;
                    continue;
                case 32:
                    this.f35904e = c7213a.m33567i();
                    this.f35900a |= 8;
                    continue;
                case 40:
                    this.f35905f = c7213a.m33567i();
                    this.f35900a |= 16;
                    continue;
                case 48:
                    this.f35906g = c7213a.m33567i();
                    this.f35900a |= 32;
                    continue;
                case 56:
                    this.f35907h = c7213a.m33567i();
                    this.f35900a |= 64;
                    continue;
                case 64:
                    this.f35908i = c7213a.m33567i();
                    this.f35900a |= 128;
                    continue;
                case 72:
                    this.f35909j = c7213a.m33567i();
                    this.f35900a |= 256;
                    continue;
                case 80:
                    this.f35910k = c7213a.m33563e();
                    this.f35900a |= 512;
                    continue;
                case 88:
                    this.f35911l = c7213a.m33567i();
                    this.f35900a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                    continue;
                case 96:
                    this.f35912m = c7213a.m33563e();
                    this.f35900a |= eq.FLAG_MOVED;
                    continue;
                case 106:
                    if (this.f35913n == null) {
                        this.f35913n = new ch();
                    }
                    c7213a.m33552a(this.f35913n);
                    continue;
                case 112:
                    this.f35914o = c7213a.m33567i();
                    this.f35900a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                    continue;
                case 120:
                    this.f35915p = c7213a.m33567i();
                    this.f35900a |= 8192;
                    continue;
                case 128:
                    this.f35916q = c7213a.m33568j();
                    this.f35900a |= 16384;
                    continue;
                case 136:
                    this.f35917r = c7213a.m33568j();
                    this.f35900a |= 32768;
                    continue;
                case HprofParser.ROOT_UNREACHABLE /*144*/:
                    this.f35918s = c7213a.m33568j();
                    this.f35900a |= 65536;
                    continue;
                case 152:
                    this.f35919t = c7213a.m33568j();
                    this.f35900a |= 131072;
                    continue;
                case 162:
                    if (this.f35920u == null) {
                        this.f35920u = new C7291w();
                    }
                    c7213a.m33552a(this.f35920u);
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
