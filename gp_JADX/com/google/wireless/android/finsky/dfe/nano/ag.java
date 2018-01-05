package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.aw;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.cv.a.ip;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ag extends b {
    public static volatile ag[] f38327a;
    public int f38328b;
    public String f38329c;
    public bd f38330d;
    public ip f38331e;
    public boolean f38332f;
    public int f38333g;
    public boolean f38334h;
    public byte[] f38335i;

    public static ag[] m35988d() {
        if (f38327a == null) {
            synchronized (C7219h.f35465b) {
                if (f38327a == null) {
                    f38327a = new ag[0];
                }
            }
        }
        return f38327a;
    }

    public ag() {
        this.f38328b = 0;
        this.f38329c = "";
        this.f38330d = null;
        this.f38331e = null;
        this.f38332f = false;
        this.f38333g = 0;
        this.f38334h = false;
        this.f38335i = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35990a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38328b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38329c);
        }
        if (this.f38330d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38330d);
        }
        if (this.f38331e != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38331e);
        }
        if ((this.f38328b & 2) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f38332f);
        }
        if ((this.f38328b & 16) != 0) {
            codedOutputByteBufferNano.m33523a(5, this.f38335i);
        }
        if ((this.f38328b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f38333g);
        }
        if ((this.f38328b & 8) != 0) {
            codedOutputByteBufferNano.m33522a(7, this.f38334h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35991b() {
        int b = super.b();
        if ((this.f38328b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38329c);
        }
        if (this.f38330d != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38330d);
        }
        if (this.f38331e != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38331e);
        }
        if ((this.f38328b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if ((this.f38328b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33494b(5, this.f38335i);
        }
        if ((this.f38328b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(6, this.f38333g);
        }
        if ((this.f38328b & 8) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(7) + 1);
        }
        return b;
    }

    private final ag m35987b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38329c = c7213a.m33564f();
                    this.f38328b |= 1;
                    continue;
                case 18:
                    if (this.f38330d == null) {
                        this.f38330d = new bd();
                    }
                    c7213a.m33552a(this.f38330d);
                    continue;
                case 26:
                    if (this.f38331e == null) {
                        this.f38331e = new ip();
                    }
                    c7213a.m33552a(this.f38331e);
                    continue;
                case 32:
                    this.f38332f = c7213a.m33563e();
                    this.f38328b |= 2;
                    continue;
                case 42:
                    this.f38335i = c7213a.m33565g();
                    this.f38328b |= 16;
                    continue;
                case 48:
                    this.f38328b |= 4;
                    int o = c7213a.m33573o();
                    try {
                        this.f38333g = aw.a(c7213a.m33567i());
                        this.f38328b |= 4;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 56:
                    this.f38334h = c7213a.m33563e();
                    this.f38328b |= 8;
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

    public final /* synthetic */ i m35989a(C7213a c7213a) {
        return m35987b(c7213a);
    }
}
