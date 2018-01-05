package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.android.finsky.cv.a.cv;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7486k extends b {
    public static volatile C7486k[] f38101a;
    public int f38102b;
    public cv f38103c;
    public int f38104d;

    public static C7486k[] m35811d() {
        if (f38101a == null) {
            synchronized (C7219h.f35465b) {
                if (f38101a == null) {
                    f38101a = new C7486k[0];
                }
            }
        }
        return f38101a;
    }

    public C7486k() {
        this.f38102b = 0;
        this.f38103c = null;
        this.f38104d = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35813a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38103c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38103c);
        }
        if ((this.f38102b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f38104d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35814b() {
        int b = super.b();
        if (this.f38103c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38103c);
        }
        if ((this.f38102b & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(2, this.f38104d);
        }
        return b;
    }

    private final C7486k m35810b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38103c == null) {
                        this.f38103c = new cv();
                    }
                    c7213a.m33552a(this.f38103c);
                    continue;
                case 16:
                    this.f38102b |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f38104d = ah.m35745a(c7213a.m33567i());
                        this.f38102b |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public final /* synthetic */ i m35812a(C7213a c7213a) {
        return m35810b(c7213a);
    }
}
