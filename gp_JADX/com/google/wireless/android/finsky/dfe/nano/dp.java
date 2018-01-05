package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.p493b.C7367w;

public final class dp extends b {
    public C7367w f38672a;

    public dp() {
        this.f38672a = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36267a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38672a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38672a);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36268b() {
        int b = super.b();
        if (this.f38672a != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f38672a);
        }
        return b;
    }

    public final /* synthetic */ i m36266a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38672a == null) {
                        this.f38672a = new C7367w();
                    }
                    c7213a.m33552a(this.f38672a);
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
