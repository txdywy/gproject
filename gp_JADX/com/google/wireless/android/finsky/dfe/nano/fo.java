package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fo extends b {
    public static volatile fo[] f38990a;
    public int f38991b;
    public long f38992c;
    public String f38993d;
    public String f38994e;
    public long f38995f;
    public int f38996g;
    public int f38997h;

    public static fo[] m36434d() {
        if (f38990a == null) {
            synchronized (C7219h.f35465b) {
                if (f38990a == null) {
                    f38990a = new fo[0];
                }
            }
        }
        return f38990a;
    }

    public fo() {
        this.f38991b = 0;
        this.f38992c = 0;
        this.f38993d = "";
        this.f38994e = "";
        this.f38995f = 0;
        this.f38996g = 0;
        this.f38997h = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36436a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38991b & 1) != 0) {
            codedOutputByteBufferNano.m33531b(1, this.f38992c);
        }
        if ((this.f38991b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38993d);
        }
        if ((this.f38991b & 4) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f38994e);
        }
        if ((this.f38991b & 32) != 0) {
            codedOutputByteBufferNano.m33518a(4, this.f38997h);
        }
        if ((this.f38991b & 8) != 0) {
            codedOutputByteBufferNano.m33519a(5, this.f38995f);
        }
        if ((this.f38991b & 16) != 0) {
            codedOutputByteBufferNano.m33518a(6, this.f38996g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36437b() {
        int b = super.b();
        if ((this.f38991b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33508f(1, this.f38992c);
        }
        if ((this.f38991b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38993d);
        }
        if ((this.f38991b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f38994e);
        }
        if ((this.f38991b & 32) != 0) {
            b += CodedOutputByteBufferNano.m33502d(4, this.f38997h);
        }
        if ((this.f38991b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33505e(5, this.f38995f);
        }
        if ((this.f38991b & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(6, this.f38996g);
        }
        return b;
    }

    private final fo m36433b(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f38992c = c7213a.m33568j();
                    this.f38991b |= 1;
                    continue;
                case 18:
                    this.f38993d = c7213a.m33564f();
                    this.f38991b |= 2;
                    continue;
                case 26:
                    this.f38994e = c7213a.m33564f();
                    this.f38991b |= 4;
                    continue;
                case 32:
                    this.f38997h = c7213a.m33567i();
                    this.f38991b |= 32;
                    continue;
                case 40:
                    this.f38995f = c7213a.m33568j();
                    this.f38991b |= 8;
                    continue;
                case 48:
                    this.f38991b |= 16;
                    int o = c7213a.m33573o();
                    try {
                        this.f38996g = com.google.wireless.android.b.a.b.a(c7213a.m33567i());
                        this.f38991b |= 16;
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

    public final /* synthetic */ i m36435a(C7213a c7213a) {
        return m36433b(c7213a);
    }
}
