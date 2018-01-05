package com.google.p443h.p451c.p455b.p456a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7154c extends b {
    public String f34940a;

    public C7154c() {
        this.f34940a = "";
        this.aP = -1;
    }

    public final void m32443a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f34940a == null || this.f34940a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f34940a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32444b() {
        int b = super.b();
        if (this.f34940a == null || this.f34940a.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(1, this.f34940a);
    }

    public final /* synthetic */ i m32442a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34940a = c7213a.m33564f();
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
