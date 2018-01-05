package com.google.wireless.android.finsky.dfe.p517i.p518a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7507f extends b {
    public static volatile C7507f[] f38197a;
    public int f38198b;
    public ax f38199c;
    public C7504c f38200d;
    public float f38201e;

    public static C7507f[] m35890d() {
        if (f38197a == null) {
            synchronized (C7219h.f35465b) {
                if (f38197a == null) {
                    f38197a = new C7507f[0];
                }
            }
        }
        return f38197a;
    }

    public C7507f() {
        this.f38198b = 0;
        this.f38199c = null;
        this.f38200d = null;
        this.f38201e = 0.0f;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35892a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38199c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38199c);
        }
        if (this.f38200d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38200d);
        }
        if ((this.f38198b & 1) != 0) {
            codedOutputByteBufferNano.m33517a(3, this.f38201e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35893b() {
        int b = super.b();
        if (this.f38199c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38199c);
        }
        if (this.f38200d != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38200d);
        }
        if ((this.f38198b & 1) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(3) + 4);
        }
        return b;
    }

    public final /* synthetic */ i m35891a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38199c == null) {
                        this.f38199c = new ax();
                    }
                    c7213a.m33552a(this.f38199c);
                    continue;
                case 18:
                    if (this.f38200d == null) {
                        this.f38200d = new C7504c();
                    }
                    c7213a.m33552a(this.f38200d);
                    continue;
                case 29:
                    this.f38201e = Float.intBitsToFloat(c7213a.m33569k());
                    this.f38198b |= 1;
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
