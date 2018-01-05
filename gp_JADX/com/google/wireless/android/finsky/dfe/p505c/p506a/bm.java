package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bm extends b {
    public int f37207a;
    public bl f37208b;
    public bl f37209c;
    public boolean f37210d;
    public boolean f37211e;

    public bm() {
        this.f37207a = 0;
        this.f37208b = null;
        this.f37209c = null;
        this.f37210d = false;
        this.f37211e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35195a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37208b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37208b);
        }
        if (this.f37209c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37209c);
        }
        if ((this.f37207a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f37210d);
        }
        if ((this.f37207a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f37211e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35196b() {
        int b = super.b();
        if (this.f37208b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37208b);
        }
        if (this.f37209c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37209c);
        }
        if ((this.f37207a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33501d(3) + 1;
        }
        if ((this.f37207a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(4) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35194a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37208b == null) {
                        this.f37208b = new bl();
                    }
                    c7213a.m33552a(this.f37208b);
                    continue;
                case 18:
                    if (this.f37209c == null) {
                        this.f37209c = new bl();
                    }
                    c7213a.m33552a(this.f37209c);
                    continue;
                case 24:
                    this.f37210d = c7213a.m33563e();
                    this.f37207a |= 1;
                    continue;
                case 32:
                    this.f37211e = c7213a.m33563e();
                    this.f37207a |= 2;
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
