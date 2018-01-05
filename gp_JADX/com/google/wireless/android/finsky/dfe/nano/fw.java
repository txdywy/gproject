package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class fw extends b {
    public C7367w f39033a;

    public fw() {
        this.f39033a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36465a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39033a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39033a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36466b() {
        int b = super.b();
        if (this.f39033a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f39033a);
        }
        return b;
    }

    public final /* synthetic */ i m36464a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39033a == null) {
                        this.f39033a = new C7367w();
                    }
                    c7213a.m33552a(this.f39033a);
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
