package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aa extends b {
    public static volatile aa[] f36319a;
    public int f36320b;
    public String f36321c;
    public String f36322d;
    public boolean f36323e;

    public static aa[] m34598d() {
        if (f36319a == null) {
            synchronized (C7219h.f35465b) {
                if (f36319a == null) {
                    f36319a = new aa[0];
                }
            }
        }
        return f36319a;
    }

    public aa() {
        this.f36320b = 0;
        this.f36321c = "";
        this.f36322d = "";
        this.f36323e = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34600a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36320b & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36321c);
        }
        if ((this.f36320b & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36322d);
        }
        if ((this.f36320b & 4) != 0) {
            codedOutputByteBufferNano.m33522a(3, this.f36323e);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34601b() {
        int b = super.b();
        if ((this.f36320b & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36321c);
        }
        if ((this.f36320b & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f36322d);
        }
        if ((this.f36320b & 4) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(3) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m34599a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36321c = c7213a.m33564f();
                    this.f36320b |= 1;
                    continue;
                case 18:
                    this.f36322d = c7213a.m33564f();
                    this.f36320b |= 2;
                    continue;
                case 24:
                    this.f36323e = c7213a.m33563e();
                    this.f36320b |= 4;
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
