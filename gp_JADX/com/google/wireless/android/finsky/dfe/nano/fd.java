package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class fd extends b {
    public int f38903a;
    public String f38904b;
    public boolean f38905c;

    public fd() {
        this.f38903a = 0;
        this.f38904b = "";
        this.f38905c = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36404a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f38903a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f38904b);
        }
        if ((this.f38903a & 2) != 0) {
            codedOutputByteBufferNano.m33522a(2, this.f38905c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36405b() {
        int b = super.b();
        if ((this.f38903a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f38904b);
        }
        if ((this.f38903a & 2) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(2) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m36403a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f38904b = c7213a.m33564f();
                    this.f38903a |= 1;
                    continue;
                case 16:
                    this.f38905c = c7213a.m33563e();
                    this.f38903a |= 2;
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
