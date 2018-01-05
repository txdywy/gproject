package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.ax;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ci extends b {
    public static volatile ci[] f38568a;
    public int f38569b;
    public ax f38570c;
    public String f38571d;
    public int f38572e;
    public boolean f38573f;
    public boolean f38574g;
    public String f38575h;

    public static ci[] m36158d() {
        if (f38568a == null) {
            synchronized (C7219h.f35465b) {
                if (f38568a == null) {
                    f38568a = new ci[0];
                }
            }
        }
        return f38568a;
    }

    public ci() {
        this.f38569b = 0;
        this.f38570c = null;
        this.f38571d = "";
        this.f38572e = 0;
        this.f38573f = false;
        this.f38574g = false;
        this.f38575h = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36160a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38570c != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38570c);
        }
        if ((this.f38569b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f38571d);
        }
        if ((this.f38569b & 2) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f38572e);
        }
        if ((this.f38569b & 4) != 0) {
            codedOutputByteBufferNano.m33522a(4, this.f38573f);
        }
        if ((this.f38569b & 8) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f38574g);
        }
        if ((this.f38569b & 16) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f38575h);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36161b() {
        int b = super.b();
        if (this.f38570c != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38570c);
        }
        if ((this.f38569b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f38571d);
        }
        if ((this.f38569b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f38572e);
        }
        if ((this.f38569b & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 1;
        }
        if ((this.f38569b & 8) != 0) {
            b += CodedOutputByteBufferNano.m33501d(5) + 1;
        }
        if ((this.f38569b & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(6, this.f38575h);
        }
        return b;
    }

    public final /* synthetic */ i m36159a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38570c == null) {
                        this.f38570c = new ax();
                    }
                    c7213a.m33552a(this.f38570c);
                    continue;
                case 18:
                    this.f38571d = c7213a.m33564f();
                    this.f38569b |= 1;
                    continue;
                case 24:
                    this.f38572e = c7213a.m33567i();
                    this.f38569b |= 2;
                    continue;
                case 32:
                    this.f38573f = c7213a.m33563e();
                    this.f38569b |= 4;
                    continue;
                case 40:
                    this.f38574g = c7213a.m33563e();
                    this.f38569b |= 8;
                    continue;
                case 50:
                    this.f38575h = c7213a.m33564f();
                    this.f38569b |= 16;
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
