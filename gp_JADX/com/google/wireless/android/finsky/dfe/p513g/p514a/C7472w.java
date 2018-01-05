package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7472w extends b {
    public aj f37953a;
    public ai f37954b;

    public C7472w() {
        this.f37953a = null;
        this.f37954b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35704a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37953a != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37953a);
        }
        if (this.f37954b != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37954b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35705b() {
        int b = super.b();
        if (this.f37953a != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37953a);
        }
        if (this.f37954b != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37954b);
        }
        return b;
    }

    public final /* synthetic */ i m35703a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37953a == null) {
                        this.f37953a = new aj();
                    }
                    c7213a.m33552a(this.f37953a);
                    continue;
                case 18:
                    if (this.f37954b == null) {
                        this.f37954b = new ai();
                    }
                    c7213a.m33552a(this.f37954b);
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
