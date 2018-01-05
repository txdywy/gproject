package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dg extends b {
    public int f37443a;
    public int f37444b;
    public float f37445c;

    public dg() {
        this.f37443a = 0;
        this.f37444b = 0;
        this.f37445c = 0.0f;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35365a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37443a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37444b);
        }
        if ((this.f37443a & 2) != 0) {
            codedOutputByteBufferNano.m33517a(2, this.f37445c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35366b() {
        int b = super.b();
        if ((this.f37443a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37444b);
        }
        if ((this.f37443a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 4);
        }
        return b;
    }

    private final dg m35363b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37443a |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f37444b = dh.m35367a(c7213a.m33567i());
                        this.f37443a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 21:
                    this.f37445c = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37443a |= 2;
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

    public final /* synthetic */ i m35364a(C7213a c7213a) {
        return m35363b(c7213a);
    }
}
