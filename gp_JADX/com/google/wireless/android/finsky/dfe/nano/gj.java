package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.aw;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gj extends b {
    public static volatile gj[] f39091a;
    public int f39092b;
    public int f39093c;
    public String f39094d;
    public String f39095e;
    public String f39096f;
    public String f39097g;
    public String f39098h;

    public static gj[] m36503d() {
        if (f39091a == null) {
            synchronized (C7219h.f35465b) {
                if (f39091a == null) {
                    f39091a = new gj[0];
                }
            }
        }
        return f39091a;
    }

    public gj() {
        this.f39092b = 0;
        this.f39093c = 0;
        this.f39094d = "";
        this.f39095e = "";
        this.f39096f = "";
        this.f39097g = "";
        this.f39098h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36505a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f39093c);
        if ((this.f39092b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39094d);
        }
        if ((this.f39092b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39095e);
        }
        if ((this.f39092b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f39096f);
        }
        if ((this.f39092b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f39098h);
        }
        if ((this.f39092b & 8) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f39097g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36506b() {
        int b = super.b() + CodedOutputByteBufferNano.m33502d(1, this.f39093c);
        if ((this.f39092b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39094d);
        }
        if ((this.f39092b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f39095e);
        }
        if ((this.f39092b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f39096f);
        }
        if ((this.f39092b & 16) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f39098h);
        }
        if ((this.f39092b & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(7, this.f39097g);
        }
        return b;
    }

    private final gj m36502b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    int o = c7213a.m33573o();
                    try {
                        this.f39093c = aw.a(c7213a.m33567i());
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 18:
                    this.f39094d = c7213a.m33564f();
                    this.f39092b |= 1;
                    continue;
                case 26:
                    this.f39095e = c7213a.m33564f();
                    this.f39092b |= 2;
                    continue;
                case 34:
                    this.f39096f = c7213a.m33564f();
                    this.f39092b |= 4;
                    continue;
                case 50:
                    this.f39098h = c7213a.m33564f();
                    this.f39092b |= 16;
                    continue;
                case 58:
                    this.f39097g = c7213a.m33564f();
                    this.f39092b |= 8;
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

    public final /* synthetic */ i m36504a(C7213a c7213a) {
        return m36502b(c7213a);
    }
}
