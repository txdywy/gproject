package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7548x extends b {
    public static volatile C7548x[] f39236a;
    public int f39237b;
    public String f39238c;
    public bd f39239d;
    public String f39240e;
    public byte[] f39241f;

    public static C7548x[] m36594d() {
        if (f39236a == null) {
            synchronized (C7219h.f35465b) {
                if (f39236a == null) {
                    f39236a = new C7548x[0];
                }
            }
        }
        return f39236a;
    }

    public C7548x() {
        this.f39237b = 0;
        this.f39238c = "";
        this.f39239d = null;
        this.f39240e = "";
        this.f39241f = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36596a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f39237b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f39238c);
        }
        if ((this.f39237b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39240e);
        }
        if ((this.f39237b & 4) != 0) {
            codedOutputByteBufferNano.m33523a(4, this.f39241f);
        }
        if (this.f39239d != null) {
            codedOutputByteBufferNano.m33532b(5, this.f39239d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36597b() {
        int b = super.b();
        if ((this.f39237b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f39238c);
        }
        if ((this.f39237b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f39240e);
        }
        if ((this.f39237b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33494b(4, this.f39241f);
        }
        if (this.f39239d != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f39239d);
        }
        return b;
    }

    public final /* synthetic */ i m36595a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f39238c = c7213a.m33564f();
                    this.f39237b |= 1;
                    continue;
                case 26:
                    this.f39240e = c7213a.m33564f();
                    this.f39237b |= 2;
                    continue;
                case 34:
                    this.f39241f = c7213a.m33565g();
                    this.f39237b |= 4;
                    continue;
                case 42:
                    if (this.f39239d == null) {
                        this.f39239d = new bd();
                    }
                    c7213a.m33552a(this.f39239d);
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
