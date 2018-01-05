package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cm extends b {
    public int f35969a;
    public int f35970b;
    public int f35971c;

    private static int m34326a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return i;
            default:
                throw new IllegalArgumentException(i + " is not a valid enum SearchBoxMode");
        }
    }

    public cm() {
        this.f35969a = 0;
        this.f35970b = 0;
        this.f35971c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34329a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35969a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f35970b);
        }
        if ((this.f35969a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f35971c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34330b() {
        int b = super.b();
        if ((this.f35969a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f35970b);
        }
        if ((this.f35969a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f35971c);
        }
        return b;
    }

    private final cm m34327b(C7213a c7213a) {
        int o;
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35969a |= 1;
                    o = c7213a.m33573o();
                    try {
                        this.f35970b = cm.m34326a(c7213a.m33567i());
                        this.f35969a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    this.f35969a |= 2;
                    o = c7213a.m33573o();
                    try {
                        this.f35971c = cm.m34326a(c7213a.m33567i());
                        this.f35969a |= 2;
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

    public final /* synthetic */ i m34328a(C7213a c7213a) {
        return m34327b(c7213a);
    }
}
