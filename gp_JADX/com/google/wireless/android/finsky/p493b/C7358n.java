package com.google.wireless.android.finsky.p493b;

import com.google.android.finsky.cv.a.aw;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p491a.p492a.ax;

public final class C7358n extends b {
    public int f36778a;
    public int f36779b;
    public String f36780c;
    public ax f36781d;

    public C7358n() {
        this.f36778a = 0;
        this.f36779b = 0;
        this.f36780c = "";
        this.f36781d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34876a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36778a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36779b);
        }
        if ((this.f36778a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36780c);
        }
        if (this.f36781d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f36781d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34877b() {
        int b = super.b();
        if ((this.f36778a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36779b);
        }
        if ((this.f36778a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36780c);
        }
        if (this.f36781d != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f36781d);
        }
        return b;
    }

    private final C7358n m34874b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36778a |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f36779b = aw.a(c7213a.m33567i());
                        this.f36778a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 18:
                    this.f36780c = c7213a.m33564f();
                    this.f36778a |= 2;
                    continue;
                case 26:
                    if (this.f36781d == null) {
                        this.f36781d = new ax();
                    }
                    c7213a.m33552a(this.f36781d);
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

    public final /* synthetic */ i m34875a(C7213a c7213a) {
        return m34874b(c7213a);
    }
}
