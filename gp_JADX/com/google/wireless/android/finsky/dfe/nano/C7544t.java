package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class C7544t extends b {
    public static volatile C7544t[] f39204a;
    public C7543s f39205b;

    public static C7544t[] m36582d() {
        if (f39204a == null) {
            synchronized (C7219h.f35465b) {
                if (f39204a == null) {
                    f39204a = new C7544t[0];
                }
            }
        }
        return f39204a;
    }

    public C7544t() {
        this.f39205b = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m36584a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39205b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39205b);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36585b() {
        int b = super.b();
        if (this.f39205b != null) {
            return b + CodedOutputByteBufferNano.m33503d(1, this.f39205b);
        }
        return b;
    }

    public final /* synthetic */ i m36583a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39205b == null) {
                        this.f39205b = new C7543s();
                    }
                    c7213a.m33552a(this.f39205b);
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
