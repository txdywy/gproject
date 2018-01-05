package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7341w extends b {
    public int f36630a;
    public String f36631b;
    public String f36632c;

    public C7341w() {
        this.f36630a = 0;
        this.f36631b = "";
        this.f36632c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34783a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36630a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36631b);
        }
        if ((this.f36630a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36632c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34784b() {
        int b = super.b();
        if ((this.f36630a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36631b);
        }
        if ((this.f36630a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36632c);
        }
        return b;
    }

    public final /* synthetic */ i m34782a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36631b = c7213a.m33564f();
                    this.f36630a |= 1;
                    continue;
                case 18:
                    this.f36632c = c7213a.m33564f();
                    this.f36630a |= 2;
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
