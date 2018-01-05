package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class co extends b {
    public int f37327a;
    public int f37328b;
    public int f37329c;
    public int f37330d;
    public cp f37331e;
    public boolean f37332f;

    public final co m35291a(int i) {
        this.f37327a |= 1;
        this.f37328b = i;
        return this;
    }

    public final co m35294b(int i) {
        this.f37327a |= 2;
        this.f37329c = i;
        return this;
    }

    public final boolean m35295d() {
        return (this.f37327a & 4) != 0;
    }

    public co() {
        this.f37327a = 0;
        this.f37328b = 0;
        this.f37329c = 0;
        this.f37330d = 0;
        this.f37331e = null;
        this.f37332f = false;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35292a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.f37327a & 1) != 0) {
            codedOutputByteBufferNano.m33518a(1, this.f37328b);
        }
        if ((this.f37327a & 2) != 0) {
            codedOutputByteBufferNano.m33518a(2, this.f37329c);
        }
        if ((this.f37327a & 4) != 0) {
            codedOutputByteBufferNano.m33518a(3, this.f37330d);
        }
        if (this.f37331e != null) {
            codedOutputByteBufferNano.m33532b(4, this.f37331e);
        }
        if ((this.f37327a & 8) != 0) {
            codedOutputByteBufferNano.m33522a(5, this.f37332f);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35293b() {
        int b = super.b();
        if ((this.f37327a & 1) != 0) {
            b += CodedOutputByteBufferNano.m33502d(1, this.f37328b);
        }
        if ((this.f37327a & 2) != 0) {
            b += CodedOutputByteBufferNano.m33502d(2, this.f37329c);
        }
        if ((this.f37327a & 4) != 0) {
            b += CodedOutputByteBufferNano.m33502d(3, this.f37330d);
        }
        if (this.f37331e != null) {
            b += CodedOutputByteBufferNano.m33503d(4, this.f37331e);
        }
        if ((this.f37327a & 8) != 0) {
            return b + (CodedOutputByteBufferNano.m33501d(5) + 1);
        }
        return b;
    }

    public final /* synthetic */ i m35290a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f37328b = c7213a.m33567i();
                    this.f37327a |= 1;
                    continue;
                case 16:
                    this.f37329c = c7213a.m33567i();
                    this.f37327a |= 2;
                    continue;
                case 24:
                    this.f37330d = c7213a.m33567i();
                    this.f37327a |= 4;
                    continue;
                case 34:
                    if (this.f37331e == null) {
                        this.f37331e = new cp();
                    }
                    c7213a.m33552a(this.f37331e);
                    continue;
                case 40:
                    this.f37332f = c7213a.m33563e();
                    this.f37327a |= 8;
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
