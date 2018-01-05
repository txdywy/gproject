package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.aw;
import com.google.android.finsky.cv.a.ay;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fz extends b {
    public static volatile fz[] f39038a;
    public int f39039b;
    public String f39040c;
    public String f39041d;
    public int f39042e;
    public int f39043f;
    public boolean f39044g;

    public static fz[] m36471d() {
        if (f39038a == null) {
            synchronized (C7219h.f35465b) {
                if (f39038a == null) {
                    f39038a = new fz[0];
                }
            }
        }
        return f39038a;
    }

    public fz() {
        this.f39039b = 0;
        this.f39040c = "";
        this.f39041d = "";
        this.f39042e = 0;
        this.f39043f = 1;
        this.f39044g = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36473a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39039b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39040c);
        }
        if ((this.f39039b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39041d);
        }
        if ((this.f39039b & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f39042e);
        }
        if ((this.f39039b & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f39043f);
        }
        if ((this.f39039b & 16) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f39044g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36474b() {
        int b = super.b();
        if ((this.f39039b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39040c);
        }
        if ((this.f39039b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39041d);
        }
        if ((this.f39039b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f39042e);
        }
        if ((this.f39039b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f39043f);
        }
        if ((this.f39039b & 16) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(5) + 1);
        }
        return b;
    }

    private final fz m36470b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39040c = c7213a.m33564f();
                    this.f39039b |= 1;
                    continue;
                case 18:
                    this.f39041d = c7213a.m33564f();
                    this.f39039b |= 2;
                    continue;
                case 24:
                    this.f39039b |= 4;
                    o = c7213a.m33573o();
                    try {
                        this.f39042e = aw.a(c7213a.m33567i());
                        this.f39039b |= 4;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 32:
                    this.f39039b |= 8;
                    o = c7213a.m33573o();
                    try {
                        this.f39043f = ay.a(c7213a.m33567i());
                        this.f39039b |= 8;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 40:
                    this.f39044g = c7213a.m33563e();
                    this.f39039b |= 16;
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

    public final /* synthetic */ i m36472a(C7213a c7213a) {
        return m36470b(c7213a);
    }
}
