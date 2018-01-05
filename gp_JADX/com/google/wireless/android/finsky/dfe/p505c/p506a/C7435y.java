package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7435y extends b {
    public int f37715a;
    public ea f37716b;
    public bl f37717c;
    public bl f37718d;
    public bl f37719e;
    public String f37720f;

    public C7435y() {
        this.f37715a = 0;
        this.f37716b = null;
        this.f37717c = null;
        this.f37718d = null;
        this.f37719e = null;
        this.f37720f = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35529a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37716b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37716b);
        }
        if (this.f37717c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37717c);
        }
        if (this.f37718d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37718d);
        }
        if (this.f37719e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37719e);
        }
        if ((this.f37715a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f37720f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35530b() {
        int b = super.b();
        if (this.f37716b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37716b);
        }
        if (this.f37717c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37717c);
        }
        if (this.f37718d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37718d);
        }
        if (this.f37719e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37719e);
        }
        if ((this.f37715a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(5, this.f37720f);
        }
        return b;
    }

    public final /* synthetic */ i m35528a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37716b == null) {
                        this.f37716b = new ea();
                    }
                    c7213a.m33552a(this.f37716b);
                    continue;
                case 18:
                    if (this.f37717c == null) {
                        this.f37717c = new bl();
                    }
                    c7213a.m33552a(this.f37717c);
                    continue;
                case 26:
                    if (this.f37718d == null) {
                        this.f37718d = new bl();
                    }
                    c7213a.m33552a(this.f37718d);
                    continue;
                case 34:
                    if (this.f37719e == null) {
                        this.f37719e = new bl();
                    }
                    c7213a.m33552a(this.f37719e);
                    continue;
                case 42:
                    this.f37720f = c7213a.m33564f();
                    this.f37715a |= 1;
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
