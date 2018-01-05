package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ee extends b {
    public int f37542a;
    public int f37543b;
    public byte[] f37544c;

    public ee() {
        this.f37542a = 0;
        this.f37543b = 0;
        this.f37544c = C7222l.f35479l;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35446a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37542a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37543b);
        }
        if ((this.f37542a & 2) != 0) {
            codedOutputByteBufferNano.m33523a(2, this.f37544c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35447b() {
        int b = super.b();
        if ((this.f37542a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37543b);
        }
        if ((this.f37542a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33494b(2, this.f37544c);
        }
        return b;
    }

    public final /* synthetic */ i m35445a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37543b = c7213a.m33567i();
                    this.f37542a |= 1;
                    continue;
                case 18:
                    this.f37544c = c7213a.m33565g();
                    this.f37542a |= 2;
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
