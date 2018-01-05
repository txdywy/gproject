package com.google.wireless.android.finsky.p494c.p495a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7381k extends b {
    public int f36880a;
    public long f36881b;
    public boolean f36882c;
    public boolean f36883d;
    public long f36884e;
    public C7383m f36885f;

    public final boolean m34960d() {
        return (this.f36880a & 1) != 0;
    }

    public C7381k() {
        this.f36880a = 0;
        this.f36881b = 0;
        this.f36882c = false;
        this.f36883d = false;
        this.f36884e = 0;
        this.f36885f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34958a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36880a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f36881b);
        }
        if ((this.f36880a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f36882c);
        }
        if ((this.f36880a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f36883d);
        }
        if ((this.f36880a & 8) != 0) {
            codedOutputByteBufferNano.m33531b(4, this.f36884e);
        }
        if (this.f36885f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f36885f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34959b() {
        int b = super.b();
        if ((this.f36880a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f36881b);
        }
        if ((this.f36880a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f36880a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f36880a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33508f(4, this.f36884e);
        }
        if (this.f36885f != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f36885f);
        }
        return b;
    }

    public final /* synthetic */ i m34957a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36881b = c7213a.m33568j();
                    this.f36880a |= 1;
                    continue;
                case 16:
                    this.f36882c = c7213a.m33563e();
                    this.f36880a |= 2;
                    continue;
                case 24:
                    this.f36883d = c7213a.m33563e();
                    this.f36880a |= 4;
                    continue;
                case 32:
                    this.f36884e = c7213a.m33568j();
                    this.f36880a |= 8;
                    continue;
                case 42:
                    if (this.f36885f == null) {
                        this.f36885f = new C7383m();
                    }
                    c7213a.m33552a(this.f36885f);
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
