package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ax extends b {
    public int f37148a;
    public int f37149b;
    public au f37150c;

    public ax() {
        this.f37148a = 0;
        this.f37149b = 0;
        this.f37150c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35147a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37148a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37149b);
        }
        if (this.f37150c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37150c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35148b() {
        int b = super.b();
        if ((this.f37148a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37149b);
        }
        if (this.f37150c != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37150c);
        }
        return b;
    }

    public final /* synthetic */ i m35146a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37149b = c7213a.m33567i();
                    this.f37148a |= 1;
                    continue;
                case 18:
                    if (this.f37150c == null) {
                        this.f37150c = new au();
                    }
                    c7213a.m33552a(this.f37150c);
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
