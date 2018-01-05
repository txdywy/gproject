package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ag extends b {
    public int f37794a;
    public int f37795b;
    public int f37796c;
    public ad f37797d;

    public ag() {
        this.f37794a = 0;
        this.f37795b = 0;
        this.f37796c = 0;
        this.f37797d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35602a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37794a & 1) != 0) {
            codedOutputByteBufferNano.m33530b(1, this.f37795b);
        }
        if ((this.f37794a & 2) != 0) {
            codedOutputByteBufferNano.m33530b(2, this.f37796c);
        }
        if (this.f37797d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37797d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35603b() {
        int b = super.b();
        if ((this.f37794a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 4;
        }
        if ((this.f37794a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 4;
        }
        if (this.f37797d != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f37797d);
        }
        return b;
    }

    public final /* synthetic */ i m35601a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f37795b = c7213a.m33569k();
                    this.f37794a |= 1;
                    continue;
                case 21:
                    this.f37796c = c7213a.m33569k();
                    this.f37794a |= 2;
                    continue;
                case 26:
                    if (this.f37797d == null) {
                        this.f37797d = new ad();
                    }
                    c7213a.m33552a(this.f37797d);
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
