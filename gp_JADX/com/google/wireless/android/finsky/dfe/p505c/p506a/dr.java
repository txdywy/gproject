package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dr extends b {
    public int f37486a;
    public int f37487b;
    public String f37488c;
    public String f37489d;
    public String f37490e;
    public boolean f37491f;

    public dr() {
        this.f37486a = 0;
        this.f37487b = 0;
        this.f37488c = "";
        this.f37489d = "";
        this.f37490e = "";
        this.f37491f = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35397a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37486a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37487b);
        }
        if ((this.f37486a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37488c);
        }
        if ((this.f37486a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37489d);
        }
        if ((this.f37486a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37490e);
        }
        if ((this.f37486a & 16) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f37491f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35398b() {
        int b = super.b();
        if ((this.f37486a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37487b);
        }
        if ((this.f37486a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37488c);
        }
        if ((this.f37486a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37489d);
        }
        if ((this.f37486a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37490e);
        }
        if ((this.f37486a & 16) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(5) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35396a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37487b = c7213a.m33567i();
                    this.f37486a |= 1;
                    continue;
                case 18:
                    this.f37488c = c7213a.m33564f();
                    this.f37486a |= 2;
                    continue;
                case 26:
                    this.f37489d = c7213a.m33564f();
                    this.f37486a |= 4;
                    continue;
                case 34:
                    this.f37490e = c7213a.m33564f();
                    this.f37486a |= 8;
                    continue;
                case 40:
                    this.f37491f = c7213a.m33563e();
                    this.f37486a |= 16;
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
