package com.google.wireless.android.finsky.dfe.p505c.p506a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7219h;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bh extends b {
    public static volatile bh[] f37177b;
    public int f37178a;
    public bb f37179c;
    public av f37180d;
    public bj f37181e;

    public static bh[] m35177d() {
        if (f37177b == null) {
            synchronized (C7219h.f35465b) {
                if (f37177b == null) {
                    f37177b = new bh[0];
                }
            }
        }
        return f37177b;
    }

    public bh() {
        this.f37178a = -1;
        this.f37179c = null;
        this.f37178a = -1;
        this.f37180d = null;
        this.f37178a = -1;
        this.f37181e = null;
        this.aO = null;
        this.aP = -1;
    }

    public final void m35179a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f37178a == 0) {
            codedOutputByteBufferNano.m33532b(1, this.f37180d);
        }
        if (this.f37178a == 1) {
            codedOutputByteBufferNano.m33532b(2, this.f37181e);
        }
        if (this.f37179c != null) {
            codedOutputByteBufferNano.m33532b(3, this.f37179c);
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m35180b() {
        int b = super.b();
        if (this.f37178a == 0) {
            b += CodedOutputByteBufferNano.m33503d(1, this.f37180d);
        }
        if (this.f37178a == 1) {
            b += CodedOutputByteBufferNano.m33503d(2, this.f37181e);
        }
        if (this.f37179c != null) {
            return b + CodedOutputByteBufferNano.m33503d(3, this.f37179c);
        }
        return b;
    }

    public final /* synthetic */ i m35178a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f37180d == null) {
                        this.f37180d = new av();
                    }
                    c7213a.m33552a(this.f37180d);
                    this.f37178a = 0;
                    continue;
                case 18:
                    if (this.f37181e == null) {
                        this.f37181e = new bj();
                    }
                    c7213a.m33552a(this.f37181e);
                    this.f37178a = 1;
                    continue;
                case 26:
                    if (this.f37179c == null) {
                        this.f37179c = new bb();
                    }
                    c7213a.m33552a(this.f37179c);
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
