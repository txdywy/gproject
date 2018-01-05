package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ad extends b {
    public int f37778a;
    public double f37779b;
    public double f37780c;
    public double f37781d;
    public double f37782e;

    public final ad m35585a(double d) {
        this.f37778a |= 1;
        this.f37779b = d;
        return this;
    }

    public final ad m35588b(double d) {
        this.f37778a |= 2;
        this.f37780c = d;
        return this;
    }

    public final ad m35589c(double d) {
        this.f37778a |= 4;
        this.f37781d = d;
        return this;
    }

    public final ad m35590d(double d) {
        this.f37778a |= 8;
        this.f37782e = d;
        return this;
    }

    public ad() {
        this.f37778a = 0;
        this.f37779b = 0.0d;
        this.f37780c = 0.0d;
        this.f37781d = 1.0d;
        this.f37782e = 1.0d;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35586a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37778a & 1) != 0) {
            codedOutputByteBufferNano.m33516a(1, this.f37779b);
        }
        if ((this.f37778a & 2) != 0) {
            codedOutputByteBufferNano.m33516a(2, this.f37780c);
        }
        if ((this.f37778a & 4) != 0) {
            codedOutputByteBufferNano.m33516a(3, this.f37781d);
        }
        if ((this.f37778a & 8) != 0) {
            codedOutputByteBufferNano.m33516a(4, this.f37782e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35587b() {
        int b = super.b();
        if ((this.f37778a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 8;
        }
        if ((this.f37778a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 8;
        }
        if ((this.f37778a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 8;
        }
        if ((this.f37778a & 8) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(4) + 8);
        }
        return b;
    }

    public final /* synthetic */ i m35584a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f37779b = Double.longBitsToDouble(c7213a.m33570l());
                    this.f37778a |= 1;
                    continue;
                case 17:
                    this.f37780c = Double.longBitsToDouble(c7213a.m33570l());
                    this.f37778a |= 2;
                    continue;
                case 25:
                    this.f37781d = Double.longBitsToDouble(c7213a.m33570l());
                    this.f37778a |= 4;
                    continue;
                case 33:
                    this.f37782e = Double.longBitsToDouble(c7213a.m33570l());
                    this.f37778a |= 8;
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
