package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bv extends b {
    public int f37252a;
    public de f37253b;
    public long f37254c;

    public bv() {
        this.f37252a = 0;
        this.f37253b = null;
        this.f37254c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35227a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37253b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37253b);
        }
        if ((this.f37252a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f37254c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35228b() {
        int b = super.b();
        if (this.f37253b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37253b);
        }
        if ((this.f37252a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(2, this.f37254c);
        }
        return b;
    }

    public final /* synthetic */ i m35226a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37253b == null) {
                        this.f37253b = new de();
                    }
                    c7213a.m33552a(this.f37253b);
                    continue;
                case 16:
                    this.f37254c = c7213a.m33568j();
                    this.f37252a |= 1;
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
