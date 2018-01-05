package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7390d extends b {
    public int f36932a;
    public String f36933b;

    public C7390d() {
        this.f36932a = 0;
        this.f36933b = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m34992a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36932a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f36933b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34993b() {
        int b = super.b();
        if ((this.f36932a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(1, this.f36933b);
        }
        return b;
    }

    public final /* synthetic */ i m34991a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f36933b = c7213a.m33564f();
                    this.f36932a |= 1;
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
