package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7291w extends b {
    public int f36169a;
    public long f36170b;
    public long f36171c;
    public long f36172d;
    public long f36173e;

    public final C7291w m34483a(long j) {
        this.f36169a |= 1;
        this.f36170b = j;
        return this;
    }

    public final C7291w m34486b(long j) {
        this.f36169a |= 2;
        this.f36171c = j;
        return this;
    }

    public final C7291w m34487c(long j) {
        this.f36169a |= 4;
        this.f36172d = j;
        return this;
    }

    public final C7291w m34488d(long j) {
        this.f36169a |= 8;
        this.f36173e = j;
        return this;
    }

    public C7291w() {
        this.f36169a = 0;
        this.f36170b = 0;
        this.f36171c = 0;
        this.f36172d = 0;
        this.f36173e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34484a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36169a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f36170b);
        }
        if ((this.f36169a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f36171c);
        }
        if ((this.f36169a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f36172d);
        }
        if ((this.f36169a & 8) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f36173e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34485b() {
        int b = super.b();
        if ((this.f36169a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f36170b);
        }
        if ((this.f36169a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f36171c);
        }
        if ((this.f36169a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f36172d);
        }
        if ((this.f36169a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(4, this.f36173e);
        }
        return b;
    }

    public final /* synthetic */ i m34482a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36170b = c7213a.m33568j();
                    this.f36169a |= 1;
                    continue;
                case 16:
                    this.f36171c = c7213a.m33568j();
                    this.f36169a |= 2;
                    continue;
                case 24:
                    this.f36172d = c7213a.m33568j();
                    this.f36169a |= 4;
                    continue;
                case 32:
                    this.f36173e = c7213a.m33568j();
                    this.f36169a |= 8;
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
