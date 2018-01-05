package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.C7320b;

public final class al extends b {
    public int f37086a;
    public int f37087b;
    public long f37088c;
    public long f37089d;
    public int f37090e;

    public final al m35107a(int i) {
        this.f37087b = i;
        this.f37086a |= 1;
        return this;
    }

    public al() {
        this.f37086a = 0;
        this.f37087b = 0;
        this.f37088c = 0;
        this.f37089d = 0;
        this.f37090e = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35108a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37086a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37087b);
        }
        if ((this.f37086a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f37088c);
        }
        if ((this.f37086a & 4) != 0) {
            codedOutputByteBufferNano.m33531b(3, this.f37089d);
        }
        if ((this.f37086a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f37090e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35109b() {
        int b = super.b();
        if ((this.f37086a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37087b);
        }
        if ((this.f37086a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f37088c);
        }
        if ((this.f37086a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33508f(3, this.f37089d);
        }
        if ((this.f37086a & 8) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(4, this.f37090e);
        }
        return b;
    }

    private final al m35105b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37086a |= 1;
                    o = c7213a.m33573o();
                    try {
                        this.f37087b = am.m35110a(c7213a.m33567i());
                        this.f37086a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    this.f37088c = c7213a.m33568j();
                    this.f37086a |= 2;
                    continue;
                case 24:
                    this.f37089d = c7213a.m33568j();
                    this.f37086a |= 4;
                    continue;
                case 32:
                    this.f37086a |= 8;
                    o = c7213a.m33573o();
                    try {
                        this.f37090e = C7320b.m34689a(c7213a.m33567i());
                        this.f37086a |= 8;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ i m35106a(C7213a c7213a) {
        return m35105b(c7213a);
    }
}
