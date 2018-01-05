package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dj extends b {
    public int f37449a;
    public String f37450b;
    public String f37451c;
    public bl f37452d;

    public dj() {
        this.f37449a = 0;
        this.f37450b = "";
        this.f37451c = "";
        this.f37452d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35373a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37449a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37450b);
        }
        if ((this.f37449a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37451c);
        }
        if (this.f37452d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37452d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35374b() {
        int b = super.b();
        if ((this.f37449a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37450b);
        }
        if ((this.f37449a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37451c);
        }
        if (this.f37452d != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f37452d);
        }
        return b;
    }

    public final /* synthetic */ i m35372a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37450b = c7213a.m33564f();
                    this.f37449a |= 1;
                    continue;
                case 18:
                    this.f37451c = c7213a.m33564f();
                    this.f37449a |= 2;
                    continue;
                case 26:
                    if (this.f37452d == null) {
                        this.f37452d = new bl();
                    }
                    c7213a.m33552a(this.f37452d);
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
