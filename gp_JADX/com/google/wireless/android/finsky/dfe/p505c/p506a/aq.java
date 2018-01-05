package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.android.finsky.cv.a.n;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class aq extends b {
    public int f37110a;
    public n f37111b;
    public String f37112c;

    public aq() {
        this.f37110a = 0;
        this.f37111b = null;
        this.f37112c = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m35123a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37111b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f37111b);
        }
        if ((this.f37110a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37112c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35124b() {
        int b = super.b();
        if (this.f37111b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37111b);
        }
        if ((this.f37110a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(2, this.f37112c);
        }
        return b;
    }

    public final /* synthetic */ i m35122a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37111b == null) {
                        this.f37111b = new n();
                    }
                    c7213a.m33552a(this.f37111b);
                    continue;
                case 18:
                    this.f37112c = c7213a.m33564f();
                    this.f37110a |= 1;
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
