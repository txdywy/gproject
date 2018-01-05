package com.google.wireless.android.finsky.p491a.p492a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bg extends b {
    public int f36470a;
    public String f36471b;
    public ax f36472c;
    public String f36473d;
    public String f36474e;

    public bg() {
        this.f36470a = 0;
        this.f36471b = "";
        this.f36472c = null;
        this.f36473d = "";
        this.f36474e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34714a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36470a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36471b);
        }
        if ((this.f36470a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36473d);
        }
        if ((this.f36470a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f36474e);
        }
        if (this.f36472c != null) {
            codedOutputByteBufferNano.m33532b(4, this.f36472c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34715b() {
        int b = super.b();
        if ((this.f36470a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36471b);
        }
        if ((this.f36470a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36473d);
        }
        if ((this.f36470a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f36474e);
        }
        if (this.f36472c != null) {
            return b + CodedOutputByteBufferNano.m33503d(4, this.f36472c);
        }
        return b;
    }

    public final /* synthetic */ i m34713a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36471b = c7213a.m33564f();
                    this.f36470a |= 1;
                    continue;
                case 18:
                    this.f36473d = c7213a.m33564f();
                    this.f36470a |= 2;
                    continue;
                case 26:
                    this.f36474e = c7213a.m33564f();
                    this.f36470a |= 4;
                    continue;
                case 34:
                    if (this.f36472c == null) {
                        this.f36472c = new ax();
                    }
                    c7213a.m33552a(this.f36472c);
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
