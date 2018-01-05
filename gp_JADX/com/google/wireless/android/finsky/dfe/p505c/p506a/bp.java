package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bp extends b {
    public int f37220a;
    public String f37221b;
    public bl f37222c;
    public dm f37223d;
    public df f37224e;
    public bq f37225f;

    public bp() {
        this.f37220a = 0;
        this.f37221b = "";
        this.f37222c = null;
        this.f37223d = null;
        this.f37224e = null;
        this.f37225f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35205a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37220a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37221b);
        }
        if (this.f37222c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37222c);
        }
        if (this.f37223d != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37223d);
        }
        if (this.f37224e != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37224e);
        }
        if (this.f37225f != null) {
            codedOutputByteBufferNano.m33532b(6, this.f37225f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35206b() {
        int b = super.b();
        if ((this.f37220a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37221b);
        }
        if (this.f37222c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37222c);
        }
        if (this.f37223d != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37223d);
        }
        if (this.f37224e != null) {
            b += CodedOutputByteBufferNano.m33503d(5, this.f37224e);
        }
        if (this.f37225f != null) {
            return b + CodedOutputByteBufferNano.m33503d(6, this.f37225f);
        }
        return b;
    }

    public final /* synthetic */ i m35204a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37221b = c7213a.m33564f();
                    this.f37220a |= 1;
                    continue;
                case 18:
                    if (this.f37222c == null) {
                        this.f37222c = new bl();
                    }
                    c7213a.m33552a(this.f37222c);
                    continue;
                case 34:
                    if (this.f37223d == null) {
                        this.f37223d = new dm();
                    }
                    c7213a.m33552a(this.f37223d);
                    continue;
                case 42:
                    if (this.f37224e == null) {
                        this.f37224e = new df();
                    }
                    c7213a.m33552a(this.f37224e);
                    continue;
                case 50:
                    if (this.f37225f == null) {
                        this.f37225f = new bq();
                    }
                    c7213a.m33552a(this.f37225f);
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
