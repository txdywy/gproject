package com.google.p443h.p451c.p457c.p460b.p465c.p466a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7175b extends b {
    public boolean f35018a;
    public String f35019b;

    public C7175b() {
        this.f35018a = false;
        this.f35019b = "";
        this.aP = -1;
    }

    public final void m32524a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f35018a) {
            codedOutputByteBufferNano.m33522a(1, this.f35018a);
        }
        if (!(this.f35019b == null || this.f35019b.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f35019b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32525b() {
        int b = super.b();
        if (this.f35018a) {
            b += CodedOutputByteBufferNano.m33501d(1) + 1;
        }
        if (this.f35019b == null || this.f35019b.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(2, this.f35019b);
    }

    public final /* synthetic */ i m32523a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f35018a = c7213a.m33563e();
                    continue;
                case 18:
                    this.f35019b = c7213a.m33564f();
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
