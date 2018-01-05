package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ah extends b {
    public int f38336a;
    public String f38337b;
    public String f38338c;
    public bd f38339d;
    public bd f38340e;

    public ah() {
        this.f38336a = 0;
        this.f38337b = "";
        this.f38338c = "";
        this.f38339d = null;
        this.f38340e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35993a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38336a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38337b);
        }
        if ((this.f38336a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38338c);
        }
        if (this.f38339d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38339d);
        }
        if (this.f38340e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f38340e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35994b() {
        int b = super.b();
        if ((this.f38336a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38337b);
        }
        if ((this.f38336a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38338c);
        }
        if (this.f38339d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38339d);
        }
        if (this.f38340e != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f38340e);
        }
        return b;
    }

    public final /* synthetic */ i m35992a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38337b = c7213a.m33564f();
                    this.f38336a |= 1;
                    continue;
                case 18:
                    this.f38338c = c7213a.m33564f();
                    this.f38336a |= 2;
                    continue;
                case 26:
                    if (this.f38339d == null) {
                        this.f38339d = new bd();
                    }
                    c7213a.m33552a(this.f38339d);
                    continue;
                case 34:
                    if (this.f38340e == null) {
                        this.f38340e = new bd();
                    }
                    c7213a.m33552a(this.f38340e);
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
