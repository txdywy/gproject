package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bi extends b {
    public int f37182a;
    public String f37183b;
    public au f37184c;

    public bi() {
        this.f37182a = 0;
        this.f37183b = "";
        this.f37184c = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35182a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37182a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37183b);
        }
        if (this.f37184c != null) {
            codedOutputByteBufferNano.m33532b(2, this.f37184c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35183b() {
        int b = super.b();
        if ((this.f37182a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37183b);
        }
        if (this.f37184c != null) {
            return b + CodedOutputByteBufferNano.m33503d(2, this.f37184c);
        }
        return b;
    }

    public final /* synthetic */ i m35181a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37183b = c7213a.m33564f();
                    this.f37182a |= 1;
                    continue;
                case 18:
                    if (this.f37184c == null) {
                        this.f37184c = new au();
                    }
                    c7213a.m33552a(this.f37184c);
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
