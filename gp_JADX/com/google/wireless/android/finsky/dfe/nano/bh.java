package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bh extends b {
    public static volatile bh[] f38429a;
    public int f38430b;
    public int f38431c;
    public bd f38432d;
    public String f38433e;
    public String f38434f;
    public boolean f38435g;
    public String f38436h;

    public static bh[] m36073d() {
        if (f38429a == null) {
            synchronized (C7219h.f35465b) {
                if (f38429a == null) {
                    f38429a = new bh[0];
                }
            }
        }
        return f38429a;
    }

    public final boolean m36077e() {
        return (this.f38430b & 1) != 0;
    }

    public bh() {
        this.f38430b = 0;
        this.f38431c = 0;
        this.f38432d = null;
        this.f38433e = "";
        this.f38434f = "";
        this.f38435g = false;
        this.f38436h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36075a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38430b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38431c);
        }
        if (this.f38432d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38432d);
        }
        if ((this.f38430b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38433e);
        }
        if ((this.f38430b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38434f);
        }
        if ((this.f38430b & 8) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f38435g);
        }
        if ((this.f38430b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38436h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36076b() {
        int b = super.b();
        if ((this.f38430b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38431c);
        }
        if (this.f38432d != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38432d);
        }
        if ((this.f38430b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38433e);
        }
        if ((this.f38430b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38434f);
        }
        if ((this.f38430b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f38430b & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(6, this.f38436h);
        }
        return b;
    }

    public final /* synthetic */ i m36074a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f38431c = c7213a.m33567i();
                    this.f38430b |= 1;
                    continue;
                case 18:
                    if (this.f38432d == null) {
                        this.f38432d = new bd();
                    }
                    c7213a.m33552a(this.f38432d);
                    continue;
                case 26:
                    this.f38433e = c7213a.m33564f();
                    this.f38430b |= 2;
                    continue;
                case 34:
                    this.f38434f = c7213a.m33564f();
                    this.f38430b |= 4;
                    continue;
                case 40:
                    this.f38435g = c7213a.m33563e();
                    this.f38430b |= 8;
                    continue;
                case 50:
                    this.f38436h = c7213a.m33564f();
                    this.f38430b |= 16;
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
