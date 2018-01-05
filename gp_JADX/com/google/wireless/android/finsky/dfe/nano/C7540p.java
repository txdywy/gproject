package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class C7540p extends b {
    public int f39181a;
    public String f39182b;
    public String f39183c;
    public C7536l f39184d;
    public C7367w f39185e;
    public String f39186f;
    public String f39187g;
    public bd f39188h;

    public C7540p() {
        this.f39181a = 0;
        this.f39182b = "";
        this.f39183c = "";
        this.f39184d = null;
        this.f39185e = null;
        this.f39186f = "";
        this.f39187g = "";
        this.f39188h = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36571a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39181a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39182b);
        }
        if ((this.f39181a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39183c);
        }
        if (this.f39184d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f39184d);
        }
        if (this.f39185e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f39185e);
        }
        if ((this.f39181a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f39186f);
        }
        if ((this.f39181a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f39187g);
        }
        if (this.f39188h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f39188h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36572b() {
        int b = super.b();
        if ((this.f39181a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39182b);
        }
        if ((this.f39181a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39183c);
        }
        if (this.f39184d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f39184d);
        }
        if (this.f39185e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f39185e);
        }
        if ((this.f39181a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f39186f);
        }
        if ((this.f39181a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(6, this.f39187g);
        }
        if (this.f39188h != null) {
            return b + CodedOutputByteBufferNano.m33503d(7, this.f39188h);
        }
        return b;
    }

    public final /* synthetic */ i m36570a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39182b = c7213a.m33564f();
                    this.f39181a |= 1;
                    continue;
                case 18:
                    this.f39183c = c7213a.m33564f();
                    this.f39181a |= 2;
                    continue;
                case 26:
                    if (this.f39184d == null) {
                        this.f39184d = new C7536l();
                    }
                    c7213a.m33552a(this.f39184d);
                    continue;
                case 34:
                    if (this.f39185e == null) {
                        this.f39185e = new C7367w();
                    }
                    c7213a.m33552a(this.f39185e);
                    continue;
                case 42:
                    this.f39186f = c7213a.m33564f();
                    this.f39181a |= 4;
                    continue;
                case 50:
                    this.f39187g = c7213a.m33564f();
                    this.f39181a |= 8;
                    continue;
                case 58:
                    if (this.f39188h == null) {
                        this.f39188h = new bd();
                    }
                    c7213a.m33552a(this.f39188h);
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
