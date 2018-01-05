package com.google.p443h.p451c.p457c.p470c.p471a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7188f extends b {
    public String f35058a;
    public String f35059b;

    public C7188f() {
        this.f35058a = "";
        this.f35059b = "";
        this.aP = -1;
    }

    public final void m32560a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f35058a == null || this.f35058a.equals(""))) {
            codedOutputByteBufferNano.m33521a(1, this.f35058a);
        }
        if (!(this.f35059b == null || this.f35059b.equals(""))) {
            codedOutputByteBufferNano.m33521a(11, this.f35059b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32561b() {
        int b = super.b();
        if (!(this.f35058a == null || this.f35058a.equals(""))) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f35058a);
        }
        if (this.f35059b == null || this.f35059b.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(11, this.f35059b);
    }

    public final /* synthetic */ i m32559a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f35058a = c7213a.m33564f();
                    continue;
                case 90:
                    this.f35059b = c7213a.m33564f();
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
