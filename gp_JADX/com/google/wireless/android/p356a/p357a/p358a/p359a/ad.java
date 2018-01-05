package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ad extends b {
    public int f35581a;
    public int f35582b;
    public int f35583c;
    public String f35584d;

    private static int m34061a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum CheckIabPromoResult");
        }
    }

    public ad() {
        this.f35581a = 0;
        this.f35582b = 0;
        this.f35583c = 0;
        this.f35584d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34064a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35581a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35582b);
        }
        if ((this.f35581a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35583c);
        }
        if ((this.f35581a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f35584d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34065b() {
        int b = super.b();
        if ((this.f35581a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35582b);
        }
        if ((this.f35581a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f35583c);
        }
        if ((this.f35581a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f35584d);
        }
        return b;
    }

    private final ad m34062b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35581a |= 1;
                    o = c7213a.m33573o();
                    try {
                        this.f35582b = ad.m34061a(c7213a.m33567i());
                        this.f35581a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    this.f35581a |= 2;
                    o = c7213a.m33573o();
                    try {
                        this.f35583c = ad.m34061a(c7213a.m33567i());
                        this.f35581a |= 2;
                        continue;
                    } catch (IllegalArgumentException e2) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 26:
                    this.f35584d = c7213a.m33564f();
                    this.f35581a |= 4;
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

    public final /* synthetic */ i m34063a(C7213a c7213a) {
        return m34062b(c7213a);
    }
}
