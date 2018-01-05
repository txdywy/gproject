package com.google.wireless.android.finsky.dfe.nano;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class gt extends b {
    public int f39122a;
    public dk f39123b;
    public String f39124c;
    public String f39125d;
    public long f39126e;
    public int f39127f;
    public String f39128g;

    public gt() {
        this.f39122a = 0;
        this.f39123b = null;
        this.f39124c = "";
        this.f39125d = "";
        this.f39126e = 0;
        this.f39127f = 0;
        this.f39128g = "";
        this.aO = null;
        this.aP = -1;
    }

    public final void m36532a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39123b != null) {
            codedOutputByteBufferNano.m33532b(1, this.f39123b);
        }
        if ((this.f39122a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f39124c);
        }
        if ((this.f39122a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(3, this.f39125d);
        }
        if ((this.f39122a & 4) != 0) {
            codedOutputByteBufferNano.m33535c(4, this.f39126e);
        }
        if ((this.f39122a & 8) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f39127f);
        }
        if ((this.f39122a & 16) != 0) {
            codedOutputByteBufferNano.m33521a(6, this.f39128g);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m36533b() {
        int b = super.b();
        if (this.f39123b != null) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f39123b);
        }
        if ((this.f39122a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f39124c);
        }
        if ((this.f39122a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(3, this.f39125d);
        }
        if ((this.f39122a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33501d(4) + 8;
        }
        if ((this.f39122a & 8) != 0) {
            b += CodedOutputByteBufferNano.m33502d(5, this.f39127f);
        }
        if ((this.f39122a & 16) != 0) {
            return b + CodedOutputByteBufferNano.m33493b(6, this.f39128g);
        }
        return b;
    }

    public final /* synthetic */ i m36531a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f39123b == null) {
                        this.f39123b = new dk();
                    }
                    c7213a.m33552a(this.f39123b);
                    continue;
                case 18:
                    this.f39124c = c7213a.m33564f();
                    this.f39122a |= 1;
                    continue;
                case 26:
                    this.f39125d = c7213a.m33564f();
                    this.f39122a |= 2;
                    continue;
                case 33:
                    this.f39126e = c7213a.m33570l();
                    this.f39122a |= 4;
                    continue;
                case 40:
                    this.f39127f = c7213a.m33567i();
                    this.f39122a |= 8;
                    continue;
                case 50:
                    this.f39128g = c7213a.m33564f();
                    this.f39122a |= 16;
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
