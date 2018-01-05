package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class cg extends b {
    public int f37293a;
    public bd f37294b;
    public dm f37295c;
    public String f37296d;
    public ch f37297e;

    public cg() {
        this.f37293a = 0;
        this.f37294b = null;
        this.f37295c = null;
        this.f37296d = "";
        this.f37297e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35263a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37294b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37294b);
        }
        if (this.f37295c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37295c);
        }
        if ((this.f37293a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37296d);
        }
        if (this.f37297e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37297e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35264b() {
        int b = super.b();
        if (this.f37294b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37294b);
        }
        if (this.f37295c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37295c);
        }
        if ((this.f37293a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37296d);
        }
        if (this.f37297e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f37297e);
        }
        return b;
    }

    public final /* synthetic */ i m35262a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37294b == null) {
                        this.f37294b = new bd();
                    }
                    c7213a.m33552a(this.f37294b);
                    continue;
                case 18:
                    if (this.f37295c == null) {
                        this.f37295c = new dm();
                    }
                    c7213a.m33552a(this.f37295c);
                    continue;
                case 26:
                    this.f37296d = c7213a.m33564f();
                    this.f37293a |= 1;
                    continue;
                case 34:
                    if (this.f37297e == null) {
                        this.f37297e = new ch();
                    }
                    c7213a.m33552a(this.f37297e);
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
