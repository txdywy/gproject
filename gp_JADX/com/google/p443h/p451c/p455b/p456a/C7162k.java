package com.google.p443h.p451c.p455b.p456a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7162k extends b {
    public String f34983a;

    public C7162k() {
        this.f34983a = "";
        this.aP = -1;
    }

    public final void m32482a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!(this.f34983a == null || this.f34983a.equals(""))) {
            codedOutputByteBufferNano.m33521a(2, this.f34983a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m32483b() {
        int b = super.b();
        if (this.f34983a == null || this.f34983a.equals("")) {
            return b;
        }
        return b + CodedOutputByteBufferNano.m33493b(2, this.f34983a);
    }

    public final /* synthetic */ i m32481a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 18:
                    this.f34983a = c7213a.m33564f();
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
