package com.google.wireless.android.p488d.p489a.p490a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7317s extends b {
    public int f36312a;
    public int f36313b;
    public int f36314c;

    public C7317s() {
        this.f36312a = 0;
        this.f36313b = 0;
        this.f36314c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34590a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36312a != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36312a);
        }
        if (this.f36313b != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f36313b);
        }
        if (this.f36314c != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f36314c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34591b() {
        int b = super.b();
        if (this.f36312a != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36312a);
        }
        if (this.f36313b != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f36313b);
        }
        if (this.f36314c != 0) {
            return b + CodedOutputByteBufferNano.m33502d(3, this.f36314c);
        }
        return b;
    }

    public final /* synthetic */ i m34589a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36312a = c7213a.m33567i();
                    continue;
                case 16:
                    this.f36313b = c7213a.m33567i();
                    continue;
                case 24:
                    this.f36314c = c7213a.m33567i();
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
