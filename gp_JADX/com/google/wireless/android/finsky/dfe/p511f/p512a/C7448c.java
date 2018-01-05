package com.google.wireless.android.finsky.dfe.p511f.p512a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7448c extends b {
    public int f37753a;
    public boolean f37754b;
    public boolean f37755c;

    public C7448c() {
        this.f37753a = 0;
        this.f37754b = false;
        this.f37755c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35567a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37753a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f37754b);
        }
        if ((this.f37753a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f37755c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35568b() {
        int b = super.b();
        if ((this.f37753a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if ((this.f37753a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35566a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37754b = c7213a.m33563e();
                    this.f37753a |= 1;
                    continue;
                case 16:
                    this.f37755c = c7213a.m33563e();
                    this.f37753a |= 2;
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
