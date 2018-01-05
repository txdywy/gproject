package com.google.wireless.android.finsky.p493b;

import com.google.android.finsky.cv.a.ay;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7351g extends b {
    public static volatile C7351g[] f36754a;
    public int f36755b;
    public int f36756c;
    public C7352h f36757d;

    public static C7351g[] m34850d() {
        if (f36754a == null) {
            synchronized (C7219h.f35465b) {
                if (f36754a == null) {
                    f36754a = new C7351g[0];
                }
            }
        }
        return f36754a;
    }

    public C7351g() {
        this.f36755b = 0;
        this.f36756c = 1;
        this.f36757d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34852a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36755b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f36756c);
        }
        if (this.f36757d != null) {
            codedOutputByteBufferNano.m33532b(2, this.f36757d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34853b() {
        int b = super.b();
        if ((this.f36755b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f36756c);
        }
        if (this.f36757d != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f36757d);
        }
        return b;
    }

    private final C7351g m34849b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36755b |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f36756c = ay.a(c7213a.m33567i());
                        this.f36755b |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 18:
                    if (this.f36757d == null) {
                        this.f36757d = new C7352h();
                    }
                    c7213a.m33552a(this.f36757d);
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

    public final /* synthetic */ i m34851a(C7213a c7213a) {
        return m34849b(c7213a);
    }
}
