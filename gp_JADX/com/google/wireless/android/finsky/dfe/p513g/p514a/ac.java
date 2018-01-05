package com.google.wireless.android.finsky.dfe.p513g.p514a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class ac extends b {
    public int f37772a;
    public String f37773b;
    public String f37774c;
    public ai f37775d;
    public ae f37776e;
    public int f37777f;

    public ac() {
        this.f37772a = 0;
        this.f37773b = "";
        this.f37774c = "";
        this.f37775d = null;
        this.f37776e = null;
        this.f37777f = 0;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35582a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37772a & 1) != 0) {
            codedOutputByteBufferNano.m33521a(1, this.f37773b);
        }
        if ((this.f37772a & 2) != 0) {
            codedOutputByteBufferNano.m33521a(2, this.f37774c);
        }
        if (this.f37775d != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37775d);
        }
        if (this.f37776e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37776e);
        }
        if ((this.f37772a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(5, this.f37777f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35583b() {
        int b = super.b();
        if ((this.f37772a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33493b(1, this.f37773b);
        }
        if ((this.f37772a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33493b(2, this.f37774c);
        }
        if (this.f37775d != null) {
            b += CodedOutputByteBufferNano.m33503d(3, this.f37775d);
        }
        if (this.f37776e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37776e);
        }
        if ((this.f37772a & 4) != 0) {
            return b + CodedOutputByteBufferNano.m33502d(5, this.f37777f);
        }
        return b;
    }

    public final /* synthetic */ i m35581a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f37773b = c7213a.m33564f();
                    this.f37772a |= 1;
                    continue;
                case 18:
                    this.f37774c = c7213a.m33564f();
                    this.f37772a |= 2;
                    continue;
                case 26:
                    if (this.f37775d == null) {
                        this.f37775d = new ai();
                    }
                    c7213a.m33552a(this.f37775d);
                    continue;
                case 34:
                    if (this.f37776e == null) {
                        this.f37776e = new ae();
                    }
                    c7213a.m33552a(this.f37776e);
                    continue;
                case 40:
                    this.f37777f = c7213a.m33567i();
                    this.f37772a |= 4;
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
