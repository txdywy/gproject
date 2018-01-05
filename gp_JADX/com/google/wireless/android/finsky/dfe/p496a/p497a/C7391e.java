package com.google.wireless.android.finsky.dfe.p496a.p497a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7391e extends b {
    public int f36934a;
    public float f36935b;

    public C7391e() {
        this.f36934a = 0;
        this.f36935b = 0.0f;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34995a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36934a & 1) != 0) {
            codedOutputByteBufferNano.m33517a(1, this.f36935b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34996b() {
        int b = super.b();
        if ((this.f36934a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(1) + 4);
        }
        return b;
    }

    public final /* synthetic */ i m34994a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f36935b = Float.intBitsToFloat(c7213a.m33569k());
                    this.f36934a |= 1;
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
