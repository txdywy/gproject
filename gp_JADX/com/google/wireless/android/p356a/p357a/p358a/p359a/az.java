package com.google.wireless.android.p356a.p357a.p358a.p359a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class az extends b {
    public int f35690a;
    public String f35691b;
    public long f35692c;
    public String f35693d;

    public az() {
        this.f35690a = 0;
        this.f35691b = "";
        this.f35692c = 0;
        this.f35693d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34148a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f35690a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f35691b);
        }
        if ((this.f35690a & 2) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f35692c);
        }
        if ((this.f35690a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f35693d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34149b() {
        int b = super.b();
        if ((this.f35690a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35691b);
        }
        if ((this.f35690a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33508f(2, this.f35692c);
        }
        if ((this.f35690a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f35693d);
        }
        return b;
    }

    public final /* synthetic */ i m34147a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f35691b = c7213a.m33564f();
                    this.f35690a |= 1;
                    continue;
                case 16:
                    this.f35692c = c7213a.m33568j();
                    this.f35690a |= 2;
                    continue;
                case 26:
                    this.f35693d = c7213a.m33564f();
                    this.f35690a |= 4;
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
