package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7397k extends b {
    public int f36951a;
    public String f36952b;

    public C7397k() {
        this.f36951a = 0;
        this.f36952b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35013a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36951a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36952b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35014b() {
        int b = super.b();
        if ((this.f36951a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f36952b);
        }
        return b;
    }

    public final /* synthetic */ i m35012a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36952b = c7213a.m33564f();
                    this.f36951a |= 1;
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
