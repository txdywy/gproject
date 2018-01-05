package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.is;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ef extends b {
    public int f37545a;
    public String f37546b;
    public String f37547c;
    public String f37548d;
    public is f37549e;
    public cr f37550f;

    public ef() {
        this.f37545a = 0;
        this.f37546b = "";
        this.f37547c = "";
        this.f37548d = "";
        this.f37549e = null;
        this.f37550f = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35449a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37545a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37546b);
        }
        if ((this.f37545a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37547c);
        }
        if ((this.f37545a & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f37548d);
        }
        if (this.f37549e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37549e);
        }
        if (this.f37550f != null) {
            codedOutputByteBufferNano.m33532b(5, this.f37550f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35450b() {
        int b = super.b();
        if ((this.f37545a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37546b);
        }
        if ((this.f37545a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37547c);
        }
        if ((this.f37545a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f37548d);
        }
        if (this.f37549e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37549e);
        }
        if (this.f37550f != null) {
            return b + CodedOutputByteBufferNano.m33503d(5, this.f37550f);
        }
        return b;
    }

    public final /* synthetic */ i m35448a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37546b = c7213a.m33564f();
                    this.f37545a |= 1;
                    continue;
                case 18:
                    this.f37547c = c7213a.m33564f();
                    this.f37545a |= 2;
                    continue;
                case 26:
                    this.f37548d = c7213a.m33564f();
                    this.f37545a |= 4;
                    continue;
                case 34:
                    if (this.f37549e == null) {
                        this.f37549e = new is();
                    }
                    c7213a.m33552a(this.f37549e);
                    continue;
                case 42:
                    if (this.f37550f == null) {
                        this.f37550f = new cr();
                    }
                    c7213a.m33552a(this.f37550f);
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
