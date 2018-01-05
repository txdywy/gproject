package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7394h extends b {
    public int f36942a;
    public int f36943b;
    public String f36944c;
    public String f36945d;

    public C7394h() {
        this.f36942a = 0;
        this.f36943b = 0;
        this.f36944c = "";
        this.f36945d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35006a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36942a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36943b);
        }
        if ((this.f36942a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36944c);
        }
        if ((this.f36942a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36945d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35007b() {
        int b = super.b();
        if ((this.f36942a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36943b);
        }
        if ((this.f36942a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36944c);
        }
        if ((this.f36942a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f36945d);
        }
        return b;
    }

    public final /* synthetic */ i m35005a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36943b = c7213a.m33567i();
                    this.f36942a |= 1;
                    continue;
                case 18:
                    this.f36944c = c7213a.m33564f();
                    this.f36942a |= 2;
                    continue;
                case 26:
                    this.f36945d = c7213a.m33564f();
                    this.f36942a |= 4;
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
