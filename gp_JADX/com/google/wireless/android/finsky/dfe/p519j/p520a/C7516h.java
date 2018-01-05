package com.google.wireless.android.finsky.dfe.p519j.p520a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7516h extends b {
    public int f38233a;
    public byte[] f38234b;
    public long f38235c;
    public ax f38236d;

    public C7516h() {
        this.f38233a = 0;
        this.f38234b = C7222l.f35479l;
        this.f38235c = 0;
        this.f38236d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35929a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38233a & 1) != 0) {
            codedOutputByteBufferNano.m33523a(1, this.f38234b);
        }
        if (this.f38236d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38236d);
        }
        if ((this.f38233a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f38235c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35930b() {
        int b = super.b();
        if ((this.f38233a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33494b(1, this.f38234b);
        }
        if (this.f38236d != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38236d);
        }
        if ((this.f38233a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(3, this.f38235c);
        }
        return b;
    }

    public final /* synthetic */ i m35928a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38234b = c7213a.m33565g();
                    this.f38233a |= 1;
                    continue;
                case 18:
                    if (this.f38236d == null) {
                        this.f38236d = new ax();
                    }
                    c7213a.m33552a(this.f38236d);
                    continue;
                case 24:
                    this.f38235c = c7213a.m33568j();
                    this.f38233a |= 2;
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
