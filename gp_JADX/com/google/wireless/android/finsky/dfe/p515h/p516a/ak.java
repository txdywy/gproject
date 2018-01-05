package com.google.wireless.android.finsky.dfe.p515h.p516a;

import com.google.android.finsky.cv.a.aw;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ak extends b {
    public static volatile ak[] f38039a;
    public int f38040b;
    public int f38041c;
    public boolean f38042d;
    public String f38043e;

    public static ak[] m35749d() {
        if (f38039a == null) {
            synchronized (C7219h.f35465b) {
                if (f38039a == null) {
                    f38039a = new ak[0];
                }
            }
        }
        return f38039a;
    }

    public final ak m35751a(int i) {
        this.f38041c = i;
        this.f38040b |= 1;
        return this;
    }

    public final ak m35752a(boolean z) {
        this.f38040b |= 2;
        this.f38042d = z;
        return this;
    }

    public ak() {
        this.f38040b = 0;
        this.f38041c = 0;
        this.f38042d = false;
        this.f38043e = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35753a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38040b & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f38041c);
        }
        if ((this.f38040b & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f38042d);
        }
        if ((this.f38040b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38043e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35754b() {
        int b = super.b();
        if ((this.f38040b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f38041c);
        }
        if ((this.f38040b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33501d(2) + 1;
        }
        if ((this.f38040b & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(3, this.f38043e);
        }
        return b;
    }

    private final ak m35748b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f38040b |= 1;
                    int o = c7213a.m33573o();
                    try {
                        this.f38041c = aw.a(c7213a.m33567i());
                        this.f38040b |= 1;
                        continue;
                    } catch (IllegalArgumentException e) {
                        c7213a.m33562e(o);
                        a(c7213a, a);
                        break;
                    }
                case 16:
                    this.f38042d = c7213a.m33563e();
                    this.f38040b |= 2;
                    continue;
                case 26:
                    this.f38043e = c7213a.m33564f();
                    this.f38040b |= 4;
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

    public final /* synthetic */ i m35750a(C7213a c7213a) {
        return m35748b(c7213a);
    }
}
