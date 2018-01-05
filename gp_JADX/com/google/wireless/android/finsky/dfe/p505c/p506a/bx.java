package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bx extends b {
    public int f37259a;
    public bl f37260b;
    public int f37261c;

    public bx() {
        this.f37259a = 0;
        this.f37260b = null;
        this.f37261c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35233a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37260b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37260b);
        }
        if ((this.f37259a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37261c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35234b() {
        int b = super.b();
        if (this.f37260b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37260b);
        }
        if ((this.f37259a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f37261c);
        }
        return b;
    }

    public final /* synthetic */ i m35232a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37260b == null) {
                        this.f37260b = new bl();
                    }
                    c7213a.m33552a(this.f37260b);
                    continue;
                case 16:
                    this.f37261c = c7213a.m33567i();
                    this.f37259a |= 1;
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
