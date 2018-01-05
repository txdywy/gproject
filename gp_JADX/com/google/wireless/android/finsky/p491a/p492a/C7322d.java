package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7322d extends b {
    public int f36477a;
    public String f36478b;

    public C7322d() {
        this.f36477a = 0;
        this.f36478b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34721a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36477a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36478b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34722b() {
        int b = super.b();
        if ((this.f36477a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f36478b);
        }
        return b;
    }

    public final /* synthetic */ i m34720a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36478b = c7213a.m33564f();
                    this.f36477a |= 1;
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
