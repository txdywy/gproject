package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.nano.ev;

public final class dx extends b {
    public int f37509a;
    public int f37510b;
    public ax f37511c;
    public String f37512d;

    public dx() {
        this.f37509a = 0;
        this.f37510b = 0;
        this.f37511c = null;
        this.f37512d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35418a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37509a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37510b);
        }
        if (this.f37511c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37511c);
        }
        if ((this.f37509a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(4, this.f37512d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35419b() {
        int b = super.b();
        if ((this.f37509a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f37510b);
        }
        if (this.f37511c != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37511c);
        }
        if ((this.f37509a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(4, this.f37512d);
        }
        return b;
    }

    private final dx m35416b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    this.f37509a |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f37510b = ev.m36370a(c7213a.m33567i());
                        this.f37509a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 26:
                    if (this.f37511c == null) {
                        this.f37511c = new ax();
                    }
                    c7213a.m33552a(this.f37511c);
                    continue;
                case 34:
                    this.f37512d = c7213a.m33564f();
                    this.f37509a |= 2;
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

    public final /* synthetic */ i m35417a(C7213a c7213a) {
        return m35416b(c7213a);
    }
}
