package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dl extends b {
    public int f38659a;
    public boolean f38660b;
    public boolean f38661c;

    public dl() {
        this.f38659a = 0;
        this.f38660b = false;
        this.f38661c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36257a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38659a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f38660b);
        }
        if ((this.f38659a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f38661c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36258b() {
        int b = super.b();
        if ((this.f38659a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f38659a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m36256a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f38660b = c7213a.m33563e();
                    this.f38659a |= 1;
                    continue;
                case 16:
                    this.f38661c = c7213a.m33563e();
                    this.f38659a |= 2;
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
