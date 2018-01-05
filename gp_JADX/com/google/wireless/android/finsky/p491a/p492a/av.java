package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class av extends b {
    public int f36435a;
    public String f36436b;
    public String f36437c;

    public av() {
        this.f36435a = 0;
        this.f36436b = "";
        this.f36437c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34679a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36435a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36436b);
        }
        if ((this.f36435a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f36437c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34680b() {
        int b = super.b();
        if ((this.f36435a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f36436b);
        }
        if ((this.f36435a & 2) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f36437c);
        }
        return b;
    }

    public final /* synthetic */ i m34678a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36436b = c7213a.m33564f();
                    this.f36435a |= 1;
                    continue;
                case 18:
                    this.f36437c = c7213a.m33564f();
                    this.f36435a |= 2;
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
