package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ci extends b {
    public int f37300a;
    public cj f37301b;
    public String f37302c;
    public String f37303d;
    public boolean f37304e;

    public ci() {
        this.f37300a = 0;
        this.f37301b = null;
        this.f37302c = "";
        this.f37303d = "";
        this.f37304e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35269a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37301b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37301b);
        }
        if ((this.f37300a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37302c);
        }
        if ((this.f37300a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37303d);
        }
        if ((this.f37300a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f37304e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35270b() {
        int b = super.b();
        if (this.f37301b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37301b);
        }
        if ((this.f37300a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37302c);
        }
        if ((this.f37300a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37303d);
        }
        if ((this.f37300a & 4) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(4) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35268a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37301b == null) {
                        this.f37301b = new cj();
                    }
                    c7213a.m33552a(this.f37301b);
                    continue;
                case 18:
                    this.f37302c = c7213a.m33564f();
                    this.f37300a |= 1;
                    continue;
                case 26:
                    this.f37303d = c7213a.m33564f();
                    this.f37300a |= 2;
                    continue;
                case 32:
                    this.f37304e = c7213a.m33563e();
                    this.f37300a |= 4;
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
