package com.google.wireless.android.finsky.p491a.p492a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ba extends b {
    public int f36446a;
    public at f36447b;
    public long f36448c;

    public ba() {
        this.f36446a = 0;
        this.f36447b = null;
        this.f36448c = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m34692a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f36447b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f36447b);
        }
        if ((this.f36446a & 1) != 0) {
            codedOutputByteBufferNano.m33531b(2, this.f36448c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m34693b() {
        int b = super.b();
        if (this.f36447b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f36447b);
        }
        if ((this.f36446a & 1) != 0) {
            return b + CodedOutputByteBufferNano.m33508f(2, this.f36448c);
        }
        return b;
    }

    public final /* synthetic */ i m34691a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f36447b == null) {
                        this.f36447b = new at();
                    }
                    c7213a.m33552a(this.f36447b);
                    continue;
                case 16:
                    this.f36448c = c7213a.m33568j();
                    this.f36446a |= 1;
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
