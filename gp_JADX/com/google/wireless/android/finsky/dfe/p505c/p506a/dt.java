package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dt extends b {
    public int f37493a;
    public int f37494b;
    public int f37495c;
    public float f37496d;

    public dt() {
        this.f37493a = 0;
        this.f37494b = 0;
        this.f37495c = 0;
        this.f37496d = 0.0f;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35403a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37493a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37494b);
        }
        if ((this.f37493a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37495c);
        }
        if ((this.f37493a & 4) != 0) {
            codedOutputByteBufferNano.m33517a(3, this.f37496d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35404b() {
        int b = super.b();
        if ((this.f37493a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37494b);
        }
        if ((this.f37493a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f37495c);
        }
        if ((this.f37493a & 4) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(3) + 4);
        }
        return b;
    }

    public final /* synthetic */ i m35402a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37494b = c7213a.m33567i();
                    this.f37493a |= 1;
                    continue;
                case 16:
                    this.f37495c = c7213a.m33567i();
                    this.f37493a |= 2;
                    continue;
                case 29:
                    this.f37496d = Float.intBitsToFloat(c7213a.m33569k());
                    this.f37493a |= 4;
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
