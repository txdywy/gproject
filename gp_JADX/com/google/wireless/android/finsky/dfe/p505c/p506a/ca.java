package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ca extends b {
    public static volatile ca[] f37273a;
    public cg f37274b;
    public de f37275c;
    public dm f37276d;

    public static ca[] m35245d() {
        if (f37273a == null) {
            synchronized (C7219h.f35465b) {
                if (f37273a == null) {
                    f37273a = new ca[0];
                }
            }
        }
        return f37273a;
    }

    public ca() {
        this.f37274b = null;
        this.f37275c = null;
        this.f37276d = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35247a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37274b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37274b);
        }
        if (this.f37275c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37275c);
        }
        if (this.f37276d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37276d);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35248b() {
        int b = super.b();
        if (this.f37274b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37274b);
        }
        if (this.f37275c != null) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37275c);
        }
        if (this.f37276d != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f37276d);
        }
        return b;
    }

    public final /* synthetic */ i m35246a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37274b == null) {
                        this.f37274b = new cg();
                    }
                    c7213a.m33552a(this.f37274b);
                    continue;
                case 18:
                    if (this.f37275c == null) {
                        this.f37275c = new de();
                    }
                    c7213a.m33552a(this.f37275c);
                    continue;
                case 26:
                    if (this.f37276d == null) {
                        this.f37276d = new dm();
                    }
                    c7213a.m33552a(this.f37276d);
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
