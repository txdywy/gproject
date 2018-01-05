package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7412c extends b {
    public int f37268a;
    public bl f37269b;
    public bl f37270c;
    public int f37271d;
    public String f37272e;

    public C7412c() {
        this.f37268a = 0;
        this.f37269b = null;
        this.f37270c = null;
        this.f37271d = 0;
        this.f37272e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35243a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37269b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37269b);
        }
        if (this.f37270c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37270c);
        }
        if ((this.f37268a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37271d);
        }
        if ((this.f37268a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37272e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35244b() {
        int b = super.b();
        if (this.f37269b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37269b);
        }
        if (this.f37270c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37270c);
        }
        if ((this.f37268a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f37271d);
        }
        if ((this.f37268a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f37272e);
        }
        return b;
    }

    public final /* synthetic */ i m35242a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37269b == null) {
                        this.f37269b = new bl();
                    }
                    c7213a.m33552a(this.f37269b);
                    continue;
                case 18:
                    if (this.f37270c == null) {
                        this.f37270c = new bl();
                    }
                    c7213a.m33552a(this.f37270c);
                    continue;
                case 24:
                    this.f37271d = c7213a.m33567i();
                    this.f37268a |= 1;
                    continue;
                case 34:
                    this.f37272e = c7213a.m33564f();
                    this.f37268a |= 2;
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
