package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ba extends b {
    public cl f38406a;
    public cl f38407b;
    public az f38408c;

    public ba() {
        this.f38406a = null;
        this.f38407b = null;
        this.f38408c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36052a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38406a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38406a);
        }
        if (this.f38407b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38407b);
        }
        if (this.f38408c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38408c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36053b() {
        int b = super.b();
        if (this.f38406a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38406a);
        }
        if (this.f38407b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38407b);
        }
        if (this.f38408c != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f38408c);
        }
        return b;
    }

    public final /* synthetic */ i m36051a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38406a == null) {
                        this.f38406a = new cl();
                    }
                    c7213a.m33552a(this.f38406a);
                    continue;
                case 18:
                    if (this.f38407b == null) {
                        this.f38407b = new cl();
                    }
                    c7213a.m33552a(this.f38407b);
                    continue;
                case 26:
                    if (this.f38408c == null) {
                        this.f38408c = new az();
                    }
                    c7213a.m33552a(this.f38408c);
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
