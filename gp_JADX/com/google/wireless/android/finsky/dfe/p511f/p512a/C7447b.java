package com.google.wireless.android.finsky.dfe.p511f.p512a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7447b extends b {
    public int f37750a;
    public long f37751b;
    public long f37752c;

    public C7447b() {
        this.f37750a = 0;
        this.f37751b = 0;
        this.f37752c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35564a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37750a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f37751b);
        }
        if ((this.f37750a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f37752c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35565b() {
        int b = super.b();
        if ((this.f37750a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f37751b);
        }
        if ((this.f37750a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(2, this.f37752c);
        }
        return b;
    }

    public final /* synthetic */ i m35563a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37751b = c7213a.m33568j();
                    this.f37750a |= 1;
                    continue;
                case 16:
                    this.f37752c = c7213a.m33568j();
                    this.f37750a |= 2;
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
