package com.google.wireless.android.finsky.dfe.p498b.p499a.p501b.p502a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7405a extends b {
    public int f36974a;
    public boolean f36975b;

    public C7405a() {
        this.f36974a = 0;
        this.f36975b = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35041a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f36974a & 1) != 0) {
            codedOutputByteBufferNano.m33522a(1, this.f36975b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35042b() {
        int b = super.b();
        if ((this.f36974a & 1) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(1) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35040a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f36975b = c7213a.m33563e();
                    this.f36974a |= 1;
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
