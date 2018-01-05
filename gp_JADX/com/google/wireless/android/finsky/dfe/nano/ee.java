package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.cv.a.es;
import com.google.android.finsky.cv.a.jt;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ee extends b {
    public static volatile ee[] f38724a;
    public int f38725b;
    public ax f38726c;
    public int f38727d;
    public String f38728e;
    public bd f38729f;
    public String f38730g;
    public boolean f38731h;
    public boolean f38732i;
    public int f38733j;
    public es f38734k;
    public int f38735l;
    public int f38736m;
    public cv f38737n;
    public cc f38738o;
    public boolean f38739p;
    public String f38740q;

    public static ee[] m36315d() {
        if (f38724a == null) {
            synchronized (C7219h.f35465b) {
                if (f38724a == null) {
                    f38724a = new ee[0];
                }
            }
        }
        return f38724a;
    }

    public final boolean m36319e() {
        return (this.f38725b & 64) != 0;
    }

    public ee() {
        this.f38725b = 0;
        this.f38726c = null;
        this.f38727d = 0;
        this.f38728e = "";
        this.f38729f = null;
        this.f38730g = "";
        this.f38731h = false;
        this.f38732i = true;
        this.f38733j = -1;
        this.f38734k = null;
        this.f38735l = 100;
        this.f38736m = 0;
        this.f38737n = null;
        this.f38738o = null;
        this.f38739p = false;
        this.f38740q = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36317a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38726c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38726c);
        }
        if ((this.f38725b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38727d);
        }
        if ((this.f38725b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38728e);
        }
        if (this.f38729f != null) {
            codedOutputByteBufferNano.m33532b(4, this.f38729f);
        }
        if ((this.f38725b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38730g);
        }
        if ((this.f38725b & 128) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f38736m);
        }
        if ((this.f38725b & 8) != 0) {
            codedOutputByteBufferNano.m33522a(8, this.f38731h);
        }
        if ((this.f38725b & 16) != 0) {
            codedOutputByteBufferNano.m33522a(9, this.f38732i);
        }
        if ((this.f38725b & 32) != 0) {
            codedOutputByteBufferNano.m33518a(10, this.f38733j);
        }
        if (this.f38734k != null) {
            codedOutputByteBufferNano.m33532b(11, this.f38734k);
        }
        if ((this.f38725b & 64) != 0) {
            codedOutputByteBufferNano.m33518a(12, this.f38735l);
        }
        if (this.f38737n != null) {
            codedOutputByteBufferNano.m33532b(13, this.f38737n);
        }
        if (this.f38738o != null) {
            codedOutputByteBufferNano.m33532b(14, this.f38738o);
        }
        if ((this.f38725b & 256) != 0) {
            codedOutputByteBufferNano.m33522a(15, this.f38739p);
        }
        if ((this.f38725b & 512) != 0) {
            codedOutputByteBufferNano.m33521a(16, this.f38740q);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36318b() {
        int b = super.b();
        if (this.f38726c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38726c);
        }
        if ((this.f38725b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f38727d);
        }
        if ((this.f38725b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38728e);
        }
        if (this.f38729f != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f38729f);
        }
        if ((this.f38725b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38730g);
        }
        if ((this.f38725b & 128) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f38736m);
        }
        if ((this.f38725b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(8) + 1;
        }
        if ((this.f38725b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33501d(9) + 1;
        }
        if ((this.f38725b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33502d(10, this.f38733j);
        }
        if (this.f38734k != null) {
            b += CodedOutputByteBufferNano.m33503d(11, this.f38734k);
        }
        if ((this.f38725b & 64) != 0) {
            b += CodedOutputByteBufferNano.m33502d(12, this.f38735l);
        }
        if (this.f38737n != null) {
            b += CodedOutputByteBufferNano.m33503d(13, this.f38737n);
        }
        if (this.f38738o != null) {
            b += CodedOutputByteBufferNano.m33503d(14, this.f38738o);
        }
        if ((this.f38725b & 256) != 0) {
            b += CodedOutputByteBufferNano.m33501d(15) + 1;
        }
        if ((this.f38725b & 512) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(16, this.f38740q);
        }
        return b;
    }

    private final ee m36314b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38726c == null) {
                        this.f38726c = new ax();
                    }
                    c7213a.m33552a(this.f38726c);
                    continue;
                case 16:
                    this.f38727d = c7213a.m33567i();
                    this.f38725b |= 1;
                    continue;
                case 26:
                    this.f38728e = c7213a.m33564f();
                    this.f38725b |= 2;
                    continue;
                case 34:
                    if (this.f38729f == null) {
                        this.f38729f = new bd();
                    }
                    c7213a.m33552a(this.f38729f);
                    continue;
                case 42:
                    this.f38730g = c7213a.m33564f();
                    this.f38725b |= 4;
                    continue;
                case 48:
                    this.f38725b |= 128;
                    int o = c7213a.m33573o();
                    try {
                        this.f38736m = jt.d(c7213a.m33567i());
                        this.f38725b |= 128;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 64:
                    this.f38731h = c7213a.m33563e();
                    this.f38725b |= 8;
                    continue;
                case 72:
                    this.f38732i = c7213a.m33563e();
                    this.f38725b |= 16;
                    continue;
                case 80:
                    this.f38733j = c7213a.m33567i();
                    this.f38725b |= 32;
                    continue;
                case 90:
                    if (this.f38734k == null) {
                        this.f38734k = new es();
                    }
                    c7213a.m33552a(this.f38734k);
                    continue;
                case 96:
                    this.f38735l = c7213a.m33567i();
                    this.f38725b |= 64;
                    continue;
                case 106:
                    if (this.f38737n == null) {
                        this.f38737n = new cv();
                    }
                    c7213a.m33552a(this.f38737n);
                    continue;
                case 114:
                    if (this.f38738o == null) {
                        this.f38738o = new cc();
                    }
                    c7213a.m33552a(this.f38738o);
                    continue;
                case 120:
                    this.f38739p = c7213a.m33563e();
                    this.f38725b |= 256;
                    continue;
                case 130:
                    this.f38740q = c7213a.m33564f();
                    this.f38725b |= 512;
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

    public final /* synthetic */ i m36316a(C7213a c7213a) {
        return m36314b(c7213a);
    }
}
