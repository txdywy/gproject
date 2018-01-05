package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class af extends b {
    public int f38320a;
    public String f38321b;
    public String f38322c;
    public bd f38323d;
    public String f38324e;
    public String f38325f;
    public long f38326g;

    public af() {
        this.f38320a = 0;
        this.f38321b = "";
        this.f38322c = "";
        this.f38323d = null;
        this.f38324e = "#000000";
        this.f38325f = "#FFFFFF";
        this.f38326g = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35985a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38320a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38321b);
        }
        if ((this.f38320a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38322c);
        }
        if (this.f38323d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38323d);
        }
        if ((this.f38320a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f38324e);
        }
        if ((this.f38320a & 8) != 0) {
            codedOutputByteBufferNano.m33521a(5, this.f38325f);
        }
        if ((this.f38320a & 16) != 0) {
            codedOutputByteBufferNano.m33531b(6, this.f38326g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35986b() {
        int b = super.b();
        if ((this.f38320a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38321b);
        }
        if ((this.f38320a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38322c);
        }
        if (this.f38323d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f38323d);
        }
        if ((this.f38320a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(4, this.f38324e);
        }
        if ((this.f38320a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33493b(5, this.f38325f);
        }
        if ((this.f38320a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(6, this.f38326g);
        }
        return b;
    }

    public final /* synthetic */ i m35984a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38321b = c7213a.m33564f();
                    this.f38320a |= 1;
                    continue;
                case 18:
                    this.f38322c = c7213a.m33564f();
                    this.f38320a |= 2;
                    continue;
                case 26:
                    if (this.f38323d == null) {
                        this.f38323d = new bd();
                    }
                    c7213a.m33552a(this.f38323d);
                    continue;
                case 34:
                    this.f38324e = c7213a.m33564f();
                    this.f38320a |= 4;
                    continue;
                case 42:
                    this.f38325f = c7213a.m33564f();
                    this.f38320a |= 8;
                    continue;
                case 48:
                    this.f38326g = c7213a.m33568j();
                    this.f38320a |= 16;
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
