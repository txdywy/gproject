package com.google.wireless.android.finsky.p493b;

import com.google.android.finsky.cv.a.jt;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7348d extends b {
    public int f36733a;
    public int f36734b;
    public String f36735c;
    public String f36736d;
    public String f36737e;
    public int f36738f;
    public long f36739g;

    public C7348d() {
        this.f36733a = 0;
        this.f36734b = 0;
        this.f36735c = "";
        this.f36736d = "";
        this.f36737e = "";
        this.f36738f = 1;
        this.f36739g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34834a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.m33518a(1, this.f36734b);
        if ((this.f36733a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36736d);
        }
        if ((this.f36733a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36737e);
        }
        if ((this.f36733a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f36738f);
        }
        if ((this.f36733a & 16) != 0) {
            codedOutputByteBufferNano.m33531b(5, this.f36739g);
        }
        if ((this.f36733a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(7, this.f36735c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34835b() {
        int b = super.b() + CodedOutputByteBufferNano.m33502d(1, this.f36734b);
        if ((this.f36733a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36736d);
        }
        if ((this.f36733a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36737e);
        }
        if ((this.f36733a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f36738f);
        }
        if ((this.f36733a & 16) != 0) {
            b += CodedOutputByteBufferNano.m33508f(5, this.f36739g);
        }
        if ((this.f36733a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(7, this.f36735c);
        }
        return b;
    }

    private final C7348d m34832b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36734b = c7213a.m33567i();
                    continue;
                case 18:
                    this.f36736d = c7213a.m33564f();
                    this.f36733a |= 2;
                    continue;
                case 26:
                    this.f36737e = c7213a.m33564f();
                    this.f36733a |= 4;
                    continue;
                case 32:
                    this.f36733a |= 8;
                    int o = c7213a.m33573o();
                    try {
                        this.f36738f = jt.b(c7213a.m33567i());
                        this.f36733a |= 8;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 40:
                    this.f36739g = c7213a.m33568j();
                    this.f36733a |= 16;
                    continue;
                case 58:
                    this.f36735c = c7213a.m33564f();
                    this.f36733a |= 1;
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

    public final /* synthetic */ i m34833a(C7213a c7213a) {
        return m34832b(c7213a);
    }
}
