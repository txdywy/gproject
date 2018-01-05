package com.google.p443h.p451c.p457c.p470c.p471a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7184b extends b {
    public String f35035a;

    public C7184b() {
        this.f35035a = "";
        this.aP = -1;
    }

    public final void m32547a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f35035a == null || this.f35035a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f35035a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32548b() {
        int b = super.b();
        if (this.f35035a == null || this.f35035a.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(1, this.f35035a);
    }

    public final /* synthetic */ i m32546a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f35035a = c7213a.m33564f();
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
