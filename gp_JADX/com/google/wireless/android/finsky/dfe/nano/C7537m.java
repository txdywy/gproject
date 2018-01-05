package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bp;
import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7537m extends b {
    public int f39170a;
    public cv f39171b;
    public int f39172c;
    public String f39173d;

    public C7537m() {
        this.f39170a = 0;
        this.f39171b = null;
        this.f39172c = 1;
        this.f39173d = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36562a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39171b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39171b);
        }
        if ((this.f39170a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f39172c);
        }
        if ((this.f39170a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39173d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36563b() {
        int b = super.b();
        if (this.f39171b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39171b);
        }
        if ((this.f39170a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f39172c);
        }
        if ((this.f39170a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f39173d);
        }
        return b;
    }

    private final C7537m m36560b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39171b == null) {
                        this.f39171b = new cv();
                    }
                    c7213a.m33552a(this.f39171b);
                    continue;
                case 16:
                    this.f39170a |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f39172c = bp.a(c7213a.m33567i());
                        this.f39170a |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 26:
                    this.f39173d = c7213a.m33564f();
                    this.f39170a |= 2;
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

    public final /* synthetic */ i m36561a(C7213a c7213a) {
        return m36560b(c7213a);
    }
}
