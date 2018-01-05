package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class db extends b {
    public int f37398a;
    public String f37399b;
    public bu f37400c;
    public co f37401d;
    public String f37402e;
    public boolean f37403f;
    public boolean f37404g;
    public bl f37405h;

    public db() {
        this.f37398a = 0;
        this.f37399b = "";
        this.f37400c = null;
        this.f37401d = null;
        this.f37402e = "";
        this.f37403f = false;
        this.f37404g = false;
        this.f37405h = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35345a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37398a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37399b);
        }
        if (this.f37400c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37400c);
        }
        if (this.f37401d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37401d);
        }
        if ((this.f37398a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37402e);
        }
        if ((this.f37398a & 4) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f37403f);
        }
        if ((this.f37398a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(6, this.f37404g);
        }
        if (this.f37405h != null) {
            codedOutputByteBufferNano.m33532b(7, this.f37405h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35346b() {
        int b = super.b();
        if ((this.f37398a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37399b);
        }
        if (this.f37400c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37400c);
        }
        if (this.f37401d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37401d);
        }
        if ((this.f37398a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f37402e);
        }
        if ((this.f37398a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f37398a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(6) + 1;
        }
        if (this.f37405h != null) {
            return b + CodedOutputByteBufferNano.m33503d(7, this.f37405h);
        }
        return b;
    }

    public final /* synthetic */ i m35344a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37399b = c7213a.m33564f();
                    this.f37398a |= 1;
                    continue;
                case 18:
                    if (this.f37400c == null) {
                        this.f37400c = new bu();
                    }
                    c7213a.m33552a(this.f37400c);
                    continue;
                case 26:
                    if (this.f37401d == null) {
                        this.f37401d = new co();
                    }
                    c7213a.m33552a(this.f37401d);
                    continue;
                case 34:
                    this.f37402e = c7213a.m33564f();
                    this.f37398a |= 2;
                    continue;
                case 40:
                    this.f37403f = c7213a.m33563e();
                    this.f37398a |= 4;
                    continue;
                case 48:
                    this.f37404g = c7213a.m33563e();
                    this.f37398a |= 8;
                    continue;
                case 58:
                    if (this.f37405h == null) {
                        this.f37405h = new bl();
                    }
                    c7213a.m33552a(this.f37405h);
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
