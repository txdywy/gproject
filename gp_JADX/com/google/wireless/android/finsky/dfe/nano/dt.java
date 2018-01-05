package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.jf;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class dt extends b {
    public jf f38688a;
    public jf f38689b;
    public jf f38690c;

    public dt() {
        this.f38688a = null;
        this.f38689b = null;
        this.f38690c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36281a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f38688a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f38688a);
        }
        if (this.f38689b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f38689b);
        }
        if (this.f38690c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f38690c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36282b() {
        int b = super.b();
        if (this.f38688a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f38688a);
        }
        if (this.f38689b != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f38689b);
        }
        if (this.f38690c != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f38690c);
        }
        return b;
    }

    public final /* synthetic */ i m36280a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f38688a == null) {
                        this.f38688a = new jf();
                    }
                    c7213a.m33552a(this.f38688a);
                    continue;
                case 18:
                    if (this.f38689b == null) {
                        this.f38689b = new jf();
                    }
                    c7213a.m33552a(this.f38689b);
                    continue;
                case 26:
                    if (this.f38690c == null) {
                        this.f38690c = new jf();
                    }
                    c7213a.m33552a(this.f38690c);
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
